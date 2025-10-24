// デバック転送
prontera.gat,154,195,4	script	ポタ子	115,{
	cutin "kafra_03",2;
	mes "[ポタ子]";
	mes "こんにちは。ポタ子です。";
	mes "皆さんを無料でダンジョンに転送して差し上げますわ。";
	mes "ポタ屋さん商売上がったりですね；；";
	mes "転送して差し上げましょうか？";
	next;
	if(select("お願いします","けっこうです") == 2) {
		mes "[ポタ子]";
		mes "いつでもご利用してくださいね。";
		close2;
		cutin "kafra_03",255;
		end;
	}
	mes "[ポタ子]";
	mes "まずは地域を選んでください。";
	next;
	set @menu,select("プロンテラ","モロク","グラストヘイム","アルデバラン","ゲフェン","イズルード","アルベルタ",
	                 "フェイヨン","ルティエ","コモド","ジュノー","アマツ","コンロン","ジュピロス","リヒタルゼン",
			 "ニブルヘイム","フィゲル","ラヘル","ベインス","ブラジリス","デワタ","龍之城","モスコビア","アインベフ","マヌク",
			 "ギルドダンジョン","イリュージョンダンジョン",
                         "テラーダンジョン","ニブルヘイムダンジョン","大浴場メディタティオ","オズの迷路","廃棄場ルドゥス","魔力発電所","貯蔵庫タルタロス",
                         "捨てられた穴・蛇神の温もり","魔力が歪んだ平原","ミョルニール地下洞窟","アルデバラン時計塔地下 未知の空間","バイオスフィア","次元の狭間","やっぱやめる");
	if(@menu != 15) {
		mes "[ポタ子]";
		mes "行きたい場所を選んでください。";
		next;
	}

	switch(@menu) {
	case 1:
		switch(select("地下水路B1F","地下水路B2F","地下水路B3F","地下水路B4F","迷宮の森1",
		              "迷宮の森2","迷宮の森3","やっぱやめる")) {
			case 1: warp "prt_sewb1",131,247; end;
			case 2: warp "prt_sewb2",19,19;   end;
			case 3: warp "prt_sewb3",180,169; end;
			case 4: warp "prt_sewb4",100,192; end;
			case 5: warp "prt_maze01",176,7;  end;
			case 6: warp "prt_maze02",94,19;  end;
			case 7: warp "prt_maze03",23,8;   end;
		}
		break;

	case 2:
		switch(select("スフィンクス1F","スフィンクス2F","スフィンクス3F","スフィンクス4F","スフィンクス5F",
		              "ピラミッド1F","ピラミッド2F","ピラミッド3F","ピラミッド4F","蟻地獄1","蟻地獄2","ナイトメアピラミッド2F","ピラミッドB3F","次元の狭間03","やっぱやめる")) {
			case 1:  warp "in_sphinx1",289,9;  end;
			case 2:  warp "in_sphinx2",149,81; end;
			case 3:  warp "in_sphinx3",210,54; end;
			case 4:  warp "in_sphinx4",10,222; end;
			case 5:  warp "in_sphinx5",100,99; end;
			case 6:  warp "moc_pryd01",192,9;  end;
			case 7:  warp "moc_pryd02",10,192; end;
			case 8:  warp "moc_pryd03",100,92; end;
			case 9:  warp "moc_pryd04",18,187; end;
			case 10: warp "anthell01",35,262;  end;
			case 11: warp "anthell02",34,263;  end;
			case 12: warp "moc_prydn2",192,10;  end;
			case 13: warp "moc_pryd06",188,10;  end;
			case 14: warp "moc_fild22",39,197;  end;
		}
		break;

	case 3:
		switch(select("修道院前","古城1F","古城2F","騎士団1F","騎士団2F","個室前","カタコン","階段",
		              "地下水路B1F","地下水路B2F","地下水路B3F","地下水路B4F","最下層地下洞窟B1F","最下層地下洞窟B2F",
		              "監獄B1F","監獄B2F","やっぱやめる")) {
			case 1:  warp "glast_01",200,125;  end;
			case 2:  warp "glast_01",200,336;  end;
			case 3:  warp "gl_cas01",199,29;   end;
			case 4:  warp "gl_cas02",104,25;   end;
			case 5:  warp "gl_knt01",150,15;   end;
			case 6:  warp "gl_knt02",157,287;  end;
			case 7:  warp "gl_chyard",147,15;  end;
			case 8:  warp "gl_step",12,7;      end;
			case 9:  warp "gl_sew01",258,274;  end;
			case 10: warp "gl_sew02",29,270;   end;
			case 11: warp "gl_sew03",171,283;  end;
			case 12: warp "gl_sew04",68,277;   end;
			case 13: warp "gl_dun01",133,271;  end;
			case 14: warp "gl_dun02",224,274;  end;
			case 15: warp "gl_prison",17,70;   end;
			case 16: warp "gl_prison1",150,14; end;
		}
		break;

	case 4:
		switch(select("時計塔1F","時計塔2F","時計塔3F","時計塔4F","時計塔B1F","時計塔B2F",
		              "時計塔B3F","時計塔B4F","やっぱやめる")) {
			case 1: warp "c_tower1",199,159;   end;
			case 2: warp "c_tower2",268,26;    end;
			case 3: warp "c_tower3",65,147;    end;
			case 4: warp "c_tower4",189,39;    end;
			case 5: warp "alde_dun01",171,158; end;
			case 6: warp "alde_dun02",128,169; end;
			case 7: warp "alde_dun03",277,178; end;
			case 8: warp "alde_dun04",203,220; end;
		}
		break;

	case 5:
		switch(select("ダンジョンB1F","ダンジョンB2F","ダンジョンB3F","ダンジョンB4F","ミニョール廃坑B1F","ミニョール廃坑B2F","ミニョール廃坑B3F","オーク地下洞窟1","オーク地下洞窟2","ゲフェニア遺跡1","ゲフェニア遺跡2","ゲフェニア遺跡3","ゲフェニア遺跡4","やっぱやめる")) {
			case 1: warp "gef_dun00",104,99;  end;
			case 2: warp "gef_dun01",115,236; end;
			case 3: warp "gef_dun02",106,132; end;
			case 4: warp "gef_dun03",203,204; end;
			case 5: warp "mjo_dun01",52,17;   end;
			case 6: warp "mjo_dun02",381,343; end;
			case 7: warp "mjo_dun03",302,262; end;
			case 8: warp "orcsdun01",32,170;  end;
			case 9: warp "orcsdun02",180,17;  end;
			case 10: warp "gefenia01",244,83;  end;
			case 11: warp "gefenia02",242,24;  end;
			case 12: warp "gefenia03",252,170;  end;
			case 13: warp "gefenia04",130,271;  end;
		}
		break;

	case 6:
		switch(select("海底洞窟一層","海底洞窟二層","海底洞窟三層","海底洞窟四層","海底神殿","やっぱやめる")) {
			case 1: warp "iz_dun00",168,168; end;
			case 2: warp "iz_dun01",41,37;   end;
			case 3: warp "iz_dun02",236,204; end;
			case 4: warp "iz_dun03",32,63;   end;
			case 5: warp "iz_dun04",26,27;   end;
		}
		break;

	case 7:
		switch(select("沈没船一層","沈没船二層","タートルアイランド","タートルアイランドダンジョン","タートルアイランド陽居村","タートルアイランド久陽宮","やっぱやめる")) {
			case 1: warp "treasure01",69,24;  end;
			case 2: warp "treasure02",102,27; end;
			case 3: warp "tur_dun01",154,46;  end;
			case 4: warp "tur_dun02",148,264; end;
			case 5: warp "tur_dun03",132,189; end;
			case 6: warp "tur_dun04",100,192; end;
		}
		break;

	case 8:
		switch(select("地下洞窟B1F","地下洞窟B2F","地下洞窟B3F","地下寺院1","地下寺院2","やっぱやめる")) {
			case 1: warp "pay_dun00",21,183;  end;
			case 2: warp "pay_dun01",19,33;   end;
			case 3: warp "pay_dun02",19,63;   end;
			case 4: warp "pay_dun03",155,159; end;
			case 5: warp "pay_dun04",98,205;  end;
		}
		break;

	case 9:
		switch(select("おもちゃ工場倉庫","おもちゃ工場分類所","やっぱやめる")) {
			case 1: warp "xmas_dun01",205,15;  end;
			case 2: warp "xmas_dun02",129,133; end;
		}
		break;

	case 10:
		switch(select("西洞窟カル","北洞窟ルワンダ","東洞窟マオ","やっぱやめる")) {
			case 1: warp "beach_dun",266,67;  end;
			case 2: warp "beach_dun2",154,25; end;
			case 3: warp "beach_dun3",23,260; end;
		}
		break;

	case 11:
		switch(select("ユミルの書(転生)","ユミルの心臓(転生)","ノークロード一層","ノークロード二層","やっぱやめる")) {
			case 1: warp "yuno_in02",90,163; end;
			case 2: warp "yuno_in05",38,44; end;
			case 3: warp "mag_dun01",126,68; end;
			case 4: warp "mag_dun02",47,30;  end;
		}
		break;

	case 12:
		switch(select("畳の迷宮","地下戦場跡","アマツ地下神社","やっぱやめる")) {
			case 1: warp "ama_dun01",228,9;   end;
			case 2: warp "ama_dun02",31,41;   end;
			case 3: warp "ama_dun03",195,123; end;
		}
		break;

	case 13:
		switch(select("崑崙D1","崑崙D2","崑崙D3","やっぱやめる")) {
			case 1: warp "gon_dun01",154,45; end;
			case 2: warp "gon_dun02",26,114; end;
			case 3: warp "gon_dun03",68,8;   end;
		}
		break;

	case 14:
		switch(select("ジュピロス廃墟 01","ジュピロス廃墟 02","ジュピロス中心部","やっぱやめる")) {
			case 1: warp "juperos_01",56,247; end;
			case 2: warp "juperos_02",37,62; end;
			case 3: warp "jupe_core",150,18;   end;
		}
		break;
	case 15:
		switch(select("生体工学研究所01F","生体工学研究所02f","生体工学研究所03f","生体工学研究所04F","戦死者の墓","やっぱやめる")) {
			case 1: warp "lhz_dun01",150,286; end;
			case 2: warp "lhz_dun02",153,19; end;
			case 3: warp "lhz_dun03",140,133;  end;
			case 4: warp "lhz_dun04",245,56; end;
			case 5: warp "lhz_dun_n",140,133;  end;
		}
		break;
	case 16:
		switch(select("ニブルヘイム","秘境の村","ギョル峡谷","カボチャ農場","やっぱやめる")) {
			case 1: warp "niflheim",194,188; end;
			case 2: warp "nif_fild01",315,65; end;
			case 3: warp "nif_fild02",375,235; end;
			case 4: warp "nif_fild03",315,65; end;
		}
		break;
	case 17:
		switch(select("オーディン神殿01","オーディン神殿02","オーディン神殿03","アビスレイク地下洞窟01","アビスレイク地下洞窟02","アビスレイク地下洞窟03","タナトスタワー最上部","やっぱやめる")) {
			case 1: warp "odin_tem01",94,144; end;
			case 2: warp "odin_tem02",24,337; end;
			case 3: warp "odin_tem03",247,40; end;
			case 4: warp "abyss_01",260,272; end;
			case 5: warp "abyss_02",271,268; end;
			case 6: warp "abyss_03",115,35; end;
			case 7: warp "thana_boss",141,210; end;
		}
		break;
	case 18:
		switch(select("フレイヤ大神殿聖域01","フレイヤ大神殿聖域02","フレイヤ大神殿聖域03","フレイヤ大神殿聖域04","フレイヤ大神殿聖域05","氷の洞窟01","氷の洞窟02","氷の洞窟03","やっぱやめる")) {
			case 1: warp "ra_san01",139,20; end;
			case 2: warp "ra_san02",119,110; end;
			case 3: warp "ra_san03",10,149; end;
			case 4: warp "ra_san04",35,216; end;
			case 5: warp "ra_san05",14,149; end;
			case 6: warp "ice_dun01",158,18; end;
			case 7: warp "ice_dun02",152,140; end;
			case 8: warp "ice_dun03",149,24; end;
		}
		break;
	case 19:
		switch(select("トール火山ダンジョン01","トール火山ダンジョン02","トール火山ダンジョン03","修道院01","修道院02","修道院03","やっぱやめる")) {
			case 1: warp "thor_v01",22,229; end;
			case 2: warp "thor_v02",78,203; end;
			case 3: warp "thor_v03",37,263; end;
			case 4: warp "abbey01",53,15; end;
			case 5: warp "abbey02",149,12; end;
			case 6: warp "abbey03",119,12; end;
		}
		break;
	case 20:
		switch(select("滝の中の洞窟01","滝の中の洞窟02","やっぱやめる")) {
			case 1: warp "bra_dun01",200,40; end;
			case 2: warp "bra_dun02",261,263; end;
		}
		break;
	case 21:
		switch(select("イスタナ洞窟","やっぱやめる")) {
			case 1: warp "dew_dun02",302,30; end;
		}
		break;
	case 22:
		switch(select("王陵","王陵内部","白羊宮","やっぱやめる")) {
			case 1: warp "lou_dun01",215,195; end;
			case 2: warp "lou_dun02",285,19; end;
			case 3: warp "lou_dun03",165,38; end;
		}
		break;
	case 23:
		switch(select("森","深い森","奥深い森","やっぱやめる")) {
			case 1: warp "mosk_dun01",189,45; end;
			case 2: warp "mosk_dun02",160,33; end;
			case 3: warp "mosk_dun03",31,134; end;
		}
		break;
	case 24:
		switch(select("鉱山ダンジョン01","鉱山ダンジョン02","やっぱやめる")) {
			case 1: warp "ein_dun01",22,16; end;
			case 2: warp "ein_dun02",291,144; end;
		}
		break;
	case 25:
		switch(select("カミダルトンネル","スカラバホール","スカラバガーデン","やっぱやめる")) {
			case 1: warp "dic_dun01",366,45; end;
			case 2: warp "dic_dun02",102,144; end;
			case 3: warp "dic_dun03",31,134; end;
		}
		break;
	case 26:
		switch(select("フェイヨン","アルデバラン","プロンテラ","ゲフェン","アルナベル","シュバルツバルド","やっぱやめる")) {
			case 1: warp "gld_dun01",120,23; end;
			case 2: warp "gld_dun02",25,160; end;
			case 3: warp "gld_dun03",44,37;  end;
			case 4: warp "gld_dun04",110,28; end;
			case 5: warp "arug_dun01",207,16; end;
			case 6: warp "schg_dun01",262,315; end;
		}
		break;
	case 27:
		switch(select("フローズンメモリー","月夜花の悪夢","250 ページ","薄暗い久陽宮","悲しみの陽居村","ネジリアン帝国","幻想の北洞窟ルワンダ","歪んだ迷宮の森","紫色の深海洞窟 上層","紫色の深海洞窟 下層","認識の庭","やっぱやめる")) {
			case 1: warp "ice_d03_i",36,35; end;
			case 2: warp "pay_d03_i",147,40; end;
			case 3: warp "gef_d01_j",196,41;  end;
			case 4: warp "tur_d04_j",100,110; end;
			case 5: warp "tur_d03_j",55,35; end;
			case 6: warp "ein_d02_i",29,250; end;
			case 7: warp "com_d02_i",41,215; end;
			case 8: warp "prt_mz03_i",189,176; end;
			case 9: warp "iz_d04_i",31,40; end;
			case 10: warp "iz_d05_i",142,34; end;
			case 11: warp "ant_d02_i",257,41; end;
		}
		break;
	case 28:
		switch(select("テラーノーグロード3層","アビスレイク地下洞窟04","グラストヘイムアビス","鉱山ダンジョン03","やっぱやめる")) {
			case 1: warp "mag_dun03",47,48; end;
			case 2: warp "abyss_04",175,164; end;
			case 3: warp "gl_cas01_",200,40;  end;
			case 4: warp "ein_dun03_j",268,280; end;
		}
		break;
	case 29:
		switch(select("亡者の宴会場","崩れたオペラハウス","やっぱやめる")) {
			case 1: warp "nif_dun01",145,83; end;
			case 2: warp "nif_dun02",149,20; end;
		}
		break;
	case 30:
		switch(select("大浴場メディタティオ","やっぱやめる")) {
			case 1: warp "ba_bath_j",115,7; end;
		}
		break;
	case 31:
		switch(select("オズの迷路01","オズの迷路02","やっぱやめる")) {
			case 1: warp "oz_dun01",113,35; end;
			case 2: warp "oz_dun02",146,257; end;
		}
		break;
	case 32:
		switch(select("廃棄場ルドゥス1階","廃棄場ルドゥス2階","廃棄場ルドゥス3階","廃棄場ルドゥス4階","やっぱやめる")) {
			case 1: warp "sp_rudus",201,375; end;
			case 2: warp "sp_rudus2",356,206; end;
			case 3: warp "sp_rudus3",384,181; end;
			case 4: warp "sp_rudus4",364,208; end;

		}
		break;
	case 33:
		switch(select("第１魔力発電所","下水処理場","第２魔力発電所","やっぱやめる")) {
			case 1: warp "ba_pw01",92,288; end;
			case 2: warp "ba_pw02",11,149; end;
			case 3: warp "ba_pw03_j",13,115; end;

		}
		break;
	case 34:
		switch(select("貯蔵庫タルタロス上層","貯蔵庫タルタロス下層","やっぱやめる")) {
			case 1: warp "ba_2whs01_j",159,30; end;
			case 2: warp "ba_2whs02_j",336,325; end;

		}
		break;
	case 35:
		switch(select("捨てられた穴 01","捨てられた穴 02","蛇神の温もり 01","蛇神の温もり 02","やっぱやめる")) {
			case 1: warp "jor_ab01_",110,12; end;
			case 2: warp "jor_ab02_",282,88; end;
			case 3: warp "jor_dun01_",113,9; end;
			case 4: warp "jor_dun02_",279,87; end;

		}
		break;
	case 36:
		switch(select("魔力が歪んだ平原","やっぱやめる")) {
			case 1: warp "ra_pol01",288,105; end;

		}
		break;
	case 37:
		switch(select("ミョルニール地下洞窟","やっぱやめる")) {
			case 1: warp "mjo_wst01",203,362; end;

		}
		break;

	case 38:
		switch(select("アルデバラン時計塔地下 未知の空間","やっぱやめる")) {
			case 1: warp "clock_01",79,37; end;

		}
		break;
	case 39:
		switch(select("標本環境(草原)","標本環境(火炎)","標本環境(氷河)","標本環境(死屍)","標本環境(聖殿)","標本環境(猛毒)","やっぱやめる")) {
			case 1: warp "bl_grass",79,37; end;
			case 2: warp "bl_lava",165,16; end;
			case 3: warp "bl_ice",38,81; end;
			case 4: warp "bl_death",314,62; end;
			case 5: warp "bl_temple",53,83; end;
			case 6: warp "bl_venom",147,20; end;
		}
		break;
	case 40:
		switch(select("時の通路01","時の通路02","やっぱやめる")) {
			case 1: warp "dali",112,83; end;
			case 2: warp "dali02",63,116; end;

		}
		break;

	}
	mes "[ポタ子]";
	mes "いつでもご利用してくださいね。";
	close2;
	cutin "kafra_03",255;
	end;
}
