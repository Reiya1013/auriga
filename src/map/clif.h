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

#ifndef _CLIF_H_
#define _CLIF_H_

#include "map.h"

enum {
	ALL_CLIENT,
	ALL_SAMEMAP,
	AREA,
	AREA_WOS,
	AREA_WOC,
	AREA_WOSC,
	AREA_CHAT_WOC,
	CHAT,
	CHAT_WOS,
	PARTY,
	PARTY_WOS,
	PARTY_SAMEMAP,
	PARTY_SAMEMAP_WOS,
	PARTY_AREA,
	PARTY_AREA_WOS,
	GUILD,
	GUILD_WOS,
	GUILD_SAMEMAP_WOS,
	SELF,
	WIDE_AREA
};

// clif_skill_fail�̃X�L�����sType
enum {
	SKILLFAIL_LEVEL					= 0,	// �X�L���g�p���s�i�X�L�����x���s���j
	SKILLFAIL_SP					= 1,	// SP������܂���B
	SKILLFAIL_HP					= 2,	// HP������܂���B
	SKILLFAIL_MATERIAL				= 3,	// �ޗ�������܂���B
	SKILLFAIL_INTERVAL				= 4,	// �i�X�L���Ďg�p���Ԃ����o�߁j
	SKILLFAIL_ZENY					= 5,	// ����������Ȃ��̂ŃX�L�����g�������ł��܂���B
	SKILLFAIL_WEAPON				= 6,	// ���̑����ł͂��̃X�L�����g�p�ł��܂���B
	SKILLFAIL_REDJEMSTONE			= 7,	// ���b�h�W�F���X�g�[�����K�v�ł��B
	SKILLFAIL_BLUEJEMSTONE			= 8,	// �u���[�W�F���X�g�[�����K�v�ł��B
	SKILLFAIL_WEIGHTOVER			= 9,	// Weight��90%���z���Ă��邽�߁A�X�L�����g���܂���B
	SKILLFAIL_FAILED				= 10,	// �X�L���g�p���s�i�ėp�j
	SKILLFAIL_TOTARGET				= 11,	// ���̋@�\���g�����Ƃ��ł��Ȃ��Ώۂł��B
	SKILLFAIL_ANCILLAOVER			= 12,	// �A���V���̏��L���𒴂��ăX�L�����g�p�ł��܂���B
	SKILLFAIL_HOLYWATER				= 13,	// �������K�v�ł��B
	SKILLFAIL_ANCILLA				= 14,	// �A���V�����K�v�ł��B
	SKILLFAIL_RESTRICT_POS			= 15,	// �����ɂ��A�ݒu�ł��܂���B
	SKILLFAIL_OTHERSKILL			= 16,	// ���̃X�L�����g�p���邽�߂ɂ́A���̃X�L�����K�v�ł��B
	SKILLFAIL_PARTNER				= 17,	// ���̃X�L���͈�l�Ŏg�p�ł��܂���B
	SKILLFAIL_DIRECTION				= 18,	// ���̃X�L���͓�������̂ݎg�p�ł��܂��B
	SKILLFAIL_SUMMON_OVER			= 19,	// ����ȏ�A�����ł��܂���B
	SKILLFAIL_SUMMON_NOTHING		= 20,	// �������ꂽ�G�[�e�������݂��܂���B
	SKILLFAIL_CLONESKILL			= 21,	// �g�p�\�ȃN���[���X�L�������݂��܂���B
	SKILLFAIL_DUPLICATE				= 22,	// ���̃X�L���͏d���Ŏg�p�ł��܂���B
	SKILLFAIL_CONDITION				= 23,	// �X�L���g�p���o���Ȃ���Ԃł��B
	SKILLFAIL_PAINTBRUSH			= 24,	// �y�C���g�u���V���K�v�ł��B
	SKILLFAIL_DRAGON				= 25,	// �h���S���R�掞�̂ݎg�p�\�ł��B
	SKILLFAIL_POSITION				= 26,	// �w�肵���ʒu�ɃX�L�����g�p���邱�Ƃ��o���܂���B

	SKILLFAIL_NEERWALL				= 28,	// �ǂ̋߂��ł̂ݎg�p���邱�Ƃ��ł��܂��B
	SKILLFAIL_EXP					= 29,	// ���̃X�L���́A1���̌o���l���K�v�ɂȂ�܂��B
	SKILLFAIL_PARTNER_SP			= 30,	// �p�[�g�i�[��SP������܂���B
	SKILLFAIL_GC_WEAPONBLOCKING		= 31,	// �E�F�|���u���b�L���O�̘A�g�Ƃ��Ă̂ݎg�p�\�ł��B
	SKILLFAIL_GC_POISONINGWEAPON	= 32,	// �M���`���N���X�̓ł�h�������킪�K�v�ł��B
	SKILLFAIL_MADOGEAR				= 33,	// �����M�A���掞�̂ݎg�p�\�ł��B
	SKILLFAIL_KUNAI					= 34,	// �ꖳ�𑕔�������Ԃł̂ݎg�p�\�ł��B
	SKILLFAIL_NOT_PLAYER			= 35,	// ���̃X�L���̓v���C���[�ɂ̂ݎg�p�\�ł��B
	SKILLFAIL_GVGONLY				= 36,	// ���̃X�L���͍U���ł̂ݎg�p�\�ł��B
	SKILLFAIL_CANONBALL				= 37,	// �L���m���{�[���𑕓U���Ă��������B

	SKILLFAIL_MADOGEAR_HOVERING		= 40,	// �z�o�����O��Ԃ̂ݎg�p�\�ł��B

	SKILLFAIL_GC_POISON				= 43,	// �M���`���N���X�̓ł��K�v�ł��B

	SKILLFAIL_MADOGEAR_RIDE			= 50,	// �����M�A���掞�͎g�p�ł��܂���B
	SKILLFAIL_SPELLBOOK				= 51,	// ���@�����K�v�ł��B
	SKILLFAIL_SPELLBOOK_LEARN		= 52,	// ���@�����ƂĂ�������߁A�����Ȃ�܂��B
	SKILLFAIL_SPELLBOOK_POINT		= 53,	// �ۑ��|�C���g������܂���B
	SKILLFAIL_SPELLBOOK_OVER		= 54,	// ����ȏ�͖��@����ǂ߂܂���B

	SKILLFAIL_CART					= 57,	// �J�[�g�������̂ݎg�p�\�ł��B

	SKILLFAIL_MORESKILL				= 60,	// ����ȏ�̓X�L���g�p���ł��܂���B

	SKILLFAIL_NEED_ITEM				= 71,	// [%s]�� %d�K�v�ł��B
	SKILLFAIL_NEED_EQUIP			= 72,	// [%s]�𑕔�������Ԃ̂݁A�g�p�ł��܂��B
	SKILLFAIL_COMBOSKILL			= 73,	// ����X�L���̘A�g�X�L���ł��B -> [%s]�̘A�g�X�L���ł��B
	SKILLFAIL_SPIRITBALL			= 74,	// �C�e���K�v�ł��B -> �C�e %d���K�v�ł��B

	SKILLFAIL_EL_SUMMON				= 79,	// �������ꂽ���삪���܂���B
	SKILLFAIL_INTIMATE				= 80,	// �e���x���s�����Ă��܂��B
	SKILLFAIL_STYLE_FIGHTER			= 81,	// �X�^�C���`�F���W�t�@�C�^�[��Ԃł̂ݎg�p�\�ł��B
	SKILLFAIL_STYLE_GRAPPLER		= 82,	// �X�^�C���`�F���W�O���b�v���[��Ԃł̂ݎg�p�\�ł��B
	SKILLFAIL_NEARNPC				= 83,	// ���݂̍��W�ł́A�I�X�J�݁E����I�X�E�`���b�g���[���J�݂��ł��܂���BNPC�⃏�[�v�����N���痣��Ă��������B
	SKILLFAIL_BULLET				= 84,	// �e�ۂ𑕔����ĉ������B
	SKILLFAIL_COIN					= 85,	// �R�C�����K�v�ł��B -> �R�C���� %d���K�v�ł��B
	SKILLFAIL_MSGID					= 86,	// �iMSG ID�w��j
	SKILLFAIL_MAP					= 87,	// ���̃}�b�v�ł͎g�p�ł��Ȃ��X�L���ł��B

	SKILLFAIL_VENDING				= 89,	// ���ɘI�X��ݒu���ł��B
	SKILLFAIL_AMOUNT_BULLET			= 90,	// �X�L���������A%d�̒e�ۂ��K�v�ł��B
	SKILLFAIL_AMOUNT_ARROW			= 91,	// �X�L���������A%d�̖�K�v�ł��B
	// ���̃X�L���̓p�[�e�B�[��ԂŎg�p�\�ł��B
	// ���̃X�L���̓p�[�e�B�[���[�_�[�������g�p�\�ł��B
	// �p�[�g�i�[�����݂��Ȃ����A�p�[�g�i�[��SP���s��������A�X�L���g�p�s�̏�Ԃł��B
	// ����𑕔����Ă��܂���B
	SKILLFAIL_SOULENERGY			= 96,	// �\�E���G�i�W�[���K�v�ł��B
	// �E�F�|���u���b�L���O�����㐧�����ԓ��Ɏg�p�\�ł��B
	// %d�𒴂���ݒu�͂ł��܂���B
	// ���[�f�B���O�X�y���u�b�N�ɕۑ����ꂽ���@������܂���B
	SKILLFAIL_AP					= 100,	// AP������܂���B
	SKILLFAIL_SERVANTWEAPOM			= 101,	// �T�[���@���g�E�F�|��%d���K�v�ł��B
	SKILLFAIL_TWINKLINGGALAXY		= 102,	// ���̃X�L���͎��g���ݒu�����V�n�����͈͓̔��Ŏg�p�\�ł��B
	SKILLFAIL_SOULCOLLECT			= 103,	// ���̃X�L���͍��̒~�Ϗ�ԂŎg�p�\�ł��B
	SKILLFAIL_TALISMAN				= 104,	// �아���K�v�ł��B
	// �V���b�g�K�����K�g�����O�K���𑕔����ĉ������B
	// �n���h�K�����K�g�����O�K���𑕔����ĉ������B
	// ���C�t�����O���l�[�h�K���𑕔����ĉ������B
	// �n���h�K�����K�g�����O�K���𑕔����ĉ������B
	// �V���b�g�K�����O���l�[�h�K���𑕔����ĉ������B
	// ���𑕔����ĉ������B
	// �ړ��ł��Ȃ��ꏊ�ׁ̈A�X�L�����g�p�ł��܂���B
};

void clif_sethost(const char*);
void clif_setip(void);
void clif_setport(unsigned short);

unsigned long clif_getip(void);
unsigned short clif_getport(void);
int clif_countusers(void);
void clif_setwaitclose(int fd);
int clif_parse(int fd);

void clif_authok(struct map_session_data *sd);
void clif_authfail_fd(int fd, unsigned int type);
void clif_charselectok(int id);
void clif_disconnect_ack(int fd, int fail);
void clif_dropflooritem(struct flooritem_data *fitem);
void clif_clearflooritem(struct flooritem_data *fitem, int fd);
void clif_clearchar(struct block_list *bl, int type);
int clif_clearchar_delay(unsigned int,struct block_list *);
#define clif_clearchar_area(bl,type) clif_clearchar(bl,type)
void clif_clearchar_id(int id, unsigned char type, int fd);
void clif_spawnpc(struct map_session_data *sd);
void clif_spawnnpc(struct npc_data *nd);
void clif_spawndynamicnpc(struct map_session_data *sd, struct npc_data *nd, int x, int y, int dir, int class_);
void clif_spawnmob(struct mob_data *md);
void clif_spawnpet(struct pet_data *pd);
void clif_walkok(struct map_session_data *sd);
void clif_move(struct block_list *bl);
void clif_changemap(struct map_session_data *sd,const char *mapname,int x,int y);
void clif_changemapserver(struct map_session_data *sd, const char *mapname, int x, int y, unsigned long ip, unsigned short port);
int clif_fixpos(struct block_list *bl);
int clif_fixpos2(struct block_list *bl, int x[4], int y[4]);
void clif_blown(struct block_list *bl, int x, int y);
void clif_fixwalkpos(struct block_list *bl);
void clif_npcbuysell(struct map_session_data* sd, int id);
void clif_buylist(struct map_session_data *sd, struct npc_data *nd);
void clif_selllist(struct map_session_data *sd);
void clif_pointshop_list(struct map_session_data *sd, struct npc_data *nd);
void clif_market_list(struct map_session_data *sd, struct npc_data *nd);
void clif_scriptmes(struct map_session_data *sd, int npcid, const char *mes);
void clif_scriptmessize(struct map_session_data *sd, int npcid, int height, int width);
void clif_scriptmespos(struct map_session_data *sd, int npcid, int x, int y);
void clif_scriptmesalign(struct map_session_data *sd, int npcid, char align);
void clif_scriptnext(struct map_session_data *sd, int npcid);
void clif_scriptclose(struct map_session_data *sd, int npcid);
void clif_scriptclear(struct map_session_data *sd, int npcid);
void clif_scriptmenu(struct map_session_data *sd, int npcid, const char *mes);
void clif_scriptinput(struct map_session_data *sd, int npcid);
void clif_scriptinputstr(struct map_session_data *sd, int npcid);
void clif_viewpoint(struct map_session_data *sd, int npc_id, int type, int x, int y, int id, int color);
void clif_cutin(struct map_session_data *sd, const char *image, int type);
void clif_additem(struct map_session_data *sd, int n, int amount, unsigned char fail);
void clif_delitem(struct map_session_data *sd, short type, int n, int amount);
void clif_delitem_timeout(struct map_session_data *sd, int n, int itemid);
void clif_updatestatus(struct map_session_data *sd, int type);
void clif_changestatus(struct block_list *bl, int type, int val);
void clif_damage(struct block_list *src, struct block_list *dst, unsigned int tick, int sdelay, int ddelay, atn_bignumber damage, int div_, int type, atn_bignumber damage2, int is_spdamage);	// area
void clif_takeitem(struct block_list *src, int dst_id);
void clif_changelook(struct block_list *bl, int type, int val);
//void clif_send_clothcolor(struct block_list *bl);
void clif_arrowequip(struct map_session_data *sd, int idx);
void clif_arrow_fail(struct map_session_data *sd, unsigned short type);
void clif_arrow_create_list(struct map_session_data *sd);
void clif_poison_list(struct map_session_data *sd, short lv);
void clif_reading_sb_list(struct map_session_data *sd);
void clif_magicdecoy_list(struct map_session_data *sd, short lv, short x, short y);
void clif_statusupack(struct map_session_data *sd, int type, int ok, int val);
void clif_equipitemack(struct map_session_data *sd, int n, int pos, unsigned char ok);
void clif_unequipitemack(struct map_session_data *sd, int n, int pos, unsigned char ok);
void clif_misceffect(struct block_list* bl, int type);
void clif_misceffect2(struct block_list *bl, int type);
void clif_misceffect3(int fd, int id, int type);
void clif_misceffect_value(struct block_list* bl, int type, int num);
void clif_remove_misceffect2(struct block_list *bl,int type);
void clif_remove_misceffect3(int fd, int id, int type);
void clif_changeoption(struct block_list *bl);
void clif_changeoption_single(struct block_list* bl, struct map_session_data *tsd);
void clif_changeoption2(struct block_list *bl);
void clif_useitemack(struct map_session_data *sd, int idx, int amount, unsigned char ok);
void clif_GlobalMessage(struct block_list *bl, const char *message, int target);
void clif_GlobalMessage_id(struct block_list *bl, int id, const char *message, int target);
void clif_GlobalMessage2(struct block_list *bl, unsigned int color, const char* mes, size_t len, int target);
void clif_disp_overhead(struct map_session_data *sd, const char* mes);
void clif_createchat(struct map_session_data *sd, unsigned char fail);
void clif_dispchat(struct chat_data *cd, int fd);
void clif_joinchatfail(struct map_session_data *sd, unsigned char fail);
void clif_joinchatok(struct map_session_data *sd, struct chat_data* cd);
void clif_addchat(struct chat_data* cd, struct map_session_data *sd);
void clif_changechatowner(struct chat_data* cd, struct map_session_data *sd);
void clif_clearchat(struct chat_data *cd, int fd);
void clif_leavechat(struct chat_data* cd, struct map_session_data *sd, unsigned char flag);
void clif_changechatstatus(struct chat_data*);
void clif_changedir( struct block_list *bl, int headdir, int dir );
void clif_emotion(struct block_list *bl,int type);
void clif_emotion_self(struct map_session_data *sd,struct block_list *bl,int type);
void clif_talkiebox(struct block_list *bl,const char* talkie);
void clif_wedding_effect(struct block_list *bl);
void clif_callpartner(struct map_session_data *sd);
void clif_divorced(struct map_session_data *sd, const char *name);
void clif_baby_req_fail(struct map_session_data *sd, int type);
void clif_sitting(struct block_list *bl, int sit);
void clif_convertitem(struct map_session_data *sd, int skillid, int skilllv);
void clif_skill_message(struct map_session_data *sd, int skillid, int type);
void clif_dispexp(struct map_session_data *sd, atn_bignumber exp, short type, short quest);
void clif_soundeffect(struct map_session_data *sd,struct block_list *bl,const char *name,int type,int interval);
void clif_bodyrelocation(struct block_list *bl, int x, int y);
void clif_showscript(struct block_list *bl, char *mes);
void clif_showdigit(struct map_session_data* sd, unsigned char type, int value);
void clif_dressing_room(struct map_session_data *sd, int view);
void clif_hat_effects(struct map_session_data* sd, struct block_list* bl, int target);
void clif_hat_effect_single(struct map_session_data* sd, int effectId, bool enable);
void clif_send_achievement_list(struct map_session_data *sd);
void clif_send_achievement_update(struct map_session_data *sd, struct achieve_data *ad);
void clif_crimson_marker(struct map_session_data *sd, struct block_list *bl, bool remove);
void clif_dynamicnpc_create_ack(struct map_session_data *sd, int type);
void clif_item_preview(struct map_session_data *sd, short idx);

// trade
void clif_traderequest(struct map_session_data *sd, const char *name);
void clif_tradestart(struct map_session_data *sd, unsigned char type);
void clif_tradeadditem(struct map_session_data *sd,struct map_session_data *tsd, int idx, int amount);
void clif_tradeitemok(struct map_session_data *sd, unsigned short idx, unsigned char fail);
void clif_tradedeal_lock(struct map_session_data *sd, unsigned char fail);
void clif_tradecancelled(struct map_session_data *sd);
void clif_tradecompleted(struct map_session_data *sd, unsigned char fail);

// storage
void clif_storageitemlist(struct map_session_data *sd, struct storage *stor);
void clif_storageequiplist(struct map_session_data *sd, struct storage *stor);
void clif_updatestorageamount(struct map_session_data *sd, struct storage *stor);
void clif_storageitemadded(struct map_session_data *sd, struct storage *stor, int idx, int amount);
void clif_storageitemremoved(struct map_session_data *sd, int idx, int amount);
void clif_storageclose(struct map_session_data *sd);
void clif_guildstorageitemlist(struct map_session_data *sd, struct guild_storage *stor);
void clif_guildstorageequiplist(struct map_session_data *sd, struct guild_storage *stor);
void clif_updateguildstorageamount(struct map_session_data *sd, struct guild_storage *stor);
void clif_guildstorageitemadded(struct map_session_data *sd, struct guild_storage *stor, int idx, int amount);
void clif_inventoryStart(struct map_session_data *sd, int type, const char *name);
void clif_inventoryEnd(struct map_session_data *sd, int type);

// s storage
void clif_s1_storageitemlist(struct map_session_data *sd, struct s1_storage *stor);
void clif_s1_storageequiplist(struct map_session_data *sd, struct s1_storage *stor);
void clif_update_s1_storageamount(struct map_session_data *sd, struct s1_storage *stor);
void clif_s1_storageitemadded(struct map_session_data *sd, struct s1_storage *stor, int idx, int amount);

void clif_s2_storageitemlist(struct map_session_data *sd, struct s2_storage *stor);
void clif_s2_storageequiplist(struct map_session_data *sd, struct s2_storage *stor);
void clif_update_s2_storageamount(struct map_session_data *sd, struct s2_storage *stor);
void clif_s2_storageitemadded(struct map_session_data *sd, struct s2_storage *stor, int idx, int amount);

void clif_s3_storageitemlist(struct map_session_data *sd, struct s3_storage *stor);
void clif_s3_storageequiplist(struct map_session_data *sd, struct s3_storage *stor);
void clif_update_s3_storageamount(struct map_session_data *sd, struct s3_storage *stor);
void clif_s3_storageitemadded(struct map_session_data *sd, struct s3_storage *stor, int idx, int amount);


int clif_pcinsight(struct block_list *bl, va_list ap);
int clif_pcoutsight(struct block_list *bl, va_list ap);
int clif_mobinsight(struct block_list *bl, va_list ap);
int clif_moboutsight(struct block_list *bl, va_list ap);
int clif_petinsight(struct block_list *bl, va_list ap);
int clif_petoutsight(struct block_list *bl, va_list ap);
int clif_hominsight(struct block_list *bl, va_list ap);
int clif_homoutsight(struct block_list *bl, va_list ap);
int clif_mercinsight(struct block_list *bl, va_list ap);
int clif_mercoutsight(struct block_list *bl, va_list ap);
int clif_eleminsight(struct block_list *bl, va_list ap);
int clif_elemoutsight(struct block_list *bl, va_list ap);
int clif_npcinsight(struct block_list *bl,va_list ap);
int clif_npcoutsight(struct block_list *bl,va_list ap);

void clif_class_change(struct block_list *bl, int class_, int type);

void clif_skillinfoblock(struct map_session_data *sd);
void clif_addskill(struct map_session_data *sd, int skill_num);
void clif_delskill(struct map_session_data *sd, int skill_num);
void clif_skillup(struct map_session_data *sd, int skill_num);

void clif_skillcasting(struct block_list* bl,int src_id,int dst_id,int dst_x,int dst_y,int skill_num,int casttime);
void clif_skillcastcancel(struct block_list* bl);
void clif_skill_fail(struct map_session_data *sd, int skill_id, int type, int btype, int val);
void clif_skill_damage(struct block_list *src,struct block_list *dst,
	unsigned int tick,int sdelay,int ddelay,atn_bignumber damage,int div_,int skill_id,int skill_lv,int type);
void clif_skill_nodamage(struct block_list *src,struct block_list *dst,int skill_id,int heal,int fail);
void clif_skill_poseffect(struct block_list *src,int skill_id,int val,int x,int y,unsigned int tick);
void clif_skillscale(struct block_list *bl, int src_id, int x, int y, int skill_num, int skill_lv, int casttime);
void clif_skill_estimation(struct map_session_data *sd, struct block_list *dst);
void clif_skill_warppoint(struct map_session_data *sd,int skill_num,
	const char *map1,const char *map2,const char *map3,const char *map4);
void clif_skill_memo(struct map_session_data *sd, unsigned char flag);
void clif_skill_teleportmessage(struct map_session_data *sd, unsigned short flag);
void clif_skill_produce_mix_list(struct map_session_data *sd, int trigger, int skillid, int skilllv);
void clif_making_list(struct map_session_data *sd, int trigger, int skillid, int skilllv, int type);

void clif_produceeffect(struct map_session_data *sd, unsigned short flag, int nameid);

void clif_skill_setunit(struct skill_unit *unit);
void clif_skill_delunit(struct skill_unit *unit);

void clif_01ac(struct block_list *bl);

void clif_autospell(struct map_session_data *sd, int skilllv);
void clif_devotion(struct map_session_data *sd);

void clif_spiritball(struct map_session_data *sd);
void clif_spiritball2(struct homun_data *hd);
void clif_coin(struct map_session_data *sd);
void clif_combo_delay(struct block_list *bl, int wait);
void clif_bladestop(struct block_list *src, int dst_id, int flag);
void clif_gospel_message(struct map_session_data *sd, int type);
#define clif_fullstrip_fail(sd) clif_gospel_message((sd), 0x28);
void clif_changemapcell(int m, int x, int y, int cell_type, int type);

void clif_feel_info(struct map_session_data *sd, int skilllv);
void clif_hate_mob(struct map_session_data *sd, int skilllv, int id);
void clif_hate_info(struct map_session_data *sd, int skilllv, int id);
void clif_mission_mob(struct map_session_data *sd, int id, int count);
void clif_angel_message(struct map_session_data *sd);
void clif_feel_display(struct map_session_data *sd, int skilllv);

void clif_status_load(struct block_list *bl, int type, unsigned char flag);
void clif_status_load_id(struct map_session_data *sd, int type, unsigned char flag);
void clif_status_change(struct block_list *bl, int type, unsigned char flag, unsigned int tick, int val1, int val2, int val3);
void clif_status_change_id(struct map_session_data *sd, int id, int type, unsigned char flag, unsigned int tick, int val1, int val2, int val3);
void clif_seteffect_enter(struct block_list *bl, int type, unsigned int tick, int val1, int val2, int val3);

void clif_wis_message(int fd,const char *nick,const char *mes, size_t mes_len, int gmlevel, int ccade);
void clif_wis_end(int fd, unsigned char flag, int ccade);

void clif_solved_charname(struct map_session_data *sd, int char_id);

void clif_insert_card(struct map_session_data *sd, int idx_equip, int idx_card, unsigned char flag);

void clif_itemlist(struct map_session_data *sd);
void clif_equiplist(struct map_session_data *sd);

void clif_cart_additem(struct map_session_data *sd, int n, int amount);
void clif_cart_delitem(struct map_session_data *sd, int n, int amount);
void clif_cart_itemlist(struct map_session_data *sd);
void clif_cart_equiplist(struct map_session_data *sd);
void clif_cart_clear(struct map_session_data *sd);

void clif_item_identify_list(struct map_session_data *sd);
void clif_weapon_refine_list(struct map_session_data *sd);
void clif_weapon_refine_res(struct map_session_data *sd, int flag, int nameid);
void clif_item_identified(struct map_session_data *sd, int idx, unsigned char flag);
void clif_item_repair_list(struct map_session_data *sd, struct map_session_data *dstsd);
void clif_item_repaireffect(struct map_session_data *sd, unsigned char flag, int idx);

void clif_item_skill(struct map_session_data *sd, int skillid, int skilllv, const char *name);

void clif_mvp_effect(struct block_list *bl);
void clif_mvp_item(struct map_session_data *sd, int nameid);
void clif_mvp_fail_item(struct map_session_data *sd);
void clif_mvp_exp(struct map_session_data *sd, int exp);

void clif_send_murderer(struct map_session_data *sd,int target,int flag);
void clif_update_temper(struct map_session_data *sd);

void clif_send_hotkey(struct map_session_data *sd);
void clif_send_hotkeyAll(struct map_session_data *sd);
void clif_bossmapinfo(struct map_session_data *sd, const char *name, int x, int y, int tick, int type);
void clif_openbook(struct map_session_data *sd, int nameid, int page);
void clif_msgstringtable(struct map_session_data *sd, int line);
void clif_msgstringtable2(struct map_session_data *sd, int line, const char *mes);
void clif_msgstringtable3(struct map_session_data *sd, int line, int value);
void clif_show_partyshareitem(struct map_session_data *sd, struct item *item_data);
void clif_break_equip(struct map_session_data *sd, int where);
void clif_send_config(struct map_session_data *sd);
void clif_setfont(struct map_session_data *sd);
void clif_progressbar(struct map_session_data *sd, unsigned int color, unsigned int second);
void clif_progressbar_abort(struct map_session_data *sd);
void clif_skill_cooldown(struct map_session_data *sd, int skillid, unsigned int tick);
void clif_autoshadowspell(struct map_session_data *sd, short lv);
void clif_mshield(struct map_session_data *sd, int num);
void clif_showevent(struct map_session_data *sd, struct block_list *bl, short state, short type);
void clif_musiceffect(struct map_session_data *sd, const char *name);
void clif_partyleader_info(struct party *p, int old_account_id, int account_id);
void clif_elementball(struct map_session_data *sd);
void clif_privateitem(struct map_session_data *sd, short idx, char flag);
void clif_send_partyconfig(struct map_session_data *sd);
void clif_monster_hpinfo(struct map_session_data *sd, struct mob_data *md);
void clif_mapproperty(struct map_session_data *sd);
void clif_send_personalinfo(struct map_session_data *sd);
void clif_soulenergy(struct map_session_data *sd);
void clif_ball(struct map_session_data *sd);

// vending
void clif_openvendingreq(struct map_session_data *sd, int num);
void clif_showvendingboard(struct block_list* bl, const char *shop_title, int fd);
void clif_closevendingboard(struct block_list* bl, int fd);
void clif_vendinglist(struct map_session_data *sd, struct map_session_data *vsd);
void clif_buyvending(struct map_session_data *sd, int idx, int amount, unsigned char fail);
void clif_openvending_ack(struct map_session_data *sd);
int clif_openvending(struct map_session_data *sd);
void clif_vendingreport(struct map_session_data *sd, int idx, int amount, int account_id, int char_id, int value);

void clif_movetoattack(struct map_session_data *sd, struct block_list *bl);

// party
void clif_party_created(struct map_session_data *sd, unsigned char flag);
void clif_party_main_info(struct party *p, int fd);
void clif_party_info(struct party *p, int fd);
void clif_party_invite(struct map_session_data *sd, struct map_session_data *tsd, const char *name);
void clif_party_inviteack(struct map_session_data *sd, const char *nick, unsigned char flag);
void clif_party_option(struct party *p, struct map_session_data *sd, int flag);
void clif_party_leaved(struct party *p, struct map_session_data *sd, int account_id, const char *name, int flag);
void clif_party_message(struct party *p, int account_id, const char *mes, size_t len);
void clif_party_xy(struct map_session_data *sd);
void clif_party_hp(struct map_session_data *sd);
//void clif_party_move(struct party *p, struct map_session_data *sd, unsigned char online);
void clif_party_equiplist(struct map_session_data *sd, struct map_session_data *tsd);

// guild
void clif_guild_created(struct map_session_data *sd, unsigned char flag);
void clif_guild_belonginfo(struct map_session_data *sd, struct guild *g);
void clif_guild_memberlogin_notice(struct guild *g, int idx, unsigned char flag);
void clif_guild_basicinfo(struct map_session_data *sd, struct guild *g);
void clif_guild_allianceinfo(struct map_session_data *sd, struct guild *g);
void clif_guild_memberlist(struct map_session_data *sd, struct guild *g);
void clif_guild_positionchanged(struct guild *g, int idx);
void clif_guild_memberpositionchanged(struct guild *g, int idx);
void clif_guild_emblem(struct map_session_data *sd, struct guild *g);
void clif_guild_skillinfo(struct map_session_data *sd, struct guild *g);
void clif_guild_notice(struct map_session_data *sd, struct guild *g);
void clif_guild_invite(struct map_session_data *sd, struct guild *g);
void clif_guild_inviteack(struct map_session_data *sd, unsigned char flag);
void clif_guild_leave(struct map_session_data *sd, const char *name, const char *mes);
void clif_guild_explusion(struct map_session_data *sd, const char *name, const char *mes);
void clif_guild_message(struct guild *g, const char *mes, size_t len);
void clif_guild_skillup(struct map_session_data *sd, int skill_num, int lv, int flag);
void clif_guild_reqalliance(struct map_session_data *sd, int account_id, const char *name);
void clif_guild_allianceack(struct map_session_data *sd, unsigned int flag);
void clif_guild_delalliance(struct map_session_data *sd, int guild_id, int flag);
void clif_guild_oppositionack(struct map_session_data *sd, unsigned char flag);
void clif_guild_broken(struct map_session_data *sd, unsigned int flag);
void clif_guild_xy(struct map_session_data *sd);

// atcommand
void clif_displaymessage(const int fd, const char* mes);
void clif_disp_onlyself(const int fd, const char *mes);
void clif_GMmessage(struct block_list *bl, const char* mes, size_t len, unsigned int flag);
void clif_announce(struct block_list *bl, const char* mes, size_t len, unsigned int color, int type, int size, int align, int pos_y, unsigned int flag);
void clif_onlymessage(const char *mes, size_t len);
void clif_heal(int fd, int type, int val);
void clif_resurrection(struct block_list *bl, unsigned short type);
void clif_set0199(int fd, unsigned short type);
void clif_pvpset(struct map_session_data *sd, int pvprank, int pvpnum, char type);
void clif_send0199(int m, unsigned short type);
void clif_refine(int fd, unsigned short fail, int idx, int val);
void clif_send_packet(struct map_session_data *sd, const char *message);

// petsystem
void clif_catch_process(struct map_session_data *sd);
void clif_pet_rulet(struct map_session_data *sd, unsigned char data);
void clif_sendegg(struct map_session_data *sd);
void clif_send_petdata(struct map_session_data *sd, unsigned char type, int param);
void clif_send_pethair(struct map_session_data *sd);
void clif_send_petstatus(struct map_session_data *sd);
void clif_pet_performance(struct block_list *bl, int param);
void clif_pet_equip(struct pet_data *pd, int nameid);
void clif_pet_food(struct map_session_data *sd, int foodid, unsigned char fail);

// friend
void clif_friend_send_info( struct map_session_data *sd );
void clif_friend_send_online(const int fd, int account_id, int char_id, int flag );
void clif_friend_add_request(const int fd, struct map_session_data *from_sd );
void clif_friend_add_ack(const int fd, int account_id, int char_id, const char* name, unsigned short flag);
void clif_friend_del_ack(const int fd, int account_id, int char_id );

// ranking
void clif_blacksmith_point(const int fd,const int total,const int point);
void clif_alchemist_point(const int fd,const int total,const int point);
void clif_taekwon_point(const int fd,const int total,const int point);
void clif_pk_point(const int fd,const int total,const int point);
void clif_blacksmith_ranking(const int fd,const char *charname[10],const int point[10]);
void clif_alchemist_ranking(const int fd,const char *charname[10],const int point[10]);
void clif_taekwon_ranking(const int fd,const char *charname[10],const int point[10]);
void clif_pk_ranking(const int fd,const char *charname[10],const int point[10]);
void clif_updata_ranking_point(const int fd,const int total,const int point,int ranking_id);
void clif_rankinglist(const int fd,const char *charname[10],const int point[10],int ranking_id,int mypoint);

// mail
void clif_openmailbox(const int fd);
void clif_send_mailbox(struct map_session_data *sd,int store,struct mail_data md[MAIL_STORE_MAX]);
void clif_receive_mail(struct map_session_data *sd,struct mail_data *md);
void clif_res_sendmail(const int fd,int fail);
void clif_res_sendmail_setappend(const int fd,int idx,int flag);
void clif_mail_getappend(const int fd,int flag);
void clif_arrive_newmail(const int fd,struct mail_data *md);
void clif_deletemail_res(const int fd,int mail_num,int flag);

// homun
void clif_spawnhom(struct homun_data *hd);
void clif_send_homdata(struct map_session_data *sd, int type, int param);
void clif_send_homstatus(struct map_session_data *sd,int flag);
void clif_hom_food(struct map_session_data *sd, int foodid, unsigned char fail);
void clif_homskillinfoblock(struct map_session_data *sd);
void clif_homskillup(struct map_session_data *sd, int skill_num);

// merc
void clif_spawnmerc(struct merc_data *mcd);
void clif_send_mercstatus(struct map_session_data *sd);
void clif_mercskillinfoblock(struct map_session_data *sd);
void clif_mercupdatestatus(struct map_session_data *sd, int type);

// elem
void clif_spawnelem(struct elem_data *eld);
void clif_send_elemstatus(struct map_session_data *sd);
void clif_elemupdatestatus(struct map_session_data *sd, int type);

// quest
void clif_questlist(struct map_session_data *sd);
void clif_questlist_info(struct map_session_data *sd);
void clif_add_questlist(struct map_session_data *sd, int quest_id);
void clif_del_questlist(struct map_session_data *sd, int quest_id);
void clif_update_questcount(struct map_session_data *sd, int quest_id);
void clif_update_questcount2(struct map_session_data *sd, int quest_id);

// party_booking
void clif_bookingregack(struct map_session_data *sd, int flag);
void clif_searchbookingack(struct map_session_data *sd, struct booking_data **list, int count, int flag);
void clif_deletebookingack(struct map_session_data* sd, int flag);
void clif_insertbookinglist(struct map_session_data *sd, struct booking_data *bd);
void clif_updatebookinglist(struct map_session_data* sd, struct booking_data *bd);
void clif_deletebooking(struct map_session_data* sd, unsigned int id);

// buyingstore
void clif_openwindow_buyingstore(struct map_session_data *sd);
void clif_failed_openbuyingstore(struct map_session_data *sd, unsigned short result, int weight);
void clif_showmylist_buyingstore(struct map_session_data *sd);
void clif_show_buyingstore(struct block_list* bl, const char *shop_title, int fd);
void clif_close_buyingstore(struct block_list *bl, int fd);
void clif_itemlist_buyingstore(struct map_session_data *sd, struct map_session_data *ssd);
void clif_update_buyingstore(struct map_session_data *sd, int nameid, short amount, int value, int account_id, int char_id);
void clif_delete_buyingstore(struct map_session_data *sd, short idx, short amount, int value);
void clif_failed_tradebuyingstore(struct map_session_data *sd, short result, int nameid);
void clif_failed_trybuyingstore(struct map_session_data *sd, short result);

// memorial
void clif_memorial_create(struct map_session_data *sd, const char *name, int num, int flag);
void clif_memorial_changewait(struct map_session_data *sd, int num, int flag);
void clif_memorial_status(struct map_session_data *sd, const char *name, unsigned int limit1, unsigned int limit2, int flag);
void clif_memorial_changestatus(struct map_session_data *sd, int type, unsigned int limit, int flag);

// bank
void clif_bank_deposit(struct map_session_data *sd, int flag);
void clif_bank_withdraw(struct map_session_data *sd, int flag);

void clif_GM_kickack(struct map_session_data *sd, int id);
void clif_GM_kick(struct map_session_data *sd, struct map_session_data *tsd, int type);
void clif_manner_message(struct map_session_data* sd, int type);
void clif_GM_silence(struct map_session_data *sd, struct map_session_data *tsd, int type);

// lapineupgrade
void clif_openlapineupgrade(struct map_session_data *sd, int nameid);
void clif_lapineupgradeack(struct map_session_data *sd, int result);

int clif_foreachclient(int (*)(struct map_session_data*,va_list),...);

void packetdb_insert_packet(char *line);
void packetdb_insert_packet_key(unsigned int key1, unsigned int key2, unsigned int key3);

void do_final_clif(void);
void do_init_clif(void);

// httpd chat system
struct httpd_session_data;
void clif_webchat_message(const char* head,const char *mes1,const char *mes2);
void clif_webchat(struct httpd_session_data* sd,const char* url);

#endif
