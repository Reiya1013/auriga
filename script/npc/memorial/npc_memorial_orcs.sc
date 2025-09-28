//= Auriga Script ==============================================================
// Ragnarok Online Orc's Memory Script	by Blaze
//- Registry -------------------------------------------------------------------
// ORCS_1QUE -> 0�`3
//==============================================================================

//============================================================
// �N�G�X�gNPC
//------------------------------------------------------------
gef_fild10.gat,238,202,6	script	��̌�����	865,{
	if(Job == Job_Summoner || Job == Job_SpiritHandler) {
		mes "[��̌�����]";
		mes "���O�A^ff0000�h����^000000���ȁB";
		mes "�l�ԈȊO���G���";
		mes "���Ȍ��ۂ����������˂�B";
		mes "�������֍s���I";
		close;
	}
	switch(ORCS_1QUE) {
	case 0:
		mes "[��̌�����]";
		mes "�N�b�N�c�c�I";
		mes "�n�@�[�b�n�b�n!!";
		mes "�I�[�N�ǂ��߁A���Ɏw��{";
		mes "�G����Ȃ��悤���ȁc�c�I";
		mes "��͂�^0000ff���Ԃ̐�^000000�̗͂͑f���炵���c�c�I";
		next;
		if(select("�I�[�N���G����Ȃ��H","�i�Ȃ񂾂��̐l�c�c�j") == 2) {
			mes "[��̌�����]";
			mes "�Ȃ񂾁A���O�́H";
			mes "����ȖڂŎ�������ȁI";
			mes "�������s���I";
			mes "�V�b�V�b!!";
			close;
		}
		mes "[��̌�����]";
		mes "������[�H";
		mes "�Ȃ񂾁A����������̂��H";
		next;
		mes "[��̌�����]";
		mes "�N�N�N�c�c�M�����������������c�c";
		mes "���������N�̒��������Ă������A";
		mes "�����̋��ԂłƂ���z�΂����������B";
		mes "�����Ă��̍z�΂ɂ�";
		mes "���܂����͂���߂��Ă��邱�Ƃ�";
		mes "�킩�����̂��I";
		next;
		menu "�����̋��ԂŁc�c�H",-;
		mes "[��̌�����]";
		mes "�����A�����̋��ԂŌ��������z��";
		mes "�����Ԃ𒴉z�����ꏊ��";
		mes "�e����^����c�c�H";
		mes "�������͉e�����󂯂��̂��c�c�H";
		mes "�ڂ����͂킩��񂪁A�Ƃɂ���";
		mes "���̐΂̗͎͂����𒴂���̂��I";
		next;
		mes "[��̌�����]";
		mes "���͂��������A�����";
		mes "���ԗ��s���݂����Ƃ��o�������B";
		mes "�����ɂ���Α����킩�邩�H";
		mes "�����ɂ͌���Ȋw�̐���";
		mes "�����̋��Ԃ̍z�΂����͂�";
		mes "�����x���ŗZ�������Ă���c�c";
		next;
		mes "[��̌�����]";
		mes "�ǂ����A���O��";
		mes "���ԗ��s�����Ă݂Ȃ����H";
		next;
		menu "������ĕs���Ȏ����ł���ˁH",-;
		mes "[��̌�����]";
		mes "�������s�����I";
		next;
		mes "[��̌�����]";
		mes "�������ꂪ�����H";
		mes "����قǂ܂łɌ����҂Ƃ�����������";
		mes "������������f�ނ��ڂ̑O�ɂ���I";
		mes "������I�@�{�\�I�ɁI";
		mes "�������邱�Ƃ͊Ԉ���Ă��Ȃ��I";
		next;
		mes "[��̌�����]";
		mes "�N�b�N�b�N�A �܂�����Ă݂�I";
		mes "�ʔ������I";
		mes "�I�[�N�ǂ��Ƙb���o���邼�A�n�n�n�I";
		next;
		if(BaseLevel < 30) {
			mes "[��̌�����]";
			mes "�c�c�Ǝv�������c�c";
			mes "���O�A^ff0000���x����30����^000000���ȁB";
			mes "����Ȃ񂶂᎟���𒴂���͂�";
			mes "�ς�����B";
			mes "�����玄�ł����s���邱�Ƃ�";
			mes "�킩���Ă��邱�Ƃ�E�߂�ɂ͂Ȃ��I";
			close;
		}
		if(BaseLevel > 80) {
			mes "[��̌�����]";
			mes "�c�c�Ǝv�������c�c";
			mes "���O�A^ff0000���x����81�ȏ�^000000���ȁB";
			mes "����܂肨�O�̗͂����������";
			mes "���Ȍ��ۂ����������˂�B";
			mes "�������ɂ����͂܂�������ȁB";
			mes "������߂�I";
			close;
		}
		if(select("���Ⴀ�A���Ă݂܂�","�c�c���������̂͋��ł�") == 2) {
			mes "[��̌�����]";
			mes "�܂��I";
			mes "���O�͖{���ɂ܂��I";
			close;
		}
		mes "[��̌�����]";
		mes "�����肪��������Ȃ����I";
		mes "�����A�����̐Α��ɐG��邪�����B";
		mes "�I�[�N�ǂ��̉ߋ��̌���";
		mes "���\���邪�����I";
		mes "�N�N�N�I";
		set ORCS_1QUE, 1;
		close;
	case 1:
		mes "[��̌�����]";
		mes "��H�@�Ȃ񂾁H";
		mes "���ԗ��s�����Ă݂������";
		mes "�����̐Α��ɐG��邪�����B";
		mes "�I�[�N�ǂ��̉ߋ��̌���";
		mes "���\�ł��邼�I";
		mes "�N�N�N�I";
		next;
		if (select("�킩��܂���","������x�������Ă�������") == 1) {
			mes "[��̌�����]";
			mes "�����肪��������Ȃ����I";
			mes "�N�N�N�I";
			close;
		}
		mes "[��̌�����]";
		mes "�͂��������[�H";
		mes "�߂�ǂ������z���ȁI";
		next;
		mes "[��̌�����]";
		mes "�������c�c�M�����������������c�c";
		mes "���������N�̒��������Ă������A";
		mes "�����̋��ԂłƂ���z�΂����������B";
		mes "�����Ă��̍z�΂ɂ�";
		mes "���܂����͂���߂��Ă��邱�Ƃ�";
		mes "�킩�����̂��I";
		next;
		mes "[��̌�����]";
		mes "�����̋��ԂŌ��������z�΁c�c";
		mes "�����Ԃ𒴉z�����ꏊ��";
		mes "�e����^����c�c�H";
		mes "�������͉e�����󂯂��̂��c�c�H";
		mes "�ڂ����͂킩��񂪁A�Ƃɂ���";
		mes "���̐΂̗͎͂����𒴂���̂��I";
		next;
		mes "[��̌�����]";
		mes "���͂��������A�����";
		mes "���ԗ��s���݂����Ƃ��o�������B";
		mes "�����ɂ���Α����킩�邩�H";
		mes "�����ɂ͌���Ȋw�̐���";
		mes "�����̋��Ԃ̍z�΂����͂�";
		mes "�����x���ŗZ�������Ă���c�c";
		next;
		mes "[��̌�����]";
		mes "�������g���΂��O��";
		mes "���ԗ��s���o����Ƃ����킯���B";
		next;
		mes "[��̌�����]";
		mes "�������I";
		mes "���ԗ��s���o����̂�";
		mes "���x��30�`80�܂ł̐l�ԂɌ���I";
		mes "�シ�����玟���𒴂���͂�";
		mes "�ς����Ȃ����A";
		mes "�������Ă��ςȌ��ۂ��N�����˂�B";
		next;
		mes "[��̌�����]";
		mes "���ꂾ���@�ׂ��Ă��Ƃ�";
		mes "�����͈ȏゾ�I";
		mes "�����������H";
		close;
	case 2:
		mes "[��̌�����]";
		mes "�����A�ǂ��������H";
		mes "���ԗ��s�͊y�����������H";
		mes "�������Ԃɂ����s���Ȃ�����ȁA";
		mes "�������Ă������̂Ɠ����W�J��";
		mes "���Ă����񂾂낤�B";
		mes "�I�[�N�ǂ��̖��ȉ������ȁB";
		next;
		menu "�c�c�ߋ��ɂ������������H",-;
		mes "[��̌�����]";
		mes "�����ȁA����͎��ɕ�����Ă�����B";
		mes "���Ȃ��Ƃ��c�c";
		mes "�ߋ��ɃI�[�N�̛ޏ��Ƃ������̂Ƃ�";
		mes "��K�͂Ȑ퓬���������c�c";
		mes "�Ƃ������Ƃ��ȁB";
		next;
		mes "[��̌�����]";
		mes "����ɓ˂�����ł�����";
		mes "�|�ꂽ�I�[�N�̖����ޏ��c�c�H";
		mes "�܂��o�܂͂킩��񂪁B";
		mes "�����̉��l�͂��肻�����ȁc�c";
		mes "�N�N�N�c�c�I";
		next;
		menu "�c�c�c�c�c",-;
		mes "[��̌�����]";
		mes "���x�ł����ɍs���邼�B";
		mes "�ߋ��ɋN�������Ƃ�����ȁB";
		mes "���肪���Ȑ푈���c�c";
		mes "���x�����鉿�l�����邩��";
		mes "�m��Ȃ����ˁc�c�N�N�N�B";
		close;
	case 3:
		mes "[��̌�����]";
		mes "�����A�ǂ��������H";
		mes "���ԗ��s�͊y�����������H";
		mes "�������Ԃɂ����s���Ȃ�����ȁA";
		mes "�������Ă������̂Ɠ����W�J��";
		mes "���Ă����񂾂낤�B";
		mes "�I�[�N�ǂ��̖��ȉ������ȁB";
		next;
		menu "�c�c�኱�������ς��܂�����",-;
		mes "[��̌�����]";
		mes "�ق��H�@�܂������͕ς�邾�낤�ȁB";
		mes "�����A���ʂ͕ς��Ȃ����낤�B";
		mes "���Ȃ��Ƃ��c�c";
		mes "�ߋ��ɃI�[�N�̛ޏ��Ƃ������̂Ƃ�";
		mes "��K�͂Ȑ퓬���������c�c";
		mes "�Ƃ������ʂ́B";
		next;
		mes "[��̌�����]";
		mes "���ł���Ȃ��ƂɂȂ����̂���";
		mes "�悭������񂪁B";
		mes "�����̉��l�͂��肻�����ȁc�c";
		mes "�N�N�N�c�c�I";
		next;
		menu "�c�c�c�c�c",-;
		mes "[��̌�����]";
		mes "���x�ł����ɍs���邼�B";
		mes "�ߋ��ɋN�������Ƃ�����ȁB";
		mes "���肪���Ȑ푈���c�c";
		mes "���x�����鉿�l�����邩��";
		mes "�m��Ȃ����ˁc�c�N�N�N�B";
		close;
	case 4:
		mes "[��̌�����]";
		mes "�����A�ǂ��������H";
		mes "���ԗ��s�͊y�����������H";
		mes "�������Ԃɂ����s���Ȃ�����ȁA";
		mes "�������Ă������̂Ɠ����W�J��";
		mes "���Ă����񂾂낤�B";
		mes "�I�[�N�ǂ��̖��ȉ������ȁB";
		next;
		menu "�N���K�[�������������I",-;
		mes "[��̌�����]";
		mes "�N���K�[�H";
		mes "�����A���̛ޏ��ɓ˂������";
		mes "�|�ꂽ�I�[�N���B";
		mes "�������������������āH";
		mes "�ӂށc�c�����܂ŗ��j�̈ꕔ��";
		mes "�ς�邱�Ƃ�����̂��c�c";
		next;
		mes "[��̌�����]";
		mes "�����ȁA���̂��̃I�[�N�ǂ���";
		mes "���̗l�q������B";
		mes "�����ς���Ă��邩�c�c�H";
		mes "�����炭�A�N���K�[��";
		mes "���ʓI�ɂ͓|���B";
		mes "�����o�����ɁA���B";
		next;
		menu "�c�c�c�c�c",-;
		mes "[��̌�����]";
		mes "�ߋ��ɉ�������������";
		mes "���̌��݂Ɏ���悤��";
		mes "���j�͎����C�����悤�Ƃ�����񂾁B";
		mes "���܂��ܓ|���^�C�~���O��";
		mes "�ς�������炢���낤�B";
		next;
		mes "[��̌�����]";
		mes "�����A�����Ƃ��Ă͔���";
		mes "�ʔ����c�c�I";
		mes "�ߋ��ɃI�[�N�ɉ����������̂��c�c�H";
		mes "�����炭�A����ȏ��";
		mes "���̎��ԂɈړ����邾���ł�";
		mes "�킩��Ȃ����낤���c�c";
		next;
		mes "[��̌�����]";
		mes "�N�N�N�A�����҂̌��������ȁc�c";
		close;
	}
}

//============================================================
// ����NPC
//------------------------------------------------------------
gef_fild10.gat,238,205,4	script	��������	857,{
	mes "[��������]";
	mes "�]�ߋ��̃I�[�N�n�����A��";
	mes "�@���������]";
	next;
	switch(select("^dc143c����^000000�ɂ���","^dc143c����^000000�ɂ���","^dc143c���ӓ_^000000�ɂ���")) {
	case 1:
		mes "[��������]";
		mes "�ߋ��Ɏ��Ԉړ����邽�߂�";
		mes "�����쐬���A���Ԉړ�����ƁA";
		mes "���̈ړ����";
		mes "���̃p�[�e�B�[�Ɗ����Ȃ�";
		mes "��Ԃ̂悤�ł���B";
		next;
		mes "[��������]";
		mes "���Ԉړ����s����";
		mes "^ff0000���Ԉړ��̉e��^000000���󂯂�B";
		mes "�܂��A���Ԉړ����Ă�����";
		mes "���E�̎��Ԃ�";
		mes "^0000ff1����^000000�ł���B";
		next;
		mes "[��������]";
		mes "��x���݂ɖ߂邩�A1���Ԍo�߂���";
		mes "���݂ɖ߂�����A�ēx";
		mes "�����쐬������A�ړ�����ɂ�";
		mes "^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
		mes "���A^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
		mes "�ɂȂ�B";
		close;
	case 2:
		mes "[��������]";
		mes "�ߋ��̒n�����A��";
		mes "��̛ޏ��̎�p���낤���A";
		mes "��̗͂����菄�炳��Ă���悤���B";
		mes "���̂��߈ꕔ�X�L����A�C�e����";
		mes "���ʂ𔭊����Ȃ��B";
		next;
		mes "[��������]";
		mes "�X�L���ł́A";
		mes "�e���|�[�g�A�A�C�X�E�H�[���A";
		mes "�X�p�C�_�[�E�F�u�A�C���e�B�~�f�C�g�A";
		mes "�A�u���J�^�u�����g���Ȃ��B";
		next;
		mes "[��������]";
		mes "�A�C�e���ł́A";
		mes "�n�C���[�]�C�X�g�J�[�h�A";
		mes "�A�]�[�g�Ƃ�����";
		mes "�����X�^�[��ϊ�������ʂ�";
		mes "�����������B";
		next;
		mes "[��������]";
		mes "�e���|�[�g�Ɠ������ʂ�";
		mes "�n�G�̉H�Ȃǂ�";
		mes "�g�����Ƃ��ł��Ȃ��B";
		close;
	case 3:
		mes "[��������]";
		mes "^ff0000�����ă����X�^�[��^000000";
		mes "�e�C�~���O���Ă͂Ȃ�Ȃ��B";
		mes "�������Ă��܂����ꍇ�́A";
		mes "��ɐi�߂Ȃ��Ȃ�\��������B";
		mes "�����Ȃ�����A������";
		mes "�߂�ق��Ȃ��B";
		close;
	}
}

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
gef_fild10.gat,242,202,0	script	���Ԃ̐�	406,{
	if (ORCS_1QUE == 0) {
		mes "�]���ȕ��͋C�̐΂�����c�c�]";
		close;
	}
	if(BaseLevel < 30 || BaseLevel > 80 || Job == Job_Summoner) {
		mes "�y���Ԃ̐΁z";
		mes "���̋�Ԃ�";
		mes "^0000ff���x��30�`80�̐l�Ԃ̖`���҂̂�^000000";
		mes "���邱�Ƃ��ł���B";
		mes "�Y�����Ȃ����x���̖`���҂�";
		mes "�h�������͓��邱�Ƃ͂ł��Ȃ��B";
		close;
	}
	if(getonlinepartymember() == 0) {
		mes "�y���Ԃ̐΁z";
		mes "1�l�ȏ�̃p�[�e�B�[��g��ł���";
		mes "�Ď��s����B";
		close;
	}
	if(checkquest(12059) || checkquest(120410)) {
		if(checkquest(12059)&2 == 0 || checkquest(120410)&2 == 0) {
			mes "�y���Ԃ̐΁z";
			mes "�����ɑ��𓥂ݓ��ꂽ���߁A";
			mes "^ff0000���Ԉړ��̉e��^000000���󂯂Ă����ԁB";
			mes "^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
			mes "���A^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
			mes "�ɍēx�A���̍쐬�A���ꂪ";
			mes "�����Ȃ���B";
			close;
		}
		delquest 12059;
		delquest 120410;
		mes "�y���Ԃ̐΁z";
		mes "^ff0000���Ԉړ��̉e��^000000���������B";
		mes "�����̌��̍쐬�A�y�ѓ��ꂪ";
		mes "�\�ɂȂ����B";
		close;
	}
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		mes "�y���Ԃ̐΁z";
		mes "���i�����\�̎҂�B";
		mes "�����ɓ��錮����邩�H";
		set '@str$,"Orc's Memory�̌��̍쐬";
	}
	else {
		mes "�y���Ԃ̐΁z";
		mes "���i����҂�B";
		mes "�����ɓ��邩�H";
		set '@str$,"";
	}
	next;
	switch(select('@str$,"Orc's Memory�ɓ���","�L�����Z��")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�y���Ԃ̐΁z";
			mes "��\���������Ȃ��Ă���B";
			mes "�Ď��s����B";
			close;
		}
		mdcreate "Orc's Memory";
		mes "�y���Ԃ̐΁z";
		mes "���p�[�e�B�[��";
		mes "^0000ff"+getpartyname(getcharid(1))+"^000000";
		mes "���p�[�e�B�[���[�_�[";
		mes "^0000ff"+getpartyleader(getcharid(1))+"^000000";
		mes " ";
		mes "^006400Orc's Memory^000000�̌��̍쐬���s���B";
		next;
		mes "�y���Ԃ̐΁z";
		mes "�쐬�ɐ��������ꍇ��";
		mes "�Ăѐ΂ɘb�������A";
		mes "�wOrc's Memory�ɓ���x��";
		mes "�I�����邱�Ƃœ��ꂪ�\�B";
		close;
	case 2:
		switch(mdenter("Orc's Memory")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[Orc's Memory] �ɓ��ꂵ�܂����@�F�@"+strcharinfo(1)+" ("+strcharinfo(0)+")",0x9,0x00FF99;
			setquest 12059;
			setquest 120410;
			donpcevent getmdnpcname("�N���K�[#Orcs1-1")+"::OnStart";
			end;
		case 1:		// �p�[�e�B�[������
			mes "�y���Ԃ̐΁z";
			mes "Orc's Memory �ɓ��鎑�i���Ȃ��B";
			mes "�p�[�e�B�[�ɉ������Ă��Ȃ���ԁB";
			close;
		case 2:		// �_���W�������쐬
			mes "�y���Ԃ̐΁z";
			mes "Orc's Memory �̌���";
			mes "���݂��Ȃ��B";
			mes "�p�[�e�B�[���[�_�[������";
			mes "�쐬���Ă��Ȃ���ԁB";
			close;
		default:	// ���̑��G���[
			mes "�y���Ԃ̐΁z";
			mes "�s���ȃG���[�������B";
			close;
		}
	case 3:
		close;
	}
}

//============================================================
// �I�[�N�n�����A 01�i�ߋ��j
//------------------------------------------------------------
1@orcs.gat,180,29,4	script	�N���K�[#Orcs1-1	433,{
	donpcevent getmdnpcname("�N���K�[#Orcs1-2")+"::OnStart";
	hideonnpc;
	end;
OnStart:
	if('flag == 0) {
		set 'flag,1;
		areasetcell "this",164,27,180,27,1;
		monster "this",164,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",165,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",166,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",167,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",168,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",169,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",170,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",171,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",172,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",173,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",174,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",175,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",176,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",177,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",178,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",179,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
		monster "this",180,28,"",1080,1,getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
	}
	end;
OnKilled:
	end;
}

1@orcs.gat,180,29,4	script	�N���K�[#Orcs1-2	433,{
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer10:
	announce "�N���K�[ : ���̂���Ȃɒx�ꂽ!!�@������𕷂��v�f�͂ЂƂ�������!?�@������ԑ�ς��Ƃ����̂�!!",0x9,0xFFFF00;
	end;
OnTimer5710:
	announce "�N���K�[ : �v��ʂ�ɐi��ł���Ή�X�̒��Ԃ�����J���Ă����͂����I�@�������O�B���x�ꂽ�����śޏ��Ƀo���Ă��Â炭�Ȃ����I",0x9,0xFFFF00;
	end;
OnTimer14610:
	announce "�I�[�N���叫 : �V�������͂��������C�z������ȁc�c���񕺁I�@�����ߕӂ��x�삵��I",0x9,0xFF4444;
	end;
OnTimer20210:
	announce "�N���K�[ : �܂����ȁc�c�z�炪�����ɂł��Q�����Ă��邾�낤�B�������A�����猾�����Ƃ��悭�����B",0x9,0xFFFF00;
	end;
OnTimer24910:
	announce "�N���K�[ : ��X�ɋC�t�����ޏ��͂��̊K�w���l�̋��ɕ����ĕ��󖂏p���{�����B�����ċ�悲�ƂɈ�l�̎�앺��������Ǘ����Ă���c�c",0x9,0xFFFF00;
	end;
OnTimer34310:
	announce "�N���K�[ : ��������������H�@�z���Еt���ĕ���������񂾁I�@��������Ύ��̊K�w�Ɉړ��ł���I",0x9,0xFFFF00;
	end;
OnTimer39710:
	announce "�N���K�[ : �������ЂƂ��ӂ���I�@����̎�앺�ȊO�ɂ͎���o���ȁI�@�z��A���Ԃ������x�ɕ��͂��������Ă��₪��I",0x9,0xFFFF00;
	end;
OnTimer49210:
	announce "�N���K�[ : �ň��̏ꍇ�͎��̊K�w�ɍs���ǂ��낶��Ȃ��Ȃ�\��������B�Ȃ�ׂ��S�ʑΌ�������Đi�ނ񂾁I",0x9,0xFFFF00;
	end;
OnTimer56310:
	announce "[�C��] �y�I�[�N�����앺�z��|���I�@��앺�ȊO�̃I�[�N���Ƃ̐퓬���ɗ͔�����I",0x9,0x44FFFF;
	donpcevent getmdnpcname("OrcsControl1")+"::OnStart";
	hideonnpc;
	killmonster "this",getmdnpcname("�N���K�[#Orcs1-1")+"::OnKilled";
	areasetcell "this",164,27,180,27,0;
	end;
OnInit:
	hideonnpc;
	end;
}

1@orcs.gat,0,0,0	script	OrcsControl1	-1,{
OnStart:
	areamonster "this",0,0,0,0,"�I�[�N��",1217,30,getmdnpcname("OrcsControl1")+"::OnKilled1";
	areamonster "this",0,0,0,0,"�P�����ꂽ�T",1432,15,getmdnpcname("OrcsControl1")+"::OnKilled2";
	areamonster "this",0,0,0,0,"�I�[�N�|��",1473,15,getmdnpcname("OrcsControl1")+"::OnKilled3";
	areamonster "this",0,0,0,0,"",2569,10,getmdnpcname("OrcsControl1")+"::OnKilled4";
	areamonster "this",137,83,143,89,"�I�[�N�����앺",1217,1,getmdnpcname("OrcsControl1")+"::OnKilled5";
	end;
OnKilled1:
	set '@num,30 - getmapmobs(getmdmapname("1@orcs.gat"),getmdnpcname("OrcsControl1")+"::OnKilled1");
	if('@num > 0) {
		set '@rand,rand(30);
		if('@rand < 1) {
			areamonster "this",0,0,0,0,"�I�[�N��",1217,'@num,getmdnpcname("OrcsControl1")+"::OnKilled1";
		} else if('@rand < 2) {
			areamonster "this",0,0,0,0,"�I�[�N�ˌ���",1439,'@num,getmdnpcname("OrcsControl1")+"::OnKilled1";
			if(rand(10) == 0) {
				announce "�I�[�N���叫 : �h�䂪�s�����Ă��邼�I�@���������܂Ƃ��ȕ��͂��Ȃ��̂�!?",0x9,0xFF4444;
			}
		} else if('@rand < 4) {
			areamonster "this",41,81,51,91,"�I�[�N�ˌ���",1439,'@num,getmdnpcname("OrcsControl1")+"::OnKilled1";
			if(rand(10) == 0) {
				announce "�I�[�N���叫 : �ˌ��������͂��邩!?�@�G���͂�}����!!",0x9,0xFF4444;
			}
		} else {
			areamonster "this",17,177,27,187,"�I�[�N�ˌ���",1439,'@num,getmdnpcname("OrcsControl1")+"::OnKilled1";
			if(rand(5) == 0) {
				announce "[�x��] ��l���Ɉꕔ���͂��W�����J�n�I",0x9,0x77FF77;
			}
			if(rand(100) == 0) {
				initnpctimer;
			}
		}
	}
	end;
OnTimer10:
	announce "�I�[�N���叫 : ���������Ȃ��ȁI�@�X�^���N�^�C�g�S�[��������������!!",0x9,0xFF4444;
	end;
OnTimer4010:
	announce "[�x��] �X�^���N�^�C�g�S�[�������n���̓D�y���o���I",0x9,0x77FF77;
	areamonster "this",17,177,27,187,"�X�^���N�^�C�g�S�[����",1223,20,getmdnpcname("OrcsControl1")+"::OnKilled1";
	stopnpctimer;
	end;
OnKilled2:
	if(rand(2)) {
		areamonster "this",0,0,0,0,"�P�����ꂽ�T",1432,1,getmdnpcname("OrcsControl1")+"::OnKilled2";
	} else {
		areamonster "this",17,177,27,187,"�P�����ꂽ�T",1432,1,getmdnpcname("OrcsControl1")+"::OnKilled2";
	}
	end;
OnKilled3:
	set '@rand,rand(30);
	if('@rand < 1) {
		areamonster "this",0,0,0,0,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl1")+"::OnKilled3";
	} else if('@rand < 4) {
		areamonster "this",43,155,47,159,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl1")+"::OnKilled3";
		if(rand(3) == 0) {
			announce "�I�[�N���叫 : ��q��_���I�@�G�̎x����f�̂�!!",0x9,0xFF4444;
		}
	} else {
		areamonster "this",17,177,27,187,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl1")+"::OnKilled3";
	}
	end;
OnKilled4:
	areamonster "this",0,0,0,0,"",2569,1,getmdnpcname("OrcsControl1")+"::OnKilled4";
	end;
OnKilled5:
	enablenpc getmdnpcname("#OrcsWarp1-1");
	initnpctimer getmdnpcname("#OrcsWarp1-1");
	areamonster "this",103,105,109,111,"�I�[�N�����앺",1217,1,getmdnpcname("OrcsControl1")+"::OnKilled6";
	announce "[���] �y�I�[�N�����앺�z1�̌��j�I�@���̋��ֈړ��\�I",0x9,0x44FFFF;
	end;
OnKilled6:
	enablenpc getmdnpcname("#OrcsWarp1-2");
	initnpctimer getmdnpcname("#OrcsWarp1-2");
	areamonster "this",32,40,38,46,"�I�[�N�����앺",1217,1,getmdnpcname("OrcsControl1")+"::OnKilled7";
	announce "[���] �y�I�[�N�����앺�z2�̌��j�I�@���̋��ֈړ��\�I",0x9,0x44FFFF;
	end;
OnKilled7:
	enablenpc getmdnpcname("#OrcsWarp1-3");
	areamonster "this",19,177,25,183,"�I�[�N�����앺",1217,1,getmdnpcname("OrcsControl1")+"::OnKilled8";
	announce "[���] �y�I�[�N�����앺�z3�̌��j�I�@���̋��ֈړ��\�I",0x9,0x44FFFF;
	end;
OnKilled8:
	enablenpc getmdnpcname("#OrcsWarp1-4");
	initnpctimer getmdnpcname("#OrcsWarp1-4");
	killmonster "this",getmdnpcname("OrcsControl1")+"::OnKilled1";
	killmonster "this",getmdnpcname("OrcsControl1")+"::OnKilled2";
	killmonster "this",getmdnpcname("OrcsControl1")+"::OnKilled3";
	killmonster "this",getmdnpcname("OrcsControl1")+"::OnKilled4";
	announce "[���] �y�I�[�N�����앺�z�S�Č��j�I�@���̊K�w�ֈړ��\�I",0x9,0x44FFFF;
	end;
}

1@orcs.gat,168,125,0	script	#OrcsWarp1-1	45,3,3,{
OnTouch:
	warp getmdmapname("1@orcs.gat"),168,130;
	end;
OnTimer10300:
	announce "�N���K�[�̚��� : �����̃I�[�N�����͂�����ƑO�܂ŉ��̒��Ԃ������c�c�����ޏ��̐��_�x�z���󂯂Ď���̈ӎv�������Ă��܂����B",0x9,0xFF4499;
	end;
OnTimer18700:
	announce "�N���K�[�̚��� : �������͂ǂ����邱�Ƃ��o����B�c���Ă��钇�Ԃ�������ׂɂ��ޏ��͓|���˂΂Ȃ�Ȃ��̂��B",0x9,0xFF4499;
	stopnpctimer;
	end;
OnInit:
	disablenpc;
	end;
}

1@orcs.gat,89,94,0	script	#OrcsWarp1-2	45,3,3,{
OnTouch:
	warp getmdmapname("1@orcs.gat"),85,85;
	end;
OnTimer10300:
	announce "�N���K�[�̚��� : �����܂ł̓��ɒ��Ԃ����̊[���������c�c�ޏ��͉����m��Ȃ��I�[�N�����������̋V���Ɏg�����B",0x9,0xFF4499;
	end;
OnTimer18700:
	announce "�N���K�[�̚��� : �����A����͑S�ĉ��̂��߂������񂾁c�c�������T������͎����łȂ�Ƃ����Ȃ��Ă͂ȁc�c",0x9,0xFF4499;
	stopnpctimer;
	end;
OnInit:
	disablenpc;
	end;
}

1@orcs.gat,38,105,0	script	#OrcsWarp1-3	45,3,3,{
OnTouch:
	warp getmdmapname("1@orcs.gat"),38,110;
	end;
OnInit:
	disablenpc;
	end;
}

1@orcs.gat,21,189,0	script	#OrcsWarp1-4	45,3,3,{
OnTouch:
	warp getmdmapname("2@orcs.gat"),32,171;
	donpcevent getmdnpcname("�N���K�[#Orcs2-1")+"::OnStart";
	end;
OnTimer2300:
	announce "�N���K�[�̚��� : ���Ə������c�c",0x9,0xFF4499;
	end;
OnTimer5700:
	announce "�N���K�[�̚��� : �����𔲂���Ύ��̊K�w�Ɉړ��ł���B�C�𔲂��Ȃ�B",0x9,0xFF4499;
	stopnpctimer;
	end;
OnInit:
	disablenpc;
	end;
}

//============================================================
// �I�[�N�n�����A 02�i�ߋ��j
//------------------------------------------------------------
2@orcs.gat,35,169,4	script	�N���K�[#Orcs2-1	433,{
	donpcevent getmdnpcname("�N���K�[#Orcs2-2")+"::OnStart";
	hideonnpc;
	end;
OnStart:
	if('flag == 0) {
		set 'flag,1;
		areasetcell "this",28,165,37,165,1;
		monster "this",28,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",29,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",30,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",31,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",32,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",33,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",34,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",35,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",36,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
		monster "this",37,164,"",1080,1,getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
	}
	end;
OnKilled:
	end;
}

2@orcs.gat,35,169,4	script	�N���K�[#Orcs2-2	433,{
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer10:
	announce "�N���K�[ : �悵�A�����ȁB���̂����ɛޏ��̂Ƃ���ɍs�����@��������B",0x9,0xFFFF00;
	end;
OnTimer3510:
	announce "�N���K�[ : �ޏ������������ɗ��Ă������������邩�H�@����ɖ��͂����߂邱�ƂŎ��̋��ւ̕��󂪉������͂����B",0x9,0xFFFF00;
	end;
OnTimer10710:
	announce "�N���K�[ : ���_�ȒP�ɐG����Ȃ��悤�ɓG�͓������낤�B���K�͂Ȑ킢�͔������Ȃ����c�c",0x9,0xFFFF00;
	end;
OnTimer16310:
	announce "�N���K�[ : �����Ȃ�ׂ��ޏ������̕��m���h�q���邱�Ƃ��Ȃ��悤�ɐÂ��ɍs�������ق����������낤�ȁB",0x9,0xFFFF00;
	end;
OnTimer21910:
	announce "�N���K�[ : �悵�A��ɐi��ł���B���͉��ōs������c�c",0x9,0xFFFF00;
	end;
OnTimer23910:
	announce "[�C��] �ő���퓬����������ɖ��͂����߁A����������I�@�Ȃ��A���͂����߂��鏼���͈��̏��ԂŌ��܂�I",0x9,0x44FFFF;
	donpcevent getmdnpcname("OrcsControl2")+"::OnStart";
	hideoffnpc getmdnpcname("����#Orcs1-1");
	hideonnpc;
	killmonster "this",getmdnpcname("�N���K�[#Orcs2-1")+"::OnKilled";
	areasetcell "this",28,165,37,165,0;
	end;
OnTimer29310:
	announce "�N���K�[ : �������A�����Y��Ă����B�����ɂ͈�l�ŐG���I�@����܂蕡���l�œ����ɐG���ƒɂ��ڂɂ������I",0x9,0xFFFF00;
	end;
OnInit:
	hideonnpc;
	end;
}

2@orcs.gat,0,0,0	script	OrcsControl2	-1,{
OnStart:
	areamonster "this",0,0,0,0,"�I�[�N����",1462,30,getmdnpcname("OrcsControl2")+"::OnKilled1";
	areamonster "this",0,0,0,0,"�������I�[�N��",1463,15,getmdnpcname("OrcsControl2")+"::OnKilled2";
	areamonster "this",0,0,0,0,"",2569,10,getmdnpcname("OrcsControl2")+"::OnKilled3";
	end;
OnKilled1:
	set '@num,30 - getmapmobs(getmdmapname("2@orcs.gat"),getmdnpcname("OrcsControl2")+"::OnKilled1");
	if('@num > 0) {
		set '@rand,rand(30);
		if('@rand < 1) {
			areamonster "this",0,0,0,0,"�I�[�N����",1462,1,getmdnpcname("OrcsControl2")+"::OnKilled1";
		} else if('@rand < 2) {
			areamonster "this",0,0,0,0,"�I�[�N�ˌ���",1439,1,getmdnpcname("OrcsControl2")+"::OnKilled1";
		} else if('@rand < 4) {
			areamonster "this",157,112,167,122,"�I�[�N�ˌ���",1439,1,getmdnpcname("OrcsControl2")+"::OnKilled1";
			if(rand(5) == 0) {
				announce "[�x��] �I�[�N�ˌ�����������O���ɏW�����J�n�I",0x9,0xFF4444;
			}
		} else {
			areamonster "this",173,13,183,23,"�I�[�N�ˌ���",1439,1,getmdnpcname("OrcsControl2")+"::OnKilled1";
			if(rand(5) == 0) {
				announce "[�x��] �ޏ��̃e���g���[�ɑ����̕����W�����J�n�I",0x9,0x77FF77;
			}
			if(rand(70) == 0) {
				initnpctimer;
			}
		}
	}
	end;
OnTimer10:
	announce "��̐� : �������z���B���̒��x�ł����炪�����Ǝv���������H",0x9,0xFF4444;
	end;
OnTimer4010:
	announce "[�x��] �~��V���ɂ��A�Ñ�̎��ꂽ�����S��I",0x9,0x77FF77;
	areamonster "this",167,25,177,35,"�׈��Ȃ�Â̍�",1475,30,getmdnpcname("OrcsControl2")+"::OnKilled1";
	stopnpctimer;
	end;
OnKilled2:
	set '@rand,rand(30);
	if('@rand < 1) {
		areamonster "this",0,0,0,0,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl2")+"::OnKilled2";
	} else if('@rand < 24) {
		areamonster "this",168,10,184,26,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl2")+"::OnKilled2";
	} else {
		areamonster "this",168,21,184,21,"�I�[�N�|��",1473,1,getmdnpcname("OrcsControl2")+"::OnKilled2";
		if(rand(3) == 0) {
			announce "[�x��] �ޏ��̃e���g���[�ɑ����̕����W�����J�n�I",0x9,0x77FF77;
		}
		if(rand(70) == 0) {
			initnpctimer;
		}
	}
	end;
OnKilled3:
	areamonster "this",0,0,0,0,"",2569,1,getmdnpcname("OrcsControl2")+"::OnKilled3";
	end;
OnBossSpawn1:
	monster "this",109,156,"�I�[�N���叫",1981,1,getmdnpcname("OrcsControl2")+"::OnBossKilled1";
	announce "�I�[�N���叫 : ���̃l�Y�~��Y�ǂ���!!�@�E�C������Ȃ�Ή��Ɠ���!!",0x9,0xFF8888;
	end;
OnBossKilled1:
	enablenpc getmdnpcname("#OrcsWarp2-1");
	hideoffnpc getmdnpcname("����#Orcs2-1");
	announce "[���] �I�[�N���叫�����j�I�@���̋��ֈړ��\�I",0x9,0x44FFFF;
	end;
OnBossSpawn2:
	monster "this",67,64,"�I�[�N�_����",1982,1,getmdnpcname("OrcsControl2")+"::OnBossKilled2";
	announce "�I�[�N�_���� : �ӂ�A�悭�����܂ŗ����ȁI�@�����c�O�I�@���O�����̖`���͂����ŏI��肾!!",0x9,0xFF8888;
	end;
OnBossKilled2:
	enablenpc getmdnpcname("#OrcsWarp2-2");
	hideoffnpc getmdnpcname("����#Orcs3-1");
	announce "[���] �I�[�N�_���������j�I�@���̋��ֈړ��\�I",0x9,0x44FFFF;
	end;
OnBossSpawn3:
	monster "this",152,147,"�����I�[�N�̉��O",1983,1,getmdnpcname("OrcsControl2")+"::OnBossKilled3";
	announce "�����I�[�N�̉��O : ���_�I�@���������Z�I�@���K�����^�I�@�l�ԁA�H�E�I",0x9,0xFF8888;
	end;
OnBossKilled3:
	enablenpc getmdnpcname("#OrcsWarp2-3");
	donpcevent getmdnpcname("OrcsBossControl")+"::OnStart";
	end;
}

2@orcs.gat,26,164,0	script	����#Orcs1-1	844,{
	progressbar 5;
	if(getnpctimer(1) == 0) {
		initnpctimer;
		set '@num1,substr(strnpcinfo(2),4,1);
		set '@num2,substr(strnpcinfo(2),6,1);
		hideoffnpc getmdnpcname("����#Orcs"+'@num1+"-"+('@num2+1));
		announce "[���] "+('@num2 == 1? "��": '@num2 == 2? "��": "�O")+"�ڂ̏����ɖ��͒��������I�@���ɖ��͂����߂��鏼����T���ĐG���I",0x9,0x44FFFF;
		hideonnpc;
	}
	end;
OnTimer100:
	misceffect 96;
	end;
OnTimer2000:
	misceffect 97;
	end;
OnInit:
	hideonnpc;
	end;
}
2@orcs.gat,55,155,0		duplicate(����#Orcs1-1)	����#Orcs1-2	844
2@orcs.gat,108,146,0	duplicate(����#Orcs1-1)	����#Orcs1-3	844

2@orcs.gat,98,171,0		script	����#Orcs1-4	844,{
	progressbar 10;
	if(getnpctimer(1) == 0) {
		initnpctimer;
		donpcevent getmdnpcname("OrcsControl2")+"::OnBossSpawn"+substr(strnpcinfo(2),4,1);
		hideonnpc;
	}
	end;
OnTimer100:
	misceffect 96;
	end;
OnTimer2000:
	misceffect 97;
	end;
OnInit:
	hideonnpc;
	end;
}

2@orcs.gat,48,100,0	script	#OrcsWarp2-1	45,3,3,{
OnTouch:
	warp getmdmapname("2@orcs.gat"),47,93;
	end;
OnInit:
	disablenpc;
	end;
}

2@orcs.gat,35,92,0	duplicate(����#Orcs1-1)	����#Orcs2-1	844
2@orcs.gat,32,70,0	duplicate(����#Orcs1-1)	����#Orcs2-2	844
2@orcs.gat,70,31,0	duplicate(����#Orcs1-1)	����#Orcs2-3	844
2@orcs.gat,84,51,0	duplicate(����#Orcs1-4)	����#Orcs2-4	844

2@orcs.gat,101,55,0	script	#OrcsWarp2-2	45,3,3,{
OnTouch:
	warp getmdmapname("2@orcs.gat"),107,55;
	end;
OnInit:
	disablenpc;
	end;
}

2@orcs.gat,142,145,0	duplicate(����#Orcs1-1)	����#Orcs3-1	844
2@orcs.gat,162,134,0	duplicate(����#Orcs1-1)	����#Orcs3-2	844
2@orcs.gat,144,117,0	duplicate(����#Orcs1-1)	����#Orcs3-3	844
2@orcs.gat,136,98,0		duplicate(����#Orcs1-4)	����#Orcs3-4	844

2@orcs.gat,167,104,0	script	#OrcsWarp2-3	45,3,3,{
OnTouch:
	warp getmdmapname("2@orcs.gat"),167,95;
	end;
OnInit:
	disablenpc;
	end;
}

2@orcs.gat,0,0,0	script	OrcsBossControl	-1,{
OnStart:
	monster "this",179,15,"�����I�[�N�q�[���[",1850,1,getmdnpcname("OrcsBossControl")+"::OnKilled1";
	monster "this",185,8,"�ޏ��J���K�����X�B",1984,1,getmdnpcname("OrcsBossControl")+"::OnKilled2";
	announce "�ޏ��J���K�����X�B : �z�b�z�z�I�@���ǂ����܂ŗ����̂����B�M�l��̑��荞�񂾎h�q�͖��d�ł������B���̈����ȃI�[�N�͂���̑����œ]�����Ă����B",0x9,0xFFFF00;
	initnpctimer;
	end;
OnTimer6810:
	announce "�ޏ��J���K�����X�B : ����̒����Ȃ鉺�l��A�N���҂ǂ���r�ł��Ă܂���B",0x9,0xFFFF00;
	end;
OnTimer10310:
	announce "�����I�[�N�q�[���[ : ��Ӂc�c�c�c�c�c",0x9,0xFF8888;
	end;
OnTimer13110:
	announce "[�x��] �ޏ��ɔ������ꂽ�I�@�ʍs�����Ă����N���K�[�̍��͎��s�����͗l�I�@�ޏ���|���I",0x9,"0x8888FF";
	stopnpctimer;
	end;
OnKilled1:
	announce "�����I�[�N�q�[���[ : ���O�c�c�c�c�c�c",0x9,0xFF8888;
	sleep 6810;
	announce "�ޏ��J���K�����X�B : �c�c�Ȃ�Ƃ����𗧂�������B���f���o���B",0x9,0xFFFF00;
	end;
OnKilled2:
	switch(rand(4)) {
	case 0:
		announce "�ޏ��J���K�����X�B : ���̋����c�c�l�ԂƂ͎v���ʁc�c!!",0x9,0xFFFF00;
		break;
	case 1:
		announce "�ޏ��J���K�����X�B : ���c�c����Ȃ͂��ł́c�c���̒�����ǂ��c�c!!",0x9,0xFFFF00;
		break;
	case 2:
		announce "�ޏ��J���K�����X�B : �܂��c�c���ʂ킯�ɂ͍s���ʁc�c!!",0x9,0xFFFF00;
		break;
	case 3:
		announce "�ޏ��J���K�����X�B : �b�ɂȂ�ʁc�c���̂悤�Ȃ��Ƃ������Ă��܂邩����!!",0x9,0xFFFF00;
		break;
	}
	hideoffnpc getmdnpcname("�N���K�[#Orcs2-3");
	enablenpc getmdnpcname("#OrcsWarp2-4");
	killmonster "this",getmdnpcname("OrcsControl2")+"::OnKilled1";
	killmonster "this",getmdnpcname("OrcsControl2")+"::OnKilled2";
	killmonster "this",getmdnpcname("OrcsControl2")+"::OnKilled3";
	killmonster "this",getmdnpcname("OrcsBossControl")+"::OnKilled1";
	end;
}

2@orcs.gat,172,13,0	script	�N���K�[#Orcs2-3	434,{
	switch(ORCS_1QUE) {
	default:
		mes "[�N���K�[]";
		mes "�c�c�c�c";
		mes strcharinfo(0)+"�A";
		mes "���O���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�I";
		mes "���������I�@�����Ȃ��ق����c�c";
		next;
		mes "[�N���K�[]";
		mes "�����񂾁c�c";
		mes "���͎��s�����񂾂���ȁc�c";
		mes "�ޏ��́c�c�H";
		mes "�ޏ��͂ǂ��Ȃ����c�c�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ޏ��͓|���܂�����B";
		mes "�Ƃ���ŁA���ǂ��̛ޏ���";
		mes "���͉̂��Ȃ�ł��H";
		next;
		mes "�]�N���K�[�͈��g�̕\�����������A";
		mes "�@�����ꂵ�����Ȋ�������c�c�]";
		next;
		mes "[�N���K�[]";
		mes "�c�c���ǁc�c";
		mes "���͎����̎�Ŗ����~�߂邱�Ƃ�";
		mes "�o���Ȃ��������낤�c�c";
		mes "���������A�������̖����A";
		mes "�������ꂵ�߂��������c�c";
		mes "�I��������Ɓc�c���c�c";
		next;
		mes "�]�؎��ȕ\��ŉ�����������";
		mes "�@���Ă����N���K�[���������A";
		mes "�@���̂܂܍Ō�̑���f����";
		mes "�@�₪�ė₽���Ȃ��Ă������c�c";
		mes "�@�Ɠ����ɁA�ڂ̑O�Ɍ�����ꂽ�]";
		close2;
		set ORCS_1QUE,2;
		break;
	case 2:
		mes "[�N���K�[]";
		mes "�c�c�c�c";
		mes strcharinfo(0)+"�A";
		mes "���O���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�I";
		mes "���������I�@�����Ȃ��ق����c�c";
		next;
		mes "[�N���K�[]";
		mes "�����񂾁c�c";
		mes "���͎��s�����񂾂���ȁc�c";
		mes "�ޏ��́c�c�H";
		mes "�ޏ��͂ǂ��Ȃ����c�c�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ޏ��͓|���܂�����B";
		mes "�Ƃ���ŁA���ǂ��̛ޏ���";
		mes "���̂́c�c";
		next;
		if(select("���Ȃ��̖��Ȃ̂ł����H","���Ȃ�ł����H") == 1) {
			mes "[�N���K�[]";
			mes "�c�c�c�c!!";
			mes "���O�c�c���̂�����c�c!?";
			mes "�Ӂc�c�܂��A���ƂȂ��Ă�";
			mes "�����I��������Ƃ��c�c";
			next;
			mes "[�N���K�[]";
			mes "���̖��̛ޏ��́c�c";
			mes "�����]�������Ē��Ԃ̃I�[�N������";
			mes "���_�x�z�������c�c";
			mes "���O���m���Ă���Ǝv����";
			mes "�̂̓I�[�N�Ɛl�Ԃ͕s�N���̂悤��";
			mes "��������ł����c�c";
			next;
			mes "[�N���K�[]";
			mes "�Ƃ��낪���̐��_�x�z�̂�����";
			mes "��X�͓G�΂���悤�ɂȂ��Ă��܂����B";
			mes "�����͂��߂Ƃ��鐸�_�x�z����";
			mes "���ꂽ�I�[�N�́A���O����";
			mes "�l�Ԃɛޏ���|�����͂����߂��c�c";
			next;
			mes "[�N���K�[]";
			mes "�����āc�c";
			mes "�����A���O�����l�Ԃ̂�������";
			mes "�ޏ����|�����킯���c�c";
			mes "�������_�x�z�̉e���͎c�邾�낤�c�c";
			mes "������I�[�N�Ɛl�Ԃ̓G�Ί֌W��";
			mes "�����Ă��܂����낤�ȁc�c";
			next;
			mes "[�N���K�[]";
			mes "�����c�c�����";
			mes "�d������܂��c�c�������c�c!!";
			mes "���肪�Ƃ���A �E�m��c�c";
			mes "���́c�c�c�c";
			mes "�c�c";
			next;
			mes "�]�؎��ȕ\��ŉ�����������";
			mes "�@���Ă����N���K�[���������A";
			mes "�@���̂܂܍Ō�̑���f����";
			mes "�@�₪�ė₽���Ȃ��Ă������c�c";
			mes "�@�Ɠ����ɁA�ڂ̑O�Ɍ�����ꂽ�]";
			close2;
			set ORCS_1QUE,3;
		}
		else {
			mes "�]�N���K�[�͈��g�̕\�����������A";
			mes "�@�����ꂵ�����Ȋ�������c�c�]";
			next;
			mes "[�N���K�[]";
			mes "�c�c���ǁc�c";
			mes "���͎����̎�Ŗ����~�߂邱�Ƃ�";
			mes "�o���Ȃ��������낤�c�c";
			mes "���������A�������̖����A";
			mes "�������ꂵ�߂��������c�c";
			mes "�I��������Ɓc�c���c�c";
			next;
			mes "�]�؎��ȕ\��ŉ�����������";
			mes "�@���Ă����N���K�[���������A";
			mes "�@���̂܂܍Ō�̑���f����";
			mes "�@�₪�ė₽���Ȃ��Ă������c�c";
			mes "�@�Ɠ����ɁA�ڂ̑O�Ɍ�����ꂽ�]";
			close2;
		}
		break;
	case 3:
	case 4:
		mes "[�N���K�[]";
		mes "�c�c�c�c";
		mes strcharinfo(0)+"�A";
		mes "���O���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�N���K�[�c�c�I";
		mes "���v!?";
		next;
		mes "[�N���K�[]";
		mes "�����c�c�^���ǂ������̂�";
		mes "���̍��܂��炢�ōς񂾁B";
		mes "�c�c�܂����̒ʂ藧���Ƃ�";
		mes "����񂾂��ȁc�c�p���������b���B";
		mes "����ŁA�ޏ��́c�c�H";
		mes "�ޏ��͂ǂ��Ȃ����c�c�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�ޏ��͓|���܂�����B";
		mes "�Ƃ���ŁA���ǂ��̛ޏ���";
		mes "���̂͂��Ȃ��̖��Ȃ�ł���ˁH";
		next;
		mes "[�N���K�[]";
		mes "�c�c�c�c!!";
		mes "���O�c�c���̂�����c�c!?";
		mes "�Ӂc�c�܂��A���ƂȂ��Ă�";
		mes "�����I��������Ƃ��c�c";
		next;
		mes "[�N���K�[]";
		mes "���̖��̛ޏ��́c�c";
		mes "�����]�������Ē��Ԃ̃I�[�N������";
		mes "���_�x�z�������c�c";
		mes "���O���m���Ă���Ǝv����";
		mes "�̂̓I�[�N�Ɛl�Ԃ͕s�N���̂悤��";
		mes "��������ł����c�c";
		next;
		mes "[�N���K�[]";
		mes "�Ƃ��낪���̐��_�x�z�̂�����";
		mes "��X�͓G�΂���悤�ɂȂ��Ă��܂����B";
		mes "�����͂��߂Ƃ��鐸�_�x�z����";
		mes "���ꂽ�I�[�N�́A���O����";
		mes "�l�Ԃɛޏ���|�����͂����߂��c�c";
		next;
		mes "[�N���K�[]";
		mes "�����āc�c";
		mes "�����A���O�����l�Ԃ̂�������";
		mes "�ޏ����|�����킯���c�c";
		mes "�������_�x�z�̉e���͎c�邾�낤�c�c";
		mes "������I�[�N�Ɛl�Ԃ̓G�Ί֌W��";
		mes "�����Ă��܂����낤�ȁc�c";
		next;
		mes "[�N���K�[]";
		mes "�����c�c�����";
		mes "�d������܂��c�c";
		mes "���肪�Ƃ���A�E�m��c�c";
		mes "�Ƃ肠�����̋��Ђ͋������c�c";
		mes "���͂��Ƃ͌���邾�����B";
		next;
		mes "�]�N���K�[�͗D�������΂񂾁B";
		mes "�@�Ɠ����ɁA�ڂ̑O�Ɍ�����ꂽ�]";
		close2;
		if(ORCS_1QUE == 3)
			set ORCS_1QUE,4;
		break;
	}
	warp "gef_fild10.gat", 240, 197;
	end;

OnInit:
	hideonnpc;
	end;
}

2@orcs.gat,182,8,0	script	#OrcsWarp2-4	45,3,3,{
OnTouch:
	mes "�]��̑O���P���Ă���B";
	mes "�@���̏ꏊ�ɖ߂��̂��낤���H�]";
	next;
	if(select("��ɐi��ł݂�","�������Ȃ�") == 2) {
		mes "�]�������Ȃ��ł������c�c�]";
		close;
		close;
	}
	mes "�]��������Ɉ��Ă���c�c�I�]";
	close2;
	warp "gef_fild10.gat",240,197;
	end;
OnInit:
	disablenpc;
	end;
}
