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

#ifndef _STORAGE_H_
#define _STORAGE_H_

#include "mmo.h"

void storage_delete(int account_id);
int storage_storageopen(struct map_session_data *sd);
int storage_storageload(int account_id, struct storage *s);
void storage_storageadd(struct map_session_data *sd, int idx, int amount);
void storage_storageget(struct map_session_data *sd, int idx, int amount);
void storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount);
void storage_storagegettocart(struct map_session_data *sd, int idx, int amount);
void storage_storageclose(struct map_session_data *sd);
void storage_storage_save(struct map_session_data *sd);

void storage_guild_delete(int guild_id);
int storage_guild_storageopen(struct map_session_data *sd);
int storage_guild_storageload(int account_id, int guild_id, struct guild_storage *s);
void storage_guild_storageadd(struct map_session_data *sd, int idx, int amount);
void storage_guild_storageget(struct map_session_data *sd, int idx, int amount);
void storage_guild_storageaddfromcart(struct map_session_data *sd, int idx, int amount);
void storage_guild_storagegettocart(struct map_session_data *sd, int idx, int amount);
void storage_guild_storageclose(struct map_session_data *sd);
void storage_guild_storagesave(struct map_session_data *sd);

int storage_guild_checklock(int guild_id);

// サブ1倉庫関数
void s1_storage_delete(int account_id);
int s1_storage_storageopen(struct map_session_data *sd);
int s1_storage_storageload(int account_id, struct s1_storage *s);
void s1_storage_storageadd(struct map_session_data *sd, int idx, int amount);
void s1_storage_storageget(struct map_session_data *sd, int idx, int amount);
void s1_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount);
void s1_storage_storagegettocart(struct map_session_data *sd, int idx, int amount);
void s1_storage_storageclose(struct map_session_data *sd);
void s1_storage_storage_save(struct map_session_data *sd);

// サブ2倉庫関数
void s2_storage_delete(int account_id);
int s2_storage_storageopen(struct map_session_data *sd);
int s2_storage_storageload(int account_id, struct s2_storage *s);
void s2_storage_storageadd(struct map_session_data *sd, int idx, int amount);
void s2_storage_storageget(struct map_session_data *sd, int idx, int amount);
void s2_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount);
void s2_storage_storagegettocart(struct map_session_data *sd, int idx, int amount);
void s2_storage_storageclose(struct map_session_data *sd);
void s2_storage_storage_save(struct map_session_data *sd);

// サブ3倉庫関数
void s3_storage_delete(int account_id);
int s3_storage_storageopen(struct map_session_data *sd);
int s3_storage_storageload(int account_id, struct s3_storage *s);
void s3_storage_storageadd(struct map_session_data *sd, int idx, int amount);
void s3_storage_storageget(struct map_session_data *sd, int idx, int amount);
void s3_storage_storageaddfromcart(struct map_session_data *sd, int idx, int amount);
void s3_storage_storagegettocart(struct map_session_data *sd, int idx, int amount);
void s3_storage_storageclose(struct map_session_data *sd);
void s3_storage_storage_save(struct map_session_data *sd);

void do_init_storage(void);
void do_final_storage(void);
void storage_clear_cache(void);

#endif
