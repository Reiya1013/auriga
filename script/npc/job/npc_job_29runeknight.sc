//= Auriga Script ==============================================================
// Ragnarok Online RuneKnight Jobchange Script	by Blaze
//- Registry -------------------------------------------------------------------
// CHANGE_RK -> 0�`16
// CHANGE_RK_RUNE -> 0�`
//==============================================================================

//============================================================
// �}�b�v�t���O
//------------------------------------------------------------
job3_rune01.gat	mapflag	nomemo		dummy
job3_rune01.gat	mapflag	noteleport	dummy
job3_rune01.gat	mapflag	nosave		SavePoint
job3_rune01.gat	mapflag	nobranch	dummy
job3_rune01.gat	mapflag	nopenalty	dummy
job3_rune01.gat	mapflag	noicewall	dummy
job3_rune02.gat	mapflag	nomemo		dummy
job3_rune02.gat	mapflag	noteleport	dummy
job3_rune02.gat	mapflag	nosave		SavePoint
job3_rune02.gat	mapflag	nobranch	dummy
job3_rune02.gat	mapflag	nopenalty	dummy
job3_rune02.gat	mapflag	noicewall	dummy

//============================================================
// ���[�v�|�C���g
//------------------------------------------------------------
job3_rune01.gat,79,72,0	warp	#gate_to_rune01	1,1,gl_knt02.gat,150,60

//============================================================
// �ȈՑq�Ɂinpc_misc_storage.sc���j
//------------------------------------------------------------
job3_rune01.gat,92,62,4	script	�q�ɊǗ��l	80,{
	callfunc "Func_StorageManager",50,0;
	close;
}
job3_rune01.gat,89,60,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
job3_rune01.gat,91,60,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
job3_rune01.gat,93,60,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
job3_rune01.gat,95,60,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �J�nNPC
//------------------------------------------------------------
prt_in.gat,162,24,3	script	�ؗ�Ȃ�R�m	470,{
	if(Job == Job_RuneKnight) {
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "���܂�N�����M���h�̗��h�Ȉ�����B";
		mes "�͂��߂ČN�ɉ�������̎p���܂�";
		mes "�L���Ɏc���Ă���Ƃ����̂Ɂc�c�B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "��炪�������Ă���L��ȓ���";
		mes "���܂ł����R�Ȃ킯�ł͂Ȃ���";
		mes "���ꂱ�����l���ł���";
		mes "���̓��ł͂Ȃ����c�c�B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "���̋P�����������ׂ̈ɁA���t�I";
		if(checkquest(129700)) {
			next;
			mes "[�C���t�H���[�V����]";
			mes "���Ȃ��͓]�E������";
			mes "�N���A��V";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g��";
			mes "���������Ă��܂��B";
			next;
			mes "[�C���t�H���[�V����]";
			mes "�����𗘗p����ꍇ�A";
			mes "�C�Y���[�h�ɂ���";
			mes "�T���V�C��K�˂Ă��������B";
		}
		close;
	}
	if(Job != Job_Knight || Upper == UPPER_NORMAL) {
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̐��ɂ͗l�X�ȓ�������c�c";
		mes "�������A�����؂�Ȃ����̒���";
		mes "�������s���ׂ����𐳂����I���ł���";
		mes "�l�Ԃ͏��Ȃ��B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "����͂���Ƃ��āA�����̎���";
		mes "�{���Ɏ|���B";
		mes "�N����t�ǂ����H";
		next;
		if(select("���������܂�","�������܂�") == 2) {
			mes "[�ؗ�Ȃ�R�m]";
			mes "�������c�c�c�O�Ȃ���N��";
			mes "�����������ł��Ȃ��悤���B";
			close;
		}
		mes "[�ؗ�Ȃ�R�m]";
		mes "�S�Ăɂ����āA�ω��Ƃ�������";
		mes "�ǂ����ʂ������炷���̂ł͂Ȃ���";
		mes "���͐M���Ă���B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̎��݂����ɂȁB";
		mes "���̎��̖��́A���܂ł�";
		mes "����Ă��ė~�����Ǝv���B";
		close;
	}
	switch(CHANGE_RK) {
	case 0:
		emotion 1,"";
		mes "�]�j�������������Ă���B";
		mes "�@�R�m���낤���H�]";
		next;
		if(select("�b��������","�ʂ�߂���") == 2) {
			mes "�]�ւ��Ȃ������ǂ��������]";
			close;
		}
		if((Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {
			mes "[�ؗ�Ȃ�R�m]";
			mes "�N�����̂܂܂̓�����ݑ�����̂Ȃ�";
			mes "�����A���̌��E���v���m�邾�낤�B";
			mes "���Ă̎��������ł������悤�Ɂc�c�B";
			next;
			mes "[�ؗ�Ȃ�R�m]";
			if(Upper == UPPER_HIGH)
				mes  "^3377FFBaseLv��90�ȏ�^000000�̎���";
			else
				mes  "^3377FFBaseLv��99�AJobLv��50^000000�̎���";		// �{�q�̂Ƃ�������
			mes "���̎��ƂȂ낤�B";
			next;
			mes "[�ؗ�Ȃ�R�m]";
			mes "���̎���������A�����N��";
			mes "�����邱�Ƃ��ł���͂����B";
			mes "���͎����ނ݌��킷���Ƃ���";
			mes "�ł��Ȃ����c�c�B";
			next;
			mes "[�ؗ�Ȃ�R�m]";
			mes "�����ꗈ�邻�̓��ׂ̈Ɂc�c���t�I";
			close;
		}
		cloakoffnpc "�]�E��s�W#RK";
		misceffect 78,"�]�E��s�W#RK";
		if(callfunc("Func_Job3rd",Job_RuneKnight)) {
			cloakonnpc "�]�E��s�W#RK";
			end;
		}
		cloakonnpc "�]�E��s�W#RK";
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̐��ɂ͗l�X�ȓ�������c�c";
		mes "�������A�����؂�Ȃ����̒���";
		mes "�������s���ׂ����𐳂����I���ł���";
		mes "�l�Ԃ͏��Ȃ��B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "����͂���Ƃ��āA�����̎���";
		mes "�{���Ɏ|���B";
		mes "�N����t�ǂ����H";
		next;
		if(select("���������܂�","�������܂�") == 2) {
			mes "[�ؗ�Ȃ�R�m]";
			mes "�������c�c�c�O�Ȃ���N��";
			mes "�����������ł��Ȃ��悤���B";
			close;
		}
		mes "[�ؗ�Ȃ�R�m]";
		mes "�N�����̓�����ގ҂Ȃ̂��c�c";
		mes "�Ȃ�΁A�b���ʂ��邾�낤�B";
		mes "���Ɛ�����ғ��m�ň��߂�";
		mes "�������������|���Ȃ�Ƃ������́B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̎��͎��̂����肾�B";
		mes "�����̐e�F�ɂȂ邩���m��Ȃ�";
		mes "�N�ׂ̈ɁB";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "�ӂށA�������邩����N��";
		mes "���ꂩ��V������������";
		mes "�����������ł��Ă���悤���B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̓�����ނƂ������Ƃ�";
		mes "�ꂵ���C�s�̘A�����B";
		mes "����܂ŌN������ł������X���";
		mes "����Ɍ����������҂��Ă��邾�낤�B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "�c�c�N�����E�𒴂�����ɂ���";
		mes "�V�������ɐi�ނ��Ƃ��肤�̂ł����";
		mes "�����菕�������悤�B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "���̌��E��j�邱�Ƃ����]��";
		mes "���a�Ɛ_���������^�̌��m�̓��c�c";
		mes "���ꂪ^FF0000���[���i�C�g^000000���B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "���Ƌ��ɕ��ޓ��u�ɂȂ��ė~�����B";
		mes "�N�Ȃ���̓��u�Ƃ��ď[���Ȏ��i��";
		mes "�����Ă���̂�����B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "�N���]�ނȂ�A���[���i�C�g�ւ̓���";
		mes "�w�������t���B���Љ�悤�B";
		next;
		if(select("�������Ԃ���������","�o��͂ł��Ă��܂�") == 1) {
			mes "[�ؗ�Ȃ�R�m]";
			mes "�V��������ɂ́A��ɏ������K�v���B";
			mes "���������B�N��҂��Ƃɂ��悤�B";
			next;
			mes "[�ؗ�Ȃ�R�m]";
			mes "�V�����i�ޓ��̐�ɑ��݂���̂�";
			mes "�K�������h�������ł͂Ȃ�����ȁB";
			close;
		}
		mes "[�ؗ�Ȃ�R�m]";
		mes "�������I�@�Ȃ�΁A�������u������";
		mes "�N�𐄑E���悤�B";
		next;
		mes "[�ؗ�Ȃ�R�m]";
		mes "�N��^0000FF�O���X�g�w�C��^000000��m���Ă��邩�H";
		mes "^0000FF�O���X�g�w�C��^000000�ɂ�";
		mes "�N�𓱂��Ă���郋�[���i�C�g��";
		mes "�҂��Ă���͂����B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "���̖��O�̓}�k�G���B";
		mes "���P�̃��[���i�C�g�ƌĂ΂�Ă���B";
		mes "������b�𕷂��ė����Ɠ`�����";
		mes "���̓��؂������Ă���邾�낤�B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "�N�����̓��u�ƂȂ�";
		mes "����������ނ��Ƃ��ł��邻�̓���";
		mes "�����ő҂Ƃ��悤�B";
		set CHANGE_RK,1;
		setquest 3200;
		close;
	case 1:
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "^0000FF�O���X�g�w�C��^000000�ɂ�";
		mes "�N�𓱂��Ă���郋�[���i�C�g��";
		mes "�҂��Ă���͂����B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "������b�𕷂��ė����Ɠ`�����";
		mes "���̓��؂������Ă���邾�낤�B";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "�N�����̓��u�ƂȂ�";
		mes "����������ނ��Ƃ��ł��邻�̓���";
		mes "�����ő҂Ƃ��悤�B";
		close;
	default:
		emotion 1;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "�N�ɂ͍��A�i�ނׂ�����";
		mes "������Ă���̂ł͂Ȃ����H";
		next;
		mes "[���P�̃��[���i�C�g�@�}�k�G��]";
		mes "�����Ԉ���Ă���̂ł����";
		mes "�C�ɂ��Ȃ��ł���B";
		mes "�ӂށA�ς��Ȃ��̂�";
		mes "���̎��̍��肾�����c�c�B";
		close;
	}
}

prt_in.gat,164,26,3	script(CLOAKED)	�]�E��s�W#RK	888,{
	cloakonnpc;
	end;
}

//============================================================
// 
//------------------------------------------------------------
glast_01.gat,44,363,3	script	���[���̈�����	468,{
	if(Job == Job_RuneKnight) {
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�c�c���̓��u";
		mes strcharinfo(0) + "�ł͂Ȃ����B";
		mes "�悭���Ă��ꂽ�B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���ꂩ����̎u�����̐��ɍL�߂�";
		mes "�l�ނƂ��Ċ��҂��Ă���B";
		close;
	}
	if(Job != Job_Knight) {
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�I���́A���̎��ꂽ�O���X�g�w�C����";
		mes "�h�����\�[�h�}�X�^�[";
		mes "�x���[�u�̈�u���󂯌p��";
		mes "��l�̋R�m�ɂ����Ȃ��B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���̓��Ƃ͕ʂ̓�����ގ҂�";
		mes "��X�̎u�Ƌ`�C�͗����ł��Ȃ����낤�B";
		mes "�I���̂��Ƃ͋C�ɂ����A����̓���";
		mes "�i�񂾕��������B";
		close;
	}
	switch(CHANGE_RK) {
	case 0:
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�N�͂��̃O���X�g�w�C����";
		mes "���ꂽ�S��Ȃ̂��H";
		mes "���邢�͉����m�炸�ɖ�������";
		mes "�`���҂Ȃ̂��H";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�N��������l�Ԃł���Ȃ�";
		mes "�I���̘b���悭�����Ă���c�c�B";
		mes "�I���Ȃ�A����ȏ������낤�낵��";
		mes "�����댯�ɂ��炷�悤�Ȑ^���͂��Ȃ��B";
		next;
		switch(select("���Ȃ��͒N�ł����H","�������Ă��ł����H","��b����߂�")) {
		case 1:
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�I���́A���̎��ꂽ�O���X�g�w�C����";
			mes "�h�����\�[�h�}�X�^�[�@�x���[�u��";
			mes "��u���󂯌p���A��l�̋R�m�ɂ����Ȃ��B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�N�����̓�����ގ҂Ȃ�";
			mes "������X�Ɠ�������";
			mes "���ނ��ƂɂȂ邩������Ȃ��ȁB";
			close;
		case 2:
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�I�����N�Ɠ��������̓�����ގ҂��B";
			mes "���́A�N�̂悤�Ȉ̑�Ȃ�";
			mes "���[���~�b�h�K�b�c������";
			mes "�R�m�ł͂Ȃ����c�c�B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "��X�͋����ɖ����A�{���Ɏ���Ȃ�";
			mes "�����̋R�m�c�ł͂Ȃ��A�^�̌���";
			mes "���̓�����ގ҂����̏W�܂肾�B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "���̂̋��������ł͂Ȃ�";
			mes "�^�̗͂𐳂������̓��ւƓ����c�c�B";
			mes "���ꂪ���A���[���i�C�g�B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�����I���̊ԁA�O���X�g�w�C���̒��";
			mes "�B�����Ă������A���ɉ�X�̎u��";
			mes "���̐��ɒm�点�鎞�������̂��B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "��X�Ƌ��ɐ^�̌��̓�����ގ҂�";
			mes "�����邽�߁A�e�n�Ɉ����҂�";
			mes "�h�����Ă���B";
			next;
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�N�����̋R�m�Ƃ��āA��X�Ɠ����u��";
			mes "�����Ă���Ȃ�΁A�����҂̐��E�𓾂�";
			mes "���߂Ă����ɗ��Ă���B";
			close;
		case 3:
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�������̏ꂩ�狎�������������B";
			close;
		}
	case 1:
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�N�͂��̃O���X�g�w�C����";
		mes "���ꂽ�S��Ȃ̂��H";
		mes "���邢�͉����m�炸�ɖ�������";
		mes "�`���҂Ȃ̂��H";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�N��������l�Ԃł���Ȃ�";
		mes "�I���̘b���悭�����Ă���c�c�B";
		mes "�I���Ȃ�A����ȏ������낤�낵��";
		mes "�����댯�ɂ��炷�悤�Ȑ^���͂��Ȃ��B";
		next;
		if(select("���[���i�C�g�ɂȂ�ׂɗ��܂���","��b����߂�") == 2) {
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�������̏ꂩ�狎�������������B";
			close;
		}
		emotion 1;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�N���}�k�G���̐��E���󂯂�";
		mes "���[���i�C�g�̌�␶���ƌ����̂��H";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "����" + strcharinfo(0) + "�c�c�Ƃ����̂��B";
		mes "�m���ɁA��X�̓��u�ƂȂ��f����";
		mes "�L����R�m���Ɛ��E�����Ă���B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�c�c��낵���B";
		mes "��X�̌����ɂȂ鎑�i�ɂ��Ă�";
		mes "���߂ĕ����K�v�͂Ȃ����낤�B";
		mes "������N�ɁA�s���ׂ����������B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�܂��̓O���X�g�w�C���ɑ��݂���";
		mes "^FF0000���[���i�C�g�W���n^000000��";
		mes "�������̂��B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "^0000FF�O���X�g�w�C���R�m�c��2�K�ɂ�";
		mes "��X�̏W���n�Ɍq����ꏊ������B";
		mes "�����������邱�Ƃ���n�߂悤�B^000000";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���̏ꏊ�ɂ́A�N���W���n�Ɉē�����";
		mes "�l�����ҋ@���Ă���͂����B";
		mes "�����A�s���������B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���_�A�O���X�g�w�C���̖S��B��";
		mes "�P���|�����Ă��邾�낤�B";
		mes "�����A���̊댯��˔j������x�̗͂�";
		mes "�������킹�Ă���ƐM���Ă��邼�B";
		set CHANGE_RK,2;
		chgquest 3200,3201;
		close;
	case 2:
	case 3:
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�܂��̓O���X�g�w�C���ɑ��݂���";
		mes "^FF0000���[���i�C�g�W���n^000000��";
		mes "�������̂��B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "^0000FF�O���X�g�w�C���R�m�c��2�K�ɂ�";
		mes "��X�̏W���n�Ɍq����ꏊ������B";
		mes "�����������邱�Ƃ���n�߂悤�B^000000";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���̏ꏊ�ɂ́A�N���W���n�Ɉē�����";
		mes "�l�����ҋ@���Ă���͂����B";
		mes "�����A�s���������B";
		next;
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "���_�A�O���X�g�w�C���̖S��B��";
		mes "�P���|�����Ă��邾�낤�B";
		mes "�����A���̊댯��˔j������x�̗͂�";
		mes "�������킹�Ă���ƐM���Ă��邼�B";
		close;
	default:
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�܂��������̂悤���ȁB";
		mes "�����A������˔j���邱�Ƃ��F��B";
		next;
		if(select("�W���n�ɍs�������ł�","��b����߂�") == 2) {
			mes "[���[���̈����ҁ@�����O�x���O]";
			mes "�ǂ������H";
			mes "�����𑱂��Ȃ��̂��H";
			close;
		}
		mes "[���[���̈����ҁ@�����O�x���O]";
		mes "�悩�낤�A����������Ƃ��悤�B";
		mes "�ł́A�s���������B";
		close2;
		warp "job3_rune01.gat",80,65;
		end;
	}
}

gl_knt02.gat,150,55,3	script	���[���i�C�g�M���h�v��	83,{
	if(Job == Job_RuneKnight || CHANGE_RK > 3) {
		mes "[���[���i�C�g�M���h�v��]";
		mes "����ɂ��́B";
		mes strcharinfo(0) + "�l�B";
		mes "���[���i�C�g�W���n�ɍs���܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���[���i�C�g�M���h�v��]";
			mes "�����ł����B�ł́A�����^���I";
			mes "���͔C���ɖ߂�܂��B";
			close;
		}
		mes "[���[���i�C�g�M���h�v��]";
		mes "�������܂����B���ē��������܂��B";
		close2;
		warp "job3_rune01.gat",80,65;
		end;
	}
	switch(CHANGE_RK) {
	case 0:
		mes "[���[���i�C�g�M���h�v��]";
		mes "����ł����A�����͗�������֎~�ł��B";
		mes "���͂�������͖̂�肠��܂���";
		mes "�ז��͂��Ȃ��ł��������B";
		close;
	case 1:
		mes "[���[���i�C�g�M���h�v��]";
		mes "����ł����A�����͗�������֎~�ł��B";
		mes "���͂�������͖̂�肠��܂���";
		mes "�ז��͂��Ȃ��ł��������B";
		next;
		mes "[���[���i�C�g�M���h�v��]";
		mes "�ӂށB�ł����Ȃ��͂��ꂩ���X��";
		mes "�������邩���m��܂���ˁB";
		mes "���̓�����ގ҂�B";
		next;
		mes "[���[���i�C�g�M���h�v��]";
		mes "�����炸�A�܂����ł��傤�B";
		mes "���̎��ɂȂ�΁c�c�B";
		close;
	case 2:
	case 3:
		mes "[���[���i�C�g�M���h�v��]";
		mes "�������悭�����܂����ˁB";
		mes "�����O�x���O�l����";
		mes "���b�͎f���Ă���܂��B";
		mes "���Ȃ����W���n�ֈē��������܂��B";
		next;
		mes "[���[���i�C�g�M���h�v��]";
		mes "�W���n�ł͂܂��A�}�X�^�[�ł���";
		mes "^0000FF�e�B�O���[�X�l^000000�ɂ�����������B";
		mes "�V�������u������邱�Ƃ�";
		mes "�����҂��Ă����܂��̂ŁB";
		next;
		mes "[���[���i�C�g�M���h�v��]";
		mes "�ł́A���ɂ��ė��Ă��������B";
		if(CHANGE_RK == 2) {
			set CHANGE_RK,3;
			chgquest 3201,104452;
		}
		close2;
		warp "job3_rune01.gat",80,65;
		end;
	}
}

//============================================================
// �}�X�^�[
//------------------------------------------------------------
job3_rune01.gat,80,60,3	script	�e�B�O���[�X	470,{
	if(Job == Job_RuneKnight) {
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�悭���Ă��ꂽ�A";
		mes strcharinfo(0) + "�B";
		mes "���ɗp���͖�����������";
		mes "���������A������肵�Ă����Ƃ����B";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	}
	switch(CHANGE_RK) {
	case 0:
	case 1:
	case 2:
		// ������
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�ǂ�����Ă����ɗ����̂��m��Ȃ����A";
		mes "�N�͂����ɂ���ׂ��҂ł͂Ȃ��悤���ˁB";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���̏ꏊ�ɖ߂�Ƃ����B";
		mes "�����A�����Ă����悤�B";
		close2;
		cutin "3rd_rune_knight",255;
		warp "gl_knt02.gat",150,60;
		end;
	case 3:
		cutin "3rd_rune_knight",2;
		mes "�]�������Z���܂Ƃ�";
		mes "�@�����h�������̂悤�ȓ�������";
		mes "�@�Y�X�����p�̒j�������Ă���]";
		next;
		mes "�]�j�͔R����悤�Ȏ�����";
		mes "�@������𒭂߂��";
		mes "�@�قǂȂ����Ęb�������Ă����]";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�}�k�G�������E������␶�Ƃ����̂�";
		mes "�N�̂��Ƃ��H";
		mes "�I���̓��[���i�C�g�M���h�̃}�X�^�[";
		mes "�e�B�O���[�X���B";
		mes "�N�̖��������Ă���B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�c�c�����ƁA����͎���I";
		mes "�A�������Ă���̂������B";
		mes strcharinfo(0) + "�c�c�B";
		mes "�N�������ɗ������Ƃ����}���悤�I";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�I���͐����A�S���̎�����";
		mes "�ŏ�����Ō�܂Ō��邱�Ƃ͂ł��Ȃ��B";
		mes "�N�ɂ͐���A��肭�������p�X����";
		mes "���̓��u�ƂȂ��ė~�����B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�ǂ�ǂ�c�c��{�I�Ȋm�F��";
		mes "�}�k�G���ƃ����O�x���O��";
		mes "��肭����Ă��ꂽ�悤������";
		mes "�����Ƀe�X�g�ɓ���Ƃ��悤���B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���i���A�I";
		mes "�c�c�n�߂̎����͌N�ɔC����B";
		next;
		cutin "3rd_rune_knight",255;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�i�������j�B";
		next;
		mes "�]���i���A�ƌĂ΂ꂽ�������̏��R�m��";
		mes "�@�Â��������Ȃ���A������������]";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�����A�������n�܂邼�B";
		mes "^0000FF�܂��͂�����̉��Ȃ��삳�񂩂�";
		mes "�����̓��e�𕷂��悤�ɁB^000000";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���āA�I���͂����ŌN�����";
		mes "���ʕ񍐂�҂Ƃ��悤�B";
		mes "�撣���Ă����B";
		set CHANGE_RK,4;
		chgquest 104452,3202;
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 4:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�����A�������n�܂邼�B";
		mes "^0000FF�܂��͂�����̉��Ȃ��삳�񂩂�";
		mes "�����̓��e�𕷂��悤�ɁB^000000";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���āA�I���͂����ŌN�����";
		mes "���ʕ񍐂�҂Ƃ��悤�B";
		mes "�撣���Ă����B";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 5:
	case 6:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�N�͍��A�e�X�g������Ȃ��̂��H";
		mes "���i���A�A�ǂ��������Ƃ��H";
		mes "�e�X�g�͏I������̂����H";
		next;
		cutin "3rd_rune_knight",255;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�i�M�����j�B";
		next;
		mes "�]�ޏ��́A�������킸�Ɏ�����ɐU��";
		mes "�@��������ɂ݂����B";
		mes "�@�s���������e�͂Ȃ��˂��h����]";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�������A���i���A�I";
		mes "�c�c�I���̘b���悭�����Ă����B";
		mes "���i���A�́A������Ɩ����Ŗ����z����";
		mes "�ޏ��𖳎����邱�Ƃ͋�����Ȃ��B";
		next;
		emotion 56;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���̃I���ł����c�c";
		mes "����A��X�̒��ł͒N�ЂƂ�Ƃ���";
		mes "�{�����ޏ��ɓG���҂͂��Ȃ��񂾁B";
		mes "�͂͂́I";
		next;
		cutin "3rd_rune_knight",255;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�i�M�����j�B";
		next;
		cutin "3rd_rune_knight",2;
		emotion 19;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�����ƁA����ȖڂŌ��Ȃ��ł���B";
		mes "�������������A��␶����H";
		mes "���i���A�ɏ]���Ď������󂯂Ȃ����B";
		mes "���ꂪ�N�ƃI���̂��߂ɂȂ�悤���B";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 7:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���i���A�̎����͍��i�����悤���ˁI";
		mes "����ł�����{�͌��Ȃ��Ă����킯���B";
		mes "���āA���i���A�̎�����";
		mes "���i�����Ƃ������Ƃ́c�c�B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���m�A�I�@�v�X�ɌN�̏o�Ԃ�";
		mes "����Ă����Ƃ������Ƃ���B";
		next;
		cutin "3rd_rune_knight",255;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�ǂ����A���̂悤�ˁB";
		mes "�����ǁA���̎����̓��i���A�Ƃ�";
		mes "�����Ⴄ���H�@�]�݂��܂�";
		mes "�ؓ�����Ȃ����Ƃ����҂����B";
		next;
		cutin "3rd_rune_knight",2;
		emotion 56;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�͂͂́I�@�c�c��������ȁH";
		mes "������ؓ�ł͂����Ȃ����낤��";
		mes "�撣���Ă���I";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "^0000FF�����A�ׂ̏��ɂɍT���Ă���";
		mes "���̂悤�Ȃ���l�̎������󂯂�񂾁B^000000";
		set CHANGE_RK,8;
		chgquest 3204,3205;
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���m�A�I�@�v�X�ɌN�̏o�Ԃ�";
		mes "����Ă����Ƃ������Ƃ���B";
		next;
		cutin "3rd_rune_knight",255;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�ǂ����A���̂悤�ˁB";
		mes "�����ǁA���̎����̓��i���A�Ƃ�";
		mes "�����Ⴄ���H�@�]�݂��܂�";
		mes "�ؓ�����Ȃ����Ƃ����҂����B";
		next;
		cutin "3rd_rune_knight",2;
		emotion 56;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�͂͂́I�@�c�c��������ȁH";
		mes "������ؓ�ł͂����Ȃ����낤��";
		mes "�撣���Ă���I";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "^0000FF�����A�ׂ̏��ɂɍT���Ă���";
		mes "���̂悤�Ȃ���l�̎������󂯂�񂾁B^000000";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 14:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�b�͕������B���l�����p�X�ł��Ȃ�����";
		mes "���m�A�̃e�X�g�Ɏ󂩂����������ˁB";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "��������������Ȃ���";
		mes "���m�A�̎������ɍ��܂�����␶��";
		mes "�����؂�Ȃ��قǂ���B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���ɓ�������������̂���";
		mes "�悭���i���Ă��ꂽ�B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�ł́A�Ō�̎����ɒ���ł��炨���B";
		mes "���̎������p�X����΁A�N����X�Ɠ���";
		mes "�����ȃ��[���i�C�g�Ƃ��Ă̓���";
		mes "���ނ��ƂɂȂ�B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "^0000FF�ŏI�����́A�ׂ̕���ɂɂ���";
		mes "�����̃��[���i�C�g";
		mes "�x���t�B�[�m����󂯂�񂾁B^000000";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "��k�ł͂Ȃ��A��X�͖{����";
		mes "�N�����[���i�C�g�Ƃ���";
		mes "��ї��u�Ԃ�S�҂��ɂ��Ă���B";
		mes "�c�c�Ō�܂Ŋ撣���Ă���B";
		set CHANGE_RK,15;
		chgquest 3215,3216;
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 15:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "^0000FF�ŏI�����́A�ׂ̕���ɂɂ���";
		mes "�����̃��[���i�C�g";
		mes "�x���t�B�[�m����󂯂�񂾁B^000000";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "��k�ł͂Ȃ��A��X�͖{����";
		mes "�N�����[���i�C�g�Ƃ���";
		mes "��ї��u�Ԃ�S�҂��ɂ��Ă���B";
		mes "�c�c�Ō�܂Ŋ撣���Ă���B";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	case 16:
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���߂łƂ��I�@�N�͑S�Ă̎�����";
		mes "���i���A���[���i�C�g�Ƃ��Ă̓���";
		mes "���ނ��ƂɂȂ����B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�I���͖{���Ɋ������񂾁B";
		mes "�ӂӁc�c��y�������鎞�̊�т�";
		mes "�N�͂܂��m��Ȃ����낤�B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���ꂩ��N�́A���܂ł̊k��E���̂�";
		mes "�ւ炵����烋�[���i�C�g�̈����";
		mes "���܂�ς��񂾁B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���āA�]�E�O�̏����̊m�F���B";
		mes "���A�N���������Ă�����̂⏊���i��";
		mes "�]�E�̊�т̂��߂ɂ�������";
		mes "�������Ă�����̂�S��";
		mes "�a���Ă��Ă���B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���łɒm���Ă���Ǝv����";
		mes "�����̑q�ɃT�[�r�X�̂��삳��ɗ��߂�";
		mes "�������͖����͂����B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�܂��A�y�R�y�R�ɋR�悵�Ă���Ȃ�";
		mes "�y�R�y�R���a���ė���悤�ɁB";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "������B�X�L���|�C���g��";
		mes "�]���Ă���΁A�S�������悤�ɁB";
		mes "�]���Ă���Ɠ]�E�͏o���Ȃ����B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�I������̘b�͈ȏゾ�I";
		mes "�����A���[���i�C�g�Ƃ��Ă�";
		mes "�V�����������̎����I";
		next;
		if(select("�����͂ł��Ă��܂�","�l���鏀������������") == 2) {
			mes "[�}�X�^�[�@�e�B�O���[�X]";
			mes "�������c�c�B";
			mes "�S�̏������ł�����";
			mes "�܂��b�������Ă���B";
			close2;
			cutin "3rd_rune_knight",255;
			end;
		}
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�������A�N�ɑ��������j���̕i��";
		mes "�p�ӂ��Ă���B";
		next;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "����3�̒�����D���Ȃ��̂�I��ł���B";
		mes "���[���i�C�g�ƂȂ������ɓn���Ƃ��悤�B";
		while(1) {
			mes " ";
			mes "[<ITEM>�G�i�W�[���[���K�[�h[1]<INFO>2140</INFO></ITEM>]";
			mes "[<ITEM>���͐΂̎w��[1]<INFO>2794</INFO></ITEM>]";
			mes "[<ITEM>���[���v���[�g[1]<INFO>15002</INFO></ITEM>]";
			next;
			switch(select("�G�i�W�[���[���K�[�h[1]","���͐΂̎w��[1]","���[���v���[�g[1]","�l���鎞�Ԃ���������")) {
			case 1:
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "<ITEM>�G�i�W�[���[���K�[�h[1]<INFO>2140</INFO></ITEM>���ȁB";
				mes "�{���ɂ���ł悢�̂��H";
				set '@item,2140;
				break;
			case 2:
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "<ITEM>���͐΂̎w��[1]<INFO>2794</INFO></ITEM>���ȁB";
				mes "�{���ɂ�����ł悢�̂��H";
				set '@item,2794;
				break;
			case 3:
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "<ITEM>���[���v���[�g[1]<INFO>15002</INFO></ITEM>���ȁB";
				mes "�{���ɂ�����ł悢�̂��H";
				set '@item,15002;
				break;
			case 4:
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "�킩�����B";
				mes "�������l���Ă��Ă���B";
				close2;
				cutin "3rd_rune_knight",255;
				end;
			}
			next;
			if(select("�͂�","������") == 2) {
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "����ł͍ēx�A�~����������";
				mes "�I��ł���B";
				continue;
			}
			mes "[�}�X�^�[�@�e�B�O���[�X]";
			mes "��낵���B�ł́A";
			mes "��X�̎t�ł���̑�Ȃ�\�[�h�}�X�^�[";
			mes "�x���[�u��c�c�B";
			mes "�����āA�匫�҃Z���t�B�I�l��c�c�B";
			next;
			mes "[�}�X�^�[�@�e�B�O���[�X]";
			mes "�����Ɉ�l�̋R�m���A��X�Ƌ���";
			mes "���[���i�C�g�̓�����ނ��Ƃ�";
			mes "�j�������܂��c�c�B";
			next;
			if(Weight || checkitemblank() < 3 || checkcart() || checkfalcon() || checkriding() || checkdragon() || checkgear() || checkwolf() || sc_ison(SC_ALL_RIDING) || getpetinfo(0)) {
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "��c�c�H�@�N�̓I���̘b��";
				mes "�����ł��Ȃ������悤���ȁB";
				next;
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "���A";
				mes "�N�������A��Ă�����̂͑S�ĉ������";
				mes "�d�ʂ����镨�͈�U�S�ėa���Ă��Ă���B";
				mes "�y�R�y�R�ɋR�悵�Ă���Ȃ�";
				mes "�������K�v������Ƃ������Ƃ��B";
				next;
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "�����ɂ���";
				mes "�q�ɃT�[�r�X�̂��삳��ɗ��߂�";
				mes "�������͖����͂����B";
				next;
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "�����ł�����A�������I���Ă���";
				mes "�����|���Ă���I";
				next;
				cutin "3rd_rune_knight",255;
				mes "[�C���t�H���[�V����]";
				mes "�������̃A�C�e����";
				mes "�q�ɂɗa����Ȃǂ���";
				mes "�����A�C�e���̏d�ʂ�";
				mes "^FF00000^000000�ɂ��ĉ������B";
				mes "�󂫎�ސ��ɂ�";
				mes "������x�̗]�T���������Ă��������B";
				next;
				mes "[�C���t�H���[�V����]";
				mes "�J�[�g�A�t�@���R���A";
				mes "�y�R�y�R�A�h���S���A";
				mes "�O���t�H���A�E�H�[�O�A";
				mes "�����M�A�A�R�搶���A";
				mes "�y�b�g��";
				mes "�O���Ă��ĉ������B";
				close;
			}
			if(SkillPoint) {
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "��c�c�H";
				mes "��������������Ȃ��悤�����H";
				next;
				cutin "3rd_rune_knight",255;
				mes "^FF0000�]�X�L���|�C���g���]���Ă���ꍇ��";
				mes "�@�S�ď���Ă��������]^000000";
				close;
			}
			if(Job != Job_Knight || Upper == UPPER_NORMAL || (Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {	// �O�̂��ߐE�`�F�b�N
				mes "[�}�X�^�[�@�e�B�O���[�X]";
				mes "��c�c�H";
				mes "��������������Ȃ��悤�����H";
				close2;
				cutin "3rd_rune_knight",255;
				end;
			}
			set CHANGE_RK,0;
			chgquest 3219,201180;
			compquest 201180;
			resetstatus;
			resetskill;
			setoption 0;
			jobchange Job_RuneKnight;
			getitem 5746,1;		// ���[���T�[�N���b�g
			getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
			getitem '@item,1;
			setquest 129700;	// �X�e�[�^�X���X�L���ꊇ���Z�b�g��
			mes "[�}�X�^�[�@�e�B�O���[�X]";
			mes "���߂łƂ��B�N�����[���i�C�g�ƂȂ�";
			mes "��X�̓��u�ɂȂ������̏u�Ԃ�";
			mes "�i���ɋL������邾�낤�B";
			next;
			mes "[�}�X�^�[�@�e�B�O���[�X]";
			mes "�V����������ގ҂ׂ̈�";
			mes "���{������ʂɑ��蕨���͂��Ă���B";
			mes "�󂯎���Ă���B";
			next;
			cutin "3rd_rune_knight",255;
			mes "[�C���t�H���[�V����]";
			mes "�]�E�����̃N���A��V";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g����";
			mes "�t�^����܂����B";
			mes "�N�G�X�g�E�B���h�E�ŗ��p���@��";
			mes "�m�F�ł��܂��B";
			close;
		}
	}
}

//============================================================
// ��1����
//------------------------------------------------------------
job3_rune01.gat,90,50,3	script	���i���A	469,{
	if(Job == Job_RuneKnight) {
		mes "�]�ޏ��͐Â��Ɋ���グ";
		mes "�@����������Čy���������]";
		next;
		emotion 9;
		mes "�]�����āA������������炷��";
		mes "�@�����̂悤�ɉ������l���n�߂��]";
		close;
	}
	switch(CHANGE_RK) {
	case 0:
	case 1:
	case 2:
	case 3:
		emotion 9;
		mes "�]�������̏����R�m�͎�����C�ɂ���";
		mes "�@����l�q�͂Ȃ��B";
		mes "�@������̑��݂ɂ��Ă�";
		mes "�@�����������������]";
		close;
	case 4:
		mes "�]�������킸������̊�����Ă���";
		mes "�@���R�m�́A�����₭�悤��";
		mes "�@���������Řb���n�߂��]";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "5���c�c�B";
		mes "^0000FF5���ԂŁc�c�G���c�c";
		mes "�S���|�����Ƃ��ł���ΐ����c�c�B^000000";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c���̎����́c�c��������";
		mes "�e�B�O���[�X�}�X�^�[�c�c";
		mes "�c�c����Ƀ��m�A�ƃx���t�B�[�m��";
		mes "�c�c�ꏏ�ɎQ�ς��邩��B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "^0000FF�K�v�Ȃ�c�c�������B�̒N���Ɂc�c";
		mes "���������߂Ă��c�c�����c�c�B";
		mes "�ł��A����������킯����Ȃ��c�c�B^000000";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "����������c�c�����Ȃ��Ō���邱�Ƃ�";
		mes "�c�c����B";
		mes "���������߂�̂́c�c���R�B";
		mes "�����̗͂����Œ��킵�Ă��c�c�����B";
		next;
		break;
	case 5:
		if(checkquest(3203)) {
			chgquest 3203,104455;
		}
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "���s�c�c�Ȃ́c�c�H";
		mes "�ł��c�c�񐔐����͂Ȃ��c�c�B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�܂��c�c�󂯂����Ȃ�c�c";
		mes "������ɑ����Ă�����c�c�B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "5���c�c�B";
		mes "^0000FF5���ԂŁc�c�G���c�c";
		mes "�S���|�����Ƃ��ł���ΐ����c�c�B^000000";
		next;
		break;
	case 6:
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�����́c�c���i�B";
		next;
		mes "�]�ޏ��͏��������΂݂Ȃ���";
		mes "�@������������]";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "��{�I�ȋR�m�Ƃ��Ă̐g�̔\�͂́c�c";
		mes "�c�c���i�c�c�������f����B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�������̎����́c�c����ŏI���B";
		mes "^0000FF�e�B�O���[�X�}�X�^�[�Ɂc�c";
		mes "�񍐂��āB^000000";
		set CHANGE_RK,7;
		chgquest 104460,3204;
		close;
	default:
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�������̎����́c�c����ŏI���B";
		mes "^0000FF�e�B�O���[�X�}�X�^�[�Ɂc�c";
		mes "�񍐂��āB^000000";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c���̃��[���i�C�g�B�̎�����";
		mes "�c�c�҂��Ă邩��B";
		close;
	}
	mes "[����̃��[���i�C�g�@���i���A]";
	mes "�c�c������Ɉړ����鏀�����ł�����";
	mes "�c�c�������ɘb�������āB";
	next;
	if(select("������Ɉړ�����","�������鎞�Ԃ���������") == 2) {
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c�킩�����B";
		mes "�c�c�����������āB";
		close;
	}
	mes "�]���i���A�͌y�������Ȃ�����U��";
	mes "�@�������������]";
	next;
	if(checkquest(3220)) {
		if(checkquest(3220)&2 == 0) {
			mes "[����̃��[���i�C�g�@���i���A]";
			mes "�c�c������Ƒ҂��āB";
			mes "������Ɉ�x��������c�c";
			mes "�c�c�����̊Ԃ͍ē���ł��Ȃ��B";
			mes "�c�c�e�X�g���󂯂�ق��̌�␶�ׁ̈B";
			mes "�c�c������ɂ܂����āc�c�B";
			close;
		}
		delquest 3220;
	}
	if(getnpctimer(1,"RKTestStart") || getnpctimer(1,"RKTestBattle1") || getnpctimer(1,"RKTestBattle2")) {
		emotion 9;
		mes "�]�������A������������߂��";
		mes "�@����������āA�����J���]";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c���Ȃ��ȊO�̌�␶����";
		mes "�c�c������𗘗p���Ă���݂����B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c���������҂��āB";
		mes "�c�c���[���i�C�g�̎�����1�l���B";
		mes "�c�c���ꂪ�������B�̖񑩂�����B";
		next;
		mes "[����̃��[���i�C�g�@���i���A]";
		mes "�c�c���΂炭������I���Ǝv���B";
		mes "�c�c�����������Ԃ������āA�܂����āB";
		close;
	}
	if(CHANGE_RK == 4) {
		set CHANGE_RK,5;
		chgquest 3202,3203;
	} else {
		chgquest 104455,3203;
	}
	setquest 3220;
	warp "job3_rune02.gat",38,40;
	end;
}

job3_rune02.gat,38,40,0	script	RKTestStart	139,15,15,{
OnTouch:
	if(CHANGE_RK != 5) {
		warp "job3_rune01.gat",90,47;
		end;
	}
	areasetcell "job3_rune02.gat",37,39,39,41,1;
	initnpctimer;
	hideonnpc;
	end;
OnTimer5000:
	announce "�����胋�[���i�C�g��␶�̑�1�������s���܂�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer8000:
	announce "�������e�́u5���ȓ��ɑS�Ẵ����X�^�[��|���v���Ƃł�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer11000:
	announce "�����c��Ȃ������ꍇ��A���Ԃ��z�����ꍇ�͎��s�ƂȂ�܂�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer14000:
	announce "����ł͎������J�n���܂�",0x9,0xFFFF00,0x190,12,0,0;
	initnpctimer "RKTestBattle1";
	initnpctimer "RKTestHelper";
	areasetcell "job3_rune02.gat",37,39,39,41,0;
	stopnpctimer;
	end;
}

job3_rune02.gat,0,0,0	script	RKTestBattle1	-1,{
OnTimer5000:
	areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N",1467,1,"RKTestBattle1::OnKilled";
	areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N�A�[�`���[",1453,2,"RKTestBattle1::OnKilled";
	end;
OnTimer50000:
OnTimer100000:
OnTimer150000:
	switch(rand(6)) {
	case 0:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N",1467,1,"RKTestBattle1::OnKilled";
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N�A�[�`���[",1453,2,"RKTestBattle1::OnKilled";
		break;
	case 1:
	case 2:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���[�h",1478,4,"RKTestBattle1::OnKilled";
		break;
	case 3:
	case 4:
		areamonster "job3_rune02.gat",0,0,0,0,"�t�F���_�[�N",1484,1,"RKTestBattle1::OnKilled";
		areamonster "job3_rune02.gat",0,0,0,0,"���r�I",1483,1,"RKTestBattle1::OnKilled";
		break;
	case 5:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�X",1475,4,"RKTestBattle1::OnKilled";
		break;
	}
	end;
OnTimer200000:
	killmonster "job3_rune02.gat","RKTestBattle1::OnKilled";
	donpcevent "RKTestBattle2::OnStart";
	end;
OnTimer60000:
	announce "�]1���o�߂��܂����]",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer120000:
	announce "�]2���o�߂��܂����]",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer180000:
	announce "�]3���o�߂��܂����]",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer240000:
	announce "�]4���o�߂��܂����]",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer300000:
	announce "�]�������Ԃ��z���܂����B�����͎��s�ł��]",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer303000:
	mapwarp "job3_rune02.gat","job3_rune01.gat",90,47;
	killmonster "job3_rune02.gat","RKTestBattle1::OnKilled";
	killmonster "job3_rune02.gat","RKTestBattle2::OnKilled";
	stopnpctimer "RKTestHelper";
	stopnpctimer;
	hideonnpc "�e�B�O���[�X#RKTest";
	hideonnpc "���i���A#RKTest";
	hideonnpc "���m�A#RKTest";
	hideonnpc "�x���t�B�[�m#RKTest";
	hideoffnpc "RKTestStart";
	end;
OnKilled:
	end;
}

job3_rune02.gat,0,0,0	script	RKTestBattle2	-1,{
OnStart:
	switch(rand(6)) {
	case 0:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N",1467,1,"RKTestBattle2::OnKilled";
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���b�N�A�[�`���[",1453,2,"RKTestBattle2::OnKilled";
		break;
	case 1:
	case 2:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�h���[�h",1478,4,"RKTestBattle2::OnKilled";
		break;
	case 3:
	case 4:
		areamonster "job3_rune02.gat",0,0,0,0,"�t�F���_�[�N",1484,1,"RKTestBattle2::OnKilled";
		areamonster "job3_rune02.gat",0,0,0,0,"���r�I",1483,1,"RKTestBattle2::OnKilled";
		break;
	case 5:
		areamonster "job3_rune02.gat",0,0,0,0,"���C�X",1475,4,"RKTestBattle2::OnKilled";
		break;
	}
	end;
OnKilled:
	if(getmapmobs("job3_rune02.gat","RKTestBattle2::OnKilled") < 1) {
		set CHANGE_RK,6;
		delquest 3220;
		chgquest 3203,104460;
		announce "�����������N���A���܂����I",0x9,0xFFFF00,0x190,12,0,0;
		initnpctimer;
	}
	end;
OnTimer3000:
	mapwarp "job3_rune02.gat","job3_rune01.gat",90,47;
	killmonster "job3_rune02.gat","RKTestBattle1::OnKilled";
	killmonster "job3_rune02.gat","RKTestBattle2::OnKilled";
	stopnpctimer "RKTestHelper";
	stopnpctimer "RKTestBattle1";
	stopnpctimer;
	hideonnpc "�e�B�O���[�X#RKTest";
	hideonnpc "���i���A#RKTest";
	hideonnpc "���m�A#RKTest";
	hideonnpc "�x���t�B�[�m#RKTest";
	hideoffnpc "RKTestStart";
	end;
}

job3_rune02.gat,0,0,0	script	RKTestHelper	-1,{
OnTimer30000:
	announce "�e�B�O���[�X : ���[���i�C�g�̌�␶��B���̗͂��؂肽����΁A�N����l�ɘb�������Ă���I",0x9,0xFFFF00,0x190,12,0,0;
	hideoffnpc "�e�B�O���[�X#RKTest";
	hideoffnpc "���i���A#RKTest";
	hideoffnpc "���m�A#RKTest";
	hideoffnpc "�x���t�B�[�m#RKTest";
	end;
OnTimer60000:
	announce "�e�B�O���[�X : ���̎�͕K�v�Ȃ��̂��ȁc�c���N�A���΂炭�l�q������Ƃ��悤�B",0x9,0xFFFF00,0x190,12,0,0;
	hideonnpc "�e�B�O���[�X#RKTest";
	hideonnpc "���i���A#RKTest";
	hideonnpc "���m�A#RKTest";
	hideonnpc "�x���t�B�[�m#RKTest";
	initnpctimer;
	end;
}

job3_rune02.gat,34,46,5	script	�e�B�O���[�X#RKTest	470,{
	if(getnpctimer(1,"�e�B�O���[�X#RKTest") == 0 && getnpctimer(1,"���i���A#RKTest") == 0 && getnpctimer(1,"���m�A#RKTest") == 0 && getnpctimer(1,"�x���t�B�[�m#RKTest") == 0) {
		if(strnpcinfo(1) == "�e�B�O���[�X") {
			switch(rand(6)) {
			case 0:
				announce "�e�B�O���[�X : �N�ɁA�x���[�u�̏j�����c�c�I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 34,0;
				sc_start SC_BLESSING,240000,10;
				break;
			case 1:
			case 2:
				announce "�e�B�O���[�X : �����̉���c�c�ĂєR���オ��I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 28,1224;
				heal 1224,0;
				break;
			case 3:
				announce "�e�B�O���[�X : �X���ȖS�삽����c�c��ɋA�邪�����I",0x9,0xFFFF00,0x190,12,0,0;
				misceffect 92,"";
				killmonster "job3_rune02.gat","RKTestBattle1::OnKilled";
				break;
			case 4:
			case 5:
				announce "�e�B�O���[�X : ��␶��A�C��������Ȃ����I",0x9,0xFFFF00,0x190,12,0,0;
				break;
			}
		}
		else if(strnpcinfo(1) == "���i���A") {
			switch(rand(6)) {
			case 0:
				announce "���i���A : �����Ƒ����c�c�����Ƌ����c�c�G�̑��̍����~�߂�́c�c�I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 29,0;
				sc_start SC_INCREASEAGI,240000,10;
				break;
			case 1:
			case 2:
				announce "���i���A : �܂��I����Ă��Ȃ��c�c�����������Ȃ��ɗ͂��c�c�I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 28,1224;
				heal 1224,0;
				break;
			case 3:
				announce "���i���A : �S�Ă͌��_�Ɂc�c�҂�c�c�I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 35,0;
				sc_end SC_SILENCE;
				sc_end SC_CONFUSION;
				sc_end SC_BLIND;
				break;
			case 4:
			case 5:
				announce "���m�A : ���ꂭ�炢�̎����́A�債�����ƂȂ����ˁH",0x9,0xFFFF00,0x190,12,0,0;
				break;
			}
		}
		else if(strnpcinfo(1) == "���m�A") {
			switch(rand(6)) {
			case 0:
				announce "���m�A : �����̃��[����I�@���Ȃ��ɗ͂��I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 29,0;
				sc_start SC_INCREASEAGI,240000,10;
				break;
			case 1:
			case 2:
				announce "���m�A : �����̃��[����I�@�����̗͂��I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 28,1224;
				heal 1224,0;
				break;
			case 3:
				announce "���m�A : ���͒N���������c�c���Ƃ͈Ⴄ���I",0x9,0xFFFF00,0x190,12,0,0;
				misceffect 148,"";
				killmonster "job3_rune02.gat","RKTestBattle1::OnKilled";
				break;
			case 4:
			case 5:
				announce "���m�A : ���ꂭ�炢�̎����́A�債�����ƂȂ����ˁH",0x9,0xFFFF00,0x190,12,0,0;
				break;
			}
		}
		else if(strnpcinfo(1) == "�x���t�B�[�m") {
			switch(rand(6)) {
			case 0:
				announce "�x���t�B�[�m : ���O�́A����ȏ��œ|���҂ł͂Ȃ��I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 28,1224;
				heal 1224,0;
				break;
			case 1:
			case 2:
				announce "�x���t�B�[�m : �s���I�@�ז�������̂͑S�Đ؂�􂯁I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 29,0;
				sc_start SC_INCREASEAGI,240000,10;
				break;
			case 3:
				announce "�x���t�B�[�m : ���O�͈�l�ł͂Ȃ��B��炪������Ă���I",0x9,0xFFFF00,0x190,12,0,0;
				npcskillsupport 34,0;
				sc_start SC_BLESSING,240000,10;
				break;
			case 4:
			case 5:
				announce "�x���t�B�[�m : �킦�I�@�����āA���āI�@���̒��x�̎������S�O����ȁI",0x9,0xFFFF00,0x190,12,0,0;
				break;
			}
		}
		stopnpctimer "RKTestHelper";
		initnpctimer;
	}
	end;
OnTimer5000:
	announce "�e�B�O���[�X : ���N�A���ꂩ�炵�΂炭�l�q������Ƃ��悤�B",0x9,0xFFFF00,0x190,12,0,0;
	hideonnpc "�e�B�O���[�X#RKTest";
	hideonnpc "���i���A#RKTest";
	hideonnpc "���m�A#RKTest";
	hideonnpc "�x���t�B�[�m#RKTest";
	stopnpctimer;
	initnpctimer "RKTestHelper";
OnInit:
	hideonnpc;
	end;
}

job3_rune02.gat,43,46,3	duplicate(�e�B�O���[�X#RKTest)	���i���A#RKTest	469
job3_rune02.gat,43,34,1	duplicate(�e�B�O���[�X#RKTest)	���m�A#RKTest	469
job3_rune02.gat,34,34,7	duplicate(�e�B�O���[�X#RKTest)	�x���t�B�[�m#RKTest	468

//============================================================
// ��2����
//------------------------------------------------------------
job3_rune01.gat,55,50,3	script	���m�A#RK	469,{
	if(Job == Job_RuneKnight) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̓��u�ɂȂ����̂ˁB���߂łƂ��I";
		mes "���[���i�C�g" + strcharinfo(0) + "�B";
		mes "���߂Ă�낵���ˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���ꂩ��c�c��炪�s���ׂ�����";
		mes "�͂�����ƌ���Ă���͂���B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����܂łɁA���Ƌ��ɂ��铯�u��";
		mes "��l�ł������A�T���Ă݂��B";
		mes "���Ȃ��݂����Ȑl���ˁc�c�B";
		mes "�ӂӁc�c�B";
		close;
	}
	switch(CHANGE_RK) {
	default:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���[���i�C�g��␶���c�c�B";
		mes "���Ȃ��ŉ��l�ڂ�����������H";
		next;
		emotion 54;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̎������󂯂���قǂ̑f������";
		mes "�l�Ԃ����Ȃ��Ăˁc�c�B";
		mes "�䗗�̂Ƃ���A�x�܂��Ă�����Ă��B";
		next;
		emotion 29;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ����������󂯂Ă���Ȃ�";
		mes "���̎����܂Ŋ撣���Ďc���Ă�B";
		mes "���i���A�̃e�X�g�́A�n���p�Ȃ�����B";
		mes "�ӂӁc�c�B";
		close;
	case 8:
		emotion 29;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�����c�c�x��!!�@����ƁA���̏o�ԂˁH";
		mes "�ӂӁc�c����������Ȃ��B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���i���A�̃e�X�g���󂯂���␶��";
		mes "���l�������c�c100�l���������";
		mes "������̂��O�����������B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̓��m�A�B���[���i�C�g�̌�␶�B��";
		mes "���[���Ɩ��@�Ɋւ���w���Ǝ�����";
		mes "�s���Ă����B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�������ȃ��i���A�̃e�X�g���󂯂�";
		mes "���Ă��邩����H�@���̖��͂������";
		mes "�ς�����q�����ǁB";
		mes "�����A��������n�߂���B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�܂��́A^0000FF���̏��ɓ��ɂ���{��ǂ�";
		mes "���Ƃ���n�߂܂��傤�B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�����ˁc�c^0000FF�w���[���ƃ��[���i�C�g�x^000000�A";
		mes "^0000FF�w���[���̌����Ǝ�ށx^000000�A";
		mes "^0000FF�w���[���X�g�[���̐���Ǝg�p�x^000000�A";
		mes "����3���ł���������c�c�B";
		next;
		emotion 29;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�{����������ǂ񂾂�A";
		mes "���傤�����B���܂œǏ��Ƃ��׋��Ƃ�";
		mes "�����Ȃ������Ƃ�����A���[���i�C�g��";
		mes "�Ȃ�͓̂�������ˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ƃ��Ă��A���Ȃ��ɃQ�t�F����";
		mes "�W���m�[�̖��@�g���B�Ɠ������m����";
		mes "�v�����Ă�킯����Ȃ�����";
		mes "�撣���Ă݂Ȃ����B";
		set CHANGE_RK,9;
		chgquest 3205,3206;
		close;
	case 9:
		if(checkquest(104465) == 0 || checkquest(104470) == 0 || checkquest(104475) == 0) {
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "�܂��́A^0000FF���̏��ɓ��ɂ���{��ǂ�";
			mes "���Ƃ���n�߂܂��傤�B^000000";
			next;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "�����ˁc�c^0000FF�w���[���ƃ��[���i�C�g�x^000000�A";
			mes "^0000FF�w���[���̌����Ǝ�ށx^000000�A";
			mes "^0000FF�w���[���X�g�[���̐���Ǝg�p�x^000000�A";
			mes "����3���ł���������c�c�B";
			next;
			emotion 29;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "�{����������ǂ񂾂�A";
			mes "���傤�����B���܂œǏ��Ƃ��׋��Ƃ�";
			mes "�����Ȃ������Ƃ�����A���[���i�C�g��";
			mes "�Ȃ�͓̂�������ˁB";
			next;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "���Ƃ��Ă��A���Ȃ��ɃQ�t�F����";
			mes "�W���m�[�̖��@�g���B�Ɠ������m����";
			mes "�v�����Ă�킯����Ȃ�����";
			mes "�撣���Ă݂Ȃ����B";
			close;
		}
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�w�肵���{�͑S���ǂ񂾂̂�����H";
		mes "����Ȃ��Ǐ���������������Ȃ�����";
		mes "���[���i�C�g�ɂȂ�ƌ��ӂ����񂾂���";
		mes "���̒��x�̂��ƂŎ㉹��f���Ȃ��łˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�{��ǂ�ŕ��������Ǝv������";
		mes "���@�̗͎͂��R�ƌ��f�̗͂������o��";
		mes "�P����ς܂Ȃ��Ǝg�p����̂�";
		mes "�s�\�ɋ߂���B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����ŃE�B�U�[�h��Z�[�W�Ƃ����E�Ƃ�";
		mes "����킯�Ȃ񂾂��ǁA���@�͔ނ��";
		mes "�̈�ɂȂ��Ă��܂��Ă���̂������ˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�Ƃ���ŁA���[���i�C�g�B�̎w���ҁc�c";
		mes "�\�[�h�}�X�^�[�@�x���[�u��";
		mes "���������N�ɂ���Ĉِ��E�ւ̔���";
		mes "�J�����O�ɁA���łɈِ��E��";
		mes "�d�������ɉ���Ă����炵���́B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�d���̖��@�w�ҒB���疂�@�̐�����";
		mes "���̉����A�[�߂�Z�p���w�񂾌�";
		mes "�ނ�̋��͂𓾂ă��[���������";
		mes "������i�߂��̂�B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̌��ʁA���[���𗘗p����";
		mes "���Ɩ��@���s�g�ł���悤�ɂȂ����̂�";
		mes "���������[���i�C�g�Ƃ����킯�B";
		next;
		emotion 9,"";
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�c�c�{�œǂ񂾓��e���A�Ȃ��J��Ԃ���";
		mes "�����Ă���̂������ł��Ȃ��c�c";
		mes "�Ƃ���������Ă��ˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����Ŏ��́A^0000FF�A�b�V���E�o�L���[����";
		mes "���[���i�C�g�̒a����";
		mes "���͂��Ă���������t�B�l���̌��҂�";
		mes "���ډ���Ă��炤���Ƃɂ����B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���ꂩ��A�~�b�h�K���h�A���R���Ԓn��";
		mes "�h������Ă��郋�[���i�C�g�B�ɋ��͂�";
		mes "���[���̌��������Ă���";
		mes "^0000FF���҃Z���t�B�I�l^000000�ɉ���Ă���̂�B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�����������Ԃ����B�l�ԂƋ��ɂ��Ă���";
		mes "���҂�����A���t�͒ʂ����B";
		mes "���̓_�͐S�z���Ȃ��ŁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�o���̏������ł�����^0000FF�~�b�h�K���h";
		mes "�A���R���Ԓn^000000�ɓ]�����Ă������B";
		mes "�����Ō��҂��狳���𐿂��Ȃ����B";
		set CHANGE_RK,10;
		chgquest 3206,3207;
		delquest 104465;
		delquest 104470;
		delquest 104475;
		close;
	case 10:
	case 11:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "^0000FF�~�b�h�K���h�A���R���Ԓn^000000��";
		mes "�]�����Ă������B�����͂����H";
		next;
		if(select("�������ł��܂���","�܂��A�ł��Ă��܂���") == 2) {
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "�������I�������A�����|���ĂˁB";
			mes "���͂��ł�����OK������B";
			close;
		}
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "������B�Ȃ�A�������]�����Ă�����B";
		mes "�����A�������B����ӂ������c�c�B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ������ꂩ��s���ꏊ�ِ͈��E��B";
		mes "���Ԓn�ɔh������Ă���l�����݂͂��";
		mes "^FF0000�e���̔F�؂������`���ҒB��";
		mes "���̊Ǘ��҂݂̂�B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�e���̋���ŁA���������[���i�C�g��";
		mes "�s���̎��R�͕ۏ؂���Ă��邯�ǁc�c";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ����ِ��E�Ŏ��R�ɍs������";
		mes "���߂ɂ́A^FF0000���B�Ɗ֌W�Ȃ��ِ��E��";
		mes "�s�������ȃ��[�g��ʂ��Ȃ��ƃ_���B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�����ł���̂́A�ِ��E�Ƃ��̏ꏊ��";
		mes "�q�����Ƃ����c�c�B";
		mes "���̓_�����͋C�����ĂˁB";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���ꂶ�Ⴀ�A�]��������B";
		mes "�����Ă�����Ⴂ�I";
		close2;
		warp "mid_camp.gat",236,246;
		end;
	case 12:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���A��Ȃ����B";
		mes "�ِ��E�͂ǂ�������������H";
		next;
		emotion 29;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ��قǂ̎��͂Ȃ�A�ِ��E�ő�����";
		mes "��������Ă�����������Ȃ���ˁc�c�B";
		mes "�ӂӂ��B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ď��́A���[���i�C�g�ɂӂ��킵��";
		mes "���[���Ɋւ��鎎�����s�����B";
		mes "���̎����̂��߂ɁA�ʓ|���������Ƃ�";
		mes "����Ă�������̂�B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�܂����[���i�C�g����Ȃ����Ȃ���";
		mes "���[���X�g�[���𒼐ڐG�邱�Ƃ��ł���";
		mes "�@���p�ӂ�����B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		//mes "^0000FF���̔w��ɂ���Α��̑�����";	// �{�I�d�l
		mes "^0000FF���̔w��ɂ���Α��̑�����";
		mes "���[���X�g�[���𐶐����邽�߂�";
		mes "�F�������B������g���Ă��Ȃ���";
		mes "���[���X�g�[��������Ă��炤��B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̏��ւœǂ񂾖{�̓��e��";
		mes "�����Ɗo���Ă���Ȃ�";
		mes "�����������Ȃ��Ă����[���X�g�[����";
		mes "����͂���B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���[���X�g�[���̍쐬���J�n�����";
		mes "�F�̒��Ń��[���X�g�[�������������";
		mes "�l�q�����邱�Ƃ��ł����B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ��͂��̗l�q������";
		mes "^0000FF���������ł��낤���[���X�g�[����";
		mes "���O�𓪂̒��ŋ����C���[�W����́B^000000";
		mes "�ȒP�ł���H";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�쐬�ڕW��^0000FF���[���X�g�[��2��^000000��B";
		mes "�悭�o���Ă����ĂˁB";
		set CHANGE_RK,13;
		chgquest 3213,3214;
		close;
	case 13:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		//mes "^0000FF���̔w��ɂ���Α��̑�����";	// �{�I�d�l
		mes "^0000FF���̔w��ɂ���Α��̑�����";
		mes "���[���X�g�[���𐶐����邽�߂�";
		mes "�F�������B������g���Ă��Ȃ���";
		mes "���[���X�g�[��������Ă��炤��B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���̏��ւœǂ񂾖{�̓��e��";
		mes "�����Ɗo���Ă���Ȃ�";
		mes "�����������Ȃ��Ă����[���X�g�[����";
		mes "����͂���B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���[���X�g�[���̍쐬���J�n�����";
		mes "�F�̒��Ń��[���X�g�[�������������";
		mes "�l�q�����邱�Ƃ��ł����B";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���Ȃ��͂��̗l�q������";
		mes "^0000FF���������ł��낤���[���X�g�[����";
		mes "���O�𓪂̒��ŋ����C���[�W����́B^000000";
		mes "�ȒP�ł���H";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�쐬�ڕW��^0000FF���[���X�g�[��2��^000000��B";
		next;
		if(select("�����������[���̐��́H","2���܂����I") == 1) {
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "����܂Ő������ꂽ���[���X�g�[����";
			mes CHANGE_RK_RUNE + "�ˁc�c�B";
			close;
		}
		if(CHANGE_RK_RUNE < 2) {
			emotion 6;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "����I�@����2���悤��";
			mes "�������͂���B";
			mes "���ꂶ�Ⴀ�A����Ȃ���B";
			close;
		}
		else if(CHANGE_RK_RUNE == 2) {
			emotion 33;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "�ӂށc�c��낵���B2���傤�ǂˁB";
			mes "����Ă���������[���X�g�[����";
			mes "������e�B�O���[�X�ɓn���Ă�����B";
			next;
		}
		else {
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "����c�c2���z���ă��[���X�g�[����";
			mes "����Ă��܂����悤�ˁB";
			mes "���߂��č�������Ƃ��A�K������";
			mes "�������Ƃ��Ƃ͌����Ȃ���B";
			next;
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "���ꂾ���̃��[���X�g�[������钆��";
			mes "���s���Ď���ꂽ���͂��������Ƃ�����";
			mes "�傫�ȑ����������ƂɂȂ�̂�H";
			mes "�܂��A����͂������ǁc�c�B";
			next;
		}
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���A���̎����͂���ŏI����B";
		mes "^0000FF�}�X�^�[�ɓ`���āA���̎�����";
		mes "�i��ł��傤�����B^000000";
		set CHANGE_RK,14;
		set CHANGE_RK_RUNE,0;
		chgquest 104485,3215;
		close;
	case 14:
	case 15:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���A���̎����͂���ŏI����B";
		mes "^0000FF�}�X�^�[�ɓ`���āA���̎�����";
		mes "�i��ł��傤�����B^000000";
		next;
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�r���ŋC�Â��Ă�����������Ȃ�����";
		mes "�ŏ����玄�̎����͍��i�ƕs���i������";
		mes "�����ł͂Ȃ������̂�B";
		mes "�ْ����Ă���A���������b�N�X���Ă�";
		mes "���v������B";
		close;
	case 16:
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�x���t�B�[�m�͑f������Ȃ�����";
		mes "�l�ɂ���ē����̈Ⴄ�������o���̂�B";
		mes "�ł��A���Ȃ��͔F�߂���";
		mes "���i�ł����悤�ˁB";
		mes "���߂łƂ��I";
		close;
	}
}

job3_rune01.gat,40,54,0	script	���R���鑕���̖{	844,{
	if(Job != Job_RuneKnight && CHANGE_RK < 9) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����ɁA�����̕��Ɏ���o�����Ƃ�";
		mes "���Ă����c�c���̓��e�����Ȃ���";
		mes "�����ł���̂�����H";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�͂͂́I";
		mes "���m�A�A���������ɂ��Ȃ����B";
		mes "�N������ɁA�����̕��ɐG���̂�";
		mes "��߂��ق���������";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	}
	mes "�]��Ɏ�����{�̕\���ɂ�";
	mes "�@^0000FF�w���[���ƃ��[���i�C�g�x^000000��";
	mes "�@�L�ڂ���Ă���]";
	next;
	while(1) {
		switch(select("�w���[���i�C�g�̒a���x","�w���[���Ɩ��@�G�i�W�[�x","�{�����̏ꏊ�ɖ߂�")) {
		case 1:
			mes "^6A0000���[���i�C�g�Ƃ�";
			mes "�\�[�h�}�X�^�[�ł���";
			mes "���򗬂̎n�c�Ƃ��Ēm����";
			mes "�`���̌��m�x���[�u�����ݏo����";
			mes "���Ɩ��@�̒��a��S���Đi������";
			mes "���m�B�̂��Ƃ��B^000000";
			next;
			mes "^6A0000���̓G�i�W�[�ł͂Ȃ��A�̓��Œ���";
			mes "�������ꂽ���[���X�g�[���Ƃ���";
			mes "�}�̂𗘗p���A���[���ŗL�̖��͂�";
			mes "��g�ł��邱�Ƃ���ʓI�Ȍ��m�B��";
			mes "��ԈقȂ镔���ł���B^000000";
			next;
			mes "^6A0000�m��ꂽ�ʂ�u���@�͂͊�{�I��";
			mes "�̓��Ŗ��͐������\�ȓK���ҒB��";
			mes "�������Ԃ̏C���ɂ����";
			mes "�g����悤�ɂȂ�v�Ƃ����ʐ���";
			mes "�j�����̂��u���[�����́v�ł���";
			mes "���̏ڍׂ́A�����Ɍ������ł���B^000000";
			next;
			mes "^6A0000�\�[�h�}�X�^�[�@�x���[�u��";
			mes "�������g�̗͂̌��E�������A";
			mes "�l�ԊE�̕����I�Ȑ������z������@��";
			mes "���������҂Ƃ��Ēm���Ă���B";
			mes "���ɏ\���N�O����ِ��E�̑��ݒB��";
			mes "�ڐG���Ă����悤���B^000000";
			next;
			mes "^6A0000���������N�ɂ�鎟������̎�����";
			mes "���̑��݂��m�F���ꂽ";
			mes "�ِ��E�̗d�����u���t�B�l���v��";
			mes "���[���i�C�g�̒a����";
			mes "�[���ւ���Ă���Ƃ����B^000000";
			next;
			mes "^6A0000�l�Ԍn�Ƃ͈قȂ鎩�R�I��";
			mes "���͂̐������\��";
			mes "�ِ��E�̐����̂��疂�͂̌����";
			mes "���߂���}�̂̌����ɂ����";
			mes "�K���҂ł͂Ȃ��Ă����͂�";
			mes "�g����悤�ɂȂ����̂��B^000000";
			next;
			mes "^6A0000���̌����̐��ʕ������[�����͂�";
			mes "���[���X�g�[���ł���B";
			mes "���̋����Ɩ��͂̒����𐬂�����";
			mes "�V�����͂���ɓ��ꂽ���m��";
			mes "�ނ̒�q�B�����[���i�C�g�Ƃ���";
			mes "���̐��Ɍ���邱�ƂɂȂ����B^000000";
			set '@book,'@book|1;
			next;
			continue;
		case 2:
			mes "^6A0000���[���X�g�[���ƌĂ΂���΂�";
			mes "���̉�����ĂȂ����͂Ƃ������`��";
			mes "���݂����߂āA���̐����𒼐�";
			mes "������悤�ɂ����}�̂ł���B^000000";
			next;
			mes "^6A0000���t�B�l���̌��҃Z���t�B�I�l��";
			mes "���[���i�C�g�̎n�c�ł���x���[�u��";
			mes "���Ɍ����������̌��ʂ��A����������";
			mes "�i��ł��閳���̃G�i�W�[���ł�����B^000000";
			next;
			mes "^6A0000�l�Ԍn�̐����̂Ƃ͈قȂ�";
			mes "��X���ِ��E�ƌĂ�";
			mes "�u�A�b�V���E�o�L���[���v��";
			mes "�����̂́A�傫���͂��ꂼ��قȂ邪";
			mes "���͂̌����̓��Ɏ����Ă���Ƃ���";
			mes "�_�ɒ��ڂ��A�l�Ă��ꂽ�G�i�W�[��";
			mes "�ۑ��@���ƒm���Ă���B^000000";
			next;
			mes "^6A0000���͂̌��򂩂�����o�������͂�";
			mes "���[���ɕς����Ƃ�";
			mes "���[���}�X�^���[�ƌĂ΂�鍂�ʂ�";
			mes "���[�����B�p�ɂ���ĉ\�ł���";
			mes "����̓x���[�u�Ɣނ̒�q�B�ł���";
			mes "���[���i�C�g�̌ŗL�X�L���Ƃ���";
			mes "�`������Ă���B^000000";
			set '@book,'@book|2;
			next;
			continue;
		case 3:
			if(CHANGE_RK == 9) {
				if(checkquest(104465)) {
					mes "�]���̖{�͂��łɓǂݏI�����";
					mes "�@�����͂����]";
					close;
				}
				else if('@book == 3) {
					misceffect 16,"";
					mes "�]�{��ǂݏI������B";
					mes "�@�m�����g�ɂ����悤�Ɏv���]";
					setquest 104465;
					close;
				}
			}
			mes "�]��������{�����ɖ߂����B";
			mes "�@�����͂܂���œǂ����]";
			close;
		}
	}
}

job3_rune01.gat,43,44,0	script	��ࣂ��鑕���̖{	844,{
	if(Job != Job_RuneKnight && CHANGE_RK < 9) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����ɁA�����̕��Ɏ���o�����Ƃ�";
		mes "���Ă����c�c���̓��e�����Ȃ���";
		mes "�����ł���̂�����H";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�͂͂́I";
		mes "���m�A�A���������ɂ��Ȃ����B";
		mes "�N������ɁA�����̕��ɐG���̂�";
		mes "��߂��ق���������";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	}
	mes "�]��Ɏ�����{�̕\���ɂ�";
	mes "�@^0000FF�w���[���̌����Ǝ�ށx^000000��";
	mes "�@�L�ڂ���Ă���]";
	next;
	while(1) {
		switch(select("�w���[���̌����x","�w���[���̎�ށx","�{�����̏ꏊ�ɖ߂�")) {
		case 1:
			mes "^6A0000���[���͈��̋L���Ƃ���";
			mes "���[���~�b�h�K�b�c������";
			mes "�a���ȑO���疧���Ɏg���Ă���";
			mes "��p�I�ȈӖ�������";
			mes "����̌n�Ƃ�������B^000000";
			next;
			mes "^6A0000���[���̑̌n�Ƃ��̈Ӗ��Ɋւ��Ă�";
			mes "���݁A���ڌ��y���ꂽ������";
			mes "�قƂ�ǎc���Ă��Ȃ���";
			mes "�Q�t�F���ƃW���m�[�̊w�ҒB��";
			mes "�A���i�x���c�̊w�ҒB�ɂ����";
			mes "��������Ă���B^000000";
			next;
			mes "^6A0000���[���͋L���̌n�Ƃ��Ă�";
			mes "���p����邪�A";
			mes "���`����Ă���b�ɂ��ƁA�肢��";
			mes "�l�Ԃ̐��݈ӎ��������o����p��";
			mes "�g�p����Ă����Ƃ�����������B^000000";
			next;
			mes "^6A0000���[���͓Ǝ��̑̌n�Ǝ�ނ�����";
			mes "�z��ɂ���ĐF��ȗ͂�";
			mes "�����o�����Ƃ��ł���Ƃ����B";
			mes "���̗͂ɂ��Ă�";
			mes "���݂̋Z�p�ł͑���ł��Ȃ��B^000000";
			next;
			mes "^6A0000���[���i�C�g�B�̓o��Ƌ���";
			mes "���j�̕���ɓo�ꂵ��";
			mes "���[���̉\����";
			mes "�m��I�ȑ��ʂŒ��ڂ���Ă��邪";
			mes "�g�p�҂ɂ���Ă͈��p�����\����";
			mes "���肦��Ƃ����_���w�E����Ă���B^000000";
			set '@book,'@book|1;
			next;
			continue;
		case 2:
			mes "^6A0000���[���͑S����25��̏������΂�";
			mes "�\������Ă���A�O������̏Ռ���";
			mes "�Ǝ�ȈׁA���̕ۊǂƎ�舵���ɂ�";
			mes "���ʂȒ��ӂ����߂���B^000000";
			next;
			mes "^6A000025��̃��[���B�͊e�X�̈Ӗ�������";
			mes "���̒���14��͋t�ʒu�ɂȂ�����";
			mes "�{���̗͂Ƃ͈Ⴄ�Ӗ���";
			mes "�����ƂɂȂ�B";
			mes "�l�X�ȃp�^�[���ɂ���O�ɂ��Ă�";
			mes "�����͕K�{�ƌ����悤�B^000000";
			next;
			mes "^6A0000����11��̃��[���͈ʒu�Ɋ֌W�Ȃ�";
			mes "��т����͂�������";
			mes "11�̐����[����14�̋t���[����";
			mes "���킹�āA25��̃��[�����ׂĂ�";
			mes "�}�X�^�[���Ȃ��Ɗ��S�ȗ͂�";
			mes "�����o�����Ƃ͂ł��Ȃ��B^000000";
			next;
			mes "^6A000011�̐����[���̒��ŋ󔒂̃��[����";
			mes "��O���[���Ƃ��Ĉ����B^000000";
			next;
			mes "^6A000025��̃��[���X�g�[���̖��O��";
			mes "���ɗ񋓂���B^000000";
			next;
			mes "^6A0000�G�C�V���A�I�V���A�}���i�Y�A";
			mes "�A���X�[���A�n�K���Y�A�J�m�A";
			mes "���C�]�A�X���T�Y�A�_�K�Y�A";
			mes "�\�E�B���A���N�X�A�C�X�A";
			mes "�y�I�[�X�A�x���J�i�A�Q�[�{�A";
			mes "�A���W�X�A�G�C���Y�A�e�C���Y�A^000000";
			next;
			mes "^6A0000�E���W���[�A�W�����A�i�E�V�Y�A";
			mes "�C���O�Y�A�t�F�I�A�E���Y�A";
			mes "�����ċ󔒂̃��[���ł���A�E�B�A�h�B^000000";
			set '@book,'@book|2;
			next;
			continue;
		case 3:
			if(CHANGE_RK == 9) {
				if(checkquest(104470)) {
					mes "�]���̖{�͂��łɓǂݏI�����";
					mes "�@�����͂����]";
					close;
				}
				else if('@book == 3) {
					misceffect 16,"";
					mes "�]�{��ǂݏI������B";
					mes "�@�m�����g�ɂ����悤�Ɏv���]";
					setquest 104470;
					close;
				}
			}
			mes "�]��������{�����ɖ߂����B";
			mes "�@�����͂܂���œǂ����]";
			close;
		}
	}
}

job3_rune01.gat,50,36,0	script	����Ȃ鑕���̖{	844,{
	if(Job != Job_RuneKnight && CHANGE_RK < 9) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "����ɁA�����̕��Ɏ���o�����Ƃ�";
		mes "���Ă����c�c���̓��e�����Ȃ���";
		mes "�����ł���̂�����H";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "�͂͂́I";
		mes "���m�A�A���������ɂ��Ȃ����B";
		mes "�N������ɁA�����̕��ɐG���̂�";
		mes "��߂��ق���������";
		close2;
		cutin "3rd_rune_knight",255;
		end;
	}
	mes "�]��Ɏ�����{�̕\���ɂ�";
	mes "�@^0000FF�w���[���X�g�[���̐���Ǝg�p�x^000000��";
	mes "�@�L�ڂ���Ă���]";
	next;
	while(1) {
		switch(select("�w���[���X�g�[���̐���x","�w���[���X�g�[���̏ڍׁx","�{�����̏ꏊ�ɖ߂�")) {
		case 1:
			mes "^6A0000���[���X�g�[���̓��[���i�C�g��";
			mes "���[���}�X�^���[�Ƃ���";
			mes "�ŗL�X�L���ɂ���Đ��삳���B";
			mes "���[���}�X�^���[�̓��[���i�C�g��";
			mes "�W���Ƃ��đ̓��ɓ��͂��ꂽ����";
			mes "�ŗL�p�X���[�h�Ɠ���̂��̂ł���B^000000";
			next;
			mes "^6A0000���[���i�C�g�łȂ��l�Ԃ�";
			mes "���ʂɐ������ꂽ�����ɏ]�����Ƃ�";
			mes "���[���̐����Ǝg�p���o����B";
			mes "�������A����̓��[�����M�F��";
			mes "�Ă΂��ŗL�̋@���K�v�Ƃ���B^000000";
			next;
			mes "^6A0000���M�F�𗘗p���A���[���X�g�[����";
			mes "��������ꍇ�́A���[�����M�F��";
			mes "���ꂽ���̓G�i�W�[�ɂ����";
			mes "��������郋�[���̎�ނ�";
			mes "���肳���B";
			mes "����͕ύX���s�\�ł���B^000000";
			next;
			mes "^6A0000���[���}�X�^���[�𗘗p��";
			mes "���[���X�g�[���𐶐�����ꍇ��";
			mes "�g�p�҂����ރ��[���̐�����";
			mes "�����ł��邪�A����̓��[���i�C�g";
			mes "�݂̂̌ŗL�\�͂Ƃ��ĕ��ނ���B^000000";
			next;
			mes "^6A0000�ِ��E�̖��̓G�i�W�[��";
			mes "�g�ɗ��߂���ԂŁA���[�����M�F��";
			mes "�쓮������Ƒ̓��̖��̓G�i�W�[��";
			mes "���[�����M�F��ʂ��������A";
			mes "���[���X�g�[���Ƃ��ĕϊ������B^000000";
			next;
			set '@book,'@book|1;
			next;
			continue;
		case 2:
			switch(select("��1��","��2��","��3��","��4��","�{�����̏ꏊ�ɖ߂�")) {
			case 1:
				mes "^6A0000�]�G�C�V���]";
				mes "���̃��[���͍m��I�ȗ͂̑���������";
				mes "���M�F�ł͐Ԃ������`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�I�V���]";
				mes "���̃��[���͓��������A����";
				mes "�u��������A��𓾂�v������";
				mes "�㉿��K�v�Ƃ���͂��Ӗ�����B";
				mes "���M�F�ł͎��F�̉~�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�}���i�Y�]";
				mes "���̃��[���͊�]��";
				mes "�V�����n�܂�������A";
				mes "��]�I�ȏ󋵂��t�]������";
				mes "�m��I�ȗ͂��Ӗ�����B";
				mes "���M�F�ł̓G�������h�F�̕H�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�A���X�[���]";
				mes "���̃��[���͏����������A���関����";
				mes "�s�������z����͂��Ӗ�����B";
				mes "���M�F�ł̓G�������h�F�̉~�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�n�K���Y�]";
				mes "���̃��[���͎��R������";
				mes "�S���ɒ�R����͂��Ӗ�����B";
				mes "���M�F�ł͋�F�̐��`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�J�m�]";
				mes "���̃��[���͉��Ə�M������";
				mes "�S�Ă��I��点��͂��Ӗ�����B";
				mes "���M�F�ł͐Ԃ��H�`�ɂȂ�B^000000";
				next;
				break;
			case 2:
				mes "^6A0000�]���C�]�]";
				mes "���̃��[���͌����ƍČ���������";
				mes "���S�̗͂��Ӗ�����B";
				mes "���M�F�ł͋�F�̎ΐ��`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�X���T�Y�]";
				mes "���̃��[���͌x��������";
				mes "�����̗͂��Ӗ�����B";
				mes "���M�F�ł͉��F�����`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�_�K�Y�]";
				mes "���̃��[���͍ċN�������A";
				mes "�t�������z����͂��Ӗ�����B";
				mes "���M�F�ł̓G�������h�F�̗����`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�\�E�B���]";
				mes "���̃��[���͏����Ɛ���������";
				mes "�����ƏI���̗͂��Ӗ�����B";
				mes "���M�F�ł͋�F�̐�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]���N�X�]";
				mes "���̃��[���͔ے������";
				mes "���ʂ����͂��Ӗ�����B";
				mes "���M�F�ł͉��F���H�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�C�X�]";
				mes "���̃��[���͒�~������";
				mes "�S�Ă��~�߂�͂��Ӗ�����B";
				mes "���M�F�ł͎��F�̗����`�ɂȂ�B^000000";
				next;
				break;
			case 3:
				mes "^6A0000�]�y�I�[�X�]";
				mes "���̃��[���͌[��������";
				mes "�@��̗͂��Ӗ�����B";
				mes "���M�F�ł͋�F�̗����`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�x���J�i�]";
				mes "���̃��[���͖L�����ƒa��������";
				mes "�h��Ɩh��̗͂��Ӗ�����B";
				mes "���M�F�ł͋��F�̐��`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�Q�[�{�]";
				mes "���̃��[���͋��͂�����";
				mes "���a�̗͂��Ӗ�����B";
				mes "���M�F�ł͉��F���~���`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�A���W�X�]";
				mes "���̃��[���͋@��ƒ���̗͂�";
				mes "�Ӗ�����B";
				mes "���M�F�ł̓G�������h�F�̎ΐ��`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�G�C���Y�]";
				mes "���̃��[���͕ω��ƌ���������";
				mes "�ړ��̗͂��Ӗ�����B";
				mes "���M�F�ł͊D�F�̕H�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�e�C���Y�]";
				mes "���̃��[���͊����ȏ���������";
				mes "��ΓI�ȉ������Ӗ�����B";
				mes "���M�F�ł͋��F�̉~�`�ɂȂ�B^000000";
				next;
				break;
			case 4:
				mes "^6A0000�]�E���W���[�]";
				mes "���̃��[���͌���������";
				mes "�m�b�̗͂��Ӗ�����B";
				mes "���M�F�ł̓G�������h�F�̐��`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�W�����]";
				mes "���̃��[���͋C�y��������";
				mes "�x���̗͂��Ӗ�����B";
				mes "���M�F�ł͉��F���~�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�i�E�V�Y�]";
				mes "���̃��[���͐��������";
				mes "�㉻�̗͂��Ӗ�����B";
				mes "���M�F�ł͉��F����`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�C���O�Y�]";
				mes "���̃��[���͕��������";
				mes "�����̗͂��Ӗ�����B";
				mes "���M�F�ł͎��F�̕H�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�t�F�I�]";
				mes "���̃��[���͎���������";
				mes "��̗͂��Ӗ�����B";
				mes "���M�F�ł͋�F�̉~�`�ɂȂ�B^000000";
				next;
				mes "^6A0000�]�E���Y�]";
				mes "���̃��[���͉^��������";
				mes "�S���̗͂��Ӗ�����B";
				mes "���M�F�ł͎��F�̎ΐ��`�ɂȂ�B^000000";
				next;
				break;
			case 5:
				continue;
			}
			set '@book,'@book|2;
			continue;
		case 3:
			if(CHANGE_RK == 9) {
				if(checkquest(104475)) {
					mes "�]���̖{�͂��łɓǂݏI�����";
					mes "�@�����͂����]";
					close;
				}
				else if('@book == 3) {
					misceffect 16,"";
					mes "�]�{��ǂݏI������B";
					mes "�@�m�����g�ɂ����悤�Ɏv���]";
					setquest 104475;
					close;
				}
			}
			mes "�]��������{�����ɖ߂����B";
			mes "�@�����͂܂���œǂ����]";
			close;
		}
	}
}

mid_camp.gat,238,250,3	script	���҂̎��R�m	468,{
	if(Job == Job_RuneKnight) {
		mes "[���҂���삷�郋�[���i�C�g]";
		mes "���҃Z���t�B�I�l�l�́A���[���i�C�g��";
		mes "�n�I�����ɂ��Ă���������B";
		next;
		mes "[���҂���삷�郋�[���i�C�g]";
		mes "���̕��̌䑤�Ɏd���邱�Ƃ�";
		mes "�I���̓��[���i�C�g�Ƃ��Ă�";
		mes "�ւ�����������Ă���B";
		close;
	}
	if(CHANGE_RK == 0) {
		mes "[���҂���삷�郋�[���i�C�g]";
		mes "���̕��̎���𖳈łɂ�������Ƃ�";
		mes "�������Ƃ͂ł��Ȃ��B";
		mes "��l��������������g�̂��߂����B";
		close;
	}
	else if(CHANGE_RK < 10) {
		mes "[���҂���삷�郋�[���i�C�g]";
		mes "�����g���҂�c�c�B";
		mes "�Ⴆ��X�Ǝ���������ގ҂��Ƃ��Ă�";
		mes "���̕��̎���𖳈łɂ�������Ƃ�";
		mes "�������Ƃ͂ł��Ȃ��B";
		close;
	}
	mes "[���҂���삷�郋�[���i�C�g]";
	mes "���[���i�C�g�̌�␶�Ɍ���";
	mes "���ʂȋ����Ȃ��Ƃ����Ԓn�ɑ؍݂���";
	mes "���Ƃ�������Ă���B";
	next;
	mes "[���҂���삷�郋�[���i�C�g]";
	mes "�N�����̒n�Ŏ��R�ɍs�����������";
	mes "�������ɋ��͂��A�M�C�𓾂Ȃ����";
	mes "�Ȃ�Ȃ����낤�B";
	close;
}

mid_camp.gat,235,250,3	script	���҃Z���t�B�I�l	435,{
	if(Job == Job_RuneKnight) {
		mes "[���҃Z���t�B�I�l]";
		mes "���Ȃ������h�ȃ��[���i�C�g�̈����";
		mes "�Ȃ����̂ł��ˁB";
		mes "���Ȃ��̖����ɏ����ł����ɗ����Ƃ�";
		mes "�ł��āA�ƂĂ��������v���܂��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���[���̗͂͊����ł͂���܂���B";
		mes "�����ɉ�����������Ă��Ȃ�";
		mes "�s���S�ȗ͂ł����c�c���̗͂𐧌䂵";
		mes "���W������̂́A���Ȃ��B�Ǝ���";
		mes "�S�����Ƃł��傤�B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�ǂ������ꂩ������i��ӂ炸";
		mes "���Ȃ��̖]�ތ��Ɏ���܂��悤�ɁB";
		close;
	}
	if(CHANGE_RK < 10) {
		mes "[���҃Z���t�B�I�l]";
		mes "���t�B�l���̎����A���Ȃ��B�l�Ԃ�";
		mes "���Ԓn�ɂ��邱�Ƃɋ^��������";
		mes "������悤�ł��ˁB";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���Ȃ����l���Ă��邸���ƈȑO����";
		mes "���B�͓���ȏ󋵉��ɂ�����";
		mes "�l�ԒB�ƐڐG������܂����B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�����܂��A��l�̐l�ԂƂ��݂��̈�";
		mes "���N�ԁA�𗬂����Ă��܂����B";
		mes "���̂��߁A���Ȃ��Ƃ���������";
		mes "���b���邱�Ƃ��ł���̂ł��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���ȊO�̃��t�B�l���Ɖ�b����ɂ�";
		mes "�������̌����|�󂷂邽�߂�";
		mes "�@�B���K�v�ƂȂ邱�Ƃł��傤�B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "����ȏ�̂��Ƃɂ��Ắc�c";
		mes "������͘b�����Ƃ͂ł��܂���B";
		mes "�����ł̍s���̎��R�͔F�߂���";
		mes "���܂����A���̐��E�Ɋւ��锭����";
		mes "��������Ă��܂��̂Łc�c�B";
		close;
	}
	switch(CHANGE_RK) {
	case 10:
		mes "[���҃Z���t�B�I�l]";
		mes "�悤�����B";
		mes "���[���i�C�g�̌�␶�̕��ł��ˁH";
		mes "�����Z���t�B�I�l�ł��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���Ȃ��̏o��������[���i�C�g�B��";
		mes "�݂�ȁA�x���[�u�Ǝ��̎t�����󂯂�";
		mes "��q�B�ł��B";
		mes "���Ȃ������̈�l�Ƃ����킯�ł��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���m�A����A���[���̊�b�͋�����";
		mes "��������Ǝv���܂����A����͎���";
		mes "���Ȃ�������`�����܂��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���[���i�C�g���g�p����";
		mes "���[���X�g�[���̖��͂́A��{�I��";
		mes "�l�ԊE�̖��͂ł͂���܂���B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "����́A���̐��E�c�c";
		mes "���Ȃ��B�̓A�b�V���E�o�L���[���ƌĂ�";
		mes "���B�̐��E�c�c";
		mes "�A�[���u�w�C���ō��ꂽ���͂ł��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���̒n�̐����́A�l�Ԑ��E�̐����Ƃ�";
		mes "�قȂ�A�̓��ɖ��͂��G�i�W�[��";
		mes "�`�ɂ��ĕۗL���Ă��܂��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���[���X�g�[���̖��͂Ƃ����̂�";
		mes "���̐��E�̐������ۗL����";
		mes "���̓G�i�W�[�����[���Ƃ����ʂ̌`��";
		mes "�ς��Ďg�p�ł���悤�ɂ������́B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�܂�A���[���X�g�[�����g�p����ɂ�";
		mes "�ِ��E�̐����ɑ΂��闝����";
		mes "�K�v�ƂȂ�̂ł��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�������c�c���̒n�̐�������";
		mes "���̓G�i�W�[���W�߂�ɂ�";
		mes "���̂��Ȃ��ɂ͏��X�d�ׂ��Ǝv���܂��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�����ŁA���ꂩ�炠�Ȃ��̑̂�";
		mes "��������̖��̓G�i�W�[�����߂閂�@��";
		mes "�����Ă����܂��B";
		next;
		misceffect 58,"";
		mes "�]�Z���t�B�I�l�͉������������B";
		mes "�@�s�v�c�Ȍ����̂��ݍ��񂾁]";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�����܂ňꎞ�I�ł͂���܂���";
		mes "�l�ԊE�̎v�O�̂�|�����Ƃ�";
		mes "���̓G�i�W�[�𓾂邱�Ƃ��ł��܂��B";
		mes "���̃G�i�W�[���A���̂܂܎g�����Ƃ�";
		mes "�o���Ȃ��̂ł����ǁc�c�B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "^0000FF�ł́A�����w�肷��l�Ԑ��E��";
		mes "�v�O�̂�|���āA�G�i�W�[��";
		mes "�W�߂Ă��Ă��炢�܂��B^000000";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�����ł��ˁc�c���Ȃ��B�̐��E�ł�";
		mes "���҂��W�܂�^0000FF�j�u���w�C��^000000�Ƃ���";
		mes "�ꏊ������ƕ����܂����B";
		mes "������f�r���ҒB�̃G�i�W�[��";
		mes "�[���Ȗ��͂̌���ƂȂ�܂��B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "^0000FF�f�����n��2��^000000�A";
		mes "^0000FF�f�B�X�K�C�Y2��^000000�A";
		mes "^0000FF�L���[�u2��^000000��|��";
		mes "�G�i�W�[���W�߂ė��ĉ������B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "�G�i�W�[���W�ߏI�������";
		mes "���m�A�ɗ��߂΁A�Ăю��̌���";
		mes "�]�����Ă����ł��傤�B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "��ɂ��`�����܂����A���͂��Ȃ���";
		mes "���i�𔻒f���邱�Ƃ͂��܂���B";
		mes "���f�͂��Ȃ��̐�y�ł��鑼��";
		mes "���[���i�C�g�B�����邱�Ƃł�����B";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "����ł͊撣���Ă��������B";
		mes "���������������Ƃ�����܂�����";
		mes "�����|���ĉ������ˁB";
		set CHANGE_RK,11;
		chgquest 3207,3208;
		setquest 3209;
		setquest 3210;
		setquest 3211;
		close;
	case 11:
		mes "[���҃Z���t�B�I�l]";
		mes "���̓G�i�W�[�͏W�܂�܂������H";
		mes "����Ƃ������������Ƃł�����܂����H";
		next;
		switch(select("���̓G�i�W�[���W�߂܂���","�|���ׂ��G��������","���[���i�C�g�W���n�ɖ߂肽��","��b����߂�")) {
		case 1:
			mes "[���҃Z���t�B�I�l]";
			mes "�킩��܂����B";
			mes "����ł́A�m�F���܂��傤�B";
			next;
			if(checkquest(3209)&4 == 0 || checkquest(3210)&4 == 0 || checkquest(3211)&4 == 0) {
				emotion 9;
				mes "[���҃Z���t�B�I�l]";
				mes "�c�c�܂�����Ă��Ȃ��悤�ł��B";
				mes "���ɐi�ނ��߂ɕK�v�Ȗ��̓G�i�W�[��";
				mes "�W�߂��Ă��܂����B";
				next;
				mes "[���҃Z���t�B�I�l]";
				mes "�撣���ĖڕW��B�����Ă���";
				mes "���̂Ƃ���ɗ��ĉ������ˁB";
				close;
			}
			emotion 33;
			mes "[���҃Z���t�B�I�l]";
			mes "�܂��A���΂炵���I";
			mes "�[���ȗʂ̖��̓G�i�W�[�����Ȃ��̑̂�";
			mes "�~�ς���Ă��܂��B";
			next;
			mes "[���҃Z���t�B�I�l]";
			mes "���ꂾ������΁A^0000FF���m�A��";
			mes "���[���X�g�[���̐����ɂ���";
			mes "�����Ă����͂��ł��B^000000";
			next;
			mes "[���҃Z���t�B�I�l]";
			mes "���̖����͂���ŏI���ł��B";
			mes "���[���i�C�g�Ƃ��Đ��܂�ς����";
			mes "���Ȃ��ɍĉ�ł���悤";
			mes "�F���Ă��܂��B";
			next;
			mes "[���҃Z���t�B�I�l]";
			mes "���̒n�ł̗p�����ς�ł���̂ł�����";
			mes "���[���i�C�g�W���n�ɑ���܂��傤�B";
			mes "�������ł�����A�b�������ĉ������ˁB";
			set CHANGE_RK,12;
			chgquest 3208,3213;
			delquest 3209;
			delquest 3210;
			delquest 3211;
			close;
		case 2:
			mes "[���҃Z���t�B�I�l]";
			mes "���Ȃ��B�̐��E�ł�";
			mes "���҂��W�܂�^0000FF�j�u���w�C��^000000�Ƃ���";
			mes "�ꏊ������ƕ����܂����B";
			mes "������f�r���ҒB�̃G�i�W�[��";
			mes "�[���Ȗ��͂̌���ƂȂ�܂��B";
			next;
			mes "[���҃Z���t�B�I�l]";
			mes "^0000FF�f�����n��2��^000000�A";
			mes "^0000FF�f�B�X�K�C�Y2��^000000�A";
			mes "^0000FF�L���[�u2��^000000��|��";
			mes "�G�i�W�[���W�߂ė��ĉ������B";
			close;
		case 3:
			mes "[���҃Z���t�B�I�l]";
			mes "���]�݂ł���΁A�����ɂ����肵�܂��B";
			mes "�������A�������p�����邽�߂ɂ�";
			mes "�Ăю��̏��ɗ��Ă��������K�v��";
			mes "����܂���B";
			next;
			mes "[���҃Z���t�B�I�l]";
			mes "���������[���i�C�g�W���n��";
			mes "�߂�܂����H";
			next;
			if(select("�߂�܂�","�܂��߂�܂���") == 2) {
				mes "[���҃Z���t�B�I�l]";
				mes "�������ł�����b�������Ă��������B";
				close;
			}
			mes "[���҃Z���t�B�I�l]";
			mes "����ł͑���܂��B";
			close2;
			warp "job3_rune01.gat",80,65;
			end;
		case 4:
			mes "[���҃Z���t�B�I�l]";
			mes "�����������Ƃ�����܂�����";
			mes "���ł����ĉ������ˁB";
			close;
		}
	case 12:
		mes "[���҃Z���t�B�I�l]";
		mes "���[���i�C�g�W���n�ɖ߂�";
		mes "�����͂ł��܂������H";
		next;
		if(select("�߂�܂�","�܂��������o���Ă��܂���") == 2) {
			mes "[���҃Z���t�B�I�l]";
			mes "�������ł�����b�������Ă��������B";
			close;
		}
		mes "[���҃Z���t�B�I�l]";
		mes "����ł͑���܂��B";
		close2;
		warp "job3_rune01.gat",80,65;
		end;
	default:
		mes "[���҃Z���t�B�I�l]";
		mes "�����͏����ł����H";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���������āA���Ȃ��͉���";
		mes "�Ԉ������ԂŁA�����ɗ����̂ł�";
		mes "����܂��񂩁H";
		next;
		mes "[���҃Z���t�B�I�l]";
		mes "���Ȃ�������ׂ��ꏊ�c�c�B";
		mes "���[���i�C�g�W���n�ɑ���܂��傤�B";
		next;
		if(select("�������߂�܂�","�܂��A�����ɗp������܂�") == 2) {
			mes "[���҃Z���t�B�I�l]";
			mes "�p���ς񂾂玄�ɘb�������Ă��������B";
			close;
		}
		mes "[���҃Z���t�B�I�l]";
		mes "����ł͑���܂��B";
		close2;
		warp "job3_rune01.gat",80,65;
		end;
	}
}


job3_rune01.gat,58,51,0	script	�Α��̓�̌�	844,{
	if(CHANGE_RK != 13) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�����͏���ɐG��Ȃ��ق����������B";
		mes "�c�c��k����ς܂Ȃ�����B";
		close;
	}
	mes "�]���m�A�̌��ɗ������";
	mes "�@���[���i�C�g���̑�����";
	mes "�@���قǂ̑傫���̌���������B";
	mes "�@�m������́A�{�œǂ�";
	mes "�@�ʎY�^���[���X�g�[���̉��M�F���]";
	next;
	if(select("���[���X�g�[���̐������n�߂�","�������Ȃ�") == 2) {
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "���[���X�g�[������鏀�����o������";
		mes "���̉��M�F���g���Ȃ����B";
		close;
	}
	mes "�]���[���̖��͂��h��";
	mes "�@���M�F�ŏ��X�Ɍ`�𐬂��Ă����]";
	next;
	switch(rand(24)) {
	case 0:  set '@rune$,"�G�C�V��";   mes "�]�Ԃ������`�ŔR������";           break;
	case 1:  set '@rune$,"�I�V��";     mes "�]���F�̉~�`�ŔR������";           break;
	case 2:  set '@rune$,"�}���i�Y";   mes "�]�G�������h�F�̕H�`�ŔR������";   break;
	case 3:  set '@rune$,"�A���X�[��"; mes "�]�G�������h�F�̉~�`�ŔR������";   break;
	case 4:  set '@rune$,"�n�K���Y";   mes "�]��F�̐��`�ŔR������";           break;
	case 5:  set '@rune$,"�J�m";       mes "�]�Ԃ��H�`�ŔR������";             break;
	case 6:  set '@rune$,"���C�]";     mes "�]��F�̎ΐ��`�ŔR������";         break;
	case 7:  set '@rune$,"�X���T�Y";   mes "�]���F�����`�ŔR������";           break;
	case 8:  set '@rune$,"�_�K�Y";     mes "�]�G�������h�F�̗����`�ŔR������"; break;
	case 9:  set '@rune$,"�\�E�B��";   mes "�]��F�̐�`�ŔR������";           break;
	case 10: set '@rune$,"���N�X";     mes "�]���F���H�`�ŔR������";           break;
	case 11: set '@rune$,"�C�X";       mes "�]���F�̗����`�ŔR������";         break;
	case 12: set '@rune$,"�y�I�[�X";   mes "�]��F�̗����`�ŔR������";         break;
	case 13: set '@rune$,"�x���J�i";   mes "�]���F�̐��`�ŔR������";           break;
	case 14: set '@rune$,"�Q�[�{";     mes "�]���F���~���`�ŔR������";         break;
	case 15: set '@rune$,"�A���W�X";   mes "�]�G�������h�F�̎ΐ��`�ŔR������"; break;
	case 16: set '@rune$,"�G�C���Y";   mes "�]�D�F�̕H�`�ŔR������";           break;
	case 17: set '@rune$,"�e�C���Y";   mes "�]���F�̉~�`�ŔR������";           break;
	case 18: set '@rune$,"�E���W���["; mes "�]�G�������h�F�̐��`�ŔR������";   break;
	case 19: set '@rune$,"�W����";     mes "�]���F���~�`�ŔR������";           break;
	case 20: set '@rune$,"�i�E�V�Y";   mes "�]���F����`�ŔR������";           break;
	case 21: set '@rune$,"�C���O�Y";   mes "�]���F�̕H�`�ŔR������";           break;
	case 22: set '@rune$,"�t�F�I";     mes "�]��F�̉~�`�ŔR������";           break;
	case 23: set '@rune$,"�E���Y";     mes "�]���F�̎ΐ��`�ŔR������";         break;
	}
	mes "�@���̃��[���X�g�[���̖��͊m���c�c�]";
	next;
	input '@str$;
	if('@rune$ != '@str$) {
		if(rand(6)) {
			misceffect 306,"";
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "���R�̌��ʂ�B";
			mes "�C���[�W�������[���X�g�[����";
			mes "�F���̃��[���X�g�[�����قȂ��";
			mes "��������m���͋ɂ߂ĒႭ�Ȃ�B";
			next;
			emotion 54,"���m�A#RK";
			mes "[�g�@�̃��[���i�C�g�@���m�A]";
			mes "���[���X�g�[���̐����͎��s��B";
			mes "�͂��A����������āB";
			close;
		}
		misceffect 305,"";
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�^��������ˁB";
		mes "�C���[�W�������[���X�g�[����";
		mes "�F���̃��[���X�g�[�����Ⴄ���̂�����";
		mes "����ɐ������ꂽ��B";
		mes "����ȃP�[�X�͋H�����ǂˁc�c�B";
		next;
	}
	else {
		misceffect 305,"";
		mes "[�g�@�̃��[���i�C�g�@���m�A]";
		mes "�Ӂ[��c�c�f���炵����ˁB";
		mes "�C���[�W�������[���X�g�[����";
		mes "�F���̃��[���X�g�[������v�����̂ˁB";
		next;
	}
	emotion 33,"���m�A#RK";
	mes "[�g�@�̃��[���i�C�g�@���m�A]";
	mes "���[���X�g�[���@1��";
	mes "�������������ꂽ���Ƃ��m�F������B";
	set CHANGE_RK_RUNE,CHANGE_RK_RUNE + 1;
	if(CHANGE_RK_RUNE == 2) {
		mes " ";
		mes "�]���[���X�g�[����2���������B";
		mes "�@���m�A�ɕ񍐂��悤�]";
		chgquest 3214,104485;
	}
	close;
}

//============================================================
// �ŏI����
//------------------------------------------------------------
job3_rune01.gat,114,50,3	script	�x���t�B�[�m	468,{
	if(Job == Job_RuneKnight) {
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�I�����炷��΁A���O�͂܂��܂�";
		mes "�V�Ẵ��[���i�C�g���B";
		mes "�ߐM�����A���̗͂𖁂��������B";
		close;
	}
	switch(CHANGE_RK) {
	default:
		mes "�]���̓V�ӂ��瑫�̒ܐ�܂ō���F��";
		mes "�@�₽���C�z������[���i�C�g��";
		mes "�@������̗l�q�����������Ă���]";
		next;
		mes "�]���[���i�C�g�Ƃ����̂�";
		mes "�@�����邳���Đ��i�������҂�";
		mes "�@���邢�́A�����ŎE���Ƃ����҂���";
		mes "�@���Ȃ��̂�������Ȃ��]";
		next;
		cutin "3rd_rune_knight",2;
		mes "[�}�X�^�[�@�e�B�O���[�X]";
		mes "���A�����c�c����������Ă��Ȃ����H";
		mes "�I���͌����邳�����Ȃ���";
		mes "�E���Ƃ��Ă���킯�ł��Ȃ�����H";
		next;
		cutin "3rd_rune_knight",255;
		mes "�]�󎨂����������悤�ȋC������]";
		close;
	case 15:
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�I���̂Ƃ���ɗ����␶���c�c";
		mes "�v�X���ȁB";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�����܂ł̎�����˔j�������Ƃɂ���";
		mes "���߂łƂ��A�ƌ����Ă������B";
		mes "���ꂩ��ŏI�������s����";
		mes "���O�͂��łɊ�{������Ă����";
		mes "�l�������Ă��炤���B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�Ƃ����Ă��A�ŏI�����͊ȒP���B";
		mes "^0000FF���ꂩ��o������ɓ����Ă��炤�B^000000";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "���O�����[���i�C�g�ɂȂ�ړI�͂Ȃ񂾁H";
		next;
		menu "���p���ɂ߂�",-,"�h���S���𑀂�",-,"���[��������",-,"���Ԃ����",-;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�c�c";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�c�c�ЂƂ܂����i�B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "���[���i�C�g�ɂȂ��";
		mes "�ł��鎖�̕����L����B";
		mes "����̂ɊF�A��������̖ړI��������";
		mes "���[���i�C�g�ɂȂ���̂��B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�����A��������";
		mes "�ړI���������Ă��܂��悤�Ȃ�";
		mes "���O�Ƃ��O�̃��[���̋P����";
		mes "�����Ă��܂����낤�B";
		mes "�����ɍ��i�������Ƃ��A";
		mes "����܂ł̌o�����S�Ă����ɕԂ��Ǝv���B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "���S�����܂ł��Y���ȁB";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "����Ŏ����͑S�ďI�����B";
		mes "�c�c�Ȃ񂾁A���q�������Ă���̂��H";
		mes "^0000FF�e�B�O���[�X�}�X�^�[�ɕ񍐂�^000000";
		mes "���[���i�C�g�Ƃ��ĐV�������܂�ς��";
		mes "�����𖡂���Ă���Ƃ����B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�{���ɂ��߂łƂ��B";
		mes "���ꂶ�Ⴀ�A�I���͑��̌�␫�ׂ̈�";
		mes "�d�����ĊJ����Ƃ��悤�B";
		set CHANGE_RK,16;
		chgquest 3216,3219;
		close;
	case 16:
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "����Ŏ����͑S�ďI�����B";
		mes "^0000FF�e�B�O���[�X�}�X�^�[�ɕ񍐂�^000000";
		mes "���[���i�C�g�Ƃ��ĐV�������܂�ς��";
		mes "�����𖡂���Ă���Ƃ����B";
		next;
		mes "[�����̃��[���i�C�g�@�x���t�B�[�m]";
		mes "�{���ɂ��߂łƂ��B";
		mes "���ꂶ�Ⴀ�A�I���͑��̌�␫�ׂ̈�";
		mes "�d�����ĊJ����Ƃ��悤�B";
		close;
	}
}

//============================================================
// �h���S���Ǘ���
//------------------------------------------------------------
prontera.gat,129,212,5	script	�h���S���Ǘ���	105,{
	if(Job != Job_RuneKnight && Job != Job_DragonKnight) {
		mes "[�h���S���Ǘ���]";
		mes "���̌�p�ł����H";
		mes "���Ȃ��̓h���S���̗��p��";
		mes "�ł��Ȃ��E�Ƃł��B";
		close;
	}
	mes "[�h���S���Ǘ���]";
	mes "��������Ⴂ�܂��B";
	mes "�h���S���������p�ł����H";
	next;
	if(select("���p����","��߂�") == 2) {
		mes "[�h���S���Ǘ���]";
		mes "�����ł����B�ł́c�c";
		close;
	}
	if(checkdragon()) {
		mes "[�h���S���Ǘ���]";
		mes "���Ƀh���S���ɏ����";
		mes "��������Ⴂ�܂��ˁB";
		close;
	}
	if(sc_ison(SC_ALL_RIDING)) {
		mes "�]�R�搶���𗘗p������Ԃł�";
		mes "�@�i�s�ł��܂���B";
		mes "�@�R�搶������~��Ă��������]";
		close;
	}
	if(getskilllv(63) < 1) {
		mes "[�h���S���Ǘ���]";
		mes "�c�c�܂��h���S���ɂ�";
		mes "���Ȃ��悤�ł��ˁB";
		mes "�X�L���u���C�f�B���O�v��";
		mes "�o���Ă��炨�z�����������B";
		close;
	}
	setdragon;
	close;
}

//============================================================
// ���[�����Δ̔���
//------------------------------------------------------------
prontera.gat,168,228,3	script	���[�����Δ̔���#pro	853,{
	mes "[���[�����Δ̔���]";
	mes "���Ȃ��͂��������āA";
	mes "���[�����΂������߂ł�����!?";
	mes "�@";
	mes "���Ȃ�A�������΂������肵�܂���B";
	next;
	switch(select("�����ȃ��[�����΂𔃂�","��ʓI�ȃ��[�����΂𔃂�")) {
	case 1:
		mes "[���[�����Δ̔���]";
		mes "�قف`�A����͂��ڂ������I";
		mes "�����ȃ��[�����΂ł��ȁB";
		set '@price,2500;
		set '@gain,12734;
		break;
	case 2:
		mes "[���[�����Δ̔���]";
		mes "���`�A���Ɍ����ȕ��ł��ȁI";
		mes "��ʓI�ȃ��[�����΂������߂Ƃ́B";
		set '@price,1000;
		set '@gain,12737;
		break;
	}
	mes "���̌��΂�1�� "+ '@price +"Zeny��";
	mes "�����肵�܂��傤�I";
	mes "2000�܂łȂ�A1�x�œn���܂��傤�B";
	mes "���������܂����ȁH";
	next;
	input '@num;
	if('@num == 0) {
		mes "[���[�����Δ̔���]";
		mes "����A�����ł����B";
		mes "�c�O�ł��ȁB";
		mes "���������Ȃ�����A";
		mes "�܂����z�����������B";
		close;
	}
	if('@num < 1 || '@num > 2000) {
		mes "[���[�����Δ̔���]";
		mes "���q����A��k�ł��傤�B";
		mes "�����Ɛ��������Ă����Ȃ���";
		mes "�p�ӂł��܂����B";
		mes "1�x�ł�����ł���̂�";
		mes "1�`2000�ł�����ȁB";
		close;
	}
	if(Zeny < '@price*'@num) {
		mes "[���[�����Δ̔���]";
		mes "���₨��H";
		mes "���q����A����܂��ȁ`";
		mes "Zeny������܂����B";
		mes "�������蕥���Ă����Ȃ���";
		mes "��������������ł�����ȁB";
		mes "������p�ӂ��āA�܂����Ă��������B";
		close;
	}
	if(checkitemblank() == 0) {
		mes "[���[�����Δ̔���]";
		mes "������!?";
		mes "���q����A������Ɖו���";
		mes "��������悤�ł��ȁB";
		mes "����ł́A�w������";
		mes getitemname('@gain) +"��n�������ɂȂ��B";
		mes "�g�y�ɂ��Ă���A�܂����Ă��������B";
		close;
	}
	if(checkweight('@gain,'@num) == 0) {
		mes "[���[�����Δ̔���]";
		mes "������!?";
		mes "���q����A������Ɖו���";
		mes "�d�߂���悤�ł��ȁB";
		mes "����ł́A�w������";
		mes getitemname('@gain)+ "��n�������ɂȂ��B";
		mes "�g�y�ɂ��Ă���A�܂����Ă��������B";
		close;
	}
	set Zeny,Zeny - '@price * '@num;
	getitem '@gain,'@num;
	mes "[���[�����Δ̔���]";
	mes "���x���肪�����ł��ȁB";
	mes "�܂��̂����p�A";
	mes "���҂����Ă���܂���B";
	close;
}
