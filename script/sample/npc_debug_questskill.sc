//�N�G�X�g�X�L��
prontera.gat,152,187,4	script	�X�L����	779,{
	mes "[�X�L����]";
	mes "�E�Ƃ�I��ł�������";
	next;
	set @menu,select("���m�n","�E�B�U�[�h�n","�A�[�`���[�n","�A�R���C�g�n","�V�[�t�n","���l�n","��߂�");
	if(@menu == 7) {
		close;
	}
	mes "[�X�L����]";
	mes "�o����X�L����I��ł�������";
	next;
	if(@menu == 1) {
		switch(select("�ړ���HP��","�}���U��","�I�[�g�o�[�T�[�N","�`���[�W�A�^�b�N","�V�������N")) {
		case 1:
			set '@skillid,144;
			close;
		case 2:
			set '@skillid,145;
			close;
		case 3:
			set '@skillid,146;
			close;
		case 4:
			if(getbaseclass(Class,2) == CLASS_KN)
				skill 1001,1,0;
			close;
		case 5:
			if(getbaseclass(Class,2) == CLASS_CR)
				skill 1002,1,0;
			close;
		}
	}
	else if(@menu == 2) {
		switch(select("�G�i�W�[�R�[�g","�T�C�g�u���X�^�[","�R���o�[�^�[����","�������G�������^���`�F���W","�n�����G�������^���`�F���W","�Α����G�������^���`�F���W","�������G�������^���`�F���W")) {
		case 1:
			set '@skillid,157;
			break;
		case 2:
			if(getbaseclass(Class,2) == CLASS_WZ)
				skill 1006,1,0;
			close;
		case 3:
			if(getbaseclass(Class,2) == CLASS_SA)
				skill 1007,1,0;
			close;
		case 4:
			set '@skillid,1008;
			break;
		case 5:
			set '@skillid,1017;
			break;
		case 6:
			set '@skillid,1018;
			break;
		case 7:
			set '@skillid,1019;
			break;
		}
		// 3�`6�̂Ƃ�����
		if(getbaseclass(Class,2) == CLASS_SA && getskilllv(1008) <= 0 && getskilllv(1017) <= 0 && getskilllv(1018) <= 0 && getskilllv(1019) <= 0)
			skill '@skillid,1,0;
		close;
	}
	else if(@menu == 3) {
		switch(select("��쐬","�t�@���^�X�~�b�N�A���[","�`���[�W�A���[","�p���{�C�X","���f�̃E�B���N")) {
		case 1:
			set '@skillid,147;
			break;
		case 2:
			set '@skillid,148;
			break;
		case 3:
			if(getbaseclass(Class,2) == CLASS_HT)
				skill 1009,1,0;
			close;
		case 4:
			if(getbaseclass(Class,2) == CLASS_BA)
				skill 1010,1,0;
			close;
		case 5:
			if(getbaseclass(Class,2) == CLASS_DC)
				skill 1011,1,0;
			close;
		}
	}
	else if(@menu == 4) {
		switch(select("�z�[���[���C�g","���f���v�e�B�I","�C����","�C����")) {
		case 1:
			set '@skillid,156;
			break;
		case 2:
			if(getbaseclass(Class,2) == CLASS_PR)
				skill 1014,1,0;
			close;
		case 3:
			if(getbaseclass(Class,2) == CLASS_MO)
				skill 1015,1,0;
			close;
		case 4:
			if(getbaseclass(Class,2) == CLASS_MO)
				skill 1016,1,0;
			close;
		}
	}
	else if(@menu == 5) {
		switch(select("�ΏE��","�Γ���","���܂�","�o�b�N�X�e�b�v","�\�j�b�N�A�N�Z�����[�V����","�x�i���i�C�t","�N���[�Y�R���t�@�C��")) {
		case 1:
			set '@skillid,151;
			break;
		case 2:
			set '@skillid,152;
			break;
		case 3:
			set '@skillid,149;
			break;
		case 4:
			set '@skillid,150;
			break;
		case 5:
			if(getbaseclass(Class,2) == CLASS_AS)
				skill 1003,1,0;
			close;
		case 6:
			if(getbaseclass(Class,2) == CLASS_AS)
				skill 1004,1,0;
			close;
		case 7:
			if(getbaseclass(Class,2) == CLASS_RG)
				skill 1005,1,0;
			close;
		}
	}
	else if(@menu == 6) {
		switch(select("���E�h�{�C�X","�`�F���W�J�[�g","�J�[�g���{�����[�V����","�t�F�C�N�[�j�[","�×~")) {
		case 1:
			set '@skillid,155;
			break;
		case 2:
			set '@skillid,154;
			break;
		case 3:
			set '@skillid,153;
			break;
		case 4:
			if(getbaseclass(Class,2) == CLASS_BS)
				skill 1012,1,0;
			close;
		case 5:
			if(getbaseclass(Class,2) == CLASS_BS)
				skill 1013,1,0;
			close;
		}
	}
	close;
}
