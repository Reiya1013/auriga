/*
 * Copyright (C) 2002-2020  Auriga
 *
 * This file is part of Auriga.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street - Fifth Floor, Boston, MA 02110-1301, USA.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "db.h"
#include "malloc.h"
#include "nullpo.h"
#include "itemdb.h"
#include "clif.h"
#include "intif.h"
#include "pc.h"
#include "storage.h"
#include "guild.h"
#include "battle.h"
#include "chrif.h"
#include "msg.h"

static struct dbt *storage_db;
static struct dbt *s1_storage_db;
static struct dbt *s2_storage_db;
static struct dbt *s3_storage_db;
static struct dbt *guild_storage_db;

/*==========================================
 * �q�ɓ��A�C�e���\�[�g
 *------------------------------------------
 */
static int storage_comp_item_by_key(const void *_i1, const void *_i2)
{
	struct item *i1 = (struct item *)_i1;
	struct item *i2 = (struct item *)_i2;

	if(i1->id == 0 && i2->id != 0)
		return 1;
	if(i1->id != 0 && i2->id == 0)
		return -1;

	if(i1->id > i2->id)
		return 1;
	if(i1->id < i2->id)
		return -1;

	return 0;
}

static int storage_comp_item_by_nameid(const void *_i1, const void *_i2)
{
	struct item *i1=(struct item *)_i1;
	struct item *i2=(struct item *)_i2;

	if(i1->nameid == i2->nameid)
		return 0;
	if(!(i1->nameid) || !(i1->amount))
		return 1;
	if(!(i2->nameid) || !(i2->amount))
		return -1;

	return i1->nameid - i2->nameid;
}

static int storage_comp_item_by_type(const void *_i1, const void *_i2)
{
	struct item *i1 = (struct item *)_i1;
	struct item *i2 = (struct item *)_i2;
	struct item_data *data1, *data2;

	if(i1->nameid == 0 || i2->nameid == 0) {
		// �����ɏW�߂�̂Ŕ��]
		return i2->nameid - i1->nameid;
	}

	data1 = itemdb_search(i1->nameid);
	data2 = itemdb_search(i2->nameid);

	if(data1->type > data2->type)
		return 1;
	if(data1->type < data2->type)
		return -1;

	// ����E�h��Ȃ�LOC�Ń\�[�g
	if(itemdb_isarmor(data1->nameid) || itemdb_isweapon(data1->nameid)) {
		if(data1->equip > data2->equip)
			return 1;
		if(data1->equip < data2->equip)
			return -1;
	}

	// �Ō�̓A�C�e��ID�Ń\�[�g
	if(data1->nameid > data2->nameid)
		return 1;
	if(data1->nameid < data2->nameid)
		return -1;

	return 0;
}

static void storage_sortitem(struct item *item,int max,unsigned int *sortkey,int flag)
{
	int (*cmp)(const void *,const void *) = NULL;

	nullpo_retv(item);

	switch(flag) {
		case 1: cmp = storage_comp_item_by_key;    break;
		case 2: cmp = storage_comp_item_by_nameid; break;
		case 3: cmp = storage_comp_item_by_type;   break;
	}

	if(cmp) {
		int i;
		qsort(item, max, sizeof(struct item), cmp);

		// �\�[�g�L�[�̃��i���o�����O
		*sortkey = 0;
		for(i=0; i<max; i++) {
			if(item->nameid > 0)
				item->id = ++(*sortkey);
			else
				item->id = 0;
			item++;
		}
	}
	return;
}

/*==========================================
 * �J�v���q�Ƀf�[�^�x�[�X
 *------------------------------------------
 */
static struct storage *account2storage(int account_id)
{
	struct storage *stor;

	stor = (struct storage *)numdb_search(storage_db,account_id);
	if(stor == NULL) {
		stor = (struct storage *)aCalloc(1,sizeof(struct storage));
		stor->account_id = account_id;
		numdb_insert(storage_db,stor->account_id,stor);
	}
	return stor;
}

/*==========================================
 * �J�v���q�ɂ��폜
 *------------------------------------------
 */
void storage_delete(int account_id)
{
	struct storage *stor = (struct storage *)numdb_erase(storage_db,account_id);

	if(stor)
		aFree(stor);

	return;
}

/*==========================================
 * �J�v���q�ɂ��J��
 *------------------------------------------
 */
int storage_storageopen(struct map_session_data *sd)
{
	struct storage *stor;
	int gmlvl = 0;

	nullpo_retr(0, sd);

	if(sd->state.storage_flag == 1)
		return 0;	// ���ɃJ�v���q�ɂ��J���Ă���

	gmlvl = pc_isGM(sd);
	if(gmlvl > 0 && battle_config.gm_can_drop_lv > gmlvl)
		return 0;	// �ݒ肵�Ă���GM���x�����Ⴂ

	if((stor = (struct storage *)numdb_search(storage_db,sd->status.account_id)) != NULL) {
		if(stor->storage_status)
			return 1;
		stor->storage_status = 1;
	}

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd); // �M���h�q�ɂ����łɊJ���Ă���ꍇ����

	if(stor != NULL) {
		sd->state.storage_flag = 1;
		clif_inventoryStart(sd, 2, msg_txt(208));
		clif_storageitemlist(sd,stor);
		clif_storageequiplist(sd,stor);
		clif_updatestorageamount(sd,stor);
		clif_inventoryEnd(sd, 2);
	} else {
		intif_request_storage(sd->status.account_id);
	}
	return 0;
}

/*==========================================
 * �J�v���q�Ƀf�[�^�̎�M
 *------------------------------------------
 */
int storage_storageload(int account_id, struct storage *s)
{
	struct map_session_data *sd;
	struct storage *stor;

	nullpo_retr(1, s);

	sd = map_id2sd(account_id);
	if(sd == NULL || sd->state.waitingdisconnect) {
		if(battle_config.error_log && sd == NULL)
			printf("storage_storageload: user not found %d\n", account_id);
		storage_delete(account_id);
		return 1;
	}

	// ���ɑq�ɂ��J���ĂȂ����`�F�b�N
	if(sd->state.storage_flag == 1)
		return 0;
	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd);
	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����


	stor = account2storage(account_id);

	if(battle_config.save_log)
		printf("storageload: %d\n", account_id);

	memcpy(stor, s, sizeof(struct storage));
	storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
	stor->storage_status   = 1;
	sd->state.storage_flag = 1;
	clif_inventoryStart(sd, 2, msg_txt(208));
	clif_storageitemlist(sd,stor);
	clif_storageequiplist(sd,stor);
	clif_updatestorageamount(sd,stor);
	clif_inventoryEnd(sd, 2);

	return 0;
}

/*==========================================
 * �J�v���q�ɂփA�C�e���ǉ�
 *------------------------------------------
 */
static int storage_additem(struct map_session_data *sd,struct storage *stor,struct item *item_data,int amount)
{
	struct item_data *data;
	int i;

	nullpo_retr(1, sd);
	nullpo_retr(1, stor);
	nullpo_retr(1, item_data);

	if(item_data->nameid <= 0 || amount <= 0)
		return 1;

	nullpo_retr(1, data = itemdb_search(item_data->nameid));

	if(!itemdb_isequip2(data)) {
		// �����i�ł͂Ȃ��̂ŁA�����L�i�Ȃ���̂ݕω�������
		for(i=0; i<MAX_STORAGE; i++) {
			if(stor->store_item[i].nameid  == item_data->nameid  &&
			   stor->store_item[i].card[0] == item_data->card[0] &&
			   stor->store_item[i].card[1] == item_data->card[1] &&
			   stor->store_item[i].card[2] == item_data->card[2] &&
			   stor->store_item[i].card[3] == item_data->card[3] &&
			   stor->store_item[i].limit   == item_data->limit)
			{
				if(stor->store_item[i].amount + amount > MAX_AMOUNT)
					return 1;
				stor->store_item[i].amount += amount;
				stor->dirty = 1;
				clif_storageitemadded(sd,stor,i,amount);
				return 0;
			}
		}
	} else if(amount != 1) {
		return 1;
	}

	// �����i�������L�i�������̂ŋ󂫗��֒ǉ�
	for(i=0; i<MAX_STORAGE; i++) {
		if(stor->store_item[i].nameid == 0) {
			memcpy(&stor->store_item[i],item_data,sizeof(stor->store_item[0]));
			stor->store_item[i].id     = ++stor->sortkey;
			stor->store_item[i].amount = amount;
			stor->storage_amount++;
			stor->dirty = 1;
			clif_storageitemadded(sd,stor,i,amount);
			clif_updatestorageamount(sd,stor);
			return 0;
		}
	}

	return 1;
}

/*==========================================
 * �J�v���q�ɂ���A�C�e�������炷
 *------------------------------------------
 */
static void storage_delitem(struct map_session_data *sd,struct storage *stor,int n,int amount)
{
	nullpo_retv(sd);
	nullpo_retv(stor);

	if(stor->store_item[n].nameid == 0 || stor->store_item[n].amount < amount)
		return;

	stor->store_item[n].amount -= amount;
	if(stor->store_item[n].amount <= 0) {
		memset(&stor->store_item[n],0,sizeof(stor->store_item[0]));
		stor->store_item[n].id = 0;
		stor->storage_amount--;
		clif_updatestorageamount(sd,stor);
	}
	stor->dirty = 1;
	clif_storageitemremoved(sd,n,amount);

	return;
}

/*==========================================
 * �J�v���q�ɂ֓����
 *------------------------------------------
 */
void storage_storageadd(struct map_session_data *sd, int idx, int amount)
{
	struct storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct storage *)numdb_search(storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_INVENTORY)
		return;
	if(itemdb_isstorageable(sd->status.inventory[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.inventory[idx].amount)
		return;

	if(storage_additem(sd, stor, &sd->status.inventory[idx], amount) == 0)
		pc_delitem(sd, idx, amount, 0, 4);

	return;
}

/*==========================================
 * �J�v���q�ɂ���o��
 *------------------------------------------
 */
void storage_storageget(struct map_session_data *sd, int idx, int amount)
{
	struct storage *stor;
	int flag;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct storage *)numdb_search(storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if((flag = pc_additem(sd, &stor->store_item[idx], amount,false)) == 0) {
		storage_delitem(sd, stor, idx, amount);
		return;
	}
	clif_storageitemremoved(sd,idx,amount);
	clif_additem(sd,0,0,flag);
	clif_storageitemadded(sd,stor,idx,amount);

	return;
}

/*==========================================
 * �J�v���q�ɂփJ�[�g��������
 *------------------------------------------
 */
void storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount)
{
	struct storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct storage *)numdb_search(storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_CART)
		return;
	if(itemdb_isstorageable(sd->status.cart[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.cart[idx].amount)
		return;

	if(storage_additem(sd, stor, &sd->status.cart[idx], amount) == 0)
		pc_cart_delitem(sd, idx, amount, 0);

	return;
}

/*==========================================
 * �J�v���q�ɂ���J�[�g�֏o��
 *------------------------------------------
 */
void storage_storagegettocart(struct map_session_data *sd, int idx, int amount)
{
	struct storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct storage *)numdb_search(storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(itemdb_iscartable(stor->store_item[idx].nameid) == 0)	// �J�[�g�֏o���邩�`�F�b�N
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if(pc_cart_additem(sd, &stor->store_item[idx], amount) == 0)
		storage_delitem(sd, stor, idx, amount);

	return;
}

/*==========================================
 * �J�v���q�ɂ���ĕۑ�
 *------------------------------------------
 */
void storage_storageclose(struct map_session_data *sd)
{
	struct storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct storage *)numdb_search(storage_db,sd->status.account_id));

	if(stor->dirty) {
		storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
		intif_send_storage(stor);
		if(battle_config.save_player_when_storage_closed) {
			chrif_save(sd,0);
		}
		stor->dirty = 0;
	}
	stor->storage_status   = 0;
	sd->state.storage_flag = 0;
	clif_storageclose(sd);

	return;
}

/*==========================================
 * �J�v���q�ɂ̕ۑ�
 *------------------------------------------
 */
void storage_storage_save(struct map_session_data *sd)
{
	struct storage *stor;

	nullpo_retv(sd);

	stor = (struct storage *)numdb_search(storage_db,sd->status.account_id);
	if(stor && stor->dirty) {
		intif_send_storage(stor);
		stor->dirty = 0;
	}

	return;
}


/*==========================================
 * �M���h�q�Ƀf�[�^�x�[�X
 *------------------------------------------
 */
static struct guild_storage *guild2storage(int guild_id)
{
	struct guild_storage *gs = NULL;

	if(guild_search(guild_id) != NULL) {
		gs = (struct guild_storage *)numdb_search(guild_storage_db,guild_id);
		if(gs == NULL) {
			gs = (struct guild_storage *)aCalloc(1,sizeof(struct guild_storage));
			gs->guild_id = guild_id;
			numdb_insert(guild_storage_db,gs->guild_id,gs);
		}
	}

	return gs;
}

/*==========================================
 * �M���h�q�ɂ��폜
 *------------------------------------------
 */
void storage_guild_delete(int guild_id)
{
	struct guild_storage *gstor = (struct guild_storage *)numdb_erase(guild_storage_db,guild_id);

	if(gstor)
		aFree(gstor);

	return;
}

/*==========================================
 * �M���h�q�ɂ��J��
 *------------------------------------------
 */
int storage_guild_storageopen(struct map_session_data *sd)
{
	struct guild_storage *gstor;
	int gmlvl = 0;

	nullpo_retr(0, sd);

	if(sd->status.guild_id <= 0)
		return 2;
	if(sd->state.storage_flag == 2)
		return 3;	// ���ɃM���h�q�ɂ��J���Ă���

	gmlvl = pc_isGM(sd);
	if(gmlvl > 0 && battle_config.gm_can_drop_lv > gmlvl)
		return 2;	// �ݒ肵�Ă���GM���x�����Ⴂ

	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����


	if((gstor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id)) != NULL) {
		gstor->storage_status  = 1;
		sd->state.storage_flag = 2;
		clif_inventoryStart(sd, 3, msg_txt(209));
		clif_guildstorageitemlist(sd,gstor);
		clif_guildstorageequiplist(sd,gstor);
		clif_updateguildstorageamount(sd,gstor);
		clif_inventoryEnd(sd, 3);
	} else {
		intif_request_guild_storage(sd->status.account_id,sd->status.guild_id);
	}

	return 0;
}

/*==========================================
 * �M���h�q�Ƀf�[�^�̎�M
 *------------------------------------------
 */
int storage_guild_storageload(int account_id, int guild_id, struct guild_storage *s)
{
	struct map_session_data *sd;
	struct guild_storage *gstor;

	nullpo_retr(1, s);

	if(guild_id <= 0)
		return 0;

	sd = map_id2sd(account_id);
	if(sd == NULL || sd->state.waitingdisconnect) {
		if(battle_config.error_log && sd == NULL)
			printf("storage_guild_storageload: user not found %d\n", account_id);
		intif_unlock_guild_storage(guild_id);
		return 1;
	}

	// ���ɑq�ɂ��J���ĂȂ����`�F�b�N
	if(sd->state.storage_flag == 2)
		return 0;
	if(sd->state.storage_flag == 1)
		storage_storageclose(sd);
	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����
	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����
	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����


	gstor = guild2storage(guild_id);
	if(!gstor) {
		if(battle_config.error_log)
			printf("storage_guild_storageload: error guild_id %d not exist\n", guild_id);
		return 1;
	}

	if(battle_config.save_log)
		printf("guild_storageload: %d\n", account_id);

	memcpy(gstor, s, sizeof(struct guild_storage));
	storage_sortitem(gstor->store_item, MAX_GUILD_STORAGE, &gstor->sortkey, battle_config.guild_storage_sort);
	gstor->storage_status  = 1;
	sd->state.storage_flag = 2;
	clif_inventoryStart(sd, 3, msg_txt(209));
	clif_guildstorageitemlist(sd,gstor);
	clif_guildstorageequiplist(sd,gstor);
	clif_updateguildstorageamount(sd,gstor);
	clif_inventoryEnd(sd, 3);

	return 0;
}

/*==========================================
 * �M���h�q�ɂփA�C�e���ǉ�
 *------------------------------------------
 */
static int storage_guild_additem(struct map_session_data *sd,struct guild_storage *stor,struct item *item_data,int amount)
{
	struct item_data *data;
	int i;

	nullpo_retr(1, sd);
	nullpo_retr(1, stor);
	nullpo_retr(1, item_data);

	if(item_data->nameid <= 0 || amount <= 0)
		return 1;

	nullpo_retr(1, data = itemdb_search(item_data->nameid));

	if(!itemdb_isequip2(data)) {
		// �����i�ł͂Ȃ��̂ŁA�����L�i�Ȃ���̂ݕω�������
		for(i=0; i<MAX_GUILD_STORAGE; i++) {
			if(stor->store_item[i].nameid  == item_data->nameid  &&
			   stor->store_item[i].card[0] == item_data->card[0] &&
			   stor->store_item[i].card[1] == item_data->card[1] &&
			   stor->store_item[i].card[2] == item_data->card[2] &&
			   stor->store_item[i].card[3] == item_data->card[3] &&
			   stor->store_item[i].limit   == item_data->limit)
			{
				if(stor->store_item[i].amount + amount > MAX_AMOUNT)
					return 1;
				stor->store_item[i].amount += amount;
				stor->dirty = 1;
				clif_guildstorageitemadded(sd,stor,i,amount);
				return 0;
			}
		}
	} else if(amount != 1) {
		return 1;
	}

	// �����i�������L�i�������̂ŋ󂫗��֒ǉ�
	for(i=0; i<MAX_GUILD_STORAGE; i++) {
		if(stor->store_item[i].nameid == 0) {
			memcpy(&stor->store_item[i],item_data,sizeof(stor->store_item[0]));
			stor->store_item[i].id     = ++stor->sortkey;
			stor->store_item[i].amount = amount;
			stor->storage_amount++;
			stor->dirty = 1;
			clif_guildstorageitemadded(sd,stor,i,amount);
			clif_updateguildstorageamount(sd,stor);
			return 0;
		}
	}

	return 1;
}

/*==========================================
 * �M���h�q�ɂ���A�C�e�������炷
 *------------------------------------------
 */
static void storage_guild_delitem(struct map_session_data *sd,struct guild_storage *stor,int n,int amount)
{
	nullpo_retv(sd);
	nullpo_retv(stor);

	if(stor->store_item[n].nameid == 0 || stor->store_item[n].amount < amount)
		return;

	stor->store_item[n].amount -= amount;
	if(stor->store_item[n].amount == 0) {
		memset(&stor->store_item[n],0,sizeof(stor->store_item[0]));
		stor->store_item[n].id = 0;
		stor->storage_amount--;
		clif_updateguildstorageamount(sd,stor);
	}
	stor->dirty = 1;
	clif_storageitemremoved(sd,n,amount);

	return;
}

/*==========================================
 * �M���h�q�ɂ֓����
 *------------------------------------------
 */
void storage_guild_storageadd(struct map_session_data *sd, int idx, int amount)
{
	struct guild_storage *stor;

	nullpo_retv(sd);

	if((stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id)) == NULL)
		return;
	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_INVENTORY)
		return;
	if(itemdb_isguildstorageable(sd->status.inventory[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.inventory[idx].amount)
		return;

	if(storage_guild_additem(sd, stor, &sd->status.inventory[idx], amount) == 0)
		pc_delitem(sd, idx, amount, 0, 4);

	return;
}

/*==========================================
 * �M���h�q�ɂ���o��
 *------------------------------------------
 */
void storage_guild_storageget(struct map_session_data *sd, int idx, int amount)
{
	struct guild_storage *stor;
	int flag;

	nullpo_retv(sd);

	if((stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id)) == NULL)
		return;
	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_GUILD_STORAGE)
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if((flag = pc_additem(sd,&stor->store_item[idx],amount,false)) == 0)
		storage_guild_delitem(sd, stor, idx, amount);
	else
		clif_additem(sd,0,0,flag);

	return;
}

/*==========================================
 * �M���h�q�ɂփJ�[�g��������
 *------------------------------------------
 */
void storage_guild_storageaddfromcart(struct map_session_data *sd, int idx, int amount)
{
	struct guild_storage *stor;

	nullpo_retv(sd);

	if((stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id)) == NULL)
		return;
	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_CART)
		return;
	if(itemdb_isguildstorageable(sd->status.cart[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.cart[idx].amount)
		return;

	if(storage_guild_additem(sd, stor, &sd->status.cart[idx], amount) == 0)
		pc_cart_delitem(sd, idx, amount, 0);

	return;
}

/*==========================================
 * �M���h�q�ɂ���J�[�g�֏o��
 *------------------------------------------
 */
void storage_guild_storagegettocart(struct map_session_data *sd, int idx, int amount)
{
	struct guild_storage *stor;

	nullpo_retv(sd);

	if((stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id)) == NULL)
		return;
	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_GUILD_STORAGE)
		return;
	if(itemdb_iscartable(stor->store_item[idx].nameid) == 0)	// �J�[�g�֏o���邩�`�F�b�N
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if(pc_cart_additem(sd, &stor->store_item[idx], amount) == 0)
		storage_guild_delitem(sd, stor, idx, amount);

	return;
}

/*==========================================
 * �M���h�q�ɂ���ĕۑ�
 *------------------------------------------
 */
void storage_guild_storageclose(struct map_session_data *sd)
{
	printf("storage_guild_storageclose: %d\n", sd->status.account_id);
	struct guild_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id));

	if(stor->dirty) {
		storage_sortitem(stor->store_item, MAX_GUILD_STORAGE, &stor->sortkey, battle_config.guild_storage_sort);
		intif_send_guild_storage(sd->status.account_id,stor);
		if(battle_config.save_player_when_storage_closed) {
			chrif_save(sd,0);
		}
		stor->dirty = 0;
	}
	stor->storage_status   = 0;
	sd->state.storage_flag = 0;
	clif_storageclose(sd);
	intif_unlock_guild_storage(sd->status.guild_id);

	return;
}

/*==========================================
 * �M���h�q�ɂ̕ۑ�
 *------------------------------------------
 */
void storage_guild_storagesave(struct map_session_data *sd)
{
	struct guild_storage *stor;

	nullpo_retv(sd);

	stor = (struct guild_storage *)numdb_search(guild_storage_db,sd->status.guild_id);
	if(stor && stor->dirty) {
		intif_send_guild_storage(sd->status.account_id,stor);
		stor->dirty = 0;
	}

	return;
}

/*==========================================
 * �M���h�q�ɂ̃f�b�h���b�N�`�F�b�N
 *------------------------------------------
 */
int storage_guild_checklock(int guild_id)
{
	int i;
	struct guild *g;
	struct guild_storage *stor;

	if((g = guild_search(guild_id)) == NULL)
		return 0;

	for(i = 0; i < g->max_member; i++) {
		struct map_session_data *sd = g->member[i].sd;
		if(sd && sd->state.storage_flag == 2) {
			// �q�ɂ��J���Ă���l�������̂�OK
			return 0;
		}
	}

	// �N���g�p���Ă��Ȃ��̂Ńf�b�h���b�N����������
	stor = (struct guild_storage *)numdb_search(guild_storage_db, guild_id);
	if(stor) {
		stor->storage_status = 0;
	}
	intif_deadlock_guild_storage(guild_id);

	return 1;
}




































/*==========================================
 * �T�u�P�J�v���q�Ƀf�[�^�x�[�X
 *------------------------------------------
 */
static struct s1_storage *account2s1storage(int account_id)
{
	struct s1_storage *stor;

	stor = (struct s1_storage *)numdb_search(s1_storage_db,account_id);
	if(stor == NULL) {
		stor = (struct s1_storage *)aCalloc(1,sizeof(struct s1_storage));
		stor->account_id = account_id;
		numdb_insert(s1_storage_db,stor->account_id,stor);
	}
	return stor;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ��폜
 *------------------------------------------
 */
void s1_storage_delete(int account_id)
{
	struct s1_storage *stor = (struct s1_storage *)numdb_erase(s1_storage_db,account_id);

	if(stor)
		aFree(stor);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ��J��
 *------------------------------------------
 */
int s1_storage_storageopen(struct map_session_data *sd)
{
	struct s1_storage *stor;
	int gmlvl = 0;

	nullpo_retr(0, sd);

	if(sd->state.storage_flag == 3)
		return 0;	// ���ɃT�u�P�J�v���q�ɂ��J���Ă���

	gmlvl = pc_isGM(sd);
	if(gmlvl > 0 && battle_config.gm_can_drop_lv > gmlvl)
		return 0;	// �ݒ肵�Ă���GM���x�����Ⴂ

	if((stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id)) != NULL) {
		if(stor->storage_status)
			return 1;
		stor->storage_status = 1;
	}

	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd); // �M���h�q�ɂ����łɊJ���Ă���ꍇ����

	if(stor != NULL) {
		sd->state.storage_flag = 3;
		clif_inventoryStart(sd, 2, msg_txt(215));
		clif_s1_storageitemlist(sd,stor);
		clif_s1_storageequiplist(sd,stor);
		clif_update_s1_storageamount(sd,stor);
		clif_inventoryEnd(sd, 2);
	} else {
		intif_request_s1_storage(sd->status.account_id);
	}
	return 0;
}

/*==========================================
 * �T�u�P�J�v���q�Ƀf�[�^�̎�M
 *------------------------------------------
 */
int s1_storage_storageload(int account_id, struct s1_storage *s)
{
	struct map_session_data *sd;
	struct s1_storage *stor;

	nullpo_retr(1, s);

	sd = map_id2sd(account_id);
	if(sd == NULL || sd->state.waitingdisconnect) {
		if(battle_config.error_log && sd == NULL)
			printf("s1_storage_storageload: user not found %d\n", account_id);
		s1_storage_delete(account_id);
		return 1;
	}

	// ���ɑq�ɂ��J���ĂȂ����`�F�b�N
	if(sd->state.storage_flag == 3)
		return 0;
	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd);
		
	stor = account2s1storage(account_id);

	if(battle_config.save_log)
		printf("storageload: %d\n", account_id);

	memcpy(stor, s, sizeof(struct s1_storage));
	storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
	stor->storage_status   = 1;
	sd->state.storage_flag = 3;
	clif_inventoryStart(sd, 2, msg_txt(215));
	clif_s1_storageitemlist(sd,stor);
	clif_s1_storageequiplist(sd,stor);
	clif_update_s1_storageamount(sd,stor);
	clif_inventoryEnd(sd, 2);

	return 0;
}

/*==========================================
 * �T�u�P�J�v���q�ɂփA�C�e���ǉ�
 *------------------------------------------
 */
static int s1_storage_additem(struct map_session_data *sd,struct s1_storage *stor,struct item *item_data,int amount)
{
	struct item_data *data;
	int i;

	nullpo_retr(1, sd);
	nullpo_retr(1, stor);
	nullpo_retr(1, item_data);

	if(item_data->nameid <= 0 || amount <= 0)
		return 1;

	nullpo_retr(1, data = itemdb_search(item_data->nameid));

	if(!itemdb_isequip2(data)) {
		// �����i�ł͂Ȃ��̂ŁA�����L�i�Ȃ���̂ݕω�������
		for(i=0; i<MAX_STORAGE; i++) {
			if(stor->store_item[i].nameid  == item_data->nameid  &&
			   stor->store_item[i].card[0] == item_data->card[0] &&
			   stor->store_item[i].card[1] == item_data->card[1] &&
			   stor->store_item[i].card[2] == item_data->card[2] &&
			   stor->store_item[i].card[3] == item_data->card[3] &&
			   stor->store_item[i].limit   == item_data->limit)
			{
				if(stor->store_item[i].amount + amount > MAX_AMOUNT)
					return 1;
				stor->store_item[i].amount += amount;
				stor->dirty = 1;
				clif_s1_storageitemadded(sd,stor,i,amount);
				return 0;
			}
		}
	} else if(amount != 1) {
		return 1;
	}

	// �����i�������L�i�������̂ŋ󂫗��֒ǉ�
	for(i=0; i<MAX_STORAGE; i++) {
		if(stor->store_item[i].nameid == 0) {
			memcpy(&stor->store_item[i],item_data,sizeof(stor->store_item[0]));
			stor->store_item[i].id     = ++stor->sortkey;
			stor->store_item[i].amount = amount;
			stor->storage_amount++;
			stor->dirty = 1;
			clif_s1_storageitemadded(sd,stor,i,amount);
			clif_update_s1_storageamount(sd,stor);
			return 0;
		}
	}

	return 1;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ���A�C�e�������炷
 *------------------------------------------
 */
static void s1_storage_delitem(struct map_session_data *sd,struct s1_storage *stor,int n,int amount)
{
	nullpo_retv(sd);
	nullpo_retv(stor);

	if(stor->store_item[n].nameid == 0 || stor->store_item[n].amount < amount)
		return;

	stor->store_item[n].amount -= amount;
	if(stor->store_item[n].amount <= 0) {
		memset(&stor->store_item[n],0,sizeof(stor->store_item[0]));
		stor->store_item[n].id = 0;
		stor->storage_amount--;
		clif_update_s1_storageamount(sd,stor);
	}
	stor->dirty = 1;
	clif_storageitemremoved(sd,n,amount);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ֓����
 *------------------------------------------
 */
void s1_storage_storageadd(struct map_session_data *sd, int idx, int amount)
{
	struct s1_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_INVENTORY)
		return;
	if(itemdb_isstorageable(sd->status.inventory[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.inventory[idx].amount)
		return;

	if(s1_storage_additem(sd, stor, &sd->status.inventory[idx], amount) == 0)
		pc_delitem(sd, idx, amount, 0, 4);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ���o��
 *------------------------------------------
 */
void s1_storage_storageget(struct map_session_data *sd, int idx, int amount)
{
	struct s1_storage *stor;
	int flag;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if((flag = pc_additem(sd, &stor->store_item[idx], amount,false)) == 0) {
		s1_storage_delitem(sd, stor, idx, amount);
		return;
	}
	clif_storageitemremoved(sd,idx,amount);
	clif_additem(sd,0,0,flag);
	clif_s1_storageitemadded(sd,stor,idx,amount);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂփJ�[�g��������
 *------------------------------------------
 */
void s1_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount)
{
	struct s1_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_CART)
		return;
	if(itemdb_isstorageable(sd->status.cart[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.cart[idx].amount)
		return;

	if(s1_storage_additem(sd, stor, &sd->status.cart[idx], amount) == 0)
		pc_cart_delitem(sd, idx, amount, 0);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ���J�[�g�֏o��
 *------------------------------------------
 */
void s1_storage_storagegettocart(struct map_session_data *sd, int idx, int amount)
{
	struct s1_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(itemdb_iscartable(stor->store_item[idx].nameid) == 0)	// �J�[�g�֏o���邩�`�F�b�N
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if(pc_cart_additem(sd, &stor->store_item[idx], amount) == 0)
		s1_storage_delitem(sd, stor, idx, amount);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ���ĕۑ�
 *------------------------------------------
 */
void s1_storage_storageclose(struct map_session_data *sd)
{
	struct s1_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id));

	if(stor->dirty) {
		storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
		intif_send_s1_storage(stor);
		if(battle_config.save_player_when_storage_closed) {
			chrif_save(sd,0);
		}
		stor->dirty = 0;
	}
	stor->storage_status   = 0;
	sd->state.storage_flag = 0;
	clif_storageclose(sd);

	return;
}

/*==========================================
 * �T�u�P�J�v���q�ɂ̕ۑ�
 *------------------------------------------
 */
void s1_storage_storage_save(struct map_session_data *sd)
{
	struct s1_storage *stor;

	nullpo_retv(sd);

	stor = (struct s1_storage *)numdb_search(s1_storage_db,sd->status.account_id);
	if(stor && stor->dirty) {
		intif_send_s1_storage(stor);
		stor->dirty = 0;
	}

	return;
}




/*==========================================
 * �T�u2�J�v���q�Ƀf�[�^�x�[�X
 *------------------------------------------
 */
static struct s2_storage *account2s2storage(int account_id)
{
	struct s2_storage *stor;

	stor = (struct s2_storage *)numdb_search(s2_storage_db,account_id);
	if(stor == NULL) {
		stor = (struct s2_storage *)aCalloc(1,sizeof(struct s2_storage));
		stor->account_id = account_id;
		numdb_insert(s2_storage_db,stor->account_id,stor);
	}
	return stor;
}

/*==========================================
 * �T�u2�J�v���q�ɂ��폜
 *------------------------------------------
 */
void s2_storage_delete(int account_id)
{
	struct s2_storage *stor = (struct s2_storage *)numdb_erase(s2_storage_db,account_id);

	if(stor)
		aFree(stor);

	return;
}

/*==========================================
 * �T�u2�J�v���q�ɂ��J��
 *------------------------------------------
 */
int s2_storage_storageopen(struct map_session_data *sd)
{
	struct s2_storage *stor;
	int gmlvl = 0;

	nullpo_retr(0, sd);

	if(sd->state.storage_flag == 4)
		return 0;	// ���ɃT�u�Q�J�v���q�ɂ��J���Ă���

	gmlvl = pc_isGM(sd);
	if(gmlvl > 0 && battle_config.gm_can_drop_lv > gmlvl)
		return 0;	// �ݒ肵�Ă���GM���x�����Ⴂ

	if((stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id)) != NULL) {
		if(stor->storage_status)
			return 1;
		stor->storage_status = 1;
	}

	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd); // �M���h�q�ɂ����łɊJ���Ă���ꍇ����

	if(stor != NULL) {
		sd->state.storage_flag = 4;
		clif_inventoryStart(sd, 2, msg_txt(216));
		clif_s2_storageitemlist(sd,stor);
		clif_s2_storageequiplist(sd,stor);
		clif_update_s2_storageamount(sd,stor);
		clif_inventoryEnd(sd, 2);
	} else {
		intif_request_s2_storage(sd->status.account_id);
	}
	return 0;
}

/*==========================================
 * �T�u2�J�v���q�Ƀf�[�^�̎�M
 *------------------------------------------
 */
int s2_storage_storageload(int account_id, struct s2_storage *s)
{
	struct map_session_data *sd;
	struct s2_storage *stor;

	nullpo_retr(1, s);

	sd = map_id2sd(account_id);
	if(sd == NULL || sd->state.waitingdisconnect) {
		if(battle_config.error_log && sd == NULL)
			printf("s2_storage_storageload: user not found %d\n", account_id);
		s2_storage_delete(account_id);
		return 1;
	}

	// ���ɑq�ɂ��J���ĂȂ����`�F�b�N
	if(sd->state.storage_flag == 4)
		return 0;
	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 5)
		s3_storage_storageclose(sd); // �T�u3�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd);

	stor = account2s2storage(account_id);

	if(battle_config.save_log)
		printf("s2_storageload: %d\n", account_id);

	memcpy(stor, s, sizeof(struct s2_storage));
	storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
	stor->storage_status   = 1;
	sd->state.storage_flag = 4;
	clif_inventoryStart(sd, 2, msg_txt(216));
	clif_s2_storageitemlist(sd,stor);
	clif_s2_storageequiplist(sd,stor);
	clif_update_s2_storageamount(sd,stor);
	clif_inventoryEnd(sd, 2);

	return 0;
}

/*==========================================
 * �T�u2�J�v���q�ɂփA�C�e���ǉ�
 *------------------------------------------
 */
static int s2_storage_additem(struct map_session_data *sd,struct s2_storage *stor,struct item *item_data,int amount)
{
	struct item_data *data;
	int i;

	nullpo_retr(1, sd);
	nullpo_retr(1, stor);
	nullpo_retr(1, item_data);

	if(item_data->nameid <= 0 || amount <= 0)
		return 1;

	nullpo_retr(1, data = itemdb_search(item_data->nameid));

	if(!itemdb_isequip2(data)) {
		// �����i�ł͂Ȃ��̂ŁA�����L�i�Ȃ���̂ݕω�������
		for(i=0; i<MAX_STORAGE; i++) {
			if(stor->store_item[i].nameid  == item_data->nameid  &&
			   stor->store_item[i].card[0] == item_data->card[0] &&
			   stor->store_item[i].card[1] == item_data->card[1] &&
			   stor->store_item[i].card[2] == item_data->card[2] &&
			   stor->store_item[i].card[3] == item_data->card[3] &&
			   stor->store_item[i].limit   == item_data->limit)
			{
				if(stor->store_item[i].amount + amount > MAX_AMOUNT)
					return 1;
				stor->store_item[i].amount += amount;
				stor->dirty = 1;
				clif_s2_storageitemadded(sd,stor,i,amount);
				return 0;
			}
		}
	} else if(amount != 1) {
		return 1;
	}

	// �����i�������L�i�������̂ŋ󂫗��֒ǉ�
	for(i=0; i<MAX_STORAGE; i++) {
		if(stor->store_item[i].nameid == 0) {
			memcpy(&stor->store_item[i],item_data,sizeof(stor->store_item[0]));
			stor->store_item[i].id     = ++stor->sortkey;
			stor->store_item[i].amount = amount;
			stor->storage_amount++;
			stor->dirty = 1;
			clif_s2_storageitemadded(sd,stor,i,amount);
			clif_update_s2_storageamount(sd,stor);
			return 0;
		}
	}

	return 1;
}

/*==========================================
 * �T�u�Q�J�v���q�ɂ���A�C�e�������炷
 *------------------------------------------
 */
static void s2_storage_delitem(struct map_session_data *sd,struct s2_storage *stor,int n,int amount)
{
	nullpo_retv(sd);
	nullpo_retv(stor);

	if(stor->store_item[n].nameid == 0 || stor->store_item[n].amount < amount)
		return;

	stor->store_item[n].amount -= amount;
	if(stor->store_item[n].amount <= 0) {
		memset(&stor->store_item[n],0,sizeof(stor->store_item[0]));
		stor->store_item[n].id = 0;
		stor->storage_amount--;
		clif_update_s2_storageamount(sd,stor);
	}
	stor->dirty = 1;
	clif_storageitemremoved(sd,n,amount);

	return;
}

/*==========================================
 * �T�u�Q�J�v���q�ɂ֓����
 *------------------------------------------
 */
void s2_storage_storageadd(struct map_session_data *sd, int idx, int amount)
{
	struct s2_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_INVENTORY)
		return;
	if(itemdb_isstorageable(sd->status.inventory[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.inventory[idx].amount)
		return;

	if(s2_storage_additem(sd, stor, &sd->status.inventory[idx], amount) == 0)
		pc_delitem(sd, idx, amount, 0, 4);

	return;
}

/*==========================================
 * �T�u�Q�J�v���q�ɂ���o��
 *------------------------------------------
 */
void s2_storage_storageget(struct map_session_data *sd, int idx, int amount)
{
	struct s2_storage *stor;
	int flag;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if((flag = pc_additem(sd, &stor->store_item[idx], amount,false)) == 0) {
		s2_storage_delitem(sd, stor, idx, amount);
		return;
	}
	clif_storageitemremoved(sd,idx,amount);
	clif_additem(sd,0,0,flag);
	clif_s2_storageitemadded(sd,stor,idx,amount);

	return;
}

/*==========================================
 * �T�u�Q�J�v���q�ɂփJ�[�g��������
 *------------------------------------------
 */
void s2_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount)
{
	struct s2_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_CART)
		return;
	if(itemdb_isstorageable(sd->status.cart[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.cart[idx].amount)
		return;

	if(s2_storage_additem(sd, stor, &sd->status.cart[idx], amount) == 0)
		pc_cart_delitem(sd, idx, amount, 0);

	return;
}

/*==========================================
 * �T�u2�J�v���q�ɂ���J�[�g�֏o��
 *------------------------------------------
 */
void s2_storage_storagegettocart(struct map_session_data *sd, int idx, int amount)
{
	struct s2_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(itemdb_iscartable(stor->store_item[idx].nameid) == 0)	// �J�[�g�֏o���邩�`�F�b�N
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if(pc_cart_additem(sd, &stor->store_item[idx], amount) == 0)
		s2_storage_delitem(sd, stor, idx, amount);

	return;
}

/*==========================================
 * �T�u2�J�v���q�ɂ���ĕۑ�
 *------------------------------------------
 */
void s2_storage_storageclose(struct map_session_data *sd)
{
	struct s2_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id));

	if(stor->dirty) {
		storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
		intif_send_s2_storage(stor);
		if(battle_config.save_player_when_storage_closed) {
			chrif_save(sd,0);
		}
		stor->dirty = 0;
	}
	stor->storage_status   = 0;
	sd->state.storage_flag = 0;
	clif_storageclose(sd);

	return;
}

/*==========================================
 * �T�u2�J�v���q�ɂ̕ۑ�
 *------------------------------------------
 */
void s2_storage_storage_save(struct map_session_data *sd)
{
	struct s2_storage *stor;

	nullpo_retv(sd);

	stor = (struct s2_storage *)numdb_search(s2_storage_db,sd->status.account_id);
	if(stor && stor->dirty) {
		intif_send_s2_storage(stor);
		stor->dirty = 0;
	}

	return;
}


/*==========================================
 * �T�u3�J�v���q�Ƀf�[�^�x�[�X
 *------------------------------------------
 */
static struct s3_storage *account2s3storage(int account_id)
{
	struct s3_storage *stor;

	stor = (struct s3_storage *)numdb_search(s3_storage_db,account_id);
	if(stor == NULL) {
		stor = (struct s3_storage *)aCalloc(1,sizeof(struct s3_storage));
		stor->account_id = account_id;
		numdb_insert(s3_storage_db,stor->account_id,stor);
	}
	return stor;
}

/*==========================================
 * �T�u3�J�v���q�ɂ��폜
 *------------------------------------------
 */
void s3_storage_delete(int account_id)
{
	struct s3_storage *stor = (struct s3_storage *)numdb_erase(s3_storage_db,account_id);

	if(stor)
		aFree(stor);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ��J��
 *------------------------------------------
 */
int s3_storage_storageopen(struct map_session_data *sd)
{
	struct s3_storage *stor;
	int gmlvl = 0;

	nullpo_retr(0, sd);

	if(sd->state.storage_flag == 5)
		return 0;	// ���ɃT�u3�J�v���q�ɂ��J���Ă���

	gmlvl = pc_isGM(sd);
	if(gmlvl > 0 && battle_config.gm_can_drop_lv > gmlvl)
		return 0;	// �ݒ肵�Ă���GM���x�����Ⴂ

	if((stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id)) != NULL) {
		if(stor->storage_status)
			return 1;
		stor->storage_status = 1;
	}

	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd); // �M���h�q�ɂ����łɊJ���Ă���ꍇ����

	if(stor != NULL) {
		sd->state.storage_flag = 5;
		clif_inventoryStart(sd, 2, msg_txt(217));
		clif_s3_storageitemlist(sd,stor);
		clif_s3_storageequiplist(sd,stor);
		clif_update_s3_storageamount(sd,stor);
		clif_inventoryEnd(sd, 2);
	} else {
		intif_request_s3_storage(sd->status.account_id);
	}
	return 0;
}

/*==========================================
 * �T�u3�J�v���q�Ƀf�[�^�̎�M
 *------------------------------------------
 */
int s3_storage_storageload(int account_id, struct s3_storage *s)
{
	struct map_session_data *sd;
	struct s3_storage *stor;

	nullpo_retr(1, s);

	sd = map_id2sd(account_id);
	if(sd == NULL || sd->state.waitingdisconnect) {
		if(battle_config.error_log && sd == NULL)
			printf("s3_storage_storageload: user not found %d\n", account_id);
		s3_storage_delete(account_id);
		return 1;
	}

	// ���ɑq�ɂ��J���ĂȂ����`�F�b�N
	if(sd->state.storage_flag == 5)
		return 0;
	if(sd->state.storage_flag == 1)
		storage_storageclose(sd); // �J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 3)
		s1_storage_storageclose(sd); // �T�u1�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 4)
		s2_storage_storageclose(sd); // �T�u2�J�v���q�ɂ����łɊJ���Ă���ꍇ����

	if(sd->state.storage_flag == 2)
		storage_guild_storageclose(sd);

	stor = account2s3storage(account_id);

	if(battle_config.save_log)
		printf("s3_storageload: %d\n", account_id);

	memcpy(stor, s, sizeof(struct s3_storage));
	storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
	stor->storage_status   = 1;
	sd->state.storage_flag = 5;
	clif_inventoryStart(sd, 2, msg_txt(217));
	clif_s3_storageitemlist(sd,stor);
	clif_s3_storageequiplist(sd,stor);
	clif_update_s3_storageamount(sd,stor);
	clif_inventoryEnd(sd, 2);

	return 0;
}

/*==========================================
 * �T�u3�J�v���q�ɂփA�C�e���ǉ�
 *------------------------------------------
 */
static int s3_storage_additem(struct map_session_data *sd,struct s3_storage *stor,struct item *item_data,int amount)
{
	struct item_data *data;
	int i;

	nullpo_retr(1, sd);
	nullpo_retr(1, stor);
	nullpo_retr(1, item_data);

	if(item_data->nameid <= 0 || amount <= 0)
		return 1;

	nullpo_retr(1, data = itemdb_search(item_data->nameid));

	if(!itemdb_isequip2(data)) {
		// �����i�ł͂Ȃ��̂ŁA�����L�i�Ȃ���̂ݕω�������
		for(i=0; i<MAX_STORAGE; i++) {
			if(stor->store_item[i].nameid  == item_data->nameid  &&
			   stor->store_item[i].card[0] == item_data->card[0] &&
			   stor->store_item[i].card[1] == item_data->card[1] &&
			   stor->store_item[i].card[2] == item_data->card[2] &&
			   stor->store_item[i].card[3] == item_data->card[3] &&
			   stor->store_item[i].limit   == item_data->limit)
			{
				if(stor->store_item[i].amount + amount > MAX_AMOUNT)
					return 1;
				stor->store_item[i].amount += amount;
				stor->dirty = 1;
				clif_s3_storageitemadded(sd,stor,i,amount);
				return 0;
			}
		}
	} else if(amount != 1) {
		return 1;
	}

	// �����i�������L�i�������̂ŋ󂫗��֒ǉ�
	for(i=0; i<MAX_STORAGE; i++) {
		if(stor->store_item[i].nameid == 0) {
			memcpy(&stor->store_item[i],item_data,sizeof(stor->store_item[0]));
			stor->store_item[i].id     = ++stor->sortkey;
			stor->store_item[i].amount = amount;
			stor->storage_amount++;
			stor->dirty = 1;
			clif_s3_storageitemadded(sd,stor,i,amount);
			clif_update_s3_storageamount(sd,stor);
			return 0;
		}
	}

	return 1;
}

/*==========================================
 * �T�u�R�J�v���q�ɂ���A�C�e�������炷
 *------------------------------------------
 */
static void s3_storage_delitem(struct map_session_data *sd,struct s3_storage *stor,int n,int amount)
{
	nullpo_retv(sd);
	nullpo_retv(stor);

	if(stor->store_item[n].nameid == 0 || stor->store_item[n].amount < amount)
		return;

	stor->store_item[n].amount -= amount;
	if(stor->store_item[n].amount <= 0) {
		memset(&stor->store_item[n],0,sizeof(stor->store_item[0]));
		stor->store_item[n].id = 0;
		stor->storage_amount--;
		clif_update_s3_storageamount(sd,stor);
	}
	stor->dirty = 1;
	clif_storageitemremoved(sd,n,amount);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ֓����
 *------------------------------------------
 */
void s3_storage_storageadd(struct map_session_data *sd, int idx, int amount)
{
	struct s3_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_INVENTORY)
		return;
	if(itemdb_isstorageable(sd->status.inventory[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.inventory[idx].amount)
		return;

	if(s3_storage_additem(sd, stor, &sd->status.inventory[idx], amount) == 0)
		pc_delitem(sd, idx, amount, 0, 4);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ���o��
 *------------------------------------------
 */
void s3_storage_storageget(struct map_session_data *sd, int idx, int amount)
{
	struct s3_storage *stor;
	int flag;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if((flag = pc_additem(sd, &stor->store_item[idx], amount,false)) == 0) {
		s3_storage_delitem(sd, stor, idx, amount);
		return;
	}
	clif_storageitemremoved(sd,idx,amount);
	clif_additem(sd,0,0,flag);
	clif_s3_storageitemadded(sd,stor,idx,amount);

	return;
}

/*==========================================
 * �T�u�R�J�v���q�ɂփJ�[�g��������
 *------------------------------------------
 */
void s3_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount)
{
	struct s3_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_CART)
		return;
	if(itemdb_isstorageable(sd->status.cart[idx].nameid) == 0)
		return;
	if(amount < 1 || amount > sd->status.cart[idx].amount)
		return;

	if(s3_storage_additem(sd, stor, &sd->status.cart[idx], amount) == 0)
		pc_cart_delitem(sd, idx, amount, 0);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ���J�[�g�֏o��
 *------------------------------------------
 */
void s3_storage_storagegettocart(struct map_session_data *sd, int idx, int amount)
{
	struct s3_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id));

	if(!stor->storage_status)
		return;
	if(idx < 0 || idx >= MAX_STORAGE)
		return;
	if(itemdb_iscartable(stor->store_item[idx].nameid) == 0)	// �J�[�g�֏o���邩�`�F�b�N
		return;
	if(amount < 1 || amount > stor->store_item[idx].amount)
		return;

	if(pc_cart_additem(sd, &stor->store_item[idx], amount) == 0)
		s3_storage_delitem(sd, stor, idx, amount);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ���ĕۑ�
 *------------------------------------------
 */
void s3_storage_storageclose(struct map_session_data *sd)
{
	struct s3_storage *stor;

	nullpo_retv(sd);
	nullpo_retv(stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id));

	if(stor->dirty) {
		storage_sortitem(stor->store_item, MAX_STORAGE, &stor->sortkey, battle_config.personal_storage_sort);
		intif_send_s3_storage(stor);
		if(battle_config.save_player_when_storage_closed) {
			chrif_save(sd,0);
		}
		stor->dirty = 0;
	}
	stor->storage_status   = 0;
	sd->state.storage_flag = 0;
	clif_storageclose(sd);

	return;
}

/*==========================================
 * �T�u3�J�v���q�ɂ̕ۑ�
 *------------------------------------------
 */
void s3_storage_storage_save(struct map_session_data *sd)
{
	struct s3_storage *stor;

	nullpo_retv(sd);

	stor = (struct s3_storage *)numdb_search(s3_storage_db,sd->status.account_id);
	if(stor && stor->dirty) {
		intif_send_s3_storage(stor);
		stor->dirty = 0;
	}

	return;
}
















































/*==========================================
 *
 *------------------------------------------
 */
static int storage_db_final(void *key,void *data,va_list ap)
{
	aFree(data);
	return 0;
}

static int guild_storage_db_final(void *key,void *data,va_list ap)
{
	aFree(data);
	return 0;
}

static int s1_storage_db_final(void *key,void *data,va_list ap)
{
	aFree(data);
	return 0;
}

static int s2_storage_db_final(void *key,void *data,va_list ap)
{
	aFree(data);
	return 0;
}

static int s3_storage_db_final(void *key,void *data,va_list ap)
{
	aFree(data);
	return 0;
}

/*==========================================
 * �L���b�V���̃N���A
 *------------------------------------------
 */
void storage_clear_cache(void)
{
	if(storage_db)
		numdb_clear(storage_db,storage_db_final);
	if(s1_storage_db)
		numdb_clear(s1_storage_db,s1_storage_db_final);
	if(s2_storage_db)
		numdb_clear(s2_storage_db,s2_storage_db_final);
	if(s3_storage_db)
		numdb_clear(s3_storage_db,s3_storage_db_final);
	if(guild_storage_db)
		numdb_clear(guild_storage_db,guild_storage_db_final);

	return;
}

/*==========================================
 * �I��
 *------------------------------------------
 */
void do_final_storage(void)
{
	if(storage_db) {
		numdb_final(storage_db,storage_db_final);
		storage_db = NULL;
	}
	if(guild_storage_db) {
		numdb_final(guild_storage_db,guild_storage_db_final);
		guild_storage_db = NULL;
	}
	if(s1_storage_db) {
		numdb_final(s1_storage_db,s1_storage_db_final);
		s1_storage_db = NULL;
	}
	if(s2_storage_db) {
		numdb_final(s2_storage_db,s2_storage_db_final);
		s2_storage_db = NULL;
	}
	if(s3_storage_db) {
		numdb_final(s3_storage_db,s3_storage_db_final);
		s3_storage_db = NULL;
	}

	return;
}

/*==========================================
 * ������
 *------------------------------------------
 */
void do_init_storage(void)
{
	storage_db = numdb_init();
	guild_storage_db = numdb_init();
	s1_storage_db = numdb_init();
	s2_storage_db = numdb_init();
	s3_storage_db = numdb_init();

	return;
}
