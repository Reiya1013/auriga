// �f�o�b�N�]��
prontera.gat,154,195,4	script	�|�^�q	115,{
	cutin "kafra_03",2;
	mes "[�|�^�q]";
	mes "����ɂ��́B�|�^�q�ł��B";
	mes "�F����𖳗��Ń_���W�����ɓ]�����č����グ�܂���B";
	mes "�|�^�����񏤔��オ������ł��ˁG�G";
	mes "�]�����č����グ�܂��傤���H";
	next;
	if(select("���肢���܂�","���������ł�") == 2) {
		mes "[�|�^�q]";
		mes "���ł������p���Ă��������ˁB";
		close2;
		cutin "kafra_03",255;
		end;
	}
	mes "[�|�^�q]";
	mes "�܂��͒n���I��ł��������B";
	next;
	set @menu,select("�v�����e��","�����N","�O���X�g�w�C��","�A���f�o����","�Q�t�F��","�C�Y���[�h","�A���x���^",
	                 "�t�F�C����","���e�B�G","�R���h","�W���m�[","�A�}�c","�R������","�W���s���X","���q�^���[��",
			 "�j�u���w�C��","�t�B�Q��","���w��","�x�C���X","�u���W���X","�f���^","���V��","���X�R�r�A","�A�C���x�t","�}�k�N",
			 "�M���h�_���W����","�C�����[�W�����_���W����",
                         "�e���[�_���W����","�j�u���w�C���_���W����","�嗁�ꃁ�f�B�^�e�B�I","�I�Y�̖��H","�p���ꃋ�h�D�X","���͔��d��","�����Ƀ^���^���X",
                         "�̂Ă�ꂽ���E�֐_�̉�����","���͂��c�񂾕���","�~�����j�[���n�����A","�A���f�o�������v���n�� ���m�̋��","�o�C�I�X�t�B�A","�����̋���","����ς�߂�");
	if(@menu != 15) {
		mes "[�|�^�q]";
		mes "�s�������ꏊ��I��ł��������B";
		next;
	}

	switch(@menu) {
	case 1:
		switch(select("�n�����HB1F","�n�����HB2F","�n�����HB3F","�n�����HB4F","���{�̐X1",
		              "���{�̐X2","���{�̐X3","����ς�߂�")) {
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
		switch(select("�X�t�B���N�X1F","�X�t�B���N�X2F","�X�t�B���N�X3F","�X�t�B���N�X4F","�X�t�B���N�X5F",
		              "�s���~�b�h1F","�s���~�b�h2F","�s���~�b�h3F","�s���~�b�h4F","�a�n��1","�a�n��2","�i�C�g���A�s���~�b�h2F","�s���~�b�hB3F","�����̋���03","����ς�߂�")) {
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
		switch(select("�C���@�O","�Ï�1F","�Ï�2F","�R�m�c1F","�R�m�c2F","���O","�J�^�R��","�K�i",
		              "�n�����HB1F","�n�����HB2F","�n�����HB3F","�n�����HB4F","�ŉ��w�n�����AB1F","�ŉ��w�n�����AB2F",
		              "�č�B1F","�č�B2F","����ς�߂�")) {
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
		switch(select("���v��1F","���v��2F","���v��3F","���v��4F","���v��B1F","���v��B2F",
		              "���v��B3F","���v��B4F","����ς�߂�")) {
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
		switch(select("�_���W����B1F","�_���W����B2F","�_���W����B3F","�_���W����B4F","�~�j���[���p�BB1F","�~�j���[���p�BB2F","�~�j���[���p�BB3F","�I�[�N�n�����A1","�I�[�N�n�����A2","�Q�t�F�j�A���1","�Q�t�F�j�A���2","�Q�t�F�j�A���3","�Q�t�F�j�A���4","����ς�߂�")) {
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
		switch(select("�C�ꓴ�A��w","�C�ꓴ�A��w","�C�ꓴ�A�O�w","�C�ꓴ�A�l�w","�C��_�a","����ς�߂�")) {
			case 1: warp "iz_dun00",168,168; end;
			case 2: warp "iz_dun01",41,37;   end;
			case 3: warp "iz_dun02",236,204; end;
			case 4: warp "iz_dun03",32,63;   end;
			case 5: warp "iz_dun04",26,27;   end;
		}
		break;

	case 7:
		switch(select("���v�D��w","���v�D��w","�^�[�g���A�C�����h","�^�[�g���A�C�����h�_���W����","�^�[�g���A�C�����h�z����","�^�[�g���A�C�����h�v�z�{","����ς�߂�")) {
			case 1: warp "treasure01",69,24;  end;
			case 2: warp "treasure02",102,27; end;
			case 3: warp "tur_dun01",154,46;  end;
			case 4: warp "tur_dun02",148,264; end;
			case 5: warp "tur_dun03",132,189; end;
			case 6: warp "tur_dun04",100,192; end;
		}
		break;

	case 8:
		switch(select("�n�����AB1F","�n�����AB2F","�n�����AB3F","�n�����@1","�n�����@2","����ς�߂�")) {
			case 1: warp "pay_dun00",21,183;  end;
			case 2: warp "pay_dun01",19,33;   end;
			case 3: warp "pay_dun02",19,63;   end;
			case 4: warp "pay_dun03",155,159; end;
			case 5: warp "pay_dun04",98,205;  end;
		}
		break;

	case 9:
		switch(select("��������H��q��","��������H�ꕪ�ޏ�","����ς�߂�")) {
			case 1: warp "xmas_dun01",205,15;  end;
			case 2: warp "xmas_dun02",129,133; end;
		}
		break;

	case 10:
		switch(select("�����A�J��","�k���A�������_","�����A�}�I","����ς�߂�")) {
			case 1: warp "beach_dun",266,67;  end;
			case 2: warp "beach_dun2",154,25; end;
			case 3: warp "beach_dun3",23,260; end;
		}
		break;

	case 11:
		switch(select("���~���̏�(�]��)","���~���̐S��(�]��)","�m�[�N���[�h��w","�m�[�N���[�h��w","����ς�߂�")) {
			case 1: warp "yuno_in02",90,163; end;
			case 2: warp "yuno_in05",38,44; end;
			case 3: warp "mag_dun01",126,68; end;
			case 4: warp "mag_dun02",47,30;  end;
		}
		break;

	case 12:
		switch(select("��̖��{","�n������","�A�}�c�n���_��","����ς�߂�")) {
			case 1: warp "ama_dun01",228,9;   end;
			case 2: warp "ama_dun02",31,41;   end;
			case 3: warp "ama_dun03",195,123; end;
		}
		break;

	case 13:
		switch(select("����D1","����D2","����D3","����ς�߂�")) {
			case 1: warp "gon_dun01",154,45; end;
			case 2: warp "gon_dun02",26,114; end;
			case 3: warp "gon_dun03",68,8;   end;
		}
		break;

	case 14:
		switch(select("�W���s���X�p�� 01","�W���s���X�p�� 02","�W���s���X���S��","����ς�߂�")) {
			case 1: warp "juperos_01",56,247; end;
			case 2: warp "juperos_02",37,62; end;
			case 3: warp "jupe_core",150,18;   end;
		}
		break;
	case 15:
		switch(select("���̍H�w������01F","���̍H�w������02f","���̍H�w������03f","���̍H�w������04F","�펀�҂̕�","����ς�߂�")) {
			case 1: warp "lhz_dun01",150,286; end;
			case 2: warp "lhz_dun02",153,19; end;
			case 3: warp "lhz_dun03",140,133;  end;
			case 4: warp "lhz_dun04",245,56; end;
			case 5: warp "lhz_dun_n",140,133;  end;
		}
		break;
	case 16:
		switch(select("�j�u���w�C��","�鋫�̑�","�M�������J","�J�{�`���_��","����ς�߂�")) {
			case 1: warp "niflheim",194,188; end;
			case 2: warp "nif_fild01",315,65; end;
			case 3: warp "nif_fild02",375,235; end;
			case 4: warp "nif_fild03",315,65; end;
		}
		break;
	case 17:
		switch(select("�I�[�f�B���_�a01","�I�[�f�B���_�a02","�I�[�f�B���_�a03","�A�r�X���C�N�n�����A01","�A�r�X���C�N�n�����A02","�A�r�X���C�N�n�����A03","�^�i�g�X�^���[�ŏ㕔","����ς�߂�")) {
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
		switch(select("�t���C����_�a����01","�t���C����_�a����02","�t���C����_�a����03","�t���C����_�a����04","�t���C����_�a����05","�X�̓��A01","�X�̓��A02","�X�̓��A03","����ς�߂�")) {
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
		switch(select("�g�[���ΎR�_���W����01","�g�[���ΎR�_���W����02","�g�[���ΎR�_���W����03","�C���@01","�C���@02","�C���@03","����ς�߂�")) {
			case 1: warp "thor_v01",22,229; end;
			case 2: warp "thor_v02",78,203; end;
			case 3: warp "thor_v03",37,263; end;
			case 4: warp "abbey01",53,15; end;
			case 5: warp "abbey02",149,12; end;
			case 6: warp "abbey03",119,12; end;
		}
		break;
	case 20:
		switch(select("��̒��̓��A01","��̒��̓��A02","����ς�߂�")) {
			case 1: warp "bra_dun01",200,40; end;
			case 2: warp "bra_dun02",261,263; end;
		}
		break;
	case 21:
		switch(select("�C�X�^�i���A","����ς�߂�")) {
			case 1: warp "dew_dun02",302,30; end;
		}
		break;
	case 22:
		switch(select("����","���˓���","���r�{","����ς�߂�")) {
			case 1: warp "lou_dun01",215,195; end;
			case 2: warp "lou_dun02",285,19; end;
			case 3: warp "lou_dun03",165,38; end;
		}
		break;
	case 23:
		switch(select("�X","�[���X","���[���X","����ς�߂�")) {
			case 1: warp "mosk_dun01",189,45; end;
			case 2: warp "mosk_dun02",160,33; end;
			case 3: warp "mosk_dun03",31,134; end;
		}
		break;
	case 24:
		switch(select("�z�R�_���W����01","�z�R�_���W����02","����ς�߂�")) {
			case 1: warp "ein_dun01",22,16; end;
			case 2: warp "ein_dun02",291,144; end;
		}
		break;
	case 25:
		switch(select("�J�~�_���g���l��","�X�J���o�z�[��","�X�J���o�K�[�f��","����ς�߂�")) {
			case 1: warp "dic_dun01",366,45; end;
			case 2: warp "dic_dun02",102,144; end;
			case 3: warp "dic_dun03",31,134; end;
		}
		break;
	case 26:
		switch(select("�t�F�C����","�A���f�o����","�v�����e��","�Q�t�F��","�A���i�x��","�V���o���c�o���h","����ς�߂�")) {
			case 1: warp "gld_dun01",120,23; end;
			case 2: warp "gld_dun02",25,160; end;
			case 3: warp "gld_dun03",44,37;  end;
			case 4: warp "gld_dun04",110,28; end;
			case 5: warp "arug_dun01",207,16; end;
			case 6: warp "schg_dun01",262,315; end;
		}
		break;
	case 27:
		switch(select("�t���[�Y���������[","����Ԃ̈���","250 �y�[�W","���Â��v�z�{","�߂��݂̗z����","�l�W���A���鍑","���z�̖k���A�������_","�c�񂾖��{�̐X","���F�̐[�C���A ��w","���F�̐[�C���A ���w","�F���̒�","����ς�߂�")) {
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
		switch(select("�e���[�m�[�O���[�h3�w","�A�r�X���C�N�n�����A04","�O���X�g�w�C���A�r�X","�z�R�_���W����03","����ς�߂�")) {
			case 1: warp "mag_dun03",47,48; end;
			case 2: warp "abyss_04",175,164; end;
			case 3: warp "gl_cas01_",200,40;  end;
			case 4: warp "ein_dun03_j",268,280; end;
		}
		break;
	case 29:
		switch(select("�S�҂̉����","���ꂽ�I�y���n�E�X","����ς�߂�")) {
			case 1: warp "nif_dun01",145,83; end;
			case 2: warp "nif_dun02",149,20; end;
		}
		break;
	case 30:
		switch(select("�嗁�ꃁ�f�B�^�e�B�I","����ς�߂�")) {
			case 1: warp "ba_bath_j",115,7; end;
		}
		break;
	case 31:
		switch(select("�I�Y�̖��H01","�I�Y�̖��H02","����ς�߂�")) {
			case 1: warp "oz_dun01",113,35; end;
			case 2: warp "oz_dun02",146,257; end;
		}
		break;
	case 32:
		switch(select("�p���ꃋ�h�D�X1�K","�p���ꃋ�h�D�X2�K","�p���ꃋ�h�D�X3�K","�p���ꃋ�h�D�X4�K","����ς�߂�")) {
			case 1: warp "sp_rudus",201,375; end;
			case 2: warp "sp_rudus2",356,206; end;
			case 3: warp "sp_rudus3",384,181; end;
			case 4: warp "sp_rudus4",364,208; end;

		}
		break;
	case 33:
		switch(select("��P���͔��d��","����������","��Q���͔��d��","����ς�߂�")) {
			case 1: warp "ba_pw01",92,288; end;
			case 2: warp "ba_pw02",11,149; end;
			case 3: warp "ba_pw03_j",13,115; end;

		}
		break;
	case 34:
		switch(select("�����Ƀ^���^���X��w","�����Ƀ^���^���X���w","����ς�߂�")) {
			case 1: warp "ba_2whs01_j",159,30; end;
			case 2: warp "ba_2whs02_j",336,325; end;

		}
		break;
	case 35:
		switch(select("�̂Ă�ꂽ�� 01","�̂Ă�ꂽ�� 02","�֐_�̉����� 01","�֐_�̉����� 02","����ς�߂�")) {
			case 1: warp "jor_ab01_",110,12; end;
			case 2: warp "jor_ab02_",282,88; end;
			case 3: warp "jor_dun01_",113,9; end;
			case 4: warp "jor_dun02_",279,87; end;

		}
		break;
	case 36:
		switch(select("���͂��c�񂾕���","����ς�߂�")) {
			case 1: warp "ra_pol01",288,105; end;

		}
		break;
	case 37:
		switch(select("�~�����j�[���n�����A","����ς�߂�")) {
			case 1: warp "mjo_wst01",203,362; end;

		}
		break;

	case 38:
		switch(select("�A���f�o�������v���n�� ���m�̋��","����ς�߂�")) {
			case 1: warp "clock_01",79,37; end;

		}
		break;
	case 39:
		switch(select("�W�{��(����)","�W�{��(�Ή�)","�W�{��(�X��)","�W�{��(���r)","�W�{��(���a)","�W�{��(�ғ�)","����ς�߂�")) {
			case 1: warp "bl_grass",79,37; end;
			case 2: warp "bl_lava",165,16; end;
			case 3: warp "bl_ice",38,81; end;
			case 4: warp "bl_death",314,62; end;
			case 5: warp "bl_temple",53,83; end;
			case 6: warp "bl_venom",147,20; end;
		}
		break;
	case 40:
		switch(select("���̒ʘH01","���̒ʘH02","����ς�߂�")) {
			case 1: warp "dali",112,83; end;
			case 2: warp "dali02",63,116; end;

		}
		break;

	}
	mes "[�|�^�q]";
	mes "���ł������p���Ă��������ˁB";
	close2;
	cutin "kafra_03",255;
	end;
}
