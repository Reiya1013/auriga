//====================================================================
//Ragnarok Online - 3rd Class Jobchange Script	by refis
//====================================================================

//============================================================
// Func_Job3rd�F�]�E��sNPC
//  ����(0)	�F�Ώۂ�3���E�ԍ�(Job_RuneKnight�`Job_ShadowChaser�j
//  �߂�l	�F0) �R�[�����̃N�G�X�g���s
//			  1) �R�[�����ŉ�b�I���i���f�E�]�E�����Ȃǁj
//------------------------------------------------------------
function	script	Func_Job3rd	{
	set '@job,getarg(0);
	switch('@job) {
		case Job_RuneKnight:   set '@jobname$,"���[���i�C�g";       set '@oldjobname$,"�i�C�g";         break;
		case Job_Warlock:      set '@jobname$,"�E�H�[���b�N";       set '@oldjobname$,"�E�B�U�[�h";     break;
		case Job_Ranger:       set '@jobname$,"�����W���[";         set '@oldjobname$,"�n���^�[";       break;
		case Job_ArchBishop:   set '@jobname$,"�A�[�N�r�V���b�v";   set '@oldjobname$,"�v���[�X�g";     break;
		case Job_Mechanic:     set '@jobname$,"���J�j�b�N";         set '@oldjobname$,"�u���b�N�X�~�X"; break;
		case Job_Guillotine:   set '@jobname$,"�M���`���N���X";     set '@oldjobname$,"�A�T�V��";       break;
		case Job_RoyalGuard:   set '@jobname$,"���C�����K�[�h";     set '@oldjobname$,"�N���Z�C�_�[";   break;
		case Job_Sorcerer:     set '@jobname$,"�\�[�T���[";         set '@oldjobname$,"�Z�[�W";         break;
		case Job_Minstrel:     set '@jobname$,"�~���X�g����";       set '@oldjobname$,"�o�[�h";         break;
		case Job_Wanderer:     set '@jobname$,"�����_���[";         set '@oldjobname$,"�_���T�[";       break;
		case Job_Shura:        set '@jobname$,"�C��";               set '@oldjobname$,"�����N";         break;
		case Job_Genetic:      set '@jobname$,"�W�F�l�e�B�b�N";     set '@oldjobname$,"�A���P�~�X�g";   break;
		case Job_ShadowChaser: set '@jobname$,"�V���h�E�`�F�C�T�["; set '@oldjobname$,"���[�O";         break;
	}
	mes "[�]�E��s�W]";
	mes "���҂�������!!";
	next;
	mes "[�]�E��s�W]";
	mes "�ˑR�ł����A";
	mes "���A�]�E��s�W�Ɛ\���܂��B";
	mes "���܂��ɁA";
	mes '@jobname$ + "�]�E�N�G�X�g��";
	mes "�J�n����悤�Ƃ��Ă��܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "���̃N�G�X�g��";
	mes "����ȃN�G�X�g�ƂȂ��Ă���܂��B";
	mes "�����炲�����������܂��̂�";
	mes "���X���t���������������ˁB";
	next;
	mes "[�]�E��s�W]";
	mes '@jobname$ + "�]�E�N�G�X�g��";
	mes '@oldjobname$ + "�n��3���E�ł���";
	mes '@jobname$ + "�ɓ]�E���邽�߂�";
	mes "�N�G�X�g�ł��B";
	next;
	mes "[�]�E��s�W]";
	mes "���̃N�G�X�g���J�n���ăN���A�����ꍇ�A";
	mes "�]�E�ł��邾���łȂ�";
	mes "�N���A��V�Ƃ���^FF0000��x�������p�\��";
	mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g��^000000��";
	mes "�t�^����܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "�܂��A���̃N�G�X�g�͊J�n������";
	mes "�̌����������ɂ���";
	mes "�������]�E���邱�Ƃ��ł��܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "�A���A���̏ꍇ�A����ȍ~��";
	mes "���̃N�G�X�g��̌����邱�Ƃ͂ł��܂���B";
	mes "�N���A��V��";
	mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g����";
	mes "���邱�Ƃ��o���Ȃ��Ȃ�܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "���ƁA���X���ʂȃP�[�X�ł����A";
	mes "�N�G�X�g���J�n������A�r����";
	mes "�ʏ�ƈقȂ���@�œ]�E�����ꍇ�A";
	mes "�]�E������̂܂܃N�G�X�g��";
	mes "�̌����邱�ƂɂȂ�܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "�����������ꍇ�ł��N�G�X�g���N���A�����";
	mes "�N���A��V�Ƃ���^FF0000��x�������p�\��";
	mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g��^000000��";
	mes "�t�^����܂��B";
	next;
	mes "[�]�E��s�W]";
	mes "�܂��A�N�G�X�g��̌����Ă���ԁA";
	mes "���̎��̐E�ƂƂ͈Ⴄ������";
	mes "�b���i�ނ��Ƃ����邩������܂���B";
	mes "����Ȏ��͘b�����킹��";
	mes "�����Ă��������ˁB";
	next;
	mes "[�]�E��s�W]";
	mes "�ǂ���̑I�����A��x�s����";
	mes "�ēx�I�тȂ������Ƃ͏o���܂���̂�";
	mes "�T�d�ɑI�����Ă��������B";
	next;
	while(1) {
		switch(select("��U�l����","�N�G�X�g���J�n�����ɍ������]�E","�N�G�X�g���J�n����","�N�G�X�g�̃N���A��V�ɂ��ĕ���","���̏�𗣂��")) {
		case 1:
			continue;
		case 2:
			mes "[�]�E��s�W]";
			mes "�u�N�G�X�g���J�n�����ɍ������]�E�v��";
			mes "�I������܂����B";
			mes "�������ɓ]�E�o���܂����A�ȍ~�A";
			mes "�N�G�X�g�͑̌��������̂Ƃ��Ĉ����A";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g�̌�����";
			mes "�����܂���B��낵���ł����H";
			next;
			if(select("�͂�","������") == 2) {
				mes "�]���̏���������]";
				close2;
				return 1;
			}
			mes "[�]�E��s�W]";
			mes "�ł́A�N�G�X�g�͑̌��������Ƃɂ���";
			mes "�]�E���܂��傤�I";
			next;
			if(SkillPoint) {
				mes "�]�X�L���|�C���g���]���Ă��邽��";
				mes "�@�i�s�ł��܂���]";
				close2;
				return 1;
			}
			if(Weight || checkitemblank() < 3 || checkcart() || checkfalcon() || checkriding() || checkdragon() || checkgear() || checkwolf() || sc_ison(SC_ALL_RIDING) || getpetinfo(0)) {
				mes "[�]�E��s�W]";
				mes "���Ȃ��͏������Ȃ����";
				mes "�Ȃ�Ȃ����Ƃ�����܂��ˁB";
				mes "�܂��́A�g�𐴂߂�ׂ�";
				mes "�g�̂܂��̂��̂�";
				mes "���ɂ��Ă��������B";
				next;
				mes "[�]�E��s�W]";
				mes "�A�C�e�����̉ו��������Ȃ�";
				mes "��̏�ԂłȂ���΂Ȃ�܂���B";
				mes "�������ɂ��������B��J�[�g�A";
				mes "�R�搶���A�y�b�g�Ȃǂ�";
				mes "�����čs�����Ƃ͂ł��܂���B";
				next;
				mes "[�]�E��s�W]";
				mes "����ł́c�c�p�ӂ��ł��܂�����";
				mes "���z�����������B";
				close2;
				return 1;
			}
			if('@job == Job_RuneKnight) {
				mes "[�]�E��s�W]";
				mes "�]�E����ׂ̏����͖��S�̂悤�ł��ˁB";
				mes "����ł́A�]�E����O�ɁA";
				mes "���ꂩ�炲�Љ�܂������̂���";
				mes "�����ꂩ1�����I�т��������B";
				while(1) {
					next;
					mes "[�]�E��s�W]";
					mes "���I�тɂȂ����������A";
					mes "�]�E�̍ۂɓn����܂��B";
					mes " ";
					mes "[<ITEM>�G�i�W�[���[���K�[�h[1]<INFO>2140</INFO></ITEM>]";
					mes "[<ITEM>���͐΂̎w��[1]<INFO>2794</INFO></ITEM>]";
					mes "[<ITEM>���[���v���[�g[1]<INFO>15002</INFO></ITEM>]";
					next;
					switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]")) {
					case 1:
						set '@item,2140;
						break;
					case 2:
						set '@item,2794;
						break;
					case 3:
						set '@item,15002;
						break;
					}
					mes "[�]�E��s�W]";
					mes getitemname('@item) + "[1]�ł��ˁB";
					mes "�{���ɂ�����ł�낵���ł����H";
					next;
					if(select("�͂�","������") == 1) {
						break;
					}
					mes "[�]�E��s�W]";
					mes "����ł͍ēx�A";
					mes "�~����������";
					mes "���I�щ������B";
					continue;
				}
			}
			resetstatus;
			resetskill;
			setoption 0;
			jobchange '@job;
			switch('@job) {
			case Job_RuneKnight:
				setquest 201180;
				compquest 201180;
				getitem 5746,1;		// ���[���T�[�N���b�g
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				getitem '@item,1;	// �I����������
				break;
			case Job_Warlock:
				setquest 201185;
				compquest 201185;
				getitem 5753,1;		// ���͐΂̖X�q
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Ranger:
				setquest 201190;
				compquest 201190;
				getitem 5748,1;		// �X�i�C�p�[�S�[�O��
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				getitem 6124,1;		// �T�̓J
				break;
			case Job_ArchBishop:
				setquest 201195;
				compquest 201195;
				getitem 5747,1;		// �~�g��
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Mechanic:
				setquest 201205;
				compquest 201205;
				if(Sex)
					getitem 5749,1;	// �h���C�o�[�o���h(male)
				else
					getitem 5760,1;	// �h���C�o�[�o���h(female)
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Guillotine:
				setquest 201200;
				compquest 201200;
				getitem 12106,1;	// ��Δ�
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				getitem 5755,1;		// ���ق̎��s��
				break;
			case Job_RoyalGuard:
				setquest 201210;
				compquest 201210;
				getitem 5757,1;		// �V���~�b�c�̃w����
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Sorcerer:
				setquest 201215;
				compquest 201215;
				getitem 5756,1;		// ���̂����₫
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Minstrel:
				setquest 201220;
				compquest 201220;
				getitem 5751,1;		// �~���X�g�����\���O�̖X�q
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Wanderer:
				setquest 201225;
				compquest 201225;
				getitem 5758,1;		// �o�����[�i�̔�����
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Shura:
				setquest 201230;
				compquest 201230;
				getitem 5754,1;		// �u���C�W���O�\�E��
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_Genetic:
				setquest 201240;
				compquest 201240;
				getitem 5752,1;		// �~�_�X�̂����₫
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				break;
			case Job_ShadowChaser:
				setquest 201235;
				compquest 201235;
				getitem 6121,1;		// �t�F�C�X�y�C���g�u���V
				getitem 6122,1;		// �y�C���g�u���V
				getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
				getitem 5750,1;		// �V���h�E�N���E��
				break;
			}
			mes "[�]�E��s�W]";
			mes "�����A����ŋM����";
			mes '@jobname$ + "�ƂȂ�܂����B";
			mes "�����ڂ��C��������V�ł��ˁI";
			close2;
			return 1;
		case 3:
			mes "[�]�E��s�W]";
			mes "�u�N�G�X�g���J�n����v��";
			mes "�I������܂����B";
			mes "�N�G�X�g�J�n���";
			mes "�J�n�����ɍ������]�E����I����";
			mes "�o���Ȃ��Ȃ�܂��B";
			mes "�{���ɂ�낵���ł����H";
			next;
			if(select("�͂�","��߂�") == 2) {
				mes "�]���̏���������]";
				close2;
				return 1;
			}
			mes "[�]�E��s�W]";
			mes "�킩��܂����B";
			mes "�ł́A�N�G�X�g���J�n���܂��B";
			next;
			return 0;
		case 4:
			mes "[�]�E��s�W]";
			mes '@jobname$ + "�]�E�N�G�X�g��";
			mes '@oldjobname$ + "�n��3���E�ł���";
			mes '@jobname$ + "�ɓ]�E���邽�߂�";
			mes "�N�G�X�g�ł��B";
			next;
			mes "[�]�E��s�W]";
			mes "���̃N�G�X�g���J�n���ăN���A�����ꍇ�A";
			mes "�]�E�ł��邾���łȂ�";
			mes "�N���A��V�Ƃ���^FF0000��x�������p�\��";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g��^000000��";
			mes "�t�^����܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "���̃T�[�r�X�̓C�Y���[�h�ɋ���";
			mes "�T���V�C�̌��Ŏ󂯂邱�Ƃ��o���܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g������ƁA";
			mes "�M��������܂Ŋ���U����";
			mes "�X�e�[�^�X�E�X�L�������Z�b�g����";
			mes "����܂łɊl�����Ă���";
			mes "�X�e�[�^�X�E�X�L���|�C���g��";
			mes "�S�Ď茳�ɖ߂�܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g�ɂ�";
			mes "����������������܂��B";
			mes "�܂��A�����A�C�e���̏d�ʂ�";
			mes "^FF00000^000000�ɂ���K�v������܂��B";
			mes "�莝���̃A�C�e���́A";
			mes "�q�ɂɗa����Ȃǂ��Ă��������B";
			next;
			mes "[�]�E��s�W]";
			mes "���ɁA^FF0000�J�[�g�A�t�@���R���A";
			mes "�y�R�y�R�A�h���S���A�O���t�H���A";
			mes "�E�H�[�O�A�����M�A�A�R�搶��^000000";
			mes "�𗘗p���Ă����";
			mes "�T�[�r�X���󂯂��܂���̂�";
			mes "�����͊O���Ă��Ă��������B";
			next;
			mes "[�]�E��s�W]";
			mes "�X�e�[�^�X�����Z�b�g����ƁA";
			mes "����܂łɊl�����Ă���";
			mes "�X�e�[�^�X�|�C���g��";
			mes "�茳�ɖ߂��Ă��܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "���ɃX�L�����Z�b�g��";
			mes "�d�g�݂ɂ��Ă��b���܂��傤�B";
			next;
			mes "[�]�E��s�W]";
			mes "�X�L�����Z�b�g�������";
			mes "����܂łɊl�����Ă���";
			mes "1���E����2���E���A3���E����";
			mes "���v�����X�L���|�C���g��";
			mes "�茳�ɖ߂�܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "1���E���Ɋւ��Ă̋�̗��";
			mes "�����܂��ƁA2���E�ւ̓]�E��";
			mes "JobLv40����������39�|�C���g�A";
			mes "JobLv50����������49�|�C���g";
			mes "�ƂȂ�܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "�����Ă�����2���E�A";
			mes "3���E�Ŋl�������|�C���g��";
			mes "�ǉ�����܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "�Ȃ��A�m�[�r�X���Ɋl������";
			mes "��{�X�L����A���}�蓖��";
			mes "�N�G�X�g�ŏK�������ǉ��X�L����";
			mes "�ւ��ẮA���Z�b�g����܂���B";
			next;
			mes "[�]�E��s�W]";
			mes "���ꂩ��A�]�����ꂽ���͓]��1���E��";
			mes "�]�E������Ɋl�������X�L����";
			mes "���Z�b�g����܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "�ł́A�X�L�����Z�b�g���";
			mes "���ӎ��������b�����܂��B";
			mes "2���E�E���2���E�̕���";
			mes "�܂��A^FF00001���E�E�]��1���E����";
			mes "�X�L���|�C���g������U���ĉ������B^000000";
			next;
			mes "[�]�E��s�W]";
			mes "�Ⴆ�΁c�c";
			mes "2���E�ւ̓]�E��JobLv40����������";
			mes "1���E��39�|�C���g����";
			mes "1���E�p�X�L���Ɋ���U��`��";
			mes "�Ȃ�܂��B";
			next;
			mes "[�]�E��s�W]";
			mes "^FF00001���E�p�̃X�L���|�C���g��";
			mes "�S�ď���Ȃ��ƁA2���E�̃X�L����";
			mes "�|�C���g������U�邱�Ƃ�";
			mes "�ł��܂���B^000000";
			next;
			mes "[�]�E��s�W]";
			mes "^FF0000�������3���E�̕���";
			mes "1���E�A2���E�p�̃X�L���|�C���g��";
			mes "�S�ď���Ȃ��ƁA3���E��";
			mes "�X�L���փ|�C���g������U�邱�Ƃ�";
			mes "�ł��܂���^000000�̂ŁA�����ӂ��������B";
			next;
			mes "[�]�E��s�W]";
			mes "3���E�]�E�N�G�X�g�̃N���A��V�A";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g�̐�����";
			mes "�ȏ�ł��B";
			close2;
			return 1;
		case 5:
			mes "�]���̏���������]";
			close2;
			return 1;
		}
	}
}

//============================================================
// �X�e�[�^�X�E�X�L���ꊇ���Z�b�gNPC
//------------------------------------------------------------
izlude.gat,104,231,3	script	�T���V�C	878,{
	mes "[�T���V�C]";
	mes "���������`���B����";
	mes "3���E�]�E�N�G�X�g�̃N���A��V";
	mes "^FF0000�X�e�[�^�X���X�L���ꊇ";
	mes "���Z�b�g�T�[�r�X^000000��";
	mes "��C����Ă���T���V�C�ł��B";
	next;
	mes "[�T���V�C]";
	mes "�������������ł�����A";
	mes "^FF0000�X�e�[�^�X���Z�b�g��";
	mes "�X�L�����Z�b�g���ꊇ����^000000";
	mes "�s�����Ƃ��ł��܂���B";
	next;
	switch(select("^FF0000�X�e�[�^�X���X�L���ꊇ���Z�b�g�T�[�r�X^000000�ɂ��ċ�����","^FF0000�X�e�[�^�X���X�L���ꊇ���Z�b�g�T�[�r�X^000000�𗘗p������","^FF0000�X�e�[�^�X���X�L���ꊇ���Z�b�g��^000000�̗L�����m�F������","���ɉ�������܂���")) {
	case 1:
		mes "[�T���V�C]";
		mes "^FF0000�X�e�[�^�X���X�L���ꊇ���Z�b�g";
		mes "�T�[�r�X^000000��";
		mes "^FF0000�X�e�[�^�X���Z�b�g^000000��";
		mes "^FF0000�X�L�����Z�b�g^000000��^FF0000�ꊇ��^000000";
		mes "�s�����Ƃ��ł���T�[�r�X�ł��B";
		next;
		mes "[�T���V�C]";
		mes "�������������ł����";
		mes "^FF0000�X�e�[�^�X���Z�b�g^000000��";
		mes "^FF0000�X�L�����Z�b�g^000000��";
		mes "�����ɍs�����Ƃ��ł��܂��B";
		mes "�������A�ǂ��炩�Е�������";
		mes "�s�����Ƃ͂ł��܂���B";
		next;
		mes "[�T���V�C]";
		mes "�܂��A�����p�̍ہA";
		mes "�������̃A�C�e����";
		mes "�q�ɂɗa����Ȃǂ���";
		mes "�����A�C�e���̏d�ʂ�";
		mes "^FF00000^000000�ɂ��ĉ������B";
		next;
		mes "[�T���V�C]";
		mes "������^FF0000�J�[�g�A�t�@���R���A";
		mes "�y�R�y�R�A�h���S���A";
		mes "�O���t�H���A�E�H�[�O�A�����M�A�A";
		mes "�R�搶��^000000�̂����p���́A";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
		mes "�T�[�r�X���󂯂��܂���B";
		next;
		mes "[�T���V�C]";
		mes "���萔�ł����J�[�g�A�t�@���R���A";
		mes "�y�R�y�R�A�h���S���A";
		mes "�O���t�H���A�E�H�[�O�A";
		mes "�����M�A�A�R�搶����";
		mes "�O���Ă��ĉ������B";
		next;
		mes "[�T���V�C]";
		mes "�ł́A�X�e�[�^�X���Z�b�g��";
		mes "�d�g�݂ɂ��Ă��b�����܂��傤�B";
		mes "�X�e�[�^�X���Z�b�g�������";
		mes "����܂łɊl�����Ă���";
		mes "�X�e�[�^�X�|�C���g��";
		mes "�茳�ɖ߂�܂��B";
		next;
		mes "[�T���V�C]";
		mes "���ɃX�L�����Z�b�g��";
		mes "�d�g�݂ɂ��Ă��b���܂��傤�B";
		next;
		mes "[�T���V�C]";
		mes "�X�L�����Z�b�g�������";
		mes "����܂łɊl�����Ă���";
		mes "1���E����2���E���A3���E����";
		mes "���v�����X�L���|�C���g��";
		mes "�茳�ɖ߂�܂��B";
		next;
		mes "[�T���V�C]";
		mes "1���E���Ɋւ��Ă̋�̗��";
		mes "�����܂��ƁA2���E�ւ̓]�E��";
		mes "JobLv40����������39�|�C���g�A";
		mes "JobLv50����������49�|�C���g";
		mes "�ƂȂ�܂��B";
		next;
		mes "[�T���V�C]";
		mes "�����Ă�����2���E�A";
		mes "3���E�Ŋl�������|�C���g��";
		mes "�ǉ�����܂��B";
		next;
		mes "[�T���V�C]";
		mes "�Ȃ��A�m�[�r�X���Ɋl������";
		mes "��{�X�L����A���}�蓖��";
		mes "�N�G�X�g�ŏK�������ǉ��X�L����";
		mes "�ւ��ẮA���Z�b�g����܂���B";
		next;
		mes "[�T���V�C]";
		mes "�ł́A�X�L�����Z�b�g���";
		mes "���ӎ��������b���܂��B";
		mes "�܂��A^FF00001���E�E�]��1���E����";
		mes "�X�L���|�C���g��U���ĉ������B^000000";
		next;
		mes "[�T���V�C]";
		mes "�Ⴆ�΁c�c";
		mes "2���E�ւ̓]�E��JobLv40����������";
		mes "1���E�p��39�|�C���g����";
		mes "1���E�p�X�L���Ɋ���U��`��";
		mes "�Ȃ�܂��B";
		next;
		mes "[�T���V�C]";
		mes "^FF00001���E�p�̃X�L���|�C���g��";
		mes "�S�ď���Ȃ��ƁA2���E�̃X�L����";
		mes "�|�C���g������U�邱�Ƃ�";
		mes "�ł��܂���B^000000";
		next;
		mes "[�T���V�C]";
		mes "^FF0000�����悤��";
		mes "1���E�A2���E�p�̃X�L���|�C���g��";
		mes "�S�ď���Ȃ��ƁA3���E��";
		mes "�X�L���փ|�C���g������U�邱�Ƃ�";
		mes "�ł��܂���^000000�̂ŁA�����ӂ��������B";
		next;
		mes "[�T���V�C]";
		mes "�ȏオ�X�L�����Z�b�g�T�[�r�X��";
		mes "���e�ƂȂ�܂��B";
		next;
		mes "[�T���V�C]";
		mes "�Ō�ɁA�]�E�N�G�X�g�ȊO�Ŋl������";
		mes "�X�e�[�^�X���Z�b�g��";
		mes "�X�L�����Z�b�g�̌������������ł�";
		mes "������ł͂���舵�����Ă���܂���B";
		mes "�������炸���������������B";
		close;
	case 2:
		if(checkquest(129700) == 0) {
			mes "[�T���V�C]";
			mes "����H";
			mes "�M���͌������������ł͂Ȃ��悤�ł��ˁB";
			mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
			mes "�T�[�r�X��";
			mes "�������������̕��̂ݗ��p�\�ł��B";
			mes "���������������B";
			close;
		}
		if(Weight) {
			mes "[�T���V�C]";
			mes "�\���󂲂����܂���";
			mes "�d�ʂ�0�łȂ���΁A";
			mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
			mes "�T�[�r�X��";
			mes "�󂯂鎖�͂ł��܂���B";
			next;
			mes "[�T���V�C]";
			mes "���ו���^FF0000�q��^000000�ɗa���Ă���";
			mes "���z���������B";
			close;
		}
		mes "[�T���V�C]";
		mes "������܂����B";
		mes "�ł͐�ɃX�e�[�^�X���X�L���ꊇ���Z�b�g";
		mes "�T�[�r�X�ɂ���";
		mes "�O�̂��߂��������܂��B";
		next;
		mes "[�T���V�C]";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
		mes "�T�[�r�X�ɂ́A";
		mes "�������̐���������܂��B";
		next;
		mes "[�T���V�C]";
		mes "���ꂩ�炨�����̃A�C�e����";
		mes "�q�ɂɗa����Ȃǂ���";
		mes "�����A�C�e���̏d�ʂ�";
		mes "^FF00000^000000�ɂ��ĉ������B";
		next;
		mes "[�T���V�C]";
		mes "������^FF0000�J�[�g�A�t�@���R���A";
		mes "�y�R�y�R�A�h���S���A";
		mes "�O���t�H���A�E�H�[�O�A�����M�A�A";
		mes "�R�搶��^000000�̂����p���́A";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
		mes "�T�[�r�X���󂯂��܂���B";
		next;
		mes "[�T���V�C]";
		mes "���萔�ł����J�[�g�A�t�@���R���A";
		mes "�y�R�y�R�A�h���S���A";
		mes "�O���t�H���A�E�H�[�O�A";
		mes "�����M�A�A�R�搶����";
		mes "�O���Ă��ĉ������B";
		next;
		mes "[�T���V�C]";
		mes "�ł́A�X�e�[�^�X���Z�b�g��";
		mes "�d�g�݂ɂ��Ă��b�����܂��傤�B";
		mes "�X�e�[�^�X���Z�b�g�������";
		mes "����܂łɊl�����Ă���";
		mes "�X�e�[�^�X�|�C���g��";
		mes "�茳�ɖ߂�܂��B";
		next;
		mes "[�T���V�C]";
		mes "���ɃX�L�����Z�b�g��";
		mes "�d�g�݂ɂ��Ă��b���܂��傤�B";
		next;
		mes "[�T���V�C]";
		mes "�X�L�����Z�b�g�������";
		mes "����܂łɊl�����Ă���";
		mes "1���E����2���E���A3���E����";
		mes "���v�����X�L���|�C���g��";
		mes "�茳�ɖ߂�܂��B";
		next;
		mes "[�T���V�C]";
		mes "1���E���Ɋւ��Ă̋�̗��";
		mes "�����܂��ƁA2���E�ւ̓]�E��";
		mes "JobLv40����������39�|�C���g�A";
		mes "JobLv50����������49�|�C���g";
		mes "�ƂȂ�܂��B";
		next;
		mes "[�T���V�C]";
		mes "�����Ă�����2���E�A";
		mes "3���E�Ŋl�������|�C���g��";
		mes "�ǉ�����܂��B";
		next;
		mes "[�T���V�C]";
		mes "�Ȃ��A�m�[�r�X���Ɋl������";
		mes "��{�X�L����A���}�蓖��";
		mes "�N�G�X�g�ŏK�������ǉ��X�L����";
		mes "�ւ��ẮA���Z�b�g����܂���B";
		next;
		mes "[�T���V�C]";
		mes "�ł́A�X�L�����Z�b�g���";
		mes "���ӎ��������b���܂��B";
		mes "�܂��A^FF00001���E�E�]��1���E����";
		mes "�X�L���|�C���g��U���ĉ������B^000000";
		next;
		mes "[�T���V�C]";
		mes "�Ⴆ�΁c�c";
		mes "2���E�ւ̓]�E��JobLv40����������";
		mes "1���E�p��39�|�C���g����";
		mes "1���E�p�X�L���Ɋ���U��`��";
		mes "�Ȃ�܂��B";
		next;
		mes "[�T���V�C]";
		mes "^FF00001���E�p�̃X�L���|�C���g��";
		mes "�S�ď���Ȃ��ƁA2���E�̃X�L����";
		mes "�|�C���g������U�邱�Ƃ�";
		mes "�ł��܂���B^000000";
		next;
		mes "[�T���V�C]";
		mes "^FF0000�����悤��";
		mes "1���E�A2���E�p�̃X�L���|�C���g��";
		mes "�S�ď���Ȃ��ƁA3���E��";
		mes "�X�L���փ|�C���g������U�邱�Ƃ�";
		mes "�ł��܂���^000000�̂ŁA�����ӂ��������B";
		next;
		mes "[�T���V�C]";
		mes "�Ȃ��A���̃T�[�r�X��";
		mes "^FF0000�X�e�[�^�X���Z�b�g��";
		mes "�X�L�����Z�b�g��";
		mes "�ꊇ�ł̂ݍs�����Ƃ��ł��܂��B^000000";
		mes "���ꂼ��Е����������p�ɂȂ邱�Ƃ�";
		mes "�ł��܂���̂ŁA�����Ӊ������B";
		next;
		mes "[�T���V�C]";
		mes "�����͈ȏ�ł��B";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g��";
		mes "�s���܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�T���V�C]";
			mes "�����ł����c�c������܂����B";
			mes "�܂��̋@������҂����Ă���܂��B";
			close;
		}
		mes "[�T���V�C]";
		mes "�����͂����ł��ˁH";
		mes "����ł́A";
		mes "�C�b�`�A�j�c�c";
		next;
		if(checkcart() || checkfalcon() || checkriding() || checkdragon() || checkgear() || checkwolf() || sc_ison(SC_ALL_RIDING)) {
			mes "[�T���V�C]";
			mes "�\���󂲂����܂��񂪁A";
			mes "�J�[�g�A�t�@���R���A�y�R�y�R�A";
			mes "�h���S���A�O���t�H���A�E�H�[�O�A";
			mes "�����M�A�A�R�搶���̂����p���ɂ�";
			mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g";
			mes "�T�[�r�X���󂯂��܂���B";
			next;
			mes "[�T���V�C]";
			mes "�J�[�g�A�t�@���R���A";
			mes "�y�R�y�R�A�h���S���A";
			mes "�O���t�H���A�E�H�[�O�A";
			mes "�����M�A�A�R�搶����";
			mes "�O���ĉ������B";
			close;
		}
		delquest 129700;
		resetstatus;
		resetskill;
		mes "[�T���V�C]";
		mes "�T���A�V��";
		mes "�n�C�I�@�������Z�b�g����܂�����B";
		mes "�����p���肪�Ƃ��������܂����B";
		close;
	case 3:
		mes "[�T���V�C]";
		mes "������܂����B";
		mes "���Ȃ���";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g����";
		mes "�L���������גv���܂��B";
		next;
		mes "[�T���V�C]";
		mes strcharinfo(0) + " �l�̃��Z�b�g���͎��̒ʂ�ł��B";
		mes "�@";
		mes "�X�e�[�^�X���X�L���ꊇ���Z�b�g��";
		if(checkquest(129700))
			mes "^FF0000����^000000";
		else
			mes "�Ȃ�";
		close;
	case 4:
		mes "[�T���V�C]";
		mes "�����ł����c�c������܂����B";
		mes "�܂��̋@������҂����Ă���܂��B";
		close;
	}
}

//==========================================
// �i���j�]�E��sNPC
//------------------------------------------

function	script	jobchenge3rd_func	{
	function	job_name	{
		switch(getarg(0)) {
		case Job_Knight:		return "���[�h�i�C�g";
		case Job_Priest:		return "�n�C�v���[�X�g";
		case Job_Wizard:		return "�n�C�E�B�U�[�h";
		case Job_Blacksmith:	return "�z���C�g�X�~�X";
		case Job_Hunter:		return "�X�i�C�p�[";
		case Job_Assassin:		return "�A�T�V���N���X";
		case Job_Crusader:		return "�p���f�B��";
		case Job_Monk:			return "�`�����s�I��";
		case Job_Sage:			return "�v���t�F�b�T�[";
		case Job_Rogue:			return "�`�F�C�T�[";
		case Job_Alchemist:		return "�N���G�C�^�[";
		case Job_Bard:			return "�N���E��";
		case Job_Dancer:		return "�W�v�V�[";
		case Job_RuneKnight:	return "���[���i�C�g";
		case Job_Warlock:		return "�E�H�[���b�N";
		case Job_Ranger:		return "�����W���[";
		case Job_ArchBishop:	return "�A�[�N�r�V���b�v";
		case Job_Mechanic:		return "���J�j�b�N";
		case Job_Guillotine:	return "�M���`���N���X";
		case Job_RoyalGuard:	return "���C�����K�[�h";
		case Job_Sorcerer:		return "�\�[�T���[";
		case Job_Minstrel:		return "�~���X�g����";
		case Job_Wanderer:		return "�����_���[";
		case Job_Shura:			return "�C��";
		case Job_Genetic:		return "�W�F�l�e�B�b�N";
		case Job_ShadowChaser:	return "�V���h�E�`�F�C�T�[";
		}
	}

	set '@job,getarg(0);
	set '@3rdName$, job_name('@job);
	if(Job == '@job) {
		mes "[�]�E��s�W]";
		mes "�����A�M����";
		mes '@3rdName$ +"�ł��ˁB";
		mes "�����]�E�͊������Ă��܂���B";
		close;
	}
	if(Job != getarg(1) || Upper == UPPER_NORMAL ||
	  (Upper == UPPER_HIGH && BaseLevel < 90) ||
	  (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50)) ) {
		mes "[�]�E��s�W]";
		mes "����ɂ��́B";
		mes "�M���̎���ɁA";
		mes '@3rdName$ +"�ւ�";
		mes "�]�E��]�ގ҂͂��܂��񂩁H";
		next;
		mes "[�]�E��s�W]";
		mes "�������܂�����A";
		mes "���̂Ƃ���֗���悤��";
		mes "�`���Ă��������B";
		mes "���Ȃ���������������Ă����";
		mes "�����]�E�ł��܂���B";
		close;
	}
	if(SkillPoint) {
		mes "�]�X�L���|�C���g���]���Ă��邽��";
		mes "�@�i�s�ł��܂���]";
		close;
	}
	mes "[�]�E��s�W]";
	mes "����ɂ��́B";
	if(Upper == UPPER_HIGH)
		mes "�M����"+ job_name(Job) +"�ł��ˁB";
	mes '@3rdName$ +"�ւ̓]�E��";
	mes "�]�݂܂����H";
	next;
	mes "[�]�E��s�W]";
	mes "�Ȃ��A"+ '@3rdName$ +"�֓]�E�����";
	mes "�X�e�[�^�X�ƃX�L�����S��";
	mes "���Z�b�g����܂��B";
	next;
	if(select("�]�E���Ȃ�","^0000FF�]�E����^000000")==1) {
		mes "[�]�E��s�W]";
		mes "�킩��܂����B";
		mes "������ЂƂ̓��ł��傤�B";
		close;
	}
	if(Weight || SkillPoint || checkriding() || checkcart() || checkfalcon() || sc_ison(SC_ALL_RIDING)) {
		mes "[�]�E��s�W]";
		mes "���Ȃ��͏������Ȃ����";
		mes "�Ȃ�Ȃ����Ƃ�����܂��ˁB";
		mes "�܂��́A�g�𐴂߂�ׂ�";
		mes "�g�̂܂��̂��̂�";
		mes "���ɂ��Ă��������B";
		next;
		mes "[�]�E��s�W]";
		mes "�A�C�e����X�L���|�C���g�Ȃ�";
		mes "���������Ȃ�";
		mes "��ԂłȂ���΂Ȃ�܂���B";
		mes "�������ɂ��������B��J�[�g�A";
		mes "�R�搶���Ȃǂ�";
		mes "�����čs�����Ƃ͂ł��܂���B";
		next;
		mes "[�]�E��s�W]";
		mes "����ł́c�c�p�ӂ��ł��܂�����";
		mes "���z�����������B";
		close;
	}
	if('@job == Job_RuneKnight) {
		mes "[�]�E��s�W]";
		mes "�]�E����ׂ̏����͖��S�̂悤�ł��ˁB";
		mes "����ł́A�]�E����O�ɁA";
		mes "���ꂩ�炲�Љ�܂������̂���";
		mes "�����ꂩ1�����I�т��������B";
		mes "���I�тɂȂ����������A";
		mes "�]�E�̍ۂɓn����܂��B";
		next;
		mes "[�]�E��s�W]";
		mes "�܂��A�����̏ڍׂɂ���";
		mes "���������܂��̂ŁA";
		mes "�ڍׂ��m�肽��������";
		mes "���I�щ������B";
		while(1) {
			next;
			switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]","�����͑��v�ł�")) {
			case 1:
				mes "[�]�E��s�W]";
				mes "�G�i�W�[���[���K�[�h[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "���؂ȐF�̌���";
				mes "�G�i�W�[���[����";
				mes "����΂߂��Ă���";
				mes "�H�͗l�̏��B";
				mes "���������ȋC������";
				mes "���g�Ɛ��_���h������B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : ��";
				mes "�h�� : 70";
				mes "�d�� : 0";
				mes "�v�����x�� : 99";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF MaxSP + 2%";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 2:
				mes "[�]�E��s�W]";
				mes "���͐΂̎w��[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "�s�v�c�ȃ��[����";
				mes "���܂�Ă���";
				mes "�F�̃����O�B";
				mes "�P�����[������";
				mes "�_��Ȋ��͂���������B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : �A�N�Z�T���[";
				mes "�h�� : 0";
				mes "�d�� : 0";
				mes "�v�����x�� : 90";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF Str + 2";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 3:
				mes "[�]�E��s�W]";
				mes "���[���v���[�g[1]�ɂ���";
				mes "���������Ă��������܂��B";
				next;
				mes "[�����ڍ�]";
				mes "���[���ƕ�΂ŏ���ꂽ";
				mes "�v���[�g�A�[�}�[�B";
				mes "�����ڂ��y�����A";
				mes "���͂ɂ��h��͂�";
				mes "��������Ă���B";
				next;
				mes "[�����ڍ�]";
				mes "�n�� : �Z";
				mes "�h�� : 95";
				mes "�d�� : 0";
				mes "�v�����x�� : 99";
				mes "���� : ���[���i�C�g��p";
				mes "������ʁF���B�s�A�j��s�B";
				next;
				mes "[�]�E��s�W]";
				mes "���ɏڍׂ̒m�肽��";
				mes "�����͂������܂����H";
				continue;
			case 4:
				mes "[�]�E��s�W]";
				mes "����ł́A�M�����~����";
				mes "���������I�щ������B";
				while(1) {
					next;
					switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]")) {
					case 1:
						set '@gain,2140;
						break;
					case 2:
						set '@gain,2794;
						break;
					case 3:
						set '@gain,15002;
						break;
					}
					next;
					mes "[�]�E��s�W]";
					mes getitemname('@gain) +"[1]�ł��ˁB";
					mes "�{���ɂ�����ł�낵���ł����H";
					next;
					if(select("�͂�","������")==2) {
						mes "[�]�E��s�W]";
						mes "����ł͍ēx�A";
						mes "�~����������";
						mes "���I�щ������B";
						continue;
					}
					break;
				}
			}
			break;
		}
	}
	resetstatus;
	resetskill;
	setoption 0;
	jobchange '@job;
	switch(Job) {
	case Job_RuneKnight:
		setquest 201180;
		getitem 5746,1;	//���[���T�[�N���b�g
		getitem '@gain,1;	//�I�𑕔�
		break;
	case Job_ArchBishop:
		setquest 201195;
		getitem 5747,1;	//�~�g��
		break;
	case Job_Warlock:
		setquest 201185;
		getitem 5753,1;	//���͐΂̖X�q
		break;
	case Job_Mechanic:
		setquest 201205;
		if(Sex)
			getitem 5749,1;	//�h���C�o�[�o���h(male)
		else
			getitem 5760,1;	//�h���C�o�[�o���h(female)
		break;
	case Job_Ranger:
		setquest 201190;
		getitem 6124,1;	//�T�̓J
		getitem 5748,1;	//�X�i�C�p�[�S�[�O��
		break;
	case Job_Guillotine:
		setquest 201200;
		getitem 5755,1;	//���ق̎��s��
		getitem 12106,1;	//��Δ�
		break;
	case Job_RoyalGuard:
		setquest 201210;
		getitem 5757,1;	//�V���~�b�c�̃w����
		break;
	case Job_Shura:
		setquest 201230;
		getitem 5754,1;	//�u���C�W���O�\�E��
		break;
	case Job_Sorcerer:
		setquest 201215;
		getitem 5756,1;	//���̂����₫
		break;
	case Job_ShadowChaser:
		setquest 201235;
		getitem 6121,1;	//�t�F�C�X�y�C���g�u���V
		getitem 6122,1;	//�y�C���g�u���V
		getitem 5750,1;	//�V���h�E�N���E��
		break;
	case Job_Genetic:
		setquest 201240;
		getitem 5752,1;	//�~�_�X�̂����₫
		break;
	case Job_Minstrel:
		setquest 201220;
		getitem 5751,1;	//�~���X�g�����\���O�̖X�q
		break;
	case Job_Wanderer:
		setquest 201225;
		getitem 5758,1;	//�o�����[�i�̔�����
		break;
	}
	getitem 2795,1;	//�n���Ă��Ȃ������S�̎w��
	if(Upper == UPPER_BABY) {
		for(set '@i,22954;'@i<=22969;set '@i,'@i+1) {
			if(countitem('@i))
				delitem '@i,1;
		}
		if(countitem(25018)) delitem 25018,1;
		if(countitem(25019)) delitem 25019,1;
		if(countitem(25020)) delitem 25020,1;
		if(getequipid(14) == 20307) unequip 14;
		if(countitem(20307)) delitem 20307,1;
	}
	mes "[�]�E��s�W]";
	mes "�����A����ŋM����";
	mes '@3rdName$ +"�ƂȂ�܂����B";
	mes "�����ڂ��C��������V�ł��ˁI";
	close;
}

//prt_in.gat,162,24,3	script	�]�E��s�W#runeknight	888,{ callfunc "jobchenge3rd_func",Job_RuneKnight,Job_Knight; }
//morocc.gat,94,141,3	script	�]�E��s�W#warlock	888,{ callfunc "jobchenge3rd_func",Job_Warlock,Job_Wizard; }
alberta.gat,223,111,5	script	�]�E��s�W#ranger	888,{ callfunc "jobchenge3rd_func",Job_Ranger,Job_Hunter; }
//prt_church.gat,103,88,3	script	�]�E��s�W#arch	888,{ callfunc "jobchenge3rd_func",Job_ArchBishop,Job_Priest; }
//yuno.gat,129,156,3	script	�]�E��s�W#mechanic	888,{ callfunc "jobchenge3rd_func",Job_Mechanic,Job_Blacksmith; }
que_job01.gat,75,96,3	script	�]�E��s�W#guillotine	888,{ callfunc "jobchenge3rd_func",Job_Guillotine,Job_Assassin; }
prt_castle.gat,48,161,3	script	�]�E��s�W#roya	888,{ callfunc "jobchenge3rd_func",Job_RoyalGuard,Job_Crusader; }
gef_tower.gat,102,34,3	script	�]�E��s�W#sorc	888,{ callfunc "jobchenge3rd_func",Job_Sorcerer,Job_Sage; }
alberta.gat,196,133,3	script	�]�E��s�W#mins	888,{ callfunc "jobchenge3rd_func",Job_Minstrel,Job_Bard; }
xmas.gat,162,209,3	script	�]�E��s�W#wand	888,{ callfunc "jobchenge3rd_func",Job_Wanderer,Job_Dancer; }
ve_in.gat,237,125,3	script	�]�E��s�W#sura	888,{ callfunc "jobchenge3rd_func",Job_Shura,Job_Monk; }
alde_alche.gat,35,186,3	script	�]�E��s�W#gene	888,{ callfunc "jobchenge3rd_func",Job_Genetic,Job_Alchemist; }
morocc.gat,156,70,3	script	�]�E��s�W#shad	888,{ callfunc "jobchenge3rd_func",Job_ShadowChaser,Job_Rogue; }


//==========================================
// �O���t�H�������^��
//------------------------------------------

prontera.gat,125,208,5	script	�O���t�H���Ǘ���	105,{
	if(Job != Job_RoyalGuard) {
		mes "[�O���t�H���Ǘ���]";
		mes "���̌�p�ł����H";
		mes "�O���t�H���́A���C�����K�[�h�l��p";
		mes "�ƂȂ��Ă���܂��B";
		close;
	}
	//������
	mes "[�O���t�H���Ǘ���]";
	mes "��������Ⴂ�܂��B";
	mes "�O���t�H���������p�ł����H";
	next;
	if(select("���p����","��߂�")==2) {
		mes "[�O���t�H���Ǘ���]";
		mes "�����ł����B�ł́c�c";
		close;
	}
	if(checkriding()) {
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[�O���t�H���Ǘ���]";
		mes "�c�c�܂��O���t�H���ɂ�";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�X�L���u���C�f�B���O�v��";
		mes "�o���Ă��炨�z�����������B";
		close;
	}
	setriding;
	close;
}


//==========================================
// �g���b�v���� - �����W���[
//------------------------------------------

-	shop	AlloyTrapShopper	-1,7940,12341

prt_in.gat,109,68,4		substore(AlloyTrapShopper)	�g���b�v����	66
mid_camp.gat,129,284,4	substore(AlloyTrapShopper)	�g���b�v����	66
payon.gat,123,109,4		substore(AlloyTrapShopper)	�g���b�v����	66
ra_in.gat,263,281,4		substore(AlloyTrapShopper)	�g���b�v����	66
lighthalzen.gat,337,240,4	substore(AlloyTrapShopper)	�g���b�v����	66


//==========================================
// �Ő����L�b�g�̔��� - �M���`���N���X
//------------------------------------------

-	script	3rdPoisonShopper	-1,{
	mes "[�Ő����L�b�g�̔���]";
	mes "�Ő����L�b�g�͂���܂��񂩁`�H";
	mes "�@";
	mes "�Ő����L�b�g�͂P��";
	mes "5000zeny�ł���`";
	mes "�@";
	mes "�����܂����`�H";
	next;
	if(select("�͂�","������")==2) {
		mes "[�Ő����L�b�g�̔���]";
		mes "�����ł����`";
		mes "�킩��܂����`";
		mes "�܂����Ă��������ˁ`";
		close;
	}
	if(Zeny < 5000) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A����������܂����`";
		mes "�����𑝂₵�āA�܂����ĉ����`���B";
		close;
	}
	if(checkitemblank()==0) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A�������Ă���ו���";
		mes "�����ł��ˁ`";
		mes "����ł͓Ő����L�b�g��";
		mes "�n���܂����`";
		mes "�g���y�����Ă���܂����ĉ����`���B";
		close;
	}
	if(checkweight(7931,1)==0) {
		mes "[�Ő����L�b�g�̔���]";
		mes "���́`";
		mes "���q����A�������Ă���ו���";
		mes "�d�����ł���`";
		mes "����ł͓Ő����L�b�g��";
		mes "�n���܂����`";
		mes "�g���y�����Ă���܂����ĉ����`���B";
		close;
	}
	set Zeny,Zeny - 5000;
	getitem 7931,1;
	mes "[�Ő����L�b�g�̔���]";
	mes "�������グ�`";
	mes "���肪�Ƃ��������܁`���B";
	mes "�܂����z���������`���B";
	close;
}

morocc.gat,185,95,4	duplicate(3rdPoisonShopper)	�Ő����L�b�g�̔���#moc	877
lhz_in02.gat,16,205,4	duplicate(3rdPoisonShopper)	�Ő����L�b�g�̔���#lhz	877


//==========================================
// �}�̔̔� - �~���X�g�����A�����_���[
//------------------------------------------

comodo.gat,196,162,3	shop	�J���u#comodo	479,11513,6144


//==========================================
// �|�C���g���l - �����W���[�A�\�[�T���[
//------------------------------------------

gef_tower.gat,105,172,5	script	�|�C���g���l	700,{
	mes "[�|�C���g���l]";
	mes "����ɂ��́B";
	mes "�����ł͍z�΂�����ɍӂ���";
	mes "�G�}�Ƃ��Ďg�p����";
	mes "^FF0000�e��|�C���g^000000��̔����Ă��܂��B";
	mes "�����K�v�ł����H";
	next;
	switch(select("�X�J�[���b�g�|�C���g(��) - 200z","���C���O���[���|�C���g(�n) - 200z","�C���f�B�S�|�C���g(��) - 200z","�C�G���[�E�B�b�V���|�C���g(��) - 200z","��b���I����")) {
	case 1:
		set '@itemid,6360;
		set '@element$,"�Α���";
		break;
	case 2:
		set '@itemid,6363;
		set '@element$,"�n����";
		break;
	case 3:
		set '@itemid,6361;
		set '@element$,"������";
		break;
	case 4:
		set '@itemid,6362;
		set '@element$,"������";
		break;
	case 5:
		mes "[�|�C���g���l]";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	mes "[�|�C���g���l]";
	mes "^ff0000" +getitemname('@itemid)+ "^000000�ł��ˁB";
	mes "�������^0000ff" +'@element$+ "^000000�̃|�C���g�ł��B";
	mes "���w�����܂����H";
	mes "������1000�܂ōw���ł��܂��B";
	mes "�L�����Z������ɂ́A";
	mes "0����͂��Ă��������B";
	next;
	input '@num;
	if('@num == 0) {
		mes "[�|�C���g���l]";
		mes "�L�����Z�����܂����B";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	if('@num < 0 || '@num > 1000) {
		mes "[�|�C���g���l]";
		mes "������������͂��Ă��������B";
		mes "��x�ɍw���ł���̂�";
		mes "1000�܂łƂȂ�܂��B";
		close;
	}
	mes "[�|�C���g���l]";
	mes "^ff0000" +getitemname('@itemid)+ "^000000��";
	mes "^0000ff" +'@num+ "��^000000��";
	mes "��낵���ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�|�C���g���l]";
		mes "�L�����Z�����܂����B";
		mes "�܂��̂����p�����҂����Ă��܂��B";
		close;
	}
	if(200*'@num > Zeny) {
		mes "[�|�C���g���l]";
		mes "���q�l�A���݂܂��񂪁A";
		mes "���������s�����Ă��܂��B";
		close;
	}
	if(checkweight('@itemid,'@num) == 0) {
		mes "[�|�C���g���l]";
		mes "����A�ו�����t�̂悤�ł��B";
		mes "�����������炵�Ă���A";
		mes "�����p���������B";
		close;
	}
	set Zeny,Zeny-200*'@num;
	getitem '@itemid,'@num;
	mes "[�|�C���g���l]";
	mes "�����p���肪�Ƃ��������܂��B";
	close;
}


//==========================================
// �����{�̔��� - �W�F�l�e�B�b�N
//------------------------------------------

comodo.gat,106,213,5	shop	�썑�̉ʕ����l	724,6258

alde_alche.gat,31,186,3	script	�����{�̔���#alde	883,{
	mes "[�����{�̔���]";
	mes "����ɂ��́I";
	mes "���̓W�F�l�e�B�b�N��";
	mes "^0000FF���ʂȐ����{^000000��̔����Ă��܂��I";
	next;
	mes "[�����{�̔���]";
	mes "�m���Ă܂����H";
	mes "�W�F�l�e�B�b�N�͐����{��";
	mes "�������Ă��Ȃ��ƁA";
	mes "�g���Ȃ������X�L����";
	mes "�����ł���B";
	next;
	mes "[�����{�̔���]";
	mes "�������Ă��鐻���{��";
	mes "^FF0000���^000000��������Α����قǁA";
	mes "�����ł���A�C�e���̎�ނ�";
	mes "�������ł���B";
	next;
	mes "[�����{�̔���]";
	mes "����`�A���̖{���e������̂ŁA";
	mes "����Ȃ��č����Ă���ł���B";
	mes "1������΁A�����̍ޗ��͂킩��̂ŁA";
	mes "�[���Ȃ�ł����ǁA";
	mes "�����ł�����܂���I";
	mes "�����{���w�����܂����H";
	next;
	if(select("�͂�","������")==2) {
		mes "[�����{�̔���]";
		mes "�ł́A�܂����Ă��������B";
		mes "���ł��A���҂����Ă܂���I";
		close;
	}
	if(checkitemblank()==0) {
		mes "[�����{�̔���]";
		mes "�����Ă���ו��̐���";
		mes "�������܂��ˁB";
		mes "����ł͖{��";
		mes "�n���܂����B";
		mes "�ו��𐮗����Ă���";
		mes "�܂����Ă��������B";
		close;
	}
	if(Weight*100/MaxWeight >= 90) {
		mes "[�����{�̔���]";
		mes "�����Ă���ו��̏d�ʂ�";
		mes "�d�����܂��ˁB";
		mes "����ł͖{��";
		mes "�n���܂����B";
		mes "�ו��𐮗����Ă���";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[�����{�̔���]";
	mes "�فA�{���ł����`�I";
	mes "���肪�Ƃ��������܂��I";
	mes "����ł́A�����{�̃��X�g��";
	mes "���������܂��ˁI";
	mes "�ł���΁A�����ς�";
	mes "�����Ă����Ă��������I";
	while(1){
		next;
		switch(select(
			"[�����S���e�����{] 100,000 zeny",
			"[�p�C�i�b�v�����e�����{] 100,000 zeny",
			"[�R�R�i�b�c���e�����{] 100,000 zeny",
			"[���������e�����{] 100,000 zeny",
			"[�o�i�i���e�����{]100,000 zeny",
			"[��`�q�g�݊����A���͔|�@]100,000 zeny",
			"[�㋉�|�[�V���������}�j���A��] 100,000 zeny",
			"[�~�b�N�X�N�b�L���O�����{] 100,000 zeny",
			"[�X�^�~�i���i������] 100,000 zeny",
			"[���̓h�����N�����@]100,000 zeny",
			"�w�����I������B")) {
		case 1:		//�����S���e�����{
			set '@gain,6279;
			break;
		case 2:		//�p�C�i�b�v�����e�����{
			set '@gain,6280;
			break;
		case 3:		//�R�R�i�b�c���e�����{
			set '@gain,6281;
			break;
		case 4:		//���������e�����{
			set '@gain,6282;
			break;
		case 5:		//�o�i�i���e�����{
			set '@gain,6283;
			break;
		case 6:		//��`�q�g�݊����A���͔|�@
			set '@gain,6284;
			break;
		case 7:		//�㋉�|�[�V���������}�j���A��
			set '@gain,6285;
			break;
		case 8:		//�~�b�N�X�N�b�L���O�����{
			set '@gain,11022;
			break;
		case 9:		//�X�^�~�i���i������
			set '@gain,11023;
			break;
		case 10:	//���̓h�����N�����@
			set '@gain,11024;
			break;
		case 11:
			mes "[�����{�̔���]";
			mes "�����ł����B";
			mes "�܂����Ă��������ˁI";
			close;
		}
		mes "[�����{�̔���]";
		mes "^0000FF[" +getitemname('@gain)+ "]^000000��";
		mes "100,000 zeny�ł��B";
		mes "�����w�����܂��H";
		mes "1���ł��[���ł����ǁA";
		mes "100���Ƃ������Ă�����Ă�";
		mes "�����ł���I";
		next;
		input '@num;
		if('@num == 0) {
			mes "[�����{�̔���]";
			mes "���̖{�͂������ł����B";
			continue;
		}
		if('@num < 1 || '@num > 100) {
			mes "[�����{�̔���]";
			mes "���`��A�c�O�I";
			mes "1�x�ɍw���ł���̂�";
			mes "100���܂łȂ�ł��B";
			continue;
		}
		mes "[�����{�̔���]";
		mes "^0000FF[" +getitemname('@gain)+ "]^000000��";
		mes '@num+ " ���w���ł��ˁI";
		mes "�@";
		mes "��낵���ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�����{�̔���]";
			mes "���A�����ł����c�c";
			mes "�����{�͂����ς�����܂�����A";
			mes "�������邱�Ƃ͂Ȃ��ł���B";
			continue;
		}
		if(Zeny < 100000 * '@num){
			mes "[�����{�̔���]";
			mes "���`�A������Ƃ�����";
			mes "����Ȃ��݂����ł��ˁB";
			mes "������p�ӂ��ė��Ă��������B";
			close;
		}
		mes "[�����{�̔���]";
		mes "���肪�Ƃ��������܂��I";
		mes "���̖{�͂���܂��񂩁H";
		set Zeny,Zeny - 100000 * '@num;
		getitem '@gain,'@num;
		continue;
	}
}


//==========================================
// �e�H�[ - �V���h�E�`�F�C�T�[
//------------------------------------------

-	shop	PaintingShopper	-1,6123,6120

s_atelier.gat,17,110,1	substore(PaintingShopper)	�̔���#sc_prt	67
s_atelier.gat,137,60,3	substore(PaintingShopper)	�̔���#sc_ra	70
s_atelier.gat,114,117,1	substore(PaintingShopper)	�̔���#sc_yuno	92
s_atelier.gat,15,65,5	substore(PaintingShopper)	�̔���#sc_lgt	89
