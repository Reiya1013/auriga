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

// Original : mmo.h 2003/03/14 12:07:02 Rev.1.7

#ifndef	_MMO_H_
#define	_MMO_H_

#include <stdio.h>
#include <string.h>

#include "utils.h"

#pragma pack(4)

#define AUTH_FIFO_SIZE 256
#define MAPSERVER_TAGNAME 16

#define MAX_INVENTORY 100
#define MAX_AMOUNT 30000
#define MAX_ZENY 2147483647
#define MAX_CART 100
#define GLOBAL_REG_NUM 96
#define ACCOUNT_REG_NUM 16
#define ACCOUNT_REG2_NUM 16
#define DEFAULT_WALK_SPEED 150
#define MIN_WALK_SPEED 0
#define MAX_WALK_SPEED 1000
#define MAX_STORAGE 1000
#define MAX_GUILD_STORAGE 1000
#define MAX_PARTY 12
#define MAX_GUILD 76
#define MAX_GUILDPOSITION 20
#define MAX_GUILDEXPLUSION 32
#define MAX_GUILDALLIANCE 16
#define MAX_GUILDCASTLE 30
#define MAX_GUILDLEVEL 50
#define MAX_FRIEND 20

#define MAX_STATUSCHANGE 900

#define MAX_PORTAL_MEMO 3
#define MAIL_STORE_MAX 30

#if PACKETVER < 20090603
	#define MAX_HOTKEYS 27
#elif PACKETVER < 20090617
	#define MAX_HOTKEYS 36
#elif PACKETVER < 20190522
	#define MAX_HOTKEYS 38
#else
	#define MAX_HOTKEYS 74
#endif
#if PACKETVER < 20190522
	#define MAX_HOTKEYS_TAB 1
#else
	#define MAX_HOTKEYS_TAB 2
#endif

#define MAX_HAIR_STYLE 28
#define MAX_HAIR_COLOR 9
#define MAX_CLOTH_COLOR 5

#define WEDDING_RING_M 2634
#define WEDDING_RING_F 2635

#define MAX_RANKING 4	// ランキング数
#define MAX_RANKER  10	// ランキング人数

#define MAX_HOMUN_DB 16			// ホムの数
#define HOM_ID 6001			// ホムID開始値

#define MAX_HOMUN_S_DB 5		// ホムSの数
#define HOM_S_ID 6048			// ホムSID開始値

#define MAX_MERC_DB 50			// 傭兵の数
#define MAX_MERC_TYPE 3			// 傭兵の種�?

#define MAX_ELEM_DB 17			// 精霊�?�数
#define ELEM_ID 2114			// 精霊IDの開始値

// スキルID定義
#define SECOND_SKILLID  1001		// 2次職クエストスキルIDの開始値
#define THIRD1_SKILLID  2001		// 3次職1スキルIDの開始値
#define THIRD2_SKILLID  2201		// 3次職2スキルIDの開始値
#define THIRD3_SKILLID  3001		// 3次職3スキルIDの開始値
#define THIRD4_SKILLID  5001		// 3次職4スキルIDの開始値
#define FOURTH1_SKILLID 5201		// 4次職1スキルIDの開始値
#define FOURTH2_SKILLID 6001		// 4次職2スキルIDの開始値
#define HOM_SKILLID     8001		// ホムスキルIDの開始値
#define MERC_SKILLID    8201		// 傭兵スキルIDの開始値
#define ELEM_SKILLID    8401		// 精霊スキルIDの開始値
#define ABR_SKILLID     8601		// ABRスキルIDの開始値
#define GUILD_SKILLID  10000		// ギルドスキルIDの開始値

#define MAX_SKILLID         (  784+1)	// スキルIDの終�?値
#define MAX_SECOND_SKILLID  ( 1019+1)	// 2次職クエストスキルIDの終�?値
#define MAX_THIRD1_SKILLID  ( 2057+1)	// 3次職1スキルIDの終�?値
#define MAX_THIRD2_SKILLID  ( 2612+1)	// 3次職2スキルIDの終�?値
#define MAX_THIRD3_SKILLID  ( 3045+1)	// 3次職3スキルIDの終�?値
#define MAX_THIRD4_SKILLID  ( 5078+1)	// 3次職4スキルIDの終�?値
#define MAX_FOURTH1_SKILLID ( 5497+1)	// 4次職1スキルIDの終�?値
#define MAX_FOURTH2_SKILLID ( 6006+1)	// 4次職1スキルIDの終�?値
#define MAX_HOM_SKILLID     ( 8059+1)	// ホムスキルIDの終�?値
#define MAX_MERC_SKILLID    ( 8241+1)	// 傭兵スキルIDの終�?値
#define MAX_ELEM_SKILLID    ( 8457+1)	// 精霊スキルIDの終�?値
#define MAX_ABR_SKILLID     ( 8605+1)	// ABRスキルIDの終�?値
#define MAX_GUILD_SKILLID   (10019+1)	// ギルドスキルIDの終�?値

#define MAX_SKILL        (MAX_SKILLID)
#define MAX_SECONDSKILL  (MAX_SECOND_SKILLID - SECOND_SKILLID)
#define MAX_THIRD1SKILL  (MAX_THIRD1_SKILLID - THIRD1_SKILLID)
#define MAX_THIRD2SKILL  (MAX_THIRD2_SKILLID - THIRD2_SKILLID)
#define MAX_THIRD3SKILL  (MAX_THIRD3_SKILLID - THIRD3_SKILLID)
#define MAX_THIRD4SKILL  (MAX_THIRD4_SKILLID - THIRD4_SKILLID)
#define MAX_FOURTH1SKILL (MAX_FOURTH1_SKILLID - FOURTH1_SKILLID)
#define MAX_FOURTH2SKILL (MAX_FOURTH2_SKILLID - FOURTH2_SKILLID)
#define MAX_HOMSKILL     (MAX_HOM_SKILLID - HOM_SKILLID)
#define MAX_MERCSKILL    (MAX_MERC_SKILLID - MERC_SKILLID)
#define MAX_ELEMSKILL    (MAX_ELEM_SKILLID - ELEM_SKILLID)
#define MAX_ABRSKILL     (MAX_ABR_SKILLID - ABR_SKILLID)
#define MAX_GUILDSKILL   (MAX_GUILD_SKILLID - GUILD_SKILLID)

#define MAX_SKILL_DB (MAX_SKILL+MAX_SECONDSKILL+MAX_THIRD1SKILL+MAX_THIRD2SKILL+MAX_THIRD3SKILL+MAX_THIRD4SKILL+MAX_FOURTH1SKILL+MAX_FOURTH2SKILL+MAX_HOMSKILL+MAX_MERCSKILL+MAX_ELEMSKILL+MAX_ABRSKILL+MAX_GUILDSKILL)
#define MAX_PCSKILL  MAX_FOURTH2_SKILLID		// PCが使用可能の最大のスキルID

#define MAX_QUESTLIST 100

#define MAX_ACHIEVELIST 100
#define MAX_ACHIEVE_CONTENT  10

// ブロ�?クID定義
#define MIN_FLOORITEM            2
#define MAX_FLOORITEM      1999999
#define START_ACCOUNT_NUM  2000000
#define END_ACCOUNT_NUM    5000000
#define START_NPC_NUM      5000001
#define END_NPC_NUM       16777215	// SL_SMAのエフェクト表現可能上限 = 0x00ffffff

// クラスID定義
enum {
	PC_CLASS_NV = 0,		// ノ�?�ビス
	PC_CLASS_SM,			// ソード�?�ン
	PC_CLASS_MG,			// マジシャン
	PC_CLASS_AC,			// アーチャー
	PC_CLASS_AL,			// アコライ�?
	PC_CLASS_MC,			// マ�?�チャン�?
	PC_CLASS_TF,			// シー�?
	PC_CLASS_KN,			// ナイ�?
	PC_CLASS_PR,			// プリース�?
	PC_CLASS_WZ,			// ウィザー�?
	PC_CLASS_BS,			// ブラ�?クスミス
	PC_CLASS_HT,			// ハンター
	PC_CLASS_AS,			// アサシン
	PC_CLASS_KN2,			// ナイ�?(騎�?)
	PC_CLASS_CR,			// クルセイダー
	PC_CLASS_MO,			// モンク
	PC_CLASS_SA,			// セージ
	PC_CLASS_RG,			// ローグ
	PC_CLASS_AM,			// アルケミス�?
	PC_CLASS_BA,			// バ�?��?
	PC_CLASS_DC,			// ダンサー
	PC_CLASS_CR2,			// クルセイダー(騎�?)
	PC_CLASS_WE,			// ウェ�?ィング
	PC_CLASS_SNV,			// スーパ�?�ノ�?�ビス
	PC_CLASS_GS,			// ガンスリンガー
	PC_CLASS_NJ,			// 忍�?
	PC_CLASS_ST,			// サンタ
	PC_CLASS_SU,			// 水着
	PC_CLASS_HA,			// 韓服
	PC_CLASS_OKT,			// オクト�?�バ�?�フェス�?
	PC_CLASS_SU2,			// 水着2
	PC_CLASS_NV_H = 4001,	// 転生ノービス
	PC_CLASS_SM_H,			// 転生ソード�?�ン
	PC_CLASS_MG_H,			// 転生�?�ジシャン
	PC_CLASS_AC_H,			// 転生アーチャー
	PC_CLASS_AL_H,			// 転生アコライ�?
	PC_CLASS_MC_H,			// 転生�?��?�チャン�?
	PC_CLASS_TF_H,			// 転生シー�?
	PC_CLASS_KN_H,			// ロードナイ�?
	PC_CLASS_PR_H,			// ハイプリース�?
	PC_CLASS_WZ_H,			// ハイウィザー�?
	PC_CLASS_BS_H,			// ホワイトスミス
	PC_CLASS_HT_H,			// スナイパ�?�
	PC_CLASS_AS_H,			// アサシンクロス
	PC_CLASS_KN2_H,			// ロードナイ�?(騎�?)
	PC_CLASS_CR_H,			// パラ�?ィン
	PC_CLASS_MO_H,			// チャンピオン
	PC_CLASS_SA_H,			// プロフェ�?サー
	PC_CLASS_RG_H,			// チェイサー
	PC_CLASS_AM_H,			// クリエイター
	PC_CLASS_BA_H,			// クラウン
	PC_CLASS_DC_H,			// ジプシー
	PC_CLASS_CR2_H,			// パラ�?ィン(騎�?)
	PC_CLASS_NV_B,			// 養子ノービス
	PC_CLASS_SM_B,			// 養子ソード�?�ン
	PC_CLASS_MG_B,			// 養子�?�ジシャン
	PC_CLASS_AC_B,			// 養子アーチャー
	PC_CLASS_AL_B,			// 養子アコライ�?
	PC_CLASS_MC_B,			// 養子�?��?�チャン�?
	PC_CLASS_TF_B,			// 養子シー�?
	PC_CLASS_KN_B,			// 養子ナイ�?
	PC_CLASS_PR_B,			// 養子�?�リース�?
	PC_CLASS_WZ_B,			// 養子ウィザー�?
	PC_CLASS_BS_B,			// 養子ブラ�?クスミス
	PC_CLASS_HT_B,			// 養子ハンター
	PC_CLASS_AS_B,			// 養子アサシン
	PC_CLASS_KN2_B,			// 養子ナイ�?(騎�?)
	PC_CLASS_CR_B,			// 養子クルセイダー
	PC_CLASS_MO_B,			// 養子モンク
	PC_CLASS_SA_B,			// 養子セージ
	PC_CLASS_RG_B,			// 養子ローグ
	PC_CLASS_AM_B,			// 養子アルケミス�?
	PC_CLASS_BA_B,			// 養子バー�?
	PC_CLASS_DC_B,			// 養子ダンサー
	PC_CLASS_CR2_B,			// 養子クルセイダー(騎�?)
	PC_CLASS_SNV_B,			// 養子スーパ�?�ノ�?�ビス
	PC_CLASS_TK,			// �?コンキ�?�?
	PC_CLASS_SG,			// 拳�?
	PC_CLASS_SG2,			// 拳�?(融合)
	PC_CLASS_SL,			// ソウルリンカー
	PC_CLASS_MB,			// キョンシー
	PC_CLASS_DE,			// �?スナイ�?
	PC_CLASS_DA,			// ダークコレクター
	// 4053
	PC_CLASS_RK = 4054,		// ルーンナイ�?
	PC_CLASS_WL,			// ウォーロ�?ク
	PC_CLASS_RA,			// レンジャー
	PC_CLASS_AB,			// アークビショ�?�?
	PC_CLASS_NC,			// メカニック
	PC_CLASS_GC,			// ギロチンクロス
	PC_CLASS_RK_H,			// 転生ルーンナイ�?
	PC_CLASS_WL_H,			// 転生ウォーロ�?ク
	PC_CLASS_RA_H,			// 転生レンジャー
	PC_CLASS_AB_H,			// 転生アークビショ�?�?
	PC_CLASS_NC_H,			// 転生メカニック
	PC_CLASS_GC_H,			// 転生ギロチンクロス
	PC_CLASS_LG,			// ロイヤルガー�?
	PC_CLASS_SO,			// ソーサラー
	PC_CLASS_MI,			// ミンストレル
	PC_CLASS_WA,			// ワンダラー
	PC_CLASS_SR,			// 修�?
	PC_CLASS_GN,			// ジェネティ�?ク
	PC_CLASS_SC,			// シャドウチェイサー
	PC_CLASS_LG_H,			// 転生ロイヤルガー�?
	PC_CLASS_SO_H,			// 転生ソーサラー
	PC_CLASS_MI_H,			// 転生ミンストレル
	PC_CLASS_WA_H,			// 転生ワンダラー
	PC_CLASS_SR_H,			// 転生修�?
	PC_CLASS_GN_H,			// 転生ジェネティ�?ク
	PC_CLASS_SC_H,			// 転生シャドウチェイサー
	PC_CLASS_RK2,			// ルーンナイ�?(騎�?)
	PC_CLASS_RK2_H,			// 転生ルーンナイ�?(騎�?)
	PC_CLASS_LG2,			// ロイヤルガー�?(騎�?)
	PC_CLASS_LG2_H,			// 転生ロイヤルガー�?(騎�?)
	PC_CLASS_RA2,			// レンジャー(騎�?)
	PC_CLASS_RA2_H,			// 転生レンジャー(騎�?)
	PC_CLASS_NC2,			// メカニック(騎�?)
	PC_CLASS_NC2_H,			// 転生メカニック(騎�?)
	PC_CLASS_RK3,			// ルーンナイ�?(騎�?)
	PC_CLASS_RK3_H,			// 転生ルーンナイ�?(騎�?)
	PC_CLASS_RK4,			// ルーンナイ�?(騎�?)
	PC_CLASS_RK4_H,			// 転生ルーンナイ�?(騎�?)
	PC_CLASS_RK5,			// ルーンナイ�?(騎�?)
	PC_CLASS_RK5_H,			// 転生ルーンナイ�?(騎�?)
	PC_CLASS_RK6,			// ルーンナイ�?(騎�?)
	PC_CLASS_RK6_H,			// 転生ルーンナイ�?(騎�?)
	PC_CLASS_RK_B,			// 養子ルーンナイ�?
	PC_CLASS_WL_B,			// 養子ウォーロ�?ク
	PC_CLASS_RA_B,			// 養子レンジャー
	PC_CLASS_AB_B,			// 養子アークビショ�?�?
	PC_CLASS_NC_B,			// 養子メカニック
	PC_CLASS_GC_B,			// 養子ギロチンクロス
	PC_CLASS_LG_B,			// 養子ロイヤルガー�?
	PC_CLASS_SO_B,			// 養子ソーサラー
	PC_CLASS_MI_B,			// 養子ミンストレル
	PC_CLASS_WA_B,			// 養子ワンダラー
	PC_CLASS_SR_B,			// 養子修�?
	PC_CLASS_GN_B,			// 養子ジェネティ�?ク
	PC_CLASS_SC_B,			// 養子シャドウチェイサー
	PC_CLASS_RK2_B,			// 養子ルーンナイ�?(騎�?)
	PC_CLASS_LG2_B,			// 養子ロイヤルガー�?(騎�?)
	PC_CLASS_RA2_B,			// 養子レンジャー(騎�?)
	PC_CLASS_NC2_B,			// 養子メカニック(騎�?)
	PC_CLASS_NJ2   = 4114,	// 忍�?(騎�?)
	PC_CLASS_GS2,			// ガンスリンガー(騎�?)
	PC_CLASS_SM2,			// ソード�?�ン(騎�?)
	PC_CLASS_SL2,			// ソウルリンカー(騎�?)
	PC_CLASS_BS2_H,			// ホワイトスミス(騎�?)
	PC_CLASS_MC2,			// マ�?�チャン�?(騎�?)
	PC_CLASS_GN2,			// ジェネティ�?ク(騎�?)
	PC_CLASS_AM2_H,			// クリエイター(騎�?)
	PC_CLASS_AC2,			// アーチャー(騎�?)
	PC_CLASS_SG3,			// 拳�?(騎�?)
	PC_CLASS_NV2,			// ノ�?�ビス(騎�?)
	PC_CLASS_MO2,			// モンク(騎�?)
	PC_CLASS_AL2,			// アコライ�?(騎�?)
	PC_CLASS_SR2,			// 修�?(騎�?)
	PC_CLASS_SNV2,			// スーパ�?�ノ�?�ビス(騎�?)
	PC_CLASS_AB2,			// アークビショ�?�?(騎�?)
	PC_CLASS_MG2,			// マジシャン(騎�?)
	PC_CLASS_SA2,			// セージ(騎�?)
	PC_CLASS_SO2,			// ソーサラー(騎�?)
	PC_CLASS_WL2,			// ウォーロ�?ク(騎�?)
	PC_CLASS_WZ2,			// ウィザー�?(騎�?)
	PC_CLASS_SA2_H,			// プロフェ�?サー(騎�?)
	PC_CLASS_WZ2_H,			// ハイウィザー�?(騎�?)
	PC_CLASS_AM2,			// アルケミス�?(騎�?)
	PC_CLASS_BS2,			// ブラ�?クスミス(騎�?)
	PC_CLASS_MO2_H,			// チャンピオン(騎�?)
	PC_CLASS_GC2,			// ギロチンクロス(騎�?)
	PC_CLASS_TF2,			// シー�?(騎�?)
	PC_CLASS_RG2,			// ローグ(騎�?)
	PC_CLASS_RG2_H,			// チェイサー(騎�?)
	PC_CLASS_RG3_H,			// JT_DOG_STALKER
	PC_CLASS_AS2,			// アサシン(騎�?)
	PC_CLASS_AS2_H,			// アサシンクロス(騎�?)
	PC_CLASS_DC2,			// ダンサー(騎�?)
	PC_CLASS_MI2,			// ミンストレル(騎�?)
	PC_CLASS_BA2,			// バ�?��?(騎�?)
	PC_CLASS_HT2_H,			// スナイパ�?�(騎�?)
	PC_CLASS_WA2,			// ワンダラー(騎�?)
	PC_CLASS_DC2_H,			// ジプシー(騎�?)
	PC_CLASS_BA2_H,			// クラウン(騎�?)
	PC_CLASS_HT2,			// ハンター(騎�?)
	PC_CLASS_TK2,			// �?コンキ�?�?(騎�?)
	PC_CLASS_PR2,			// プリース�?(騎�?)
	PC_CLASS_PR2_H,			// ハイプリース�?(騎�?)
	PC_CLASS_NV2_B,			// 養子ノービス(騎�?)
	PC_CLASS_SM2_B,			// 養子ソード�?�ン(騎�?)
	PC_CLASS_MG2_B,			// 養子�?�ジシャン(騎�?)
	PC_CLASS_AC2_B,			// 養子アーチャー(騎�?)
	PC_CLASS_AL2_B,			// 養子アコライ�?(騎�?)
	PC_CLASS_MC2_B,			// 養子�?��?�チャン�?(騎�?)
	PC_CLASS_HT2_B,			// 養子ハンター(騎�?)
	PC_CLASS_AS2_B,			// 養子アサシン(騎�?)
	PC_CLASS_MO2_B,			// 養子モンク(騎�?)
	PC_CLASS_SA2_B,			// 養子セージ(騎�?)
	PC_CLASS_RG3_B,			// JT_DOG_CHASER_B
	PC_CLASS_AM2_B,			// 養子アルケミス�?(騎�?)
	PC_CLASS_BA2_B,			// 養子バー�?(騎�?)
	PC_CLASS_DC2_B,			// 養子ダンサー(騎�?)
	PC_CLASS_SNV2_B,		// 養子スーパ�?�ノ�?�ビス(騎�?)
	PC_CLASS_WL2_B,			// 養子ウォーロ�?ク(騎�?)
	PC_CLASS_AB2_B,			// 養子アークビショ�?�?(騎�?)
	PC_CLASS_GC2_B,			// 養子ギロチンクロス(騎�?)
	PC_CLASS_SO2_B,			// 養子ソーサラー(騎�?)
	PC_CLASS_MI2_B,			// 養子ミンストレル(騎�?)
	PC_CLASS_WA2_B,			// 養子ワンダラー(騎�?)
	PC_CLASS_SR2_B,			// 養子修�?(騎�?)
	PC_CLASS_GN2_B,			// 養子ジェネティ�?ク(騎�?)
	PC_CLASS_TF2_B,			// 養子シー�?(騎�?)
	PC_CLASS_RG2_B,			// 養子ローグ(騎�?)
	PC_CLASS_NV2_H,			// 転生ノービス(騎�?)
	PC_CLASS_SM2_H,			// 転生ソード�?�ン(騎�?)
	PC_CLASS_MG2_H,			// 転生�?�ジシャン(騎�?)
	PC_CLASS_AC2_H,			// 転生アーチャー(騎�?)
	PC_CLASS_AL2_H,			// 転生アコライ�?(騎�?)
	PC_CLASS_MC2_H,			// 転生�?��?�チャン�?(騎�?)
	PC_CLASS_TF2_H,			// 転生シー�?(騎�?)
	PC_CLASS_ESNV,			// 拡張ノ�?�ビス
	PC_CLASS_ESNV_B,		// 養子拡張ノ�?�ビス
	PC_CLASS_ESNV2,			// 拡張スーパ�?�ノ�?�ビス(騎�?)
	PC_CLASS_ESNV2_B,		// 養子拡張スーパ�?�ノ�?�ビス(騎�?)
	PC_CLASS_PR2_B,			// 養子�?�リース�?(騎�?)
	PC_CLASS_WZ2_B,			// 養子ウィザー�?(騎�?)
	PC_CLASS_BS2_B,			// 養子ブラ�?クスミス(騎�?)
	PC_CLASS_NC3,			// メカニック(騎�?)
	PC_CLASS_RA3,			// レンジャー(騎�?)
	PC_CLASS_KN3,			// ナイ�?(騎�?)
	PC_CLASS_KN3_H,			// ロードナイ�?(騎�?)
	PC_CLASS_LG3,			// ロイヤルガー�?(騎�?)
	PC_CLASS_RK7,			// ルーンナイ�?(騎�?)
	PC_CLASS_CR3,			// クルセイダー(騎�?)
	PC_CLASS_CR3_H,			// パラ�?ィン(騎�?)
	PC_CLASS_NC3_B,			// 養子メカニック(騎�?)
	PC_CLASS_RA3_B,			// 養子レンジャー(騎�?)
	PC_CLASS_KN3_B,			// 養子ナイ�?(騎�?)
	PC_CLASS_LG3_B,			// 養子ロイヤルガー�?(騎�?)
	PC_CLASS_RK7_B,			// 養子ルーンナイ�?(騎�?)
	PC_CLASS_CR3_B,			// 養子クルセイダー(騎�?)
	PC_CLASS_KG,			// 影狼
	PC_CLASS_OB,			// 朧
	PC_CLASS_KG2,			// 影狼(騎�?)
	PC_CLASS_OB2,			// 朧(騎�?)
	PC_CLASS_RL,			// リベリオン
	PC_CLASS_RL2,			// リベリオン(騎�?)
	PC_CLASS_SUM   = 4218,	// サモナ�?�
	PC_CLASS_SUM2,			// サモナ�?�(騎�?)
	PC_CLASS_SUM_B,			// 養子サモナ�?�
	PC_CLASS_SUM2_B,		// 養子サモナ�?�(騎�?)
	PC_CLASS_NJ_B,			// 養子忍�?
	PC_CLASS_KG_B,			// 養子影狼
	PC_CLASS_OB_B,			// 養子朧
	PC_CLASS_TK_B,			// 養子テコンキ�?�?
	PC_CLASS_SG_B,			// 養子拳�?
	PC_CLASS_SL_B,			// 養子ソウルリンカー
	PC_CLASS_GS_B,			// 養子ガンスリンガー
	PC_CLASS_RL_B,			// 養子リベリオン
	PC_CLASS_NJ2_B,			// 養子忍�?(騎�?)
	PC_CLASS_KG2_B,			// 養子影狼(騎�?)
	PC_CLASS_OB2_B,			// 養子朧(騎�?)
	PC_CLASS_TK2_B,			// 養子テコンキ�?�?(騎�?)
	PC_CLASS_SG2_B,			// 養子拳�?(騎�?)
	PC_CLASS_SL2_B,			// 養子ソウルリンカー(騎�?)
	PC_CLASS_GS2_B,			// 養子ガンスリンガー(騎�?)
	PC_CLASS_RL2_B,			// 養子リベリオン(騎�?)
	PC_CLASS_SG3_B,			// 養子拳�?(融合)
	PC_CLASS_SJ,			// 星�?
	PC_CLASS_SP,			// ソウルリーパ�?�
	PC_CLASS_SJ_B,			// 養子星�?
	PC_CLASS_SP_B,			// 養子ソウルリーパ�?�
	PC_CLASS_SJ2,			// 星�?(融合)
	PC_CLASS_SJ2_B,			// 養子星�?(融合)
	PC_CLASS_SJ3,			// 星�?(騎�?)
	PC_CLASS_SP2,			// ソウルリーパ�?�(騎�?)
	PC_CLASS_SJ3_B,			// 養子星�?(騎�?)
	PC_CLASS_SP2_B,			// 養子ソウルリーパ�?�(騎�?)
	PC_CLASS_DK = 4252,		// ドラゴンナイ�?
	PC_CLASS_MT,			// マイスター
	PC_CLASS_SHC,			// シャドウクロス
	PC_CLASS_AG,			// アークメイジ
	PC_CLASS_CD,			// カー�?ィナル
	PC_CLASS_WH,			// ウインド�?��?�ク
	PC_CLASS_IG,			// インペリアルガー�?
	PC_CLASS_BO,			// バイオロジス�?
	PC_CLASS_ABC,			// アビスチェイサー
	PC_CLASS_EM,			// エレメンタルマスター
	PC_CLASS_IQ,			// インクイジター
	PC_CLASS_TRB,			// トルバドゥール
	PC_CLASS_TRV,			// トルヴェール
	PC_CLASS_DK2,			// ドラゴンナイ�?(騎�?)
	PC_CLASS_MT2,			// マイスター(騎�?)
	PC_CLASS_SHC2,			// シャドウクロス(騎�?)
	PC_CLASS_AG2,			// アークメイジ(騎�?)
	PC_CLASS_CD2,			// カー�?ィナル(騎�?)
	PC_CLASS_WH2,			// ウインド�?��?�ク(騎�?)
	PC_CLASS_IG2,			// インペリアルガー�?(騎�?)
	PC_CLASS_BO2,			// バイオロジス�?(騎�?)
	PC_CLASS_ABC2,			// アビスチェイサー(騎�?)
	PC_CLASS_EM2,			// エレメンタルマスター(騎�?)
	PC_CLASS_IQ2,			// インクイジター(騎�?)
	PC_CLASS_TRB2,			// トルバドゥール(騎�?)
	PC_CLASS_TRV2,			// トルヴェール(騎�?)
	PC_CLASS_WH3,			// ウインド�?��?�ク(騎�?)
	PC_CLASS_MT3,			// マイスター(騎�?)
	PC_CLASS_DK3,			// ドラゴンナイ�?(騎�?)
	PC_CLASS_IG3,			// インペリアルガー�?(騎�?)
	PC_CLASS_SKE = 4302,	// 天�?
	PC_CLASS_SOA,			// ソウルアセ�?ィ�?ク
	PC_CLASS_SK,			// �?気楼
	PC_CLASS_SN,			// 不知火
	PC_CLASS_NW,			// ナイトウォ�?�?
	PC_CLASS_HN,			// ハイパ�?�ノ�?�ビス
	PC_CLASS_SH,			// スピリ�?トハンドラー
	PC_CLASS_SKE2,			// 天�?(騎�?)
	PC_CLASS_SOA2,			// ソウルアセ�?ィ�?ク(騎�?)
	PC_CLASS_SK2,			// �?気楼(騎�?)
	PC_CLASS_SN2,			// 不知火(騎�?)
	PC_CLASS_NW2,			// ナイトウォ�?�?(騎�?)
	PC_CLASS_HN2,			// ハイパ�?�ノ�?�ビス(騎�?)
	PC_CLASS_SH2,			// スピリ�?トハンドラー(騎�?)
	PC_CLASS_SKE3,			// 天�?(融合)
	PC_CLASS_RK_2ND = 4332,	// ルーンナイ�?(セカコス)
	PC_CLASS_NC_2ND,		// メカニック(セカコス)
	PC_CLASS_GC_2ND,		// ギロチンクロス(セカコス)
	PC_CLASS_WL_2ND,		// ウォーロ�?ク(セカコス)
	PC_CLASS_AB_2ND,		// アークビショ�?�?(セカコス)
	PC_CLASS_RA_2ND,		// レンジャー(セカコス)
	PC_CLASS_LG_2ND,		// ロイヤルガー�?(セカコス)
	PC_CLASS_GN_2ND,		// ジェネティ�?ク(セカコス)
	PC_CLASS_SC_2ND,		// シャドウチェイサー(セカコス)
	PC_CLASS_SO_2ND,		// ソーサラー(セカコス)
	PC_CLASS_SR_2ND,		// 修�?(セカコス)
	PC_CLASS_MI_2ND,		// ミンストレル(セカコス)
	PC_CLASS_WA_2ND,		// ワンダラー(セカコス)
	PC_CLASS_MAX
};

// 職業定義
enum {
	PC_JOB_NV = 0,	// ノ�?�ビス
	PC_JOB_SM,		// ソード�?�ン
	PC_JOB_MG,		// マジシャン
	PC_JOB_AC,		// アーチャー
	PC_JOB_AL,		// アコライ�?
	PC_JOB_MC,		// マ�?�チャン�?
	PC_JOB_TF,		// シー�?
	PC_JOB_KN,		// ナイ�?
	PC_JOB_PR,		// プリース�?
	PC_JOB_WZ,		// ウィザー�?
	PC_JOB_BS,		// ブラ�?クスミス
	PC_JOB_HT,		// ハンター
	PC_JOB_AS,		// アサシン
	PC_JOB_CR,		// クルセイダー
	PC_JOB_MO,		// モンク
	PC_JOB_SA,		// セージ
	PC_JOB_RG,		// ローグ
	PC_JOB_AM,		// アルケミス�?
	PC_JOB_BA,		// バ�?��?
	PC_JOB_DC,		// ダンサー
	PC_JOB_SNV,		// スーパ�?�ノ�?�ビス
	PC_JOB_TK,		// �?コンキ�?�?
	PC_JOB_SG,		// 拳�?
	PC_JOB_SL,		// ソウルリンカー
	PC_JOB_GS,		// ガンスリンガー
	PC_JOB_NJ,		// 忍�?
	PC_JOB_MB,		// キョンシー
	PC_JOB_DE,		// �?スナイ�?
	PC_JOB_DA,		// ダークコレクター
	PC_JOB_RK,		// ルーンナイ�?
	PC_JOB_WL,		// ウォーロ�?ク
	PC_JOB_RA,		// レンジャー
	PC_JOB_AB,		// アークビショ�?�?
	PC_JOB_NC,		// メカニック
	PC_JOB_GC,		// ギロチンクロス
	PC_JOB_LG,		// ロイヤルガー�?
	PC_JOB_SO,		// ソーサラー
	PC_JOB_MI,		// ミンストレル
	PC_JOB_WA,		// ワンダラー
	PC_JOB_SR,		// 修�?
	PC_JOB_GN,		// ジェネティ�?ク
	PC_JOB_SC,		// シャドウチェイサー
	PC_JOB_ESNV,	// 拡張スーパ�?�ノ�?�ビス
	PC_JOB_KG,		// 影狼
	PC_JOB_OB,		// 朧
	PC_JOB_RL,		// リベリオン
	PC_JOB_SUM,		// サモナ�?�
	PC_JOB_SJ,		// 星�?
	PC_JOB_SP,		// ソウルリーパ�?�
	PC_JOB_DK,		// ドラゴンナイ�?
	PC_JOB_MT,		// マイスター
	PC_JOB_SHC,		// シャドウクロス
	PC_JOB_AG,		// アークメイジ
	PC_JOB_CD,		// カー�?ィナル
	PC_JOB_WH,		// ウインド�?��?�ク
	PC_JOB_IG,		// インペリアルガー�?
	PC_JOB_BO,		// バイオロジス�?
	PC_JOB_ABC,		// アビスチェイサー
	PC_JOB_EM,		// エレメンタルマスター
	PC_JOB_IQ,		// インクイジター
	PC_JOB_TRB,		// トルバドゥール
	PC_JOB_TRV,		// トルヴェール
	PC_JOB_SKE,		// 天�?
	PC_JOB_SOA,		// ソウルアセ�?ィ�?ク
	PC_JOB_SK,		// �?気楼
	PC_JOB_SN,		// 不知火
	PC_JOB_NW,		// ナイトウォ�?�?
	PC_JOB_HN,		// ハイパ�?�ノ�?�ビス
	PC_JOB_SH,		// スピリ�?トハンドラー
	PC_JOB_MAX
};

enum {
	PC_UPPER_NORMAL = 0,	// 未転�?
	PC_UPPER_HIGH,			// 転�?
	PC_UPPER_BABY,			// 養�?
	PC_UPPER_MAX
};

// 性別�?ーブル
enum {
	SEX_FEMALE = 0,
	SEX_MALE,
	SEX_SERVER
};

// �?備�?所
enum {
	LOC_NOTHING           = 0x000000,
	LOC_HEAD              = 0x000001,	// 頭下段
	LOC_RARM              = 0x000002,	// 右�?
	LOC_ROBE              = 0x000004,	// 肩
	LOC_RACCESSORY        = 0x000008,	// アクセサリ右
	LOC_BODY              = 0x000010,	// �?
	LOC_LARM              = 0x000020,	// 左�?
	LOC_RLARM             = 0x000022,	// 両�?
	LOC_SHOES             = 0x000040,	// 靴
	LOC_LACCESSORY        = 0x000080,	// アクセサリ左
	LOC_RLACCESSORY       = 0x000088,	// アクセサリ右左
	LOC_HEAD2             = 0x000100,	// 頭上段
	LOC_HEAD_TB           = 0x000101,	// 頭上下段
	LOC_HEAD3             = 0x000200,	// 頭中段
	LOC_HEAD_MB           = 0x000201,	// 頭中下段
	LOC_HEAD_TM           = 0x000300,	// 頭上中段
	LOC_HEAD_TMB          = 0x000301,	// 頭上中下段
	LOC_COSTUME_HEAD2     = 0x000400,	// コスチュー�?上段
	LOC_COSTUME_HEAD3     = 0x000800,	// コスチュー�?中段
	LOC_COSTUME_HEAD_TM   = 0x000C00,	// コスチュー�?上中段
	LOC_COSTUME_HEAD      = 0x001000,	// コスチュー�?下段
	LOC_COSTUME_HEAD_TB   = 0x001400,	// コスチュー�?上下段
	LOC_COSTUME_HEAD_MB   = 0x001800,	// コスチュー�?中下段
	LOC_COSTUME_HEAD_TMB  = 0x001C00,	// コスチュー�?上中下段
	LOC_COSTUME_ROBE      = 0x002000,	// コスチュー�?肩
	LOC_COSTUME_FLOOR     = 0x004000,	// コスチュー�?FLOOR
	LOC_ARROW             = 0x008000,	// 矢・弾丸・苦無・手裏剣・キャノンボ�?�ル
	LOC_ARMOR_SHADOW      = 0x010000,	// アーマ�?�シャドウ
	LOC_WEAPON_SHADOW     = 0x020000,	// ウェポンシャドウ
	LOC_SHIELD_SHADOW     = 0x040000,	// シールドシャドウ
	LOC_SHOES_SHADOW      = 0x080000,	// シューズシャドウ
	LOC_RACCESSORY_SHADOW = 0x100000,	// アクセサリ右シャドウ
	LOC_LACCESSORY_SHADOW = 0x200000,	// アクセサリ左シャドウ
	LOC_SHADOW_ALL        = 0x3F0000,	// シャドウ全部�?
};

struct item {
	unsigned int id;
	int nameid;
	short amount;
	unsigned int equip;
	char identify;
	char refine;
	char attribute;
	char private_;
	int card[4];
	struct {
		short id;
		short val;
	} opt[5];
	unsigned int limit;
};

struct point{
	char map[24];
	short x,y;
};

struct skill {
	unsigned short id,lv,flag;
};

struct global_reg {
	char str[32];
	int value;
};

struct s_pet {
	int account_id;
	int char_id;
	int pet_id;
	int class_;
	unsigned short level;
	short egg_id;
	short equip;
	short intimate;
	short hungry;
	char name[24];
	char rename_flag;
	char incubate;
};

struct friend_data {
	int account_id;
	int char_id;
	char name[24];
};

struct hotkey {
	int id;
	unsigned short lv;
	char type;
};

struct mmo_charstatus {
	int char_id;
	int account_id;
	int partner_id;
	int parent_id[2];
	int baby_id;

	atn_bignumber base_exp,job_exp;
	int zeny;

	short class_;
	short status_point,skill_point;
	short tstatus_point;
	int hp,max_hp,sp,max_sp;
	int ap,max_ap;
	unsigned int option;
	short karma,manner;
	int die_counter;
	short hair,hair_color,clothes_color;
	int party_id,guild_id,pet_id,homun_id,merc_id,elem_id;

	int merc_fame[MAX_MERC_TYPE],merc_call[MAX_MERC_TYPE];

	short weapon;	// ?WT_DOUBLE_MAX
	short shield;
	short robe;
	short head_top,head_mid,head_bottom;

	char name[24];
	unsigned short base_level,job_level;
	short str,agi,vit,int_,dex,luk;
	short pow,sta,wis,spl,con,crt;
	unsigned char char_num;

	struct point last_point, save_point, memo_point[MAX_PORTAL_MEMO];
	char feel_map[3][24];
	struct item inventory[MAX_INVENTORY],cart[MAX_CART];
	struct skill skill[MAX_PCSKILL];
	int friend_num;
	struct friend_data friend_data[MAX_FRIEND];
	struct hotkey hotkey[MAX_HOTKEYS];
	unsigned int delete_date;
	char refuse_partyinvite;
	char show_equip;
	short font;
	short style;
	char sex;
	char allow_call;
	char autofeed;
	int title_id;
};

struct registry {
	int global_num;
	struct global_reg global[GLOBAL_REG_NUM];
	int account_num;
	struct global_reg account[ACCOUNT_REG_NUM];
	int account2_num;
	struct global_reg account2[ACCOUNT_REG2_NUM];
};

struct mmo_homunstatus {
	int account_id;
	int char_id;
	int homun_id;
	short class_;
	int base_exp;

	short status_point,skill_point;
	int hp,max_hp,sp,max_sp;

	char name[24];
	unsigned short base_level;
	short str,agi,vit,int_,dex,luk;
	short f_str,f_agi,f_vit,f_int,f_dex,f_luk;

	short equip;
	unsigned int option;

	struct skill skill[MAX_HOMSKILL];

	int intimate;	// ペットと違い最大100,000で計�?
	short hungry;
	char rename_flag;
	char incubate;
};

struct mmo_mercstatus {
	int account_id;
	int char_id;
	int merc_id;
	short class_;
	int hp,sp;
	unsigned int kill_count;
	unsigned int limit;
};

struct mmo_elemstatus {
	int account_id;
	int char_id;
	int elem_id;
	short class_, mode;
	int hp,sp;
	unsigned int limit;
};

struct storage {
	int account_id;
	char dirty;
	char storage_status;
	short storage_amount;
	unsigned int sortkey;
	struct item store_item[MAX_STORAGE];
};

struct s1_storage {
	int account_id;
	char dirty;
	char storage_status;
	short storage_amount;
	unsigned int sortkey;
	struct item store_item[MAX_STORAGE];
};

struct s2_storage {
	int account_id;
	char dirty;
	char storage_status;
	short storage_amount;
	unsigned int sortkey;
	struct item store_item[MAX_STORAGE];
};

struct s3_storage {
	int account_id;
	char dirty;
	char storage_status;
	short storage_amount;
	unsigned int sortkey;
	struct item store_item[MAX_STORAGE];
};

struct guild_storage {
	int guild_id;
	char dirty;
	char storage_status;
	short storage_amount;
	unsigned int sortkey;
	int last_fd;
	struct item store_item[MAX_GUILD_STORAGE];
};

struct map_session_data;

struct gm_account {
	int account_id;
	int level;
};

struct party_member {
	int account_id;
	int char_id;
	char name[24],map[24];
	unsigned char leader,online;
	unsigned short lv,class_;
	struct map_session_data *sd;
};

struct party {
	int party_id;
	char name[24];
	unsigned char exp;
	unsigned char item;
	int memorial_id;
	struct party_member member[MAX_PARTY];
};

struct guild_member {
	int account_id, char_id;
	short hair,hair_color,gender,class_;
	int exp,exp_payper;
	unsigned char online;
	unsigned short lv;
	short position;
	char name[24];
	struct map_session_data *sd;
};

struct guild_position {
	char name[24];
	int mode;
	int exp_mode;
};

struct guild_alliance {
	int opposition;
	int guild_id;
	char name[24];
};

struct guild_explusion {
	char name[24];
	char mes[40];
	int account_id;
};

struct guild_skill {
	int id,lv;
};

struct guild {
	int guild_id;
	short guild_lv, connect_member, max_member;
	unsigned short average_lv;
	int exp,next_exp,skill_point;
	char name[24],master[24];
	struct guild_member member[MAX_GUILD];
	struct guild_position position[MAX_GUILDPOSITION];
	char mes1[60],mes2[120];
	int emblem_len,emblem_id;
	char emblem_data[2048];
	struct guild_alliance alliance[MAX_GUILDALLIANCE];
	struct guild_explusion explusion[MAX_GUILDEXPLUSION];
	struct guild_skill skill[MAX_GUILDSKILL];
};

struct guild_castle {
	int castle_id;
	int m;
	char map_name[24];
	char area_name[24];
	char castle_name[32];
	char castle_event[24];
	int guild_id;
	int economy;
	int defense;
	int triggerE;
	int triggerD;
	int nextTime;
	int payTime;
	int createTime;
	int visibleC;
	struct {
		int visible;
		int id;
	} guardian[8];
};

struct square {
	int val1[5];
	int val2[5];
};

enum {
	GBI_EXP        = 1,	// ギルド�?�EXP
	GBI_GUILDLV    = 2,	// ギルド�?�Lv
	GBI_SKILLPOINT = 3,	// ギルド�?�スキルポイン�?
	GBI_SKILLLV    = 4,	// ギルドスキルLv

	GMI_POSITION   = 0,	// メンバ�?�の役職変更
	GMI_EXP        = 1,	// メンバ�?�のEXP
};

enum {
	GD_APPROVAL = 10000,
	GD_KAFRACONTACT,
	GD_GUARDIANRESEARCH,
	GD_GUARDUP,
	GD_EXTENSION,
	GD_GLORYGUILD,
	GD_LEADERSHIP,
	GD_GLORYWOUNDS,
	GD_SOULCOLD,
	GD_HAWKEYES,
	GD_BATTLEORDER,
	GD_REGENERATION,
	GD_RESTORE,
	GD_EMERGENCYCALL,
	GD_DEVELOPMENT,
	GD_ITEMEMERGENCYCALL,
	GD_GUILD_STORAGE,
	GD_CHARGESHOUT_FLAG,
	GD_CHARGESHOUT_BEATING,
	GD_EMERGENCY_MOVE,
};

struct mail {
	int account_id;
	int char_id;
	unsigned int rates;	// 総件数
	int store;		// 保有件数
};

struct mail_data {
	unsigned int mail_num;
	int char_id;
	char char_name[24];
	char receive_name[24];
	int read;
	unsigned int times;
	char title[40];
	char body[35*14];
	unsigned int body_size;
	int zeny;
	struct item item;
};

struct Ranking_Data {
	char name[24];
	int point;
	int char_id;
};

#pragma pack()


#endif	// _MMO_H_
