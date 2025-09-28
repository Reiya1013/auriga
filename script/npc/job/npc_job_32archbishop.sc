//= Auriga Script ==============================================================
// Ragnarok Online RoyalGuard Jobchange Script	by Blaze
//- Registry -------------------------------------------------------------------
// CHANGE_AB -> 0�`11
//==============================================================================

//============================================================
// �}�b�v�t���O
//------------------------------------------------------------
job3_arch01.gat	mapflag	nomemo		dummy
job3_arch01.gat	mapflag	noteleport	dummy
job3_arch01.gat	mapflag	nosave		SavePoint
job3_arch01.gat	mapflag	nobranch	dummy
job3_arch01.gat	mapflag	nopenalty	dummy
job3_arch01.gat	mapflag	noicewall	dummy
job3_arch02.gat	mapflag	nomemo		dummy
job3_arch02.gat	mapflag	noteleport	dummy
job3_arch02.gat	mapflag	nosave		SavePoint
job3_arch02.gat	mapflag	nobranch	dummy
job3_arch02.gat	mapflag	nopenalty	dummy
job3_arch02.gat	mapflag	noicewall	dummy

//============================================================
// �����X�^�[
//------------------------------------------------------------
job3_arch02.gat,0,0,0,0	monster	�i�C�g���A				1427,2,5000,0,0
job3_arch02.gat,0,0,0,0	monster	���C�h���b�N�A�[�`���[	1453,2,5000,0,0
job3_arch02.gat,0,0,0,0	monster	�]���r					1394,5,5000,0,0
job3_arch02.gat,0,0,0,0	monster	�]���r�v���Y�i�[		1480,3,5000,0,0

//============================================================
// �J�nNPC
//------------------------------------------------------------
prt_church.gat,103,88,3	script	�F�鐹�E��	60,{
	if(Job == Job_ArchBishop) {
		emotion 0;
		mes "[�F�鐹�E��]";
		mes "�����A�M������͈ȑO����";
		mes "�C�������M�ȃI�[���������܂��B";
		next;
		mes "[�F�鐹�E��]";
		mes "���n����̒��Ŏ����𖁂���";
		mes "����ꂽ�̂ł��ˁB";
		mes "�{���ɑf���炵���c�c�B";
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
	if(Job != Job_Priest || Upper == UPPER_NORMAL) {
		mes "[�F�鐹�E��]";
		mes "�S�\�̐_�A�I�[�f�B���̑O��";
		mes "�ނ�葏�d�Ȏ҂͂��Ȃ���";
		mes "�ނ�莜�ߐ[���҂����Ȃ��B";
		next;
		mes "[�F�鐹�E��]";
		mes "���E�҂͂����S�Ă̎d����";
		mes "�^�ʖڂɎ��g�ނׂ��ł��B";
		mes "�_�Ɏd���A�ނ̂��Ƃ𓥂ނ��Ƃ�";
		mes "�ӂ��Ă͂����܂���B";
		next;
		mes "[�F�鐹�E��]";
		mes "�ŋ߁A���E�ҒB�������ɂ܂݂�";
		mes "�{���̋`����Y�p��";
		mes "�`�������邱�Ƃɖ����ɂȂ��Ă���";
		mes "�Ƃ����b�𕷂��܂��B";
		next;
		mes "[�F�鐹�E��]";
		mes "�����A����Ȑ��E�҂�������";
		mes "�v�����e�������܂ŖK�˂ė���悤";
		mes "�`���Ă���܂��񂩁H";
		next;
		mes "[�F�鐹�E��]";
		mes "���͔ނ���A�I�[�f�B���Ɏd����";
		mes "�����ĕi�ʂ����鐹�E�҂Ƃ���";
		mes "���܂�ς���悤�ɂ������ł��B";
		close;
	}
	switch(CHANGE_AB) {
	case 0:
		mes "�]���₩�����Ȓj����";
		mes "�@�F�������Ă���]";
		next;
		if(select("�b��������","�ʂ�߂���") == 2) {
			mes "�]�ז��͂��Ȃ��ł������]";
			close;
		}
		if((Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {
			mes "[�F�鐹�E��]";
			mes "�S�\�̐_�A�I�[�f�B���̑O��";
			mes "�ނ�葏�d�Ȏ҂͂��Ȃ���";
			mes "�ނ�莜�ߐ[���҂����Ȃ��B";
			next;
			mes "[�F�鐹�E��]";
			mes "���E�҂͂����S�Ă̎d����";
			mes "�^�ʖڂɎ��g�ނׂ��ł��B";
			mes "�_�Ɏd���A�ނ̂��Ƃ𓥂ނ��Ƃ�";
			mes "�ӂ��Ă͂����܂���B";
			next;
			mes "[�F�鐹�E��]";
			mes "�M���͌o�����s�����Ă��܂���";
			if(Upper == UPPER_HIGH)
				mes  "^3377FFBaseLv��90�ȏ�^000000�Ȃ�";
			else
				mes  "^3377FFBaseLv��99�AJobLv��50^000000�Ȃ�";		// �{�q�̂Ƃ�������
			mes "��萴���A�i�ʂ����鐹�E�҂Ƃ���";
			mes "���܂�ς����@�������܂��傤�B";
			close;
		}
		cloakoffnpc "�]�E��s�W#AB";
		misceffect 78,"�]�E��s�W#AB";
		if(callfunc("Func_Job3rd",Job_ArchBishop)) {
			cloakonnpc "�]�E��s�W#AB";
			end;
		}
		cloakonnpc "�]�E��s�W#AB";
		mes "[�F�鐹�E��]";
		mes "�S�\�̐_�A�I�[�f�B���̑O��";
		mes "�ނ�葏�d�Ȏ҂͂��Ȃ���";
		mes "�ނ�莜�ߐ[���҂����Ȃ��B";
		next;
		mes "[�F�鐹�E��]";
		mes "���E�҂͂����S�Ă̎d����";
		mes "�^�ʖڂɎ��g�ނׂ��ł��B";
		mes "�_�Ɏd���A�ނ̂��Ƃ𓥂ނ��Ƃ�";
		mes "�ӂ��Ă͂����܂���B";
		next;
		mes "[�F�鐹�E��]";
		mes (Sex? "�Z��": "�o��") + "�a�A�M���͂ǂꂮ�炢";
		mes "���l�ɑ΂��Đ�����";
		mes "�����Ă����̂ł����H";
		mes "������S���󂯎~��";
		mes "�ނ�ɕ�d�����̂ł����H";
		next;
		mes "[�F�鐹�E��]";
		mes "��X�͐_�Ɏd����҂ł��B";
		mes "��X�̍s���͐_�̎p�Ƃ���";
		mes "�l�X�̖ڂɉf�邱�Ƃ�����܂��B";
		mes "������A�����������ӂ�܂��ɂ�";
		mes "�C������ׂ��ł��B";
		next;
		mes "[�F�鐹�E��]";
		mes "���E�҂͐^������������";
		mes "�U������ɂ��Ă͂����܂���B";
		mes "��X�̓��L�̗U�f�ɉ����邱�ƂȂ�";
		mes "���`�Ɛ^���Ɍ����������h�i�ȐS��";
		mes "�����Ă���͂��ł��B";
		next;
		mes "[�F�鐹�E��]";
		mes (Sex? "�Z��": "�o��") + "�a�B";
		mes "��X�͐_�Ɏd����҂ł���";
		mes "�{���͕��}�Ȑl�Ԃɂ����܂���B";
		next;
		mes "[�F�鐹�E��]";
		mes "�m��Ȃ����Ɉłɖ������";
		mes "�����Ă��܂��\��������܂��B";
		mes "����ɋC�t���Ȃ����Ƃ�����ł��傤�B";
		next;
		mes "[�F�鐹�E��]";
		mes "��X�͂������S��Y�ꂸ";
		mes "�h�i�ȐS���ێ���";
		mes "�l�X�ɑP�s���{���A�_�̋K���ƒm�b��";
		mes "�L���m�点��w�͂��s���ׂ��ł��B";
		next;
		menu "�ǂ�����΁A���ꂪ�ł��܂����H",-;
		mes "[�F�鐹�E��]";
		mes "��������ł��B";
		mes "������@������܂��B";
		next;
		mes "[�F�鐹�E��]";
		mes "^3131FF���n����^000000�́A�����m�ł����H";
		mes "�_�̉���Ɖ���������";
		mes "�_���ȏꏊ�ŁA�F��������s�ׂł��B";
		next;
		mes "[�F�鐹�E��]";
		mes "���n������s����";
		mes "^3131FF��荂�M�ŕi�ʂ����鑶��^000000�Ƃ���";
		mes "���܂�ς�邱�Ƃ��ł���ł��傤�B";
		next;
		mes "[�F�鐹�E��]";
		mes "�������ł����H";
		mes "��낵����΁A�������n����ɓK����";
		mes "�ꏊ�����������܂���B";
		next;
		if(select("���n������s���܂�","�l�������Ă�������") == 2) {
			mes "[�F�鐹�E��]";
			mes "���n����͊�������ق�";
			mes "�ߍ��Ȃ��̂ł͂���܂���B";
			mes "�����S�ŋF�邾���̂��Ƃł��B";
			next;
			mes "[�F�鐹�E��]";
			mes "�C����������A���ł����Ă��������B";
			mes "���͂��܂ł��A�����ŋM����";
			mes "���҂����Ă��܂�����B";
			close;
		}
		emotion 33;
		mes "[�F�鐹�E��]";
		mes "���΂炵���S�\���ł��B";
		mes "���E�҂Ƃ��Ă̓��ɉ�A��";
		mes "����܂ł̍߂���������";
		mes "�V�����g�ƐS�ɔ����Ă��������B";
		next;
		mes "[�F�鐹�E��]";
		mes "����ł͂܂��A^0000FF�E���o��^000000�Ƃ���";
		mes "�����ȑ��Ɍ����Ă��������B";
		mes "�����Ƃ͖�����";
		mes "���R�Ƌ�������l�X�̑��ł��B";
		next;
		mes "[�F�鐹�E��]";
		mes "�����ŁA^0000FF�f�C�����_��^000000��";
		mes "�T���Ă��������B";
		next;
		mes "[�F�鐹�E��]";
		mes "�f�C�����_������������";
		mes "^3131FF�v�����e�����琹�n����ɗ��܂����B^000000";
		mes "�Ɠ`����̂ł��B";
		next;
		mes "[�F�鐹�E��]";
		mes "�f�C�����_���͎������܂�";
		mes "�悭����܂���̂�";
		mes "�傫�����ł͂����茾��Ȃ����";
		mes "�Ȃ�܂���B";
		next;
		mes "[�F�鐹�E��]";
		mes "������܂������H";
		mes "�ł́A�m�b�ɕx�ރI�[�f�B����";
		mes "�M���ɐ��Ȃ���̓��W��";
		mes "�^���Ă�������悤�Ɂc�c�B";
		set CHANGE_AB,1;
		setquest 2187;
		close;
	default:
		mes "[�F�鐹�E��]";
		mes "���n����͏����ł����H";
		mes "^0000FF�E���o���̃f�C�����_��^000000�Ƃ�";
		mes "��������܂������H";
		next;
		mes "[�F�鐹�E��]";
		mes "�f�C�����_������������";
		mes "^3131FF�v�����e�����琹�n����ɗ��܂����B^000000";
		mes "�Ɠ`����̂ł���B";
		close;
	}
}

prt_church.gat,103,90,3	script(CLOAKED)	�]�E��s�W#AB	888,{
	cloakonnpc;
	end;
}

//============================================================
// ���n����
//------------------------------------------------------------
umbala.gat,137,227,5	script	�E���o�����̎q��	787,{
	mes "[�E���o�����̎q��]";
	mes "�c�c�c�c�B";
	close;
}

umbala.gat,139,227,3	script	�f�C�����_��	60,{
	if(Job == Job_ArchBishop) {
		mes "[�f�C�����_��]";
		mes "�悭���Ă��������܂����B";
		mes "�F���K�˂Ă��Ă���邱�Ƃ�";
		mes "�ƂĂ����������Ƃł��B";
		next;
		mes "[�f�C�����_��]";
		mes "�M���̗��h�Ȏp�����邱�Ƃ��ł���";
		mes "�����������v���܂���B";
		mes "�ق��ق��فB";
		close;
	}
	switch(CHANGE_AB) {
	case 0:
		mes "[�f�C�����_��]";
		mes "�E���c�c�o�c�c�E���o�H";
		close;
	case 1:
		mes "[�f�C�����_��]";
		mes "�E���c�c�o�c�c�E���o�H";
		next;
		mes "[�E���o�����̎q��]";
		mes "�c�c�c�c�c�c�B";
		next;
		emotion 19;
		mes "[�f�C�����_��]";
		mes "���ꂶ��c�c�Ȃ��̂��H";
		mes "�ӂށc�c��������c�c";
		mes "�E���c�c�}�H�@�E�c�c�}�E�c�c�}�H";
		next;
		mes "[�E���o�����̎q��]";
		mes "�c�c�c�c�c�c�B";
		next;
		mes "[�f�C�����_��]";
		mes "����́A�Ȃ�Ƃ�";
		mes "���ǂ������̂��c�c�ققققق��B";
		next;
		mes "[�f�C�����_��]";
		mes "�قققققق��B";
		mes "���قققق��B�ӂނӂށB";
		next;
		menu "�f�C�����_���ł����H",-;
		emotion 1;
		mes "[�f�C�����_��]";
		mes "�c�c�͂��H";
		next;
		menu "�f�C�����_���ł͂���܂��񂩁H",-;
		mes "[�f�C�����_��]";
		mes "�W�F�c�c�E�j�����j���c�c���H";
		next;
		menu "�f�C�����_���ł���ˁI",-;
		emotion 5;
		mes "[�f�C�����_��]";
		mes "���`�A�͂��͂��B";
		mes "�����ł��B";
		mes "�����f�C�����ł��B";
		mes "�͂��߂܂��āA" + (Sex? "�Z��": "�o��") + "�a�B";
		next;
		mes "�]����������̘V�l��";
		mes "�@���΂�ł����������]";
		next;
		mes "[�f�C�����_��]";
		mes "�⒮���Y��Ă��܂��܂����B";
		mes "�ققق��B";
		mes "���ɉ�����p�ł����H";
		next;
		menu "�v�����e�����琹�n����ɗ��܂����B",-;
		emotion 1;
		mes "[�f�C�����_��]";
		mes "�c�c�c�c�H";
		next;
		mes "�]�b�𕷂����߂�";
		mes "�@�f�C�����_���������߂Â��Ă����]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�c�c�ӂ��`�B";
		mes "^FF0000�v�����e�����琹�n����ɗ��܂����I";
		mes "�v�����e�����琹�n����ɗ��܂����I";
		mes "�v�����e�����琹�n����ɗ��܂����I";
		mes "�v�����e�����琹�n����ɗ��܂����I^000000";
		next;
		emotion 5;
		mes "[�f�C�����_��]";
		mes "�ق��c�c�����ł����I";
		mes "���n����ł������B";
		mes "����҂�����̂͋v���Ԃ�ł��B";
		mes "���}���܂��B" + (Sex? "�Z��": "�o��") + "�a�B";
		next;
		mes "�]�_���͎����ɖ��������΂�������]";
		next;
		mes "[�f�C�����_��]";
		mes "���̐[���΂ɕ�܂ꂽ����";
		mes "�悭���Ă��������B";
		mes "�������ɋ���Ȏ���������͂��ł��B";
		next;
		mes "[�f�C�����_��]";
		mes "���̑傫�Ȏ���";
		mes "^3131FF�C�O�h���V��^000000�ƌ����܂��B";
		mes "�I�[�f�B�������E��n���������";
		mes "�A�����ƌ����Ă��܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�C�O�h���V���̍���";
		mes "3�̐��E�ɂ܂�����";
		mes "3�̐�֐L�тĂ��܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�j�u���w�C���ɒ��������ɂ�";
		mes "�t�x���Q���~���̐򂪁B";
		mes "�~�b�h�K���h�ɂ̓~�[�~���̐򂪁B";
		next;
		mes "[�f�C�����_��]";
		mes "�_�����̐��E�A�A�X�K���h�ɂ�";
		mes "�E���h�̐򂪂���܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "���Ƀ~�[�~���̐��";
		mes "���E�̂�����m���̎����ɁB";
		mes "��炪�I�[�f�B�����Жڂ����";
		mes "���̒m���𓾂��Ƃ����b�ł��B";
		next;
		mes "[�f�C�����_��]";
		mes (Sex? "�Z��": "�o��") + "�a�B";
		mes "��X�͐��Ȃ�ꏊ�Ő_���^��";
		mes "�����̐l����U�肩���邱�Ƃ�";
		mes "�����ɂ܂݂ꂽ�̂ƐS��";
		mes "���߂邱�Ƃ��ł��܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�����A���ꂩ��^0000FF�t�x���Q���~���̐�^000000��";
		mes "�������Ă��������B";
		mes "�ꏊ�͌�Ő������鎞��";
		mes "�n�}�ɋL���܂��傤�B";
		next;
		mes "[�f�C�����_��]";
		mes "^0000FF����H��A�}�̐�[����ւƉ��т�";
		mes "�ł������Â��ȏꏊ^000000��";
		mes "�T���Ă��������B";
		next;
		mes "[�f�C�����_��]";
		mes "���܂��ɍs���߂��Ă͂����܂���B";
		mes "�s���߂���ƁA�Ⴄ���E�ւ�";
		mes "��������ł��܂��܂�����B";
		next;
		mes "[�f�C�����_��]";
		mes "�Â��Ȏ}�̐�ɂ�����";
		mes "�h�i�ȐS�ŁA�ߋ��̍߂���������";
		mes "�����Ȑ�����񑩂���F���";
		mes "�����܂��傤�B";
		next;
		mes "[�f�C�����_��]";
		mes "�_�̌b�݂��^��";
		mes "�_�̒m�b���؂�Đ���������";
		mes "�i�߂�悤�ɋF��̂ł��B";
		next;
		mes "[�f�C�����_��]";
		mes "�F��̎菇�́A�������G�ł�����";
		mes "��Ő������܂��傤�B";
		mes "^3131FF������x�A���ɘb��������";
		mes "���������B^000000";
		set CHANGE_AB,2;
		chgquest 2187,2188;
		close;
	case 2:
	case 3:
		mes "[�f�C�����_��]";
		mes "���̐��E�ň�Ԑ��Ȃ�ꏊ�̈�B";
		mes "�t�x���Q���~���̐�ɍs����";
		mes "�_�ɋF���ĉ������B";
		next;
		viewpoint 1,110,283,1,0xFF9900;
		mes "[�f�C�����_��]";
		mes "���̐_���ȋV�����M���̍���";
		mes "�ƂĂ��������A���邭�Ƃ炵��";
		mes "�����ł��傤�B";
		next;
		if(select("�F��̎菇�ɂ��ĕ���","��b����߂�") == 2) {
			mes "[�f�C�����_��]";
			mes "���̋F�肪�M���̐l���̋ꂵ�݂�";
			mes "�����ł����点��悤�Ɂc�c";
			close;
		}
		mes "[�f�C�����_��]";
		mes "�F��̍ہA�S����4�̓���";
		mes "�������ƂɂȂ�܂��B";
		mes "���ꂩ�玄���������Ƃ�";
		mes "�悭�o���ĉ������B";
		next;
		mes "[�f�C�����_��]";
		mes "��ڂ�^3131FF�ґz�̓�^000000�B";
		mes "�̂ƐS���h�i�ɂ�";
		mes "�F��̏������s���܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�S�Ă̋F��̎n�܂�ɂȂ�";
		mes "�j���Ƌ���";
		mes "���������A�ڂ��";
		mes "�S�𖳐S�ɂ���̂ł��B";
		next;
		mes "[�f�C�����_��]";
		mes "��ڂ�^3131FF�ꂵ�݂̓�^000000�B";
		mes "���܂ł̍߂�������";
		mes "�_�ւ̎͂��𐿂��܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�ꂵ�݂�����Ȃ��ŉ������B";
		mes "����͕K�v�Ȃ��̂Ȃ̂ł��B";
		mes "�łƏ����������邱�Ƃō߂𐴎Z��";
		mes "�^���̓��ɓ���ŏ��̈����";
		mes "�Ȃ�̂ł�����B";
		next;
		mes "[�f�C�����_��]";
		mes "�O�ڂ�^3131FF����̓�^000000�B";
		mes "�S�Ă̐���������̍߂ɋꂵ�ގ҂�";
		mes "�Ԃ߂Ă���܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�܂������������������݂ɂ�";
		mes "�j����^���Ă����ł��傤�B";
		mes "��������V���ƌ����܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�M���͐���Ɋ��ӂ�";
		mes "���������݂܂��B";
		mes "^0000FF����^000000��^FF00001��^000000�A���Q���Ă��������B";
		next;
		mes "[�f�C�����_��]";
		mes "�Ō��^3131FF���̓�^000000�B";
		mes "���̐��̂��ׂĂ̐�������";
		mes "�j�����ꂽ�M����";
		mes "�S�Ă̍߂��������ꂽ";
		mes "���R�Ȑg�ƂȂ�ł��傤�B";
		next;
		mes "[�f�C�����_��]";
		mes "������ꂽ�҂͑S�Ă̐����Ƌ���";
		mes "�������̎^�̂��̂��܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�F�肪�S���I�������";
		mes "�Â��ɂ��̏ꂩ�痧������܂��傤�B";
		next;
		mes "[�f�C�����_��]";
		mes "�����A�S�̏������ł��܂������H";
		mes "�F�肪�I�������";
		mes "�����������ł����݂Ȃ���";
		mes "�y�����b�����܂��傤�B";
		if(CHANGE_AB == 2) {
			set CHANGE_AB,3;
			chgquest 2188,104260;
		}
		close;
	case 4:
		mes "[�f�C�����_��]";
		mes "��������Ȃ����B";
		mes "�ƂĂ��f���炵���F���";
		mes "�������悤�ł��ˁB";
		next;
		menu "�F��̊��z��`����",-;
		mes "[�f�C�����_��]";
		mes "�ققق��B";
		mes "�F��͎������g�ɑ΂�";
		mes "�M���ƗE�C��^���Ă���܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�����ȐS���琶�ݏo�������΂݂�";
		mes "���l�̌x���S�������A��b��������";
		mes "����邱�Ƃł��傤�B";
		mes "�ł������A�吨�̐l���܂�";
		mes "���𕪂��Ă����邱�Ƃ���؂ł��B";
		next;
		menu "���肪�Ƃ��������܂���",-;
		mes "[�f�C�����_��]";
		mes (Sex? "�Z��": "�o��") + "�a�B";
		mes "�M����1���肢������܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�V���o���c�o���h��";
		mes "^0000FF�t�B�Q��^000000�Ƃ�������";
		mes "^0000FF�V�X�^�[�E�A���W�F^000000�Ƃ���";
		mes "���E�҂����܂��B";
		next;
		mes "[�f�C�����_��]";
		mes "�ޏ��͂����A���̐��ŋꂵ��ł���";
		mes "�l�X�ׂ̈ɋF�������Ă���";
		mes "�f���炵�����E�҂ł��B";
		next;
		mes "[�f�C�����_��]";
		mes "�ł����A�t�B�Q���ōŌ�ɉ������";
		mes "�ǂ�����ꂽ�悤�ȁA�߂������";
		mes "���Ă��܂����B";
		next;
		mes "[�f�C�����_��]";
		mes "�ޏ��ɁA�C�O�h���V���ւ̏����";
		mes "�i�߂Ă��炦�܂��񂩁H";
		mes "�����Ԃ̋F��ɂ����";
		mes "�̒�������Ă���̂ł͂Ȃ�����";
		mes "�S�z���Ă���̂ł��B";
		next;
		mes "[�f�C�����_��]";
		mes "�C�O�h���V���̐��񂾋�C��";
		mes "�ޏ�����₵�Ă����ł��傤�B";
		next;
		menu "�킩��܂���",-;
		mes "[�f�C�����_��]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes (Sex? "�Z��": "�o��") + "�a�����F�肪�K�v�ɂȂ�������";
		mes "���ł������ɂ��炵�Ă��������B";
		next;
		mes "[�f�C�����_��]";
		mes "�F���K�˂Ă��Ă���邱�Ƃ�";
		mes "�ƂĂ��y�������Ƃł�����B";
		set CHANGE_AB,5;
		chgquest 104265,2189;
		close;
	default:
		mes "[�f�C�����_��]";
		mes "^0000FF�t�B�Q���̃V�X�^�[�E�A���W�F^000000��";
		mes "���C�ł������H";
		close;
	}
}

yggdrasil01.gat,226,48,0	script	#���n����yggdrasil01	844,14,14,{
	switch(CHANGE_AB) {
	default:
		mes "�]�Â��ȏꏊ���B";
		mes "�@�S�������悤�ȋC�����ɂȂ�]";
		next;
		mes "�]�v�킸�����ɑ΂���";
		mes "�@�F�����������Ȃ����]";
		close;
	case 3:
		misceffect 231;
		mes "�]�Â��ɐ����͂����Ă���";
		mes "�@�_������������B";
		mes "�@�����Ȃ�F��������̂�";
		mes "�@���傤�Ǘǂ��������]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�܂��́A�Ђ��܂����āc�c";
		mes "�F����n�߂悤�c�c";
		next;
		mes "�]�f�C�����_�����狳����ꂽ";
		mes "�@�菇���v���o���Ă݂悤�]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "��ڂ́A���̓��������H";
		next;
		if(select("���ق̓�","��ɂ̓�","�ґz�̓�") != 3) {
			emotion 20,"";
			mes "[" + strcharinfo(0) + "]";
			mes (@menu == 1? "���ق̓�": "��ɂ̓�") + "�c�c�H";
			mes "����ł͂Ȃ������C������c�c�B";
			close;
		}
		mes "[" + strcharinfo(0) + "]";
		mes "�������ґz�̓��������͂��B";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "��ڂ��ґz�̓��B";
		mes "�̂ƐS���h�i�ɂ�";
		mes "�F��̏������s���܂��B^000000";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "�S�Ă̋F��̎n�܂�ɂȂ�";
		mes "�j���Ƌ���";
		mes "���������A�ڂ��";
		mes "�S�𖳐S�ɂ���̂ł��B^000000";
		next;
		misceffect 42,"";
		mes "�]�M���͐[�ċz�������";
		mes "�@�������ڂ�����]";
		next;
		mes "�]�Î�̒��ŕ������Ă���j���̉���";
		mes "�@�S�����₩�ɂȂ�̂��������B";
		mes "�@�G�O��U�藎�Ƃ��A�ł��邩����";
		mes "�@�Î���ێ�����]";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		mes "�c";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "��ڂ͋ꂵ�݂̓��B";
		mes "���܂ł̍߂�������";
		mes "�_�ւ̎͂��𐿂��܂��B^000000";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���܂ł̐����Ă�������";
		mes "�ǂ̂悤�ȉ߂���Ƃ������낤�H";
		mes "������ʂ��āA�_�Ɏ͂���";
		mes "�����Ƃ��悤�B";
		next;
		input '@str$;
		mes "[" + strcharinfo(0) + "]";
		mes "�S�m�S�\�̐_�A�I�[�f�B����";
		mes "���̍߂��������܂��B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "^3131FF" + '@str$ + "^000000";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���ߐ[���I�[�f�B����B";
		mes "���E�҂̔C�����Ȃ�������ɂ���";
		mes "�ߐ[�������ǂ������͂����������B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�_�̉p�m�ŁA���̋����Ȑ��E�҂�";
		mes "���������֓����Ă��������B";
		next;
		mes "�]�������J��Ԃ�";
		mes "�@�Â��ɋF��𑱂����]";
		next;
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		mes "�c";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "�O�ڂ͊���̓��B";
		mes "�S�Ă̐���������̍߂ɋꂵ�ގ҂�";
		mes "�Ԃ߂Ă���܂��B^000000";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "�܂������������������݂ɂ�";
		mes "�j����^���Ă����ł��傤�B";
		mes "��������V���ƌ����܂��B^000000";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "�M���͐���Ɋ��ӂ�";
		mes "���������݂܂��B^000000";
		next;
		if(countitem(523) < 1) {
			emotion 0,"";
			mes "[" + strcharinfo(0) + "]";
			mes "�����A�����������ė��Ă��Ȃ��I";
			close;
		}
		misceffect 86,"";
		mes "�]�������Ɛ����Ɍ���t�����]";
		next;
		misceffect 78,"";
		mes "�c�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		next;
		mes "�c�c�c�c";
		mes "�c�c�c";
		mes "�c�c";
		mes "�c";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "�Ō�͌��̓��B";
		mes "���̐��̂��ׂĂ̐�������";
		mes "�j�����ꂽ�M����";
		mes "�S�Ă̍߂��������ꂽ";
		mes "���R�Ȑg�ƂȂ�ł��傤�B^000000";
		next;
		mes "^3131FF[�f�C�����_��]";
		mes "������ꂽ�҂͑S�Ă̐����Ƌ���";
		mes "�������̎^�̂��̂��܂��B^000000";
		next;
		mes "�]�������[�ċz�����";
		mes "�@���炩�Ɏ^�̂��̂��n�߂��]";
		next;
		mes "�]���񂾐�ɐ��Ȃ�a��������";
		mes "�@�X�ɗ�������̉��������ɉ����]";
		next;
		misceffect 75,"";
		mes "[" + strcharinfo(0) + "]";
		mes "�w�C���_���̎q���B�݂͂�";
		mes "�傫�����̉��ŏW�܂����B";
		next;
		misceffect 75,"";
		mes "[" + strcharinfo(0) + "]";
		mes "�؂̏�̑傫������";
		mes "���ɐ��E�̒m�b�������Ă��ꂽ�B";
		mes "�؂̉��̑傫���T��";
		mes "���𐢊E�̋��Ђ�������Ă��ꂽ�B";
		next;
		misceffect 75,"";
		mes "[" + strcharinfo(0) + "]";
		mes "���@���n���̎�͗����オ��";
		mes "���E��������������������B";
		next;
		misceffect 75,"";
		mes "[" + strcharinfo(0) + "]";
		mes "���̕��A�m�b�̎��l��";
		mes "���ׂ̈ɉ̂����܂��B";
		mes "�P�������̔t�̎��";
		mes "���ׂ̈ɐ��Ȃ�\����^�����܂��B";
		next;
		misceffect 42,"";
		misceffect 77,"";
		mes "�]�̂��I����ƐM�S������";
		mes "�@�����Ɏ���Ă���悤��";
		mes "�@�S�����C�����ɂȂ����]";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���āc�c�F����ς񂾂���";
		mes "�f�C�����_���̌��ɖ߂낤�B";
		set CHANGE_AB,4;
		chgquest 104260,104265;
		close2;
		warp "umbala.gat",138,219;
		end;
	case 4:
		mes "[" + strcharinfo(0) + "]";
		mes "���āc�c�F����ς񂾂���";
		mes "�f�C�����_���̌��ɖ߂낤�B";
		close2;
		warp "umbala.gat",138,219;
		end;
	}
OnTouch:
	if(CHANGE_AB == 3 || CHANGE_AB == 4) {
		misceffect 231;
	}
	end;
}

//============================================================
// ���@���L���[�̈���
//------------------------------------------------------------
hu_in01.gat,205,204,7	script	�F��V�X�^�[	79,{
	if(CHANGE_AB == 5) {
		mes "[�F��V�X�^�[]";
		mes "�V�X�^�[�E�A���W�F�����T���ł����H";
		mes "�ޏ��Ȃ�^0000FF����ׂ̗ɂ���D����^000000��";
		mes "�F���Ă���Ǝv���܂���B";
		close;
	}
	mes "�]�Â��ȋ���̒��ɘȂ�";
	mes "�@�V�X�^�[��������B";
	mes "�@�ڂ���ċF���Ă���悤���]";
	next;
	mes "�]�ז������Ȃ��悤��";
	mes "�@�Â��ɂ��̏ꂩ�痧���������]";
	close;
}

hugel.gat,193,103,3	script	�V�X�^�[�E�A���W�F	79,{
	if(Job == Job_ArchBishop) {
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�ƂĂ�����₩�ȐS�n�ł��B";
		mes "�M���������������烔�@���L���[��";
		mes "�~���o���Ă��ꂽ�̂ł��ˁH";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "����Ŏ��������ɔY�܂���邱�Ƃ�";
		mes "�Ȃ������ł��B";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		close;
	}
	switch(CHANGE_AB) {
	default:
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�I�[�f�B���_�a�Ɍ�������̂ł�����";
		mes "�\���ɒ��ӂ��Ă��������B";
		mes "���������ɂ����";
		mes "�_�a�͐苒����Ă����Ԃł��B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�ł��邱�ƂȂ爫��������";
		mes "�ǂ����������̂Ɂc�c�B";
		mes "���ɂł��邱�Ƃ�";
		mes "��������I�[�f�B���̐_�a�Ɍ�����";
		mes "�F�邱�Ƃ����c�c�B";
		close;
	case 5:
		mes "[" + strcharinfo(0) + "]";
		mes "���́c�c���݂܂���B";
		mes "�V�X�^�[�E�A���W�F�ł����H";
		next;
		emotion 1;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�͂��A�����A���W�F�ł����c�c";
		mes "���ɉ�����p�ł��傤���H";
		next;
		mes "�]�E���o���̃f�C�����_������";
		mes "�@���܂�ė������Ƃ�`�����]";
		next;
		emotion 0;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "����A�f�C�����_������c�c�B";
		mes "�f�C�����_���͂����C�ł������H";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�������΂ł��̂�";
		mes "�q���݂����ɏ��^�ȕ��ł���ˁB";
		mes "�ӂӂ��B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�f�C�����_���͋M���̂��Ƃ�";
		mes "�S�z���Ă��܂�����B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "����A�܂��c�c�B";
		mes "�{���ɐe�؂ȕ��ł��ˁB";
		mes "�f�C�����_�����A" + (Sex? "�Z��": "�o��") + "�a���B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�����A���S�z�ɂ͋y�т܂���B";
		mes "�������ɂ��Ȃ����";
		mes "�����΂����ꂽ�����ł���B";
		next;
		menu "�������H",-;
		emotion 54;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "���ꂪ�c�c�B";
		mes "���́A���������ɕ��C�������̓�����";
		mes "�����������n�߂��̂ł��B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�ŏ��̍��́A���@���L���[��";
		mes "�Èł̒��Ŕ߂���ł��閲�ł����B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���@���L���[�H";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�͂��B";
		mes "�ޏ��͈Â��ł̒��ō��荞��";
		mes "�܂𗬂��Ă��܂����B";
		mes "�܂�ŁA�H��؂藎�Ƃ��ꂽ";
		mes "���̂悤�Ɂc�c�B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�������A���Ԃ��o�ɂ�";
		mes "���͍����Ȃ��Ă������̂ł��B";
		mes "���ł̓��@���L���[���������ɔ����";
		mes "�Ō�ɂ́A���������Ƀo���o����";
		mes "����Ă��܂��̂ł��B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "���܂�ɍ������Łc�c";
		mes "���͑�����܂Ƃ��ɂł���";
		mes "���Ȃ��ꂽ����ɖڂ��o�߂܂��B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "���@���L���[�̎������߂�Ȃ��";
		mes "�ƂĂ��炢���ł��ˁB";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�����̈����Ȃ̂ł��傤���H";
		mes "������������A�������Î����Ă���";
		mes "�̂ł͂Ȃ����Ǝv���̂ł��B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "���͐S��Â߂�ׂ�";
		mes "�I�[�f�B���_�a�ɍs��";
		mes "�~�T������悤�Ƃ����̂ł����c�c";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�_�a�͂��łɈ����̑��A��";
		mes "�Ȃ��Ă��܂��Ă���";
		mes "�����Ԃ���������܂���ł����B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�c�c���̓I�[�f�B���_�a�̈����B��";
		mes "�֌W������̂ł͂Ȃ��ł��傤���H";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�c�c������������܂���B";
		mes "�������A���ɂł��邱�Ƃ�";
		mes "��������I�[�f�B���̐_�a�Ɍ�����";
		mes "�F�邱�Ƃ����c�c�B";
		next;
		if(select("�������ׂĂ݂܂��傤","�ꏏ�ɋF�������܂��傤") == 2) {
			mes "[�V�X�^�[�E�A���W�F]";
			mes "���肪�Ƃ��������܂��B";
			mes "���������ɕ����Ȃ��悤";
			mes "���ȏ�Ɋ撣����";
			mes "�F�������邱�Ƃɂ��܂��B";
			close;
		}
		emotion 0;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�������H";
		mes "�ł����A�_�a�͖{���Ɋ댯�Ȃ̂ł��I";
		next;
		menu "����M���Ă�������",-;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�Ȃ�Ƃ����S���������t�B";
		mes "�M���������~�߂邱�Ƃ�";
		mes "�ł��Ȃ��悤�ł��ˁc�c�B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�ł����玄��";
		mes "����̏��L����D���g����";
		mes "�I�[�f�B���_�a�܂ł��ē��������܂��B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�����ƋM����_�a�Ɉē����邱�Ƃ�";
		mes "���ɉۂ���ꂽ�g���Ȃ̂ł��傤�B";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�����A�������ł��܂�����";
		mes "^0000FF���ɐ����|���Ă��������B^000000";
		mes "�I�[�f�B���_�a�܂łɌ������܂��傤�B";
		set CHANGE_AB,6;
		chgquest 2189,2190;
		close;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�I�[�f�B���_�a�Ɍ�����";
		mes "�����͂ł��܂������H";
		next;
		if(countitem(523) < 1) {
			mes "[�V�X�^�[�E�A���W�F]";
			mes "�_�a�ɂ͈������p�j���Ă��Ċ댯�ł��B";
			mes "^FF0000�K�������������čs���Ă��������B^000000";
			next;
		}
		if(select("�����͂ł��Ă��܂�","������Ƒ҂��Ă�������") == 2) {
			mes "[�V�X�^�[�E�A���W�F]";
			mes "�������ł��܂�����";
			mes "�����|���Ă��������B";
			close;
		}
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�킩��܂����B";
		if(CHANGE_AB > 6) {
			mes "�O��̓I�[�f�B���_�a�Ɍ������r��";
			mes "�M���̎p���D��������Ă��܂�";
			mes "�S�z���Ă���܂������A";
			mes "�������Ȃ悤�ň��S���܂����B";
			next;
			mes "[�V�X�^�[�E�A���W�F]";
		}
		mes "�����A�Q��܂��傤�B";
		next;
		mes "�]�V�X�^�[�E�A���W�F�Ƌ��ɑD�ɏ��";
		mes "�@�I�[�f�B���_�a�Ɍ������r��";
		mes "�@�ˑR�A���̒��ɐ����������Ă����]";
		next;
		mes "�]���ɏW�����悤�Ƃ����u��";
		mes "�@���E���^�����ɂȂ�";
		mes "�@�ӎ��������Ă��܂����]";
		close2;
		warp "job3_arch01.gat",29,29;
		end;
	case 11:
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�ƂĂ�����₩�ȐS�n�ł��B";
		mes "�M���������������烔�@���L���[��";
		mes "�~���o���Ă��ꂽ�̂ł��ˁH";
		next;
		mes "[�V�X�^�[�E�A���W�F]";
		mes "����Ŏ��������ɔY�܂���邱�Ƃ�";
		mes "�Ȃ������ł��B";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		if(select("���@���L���[�̂��Ƃ֌�����","��b����߂�") == 2) {
			mes "[�V�X�^�[�E�A���W�F]";
			mes "���@���L���[�̂��ƂɌ������ۂ�";
			mes "���ɐ��������Ă��������ˁB";
			close;
		}
		mes "[�V�X�^�[�E�A���W�F]";
		mes "�킩��܂����B";
		mes "�����A�Q��܂��傤�B";
		close2;
		warp "job3_arch02.gat",278,235;
		end;
	}
}

job3_arch01.gat,29,34,3	script	���@���L���[	403,{
	switch(CHANGE_AB) {
	default:	// ������
		warp "hugel.gat",191,103;
		end;
	case 6:
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[]";
		mes "�V��ɂ͏����̊p�J��";
		mes "�苿���Ă���̂�";
		mes "��΂Ȃ����͑�n�𔇂�";
		mes "���ɖłтĂ��܂��̂��c�c�B";
		mes "�����A�ɍ��̋ɂ݂��I";
		next;
		emotion 0;
		mes "�]���@���L���[�́A������ɋC�Â���";
		mes "�@�{��̌`�����ɂ݂��Ă����]";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[]";
		mes "�K�ł̋�ɂ̒��Ő����Ă���";
		mes "�w�C���_���̎q���ł͂Ȃ����B";
		mes "����ȂƂ���ɉ��̗p���H";
		next;
		mes "[���@���L���[]";
		mes "���̃A���O�q���f��";
		mes "�ߎS�ȉ^������������ׂɗ����̂��H";
		next;
		cutin "3rd_ab_anghilde01",255;
		mes "[" + strcharinfo(0) + "]";
		mes "�܂����I";
		mes "���͋M����T���Ă����̂ł��B";
		next;
		cutin "3rd_ab_anghilde01",1;
		emotion 1;
		mes "[�A���O�q���f]";
		mes "�c�c����T���Ă������ƁH";
		mes "�����~�b�h�K���h�ɗ��܂��Ă���";
		mes "���Ƃ͎�������";
		mes "�l�ԂƂ͌���邱�Ƃ̂Ȃ��^�����B";
		next;
		mes "[�A���O�q���f]";
		mes "�������A�M�l�̑_����";
		mes "���@���n���֒H�蒅�����ƂȂ̂��ȁH";
		mes "�������A����͊���ʖ]�݂��B";
		next;
		mes "[�A���O�q���f]";
		mes "���̓A�X�K���h�ɂďd������";
		mes "�Ǖ����ꂽ�g�B";
		next;
		mes "[�A���O�q���f]";
		mes "���̍��̔C���́A���̏����ȓ���";
		mes "��邱�Ƃł���";
		mes "���̕��̌��ɐl�Ԃ�";
		mes "�������Ƃł͂Ȃ��B";
		next;
		cutin "3rd_ab_anghilde01",255;
		mes "[" + strcharinfo(0) + "]";
		mes "�����ł͂���܂���B";
		mes "�M���������邽�߂�";
		mes "���͂����ɗ����̂ł��B";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f]";
		mes "�͂͂��I";
		mes "�l�Ԃ��Ƃ����A���̎��������邾�ƁH";
		next;
		mes "[�A���O�q���f]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "�]���@���L���[�͋}�ɖق��";
		mes "�@�Â��ɂ�����̗l�q�����Ă���]";
		next;
		mes "[�A���O�q���f]";
		mes "�l�Ԃ�A������B";
		mes "�{���Ɏ���������ׂ�";
		mes "�����ɗ����ƌ����̂��H";
		next;
		if(select("�͂�","������") == 2) {
			cutin "3rd_ab_anghilde03",1;
			mes "[���@���L���[]";
			mes "���͎q���̈��Y�������ق�";
			mes "����ł͂Ȃ����I";
			close2;
			cutin "3rd_ab_anghilde01",255;
			warp "hugel.gat",191,103;
			end;
		}
		mes "[�A���O�q���f]";
		mes "�c�c�������B";
		mes "����ȏ�g�������ꏊ������";
		mes "�����������͂��Ȃ��ȏ�";
		mes "�M�l�ɗ���̂������Ȃ��B";
		next;
		mes "[�A���O�q���f]";
		mes "���͖{���A�I�[�f�B���l�̖��߂ɏ]��";
		mes "���@���n���Ɉ��������m�B��";
		mes "����郔�@���L���[�������B";
		next;
		mes "[�A���O�q���f]";
		mes "�������A�����ȉ߂���";
		mes "�I�[�f�B���l�̘T�ł���";
		mes "�t���L�����������Ă��܂����B";
		next;
		mes "[�A���O�q���f]";
		mes "���̔��Ƃ��āA�A�X�K���h��";
		mes "�Ǖ�����A���̓������Ƃ���";
		mes "���߂��󂯂��̂��B";
		next;
		mes "[�A���O�q���f]";
		mes "�s�{�ӂł͂�������";
		mes "���̓��̓I�[�f�B���l�⑼�̐_�X��";
		mes "�`�����c��M�d�ȏꏊ�B";
		next;
		mes "[�A���O�q���f]";
		mes "���͈�Ղ�����";
		mes "���n�Ƃ��Ẳ��l�����߂邱�Ƃ�";
		mes "�s�͂����B";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[]";
		mes "�c�c�����A�����";
		mes "���̓��Ɉ����B�����ꂽ�B";
		next;
		mes "[�A���O�q���f]";
		mes "���͑S�͂ň����B�ɐ킢�𒧂񂾂�";
		mes "���X�ƌ���鈫���̌R���ɔs��";
		mes "���̏ꏊ�ɕ��󂳂�Ă��܂����̂��B";
		next;
		mes "[�A���O�q���f]";
		mes "����ɁA���Ȃ�_�a�͈����B�ɂ����";
		mes "������Ă����̂��낤�B";
		mes "�����c�c���͂��܂ł����";
		mes "�s���_�ȉ^���ɖ|�M�����̂��I";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f]";
		mes "�c�c�w�C���_���̎q����B";
		mes "�M�l�̖��O�͂Ȃ�ƌ����̂��H";
		next;
		cutin "3rd_ab_anghilde01",255;
		mes "[" + strcharinfo(0) + "]";
		mes strcharinfo(0) + " �ł��B";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f]";
		mes strcharinfo(0) + "��B";
		mes "���@���L���[�Ƃ��Ă̒p��E���";
		mes "���������߂�B";
		next;
		mes "[�A���O�q���f]";
		mes "�����͂𕕈󂳂�Ă���ȏ�";
		mes "�V��ɂ��̏�Ԃ�񍐂�";
		mes "���R��v�����Ȃ���΂Ȃ�Ȃ��B";
		next;
		menu "�ǂ�����΂����̂ł����H",-;
		mes "[�A���O�q���f]";
		mes "^0000FF�_�a�̈�ԍ�������";
		mes "�����̊p�J�𐁂���^000000";
		mes "�V��̃��@���L���[�B�ƘA��������B";
		next;
		mes "[�A���O�q���f]";
		mes "�������A�p�J��2�ɔj�󂳂��";
		mes "�ǂ����ɔj������Ă��܂����B";
		next;
		mes "[�A���O�q���f]";
		mes "���ꂩ��A���O��_�a�ɑ���B";
		mes "�܂��́A^FF0000��ꂽ�p�J�̌���^000000��";
		mes "������̂��B";
		next;
		mes "[�A���O�q���f]";
		mes "2�̌��Ђ���������";
		mes "�_�a�̈�ԍ����ꏊ�ɍs���B";
		mes "���̌�̂��Ƃ́A���ɔC����B";
		next;
		mes "[�A���O�q���f]";
		mes "�������ł�����";
		mes "�ēx�A�b���|���Ă���B";
		set CHANGE_AB,7;
		chgquest 2190,104270;
		close2;
		cutin "3rd_ab_anghilde01",255;
		end;
	case 7:
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f]";
		mes strcharinfo(0) + "��B";
		mes "������_�a�ɑ��邪";
		mes "�����͂ł��Ă��邩�H";
		next;
		if(select("�����͂ł��Ă��܂�","�܂��҂��Ă�������") == 2) {
			mes "[�A���O�q���f]";
			mes "�������ł�����";
			mes "�ēx�A�b���|���Ă���B";
			close2;
			cutin "3rd_ab_anghilde01",255;
			end;
		}
		mes "[�A���O�q���f]";
		mes "�ł́A���񂾂��I";
		set CHANGE_AB,8;
		chgquest 104270,2191;
		close2;
		cutin "3rd_ab_anghilde01",255;
		warp "job3_arch02.gat",121,50;
		end;
	case 8:
	case 9:
	case 10:
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f]";
		mes "���v���A�l�Ԃ�B";
		mes "�\�z�ǂ���A�ȒP�ł͂Ȃ���";
		mes "�Ē��킷�邩�H";
		next;
		switch(select("�Ē��킵�܂�","�܂��҂��Ă�������","�t�B�Q���ɖ߂肽��")) {
		case 1:
			mes "[�A���O�q���f]";
			mes "�ł́A���񂾂��I";
			set CHANGE_AB,8;
			close2;
			cutin "3rd_ab_anghilde01",255;
			warp "job3_arch02.gat",121,50;
			end;
		case 2:
			mes "[�A���O�q���f]";
			mes "�������ł�����";
			mes "�ēx�A�b���|���Ă���B";
			close2;
			cutin "3rd_ab_anghilde01",255;
			end;
		case 3:
			mes "[�A���O�q���f]";
			mes "�����ɖ߂�̂��H";
			mes "����Ȃ玄�͑҂��Ă��悤�B";
			close2;
			cutin "3rd_ab_anghilde01",255;
			warp "hugel.gat",191,103;
			end;
		}
	}
}

job3_arch02.gat,122,48,0	script	#arch02out	45,1,1,{
	if(CHANGE_AB >= 8 && CHANGE_AB < 11) {
		warp "job3_arch01.gat",29,29;
		end;
	}
	warp "hugel.gat",191,103;
	end;
}

job3_arch02.gat,121,50,0	script	#�R���p�X_1_job3_arch02	139,1,1,{
OnTouch:
	switch(CHANGE_AB) {
	case 8:
		viewpoint 1,113,327,0,0xFF0000;
		viewpoint 1,273,235,1,0x00FFFF;
		break;
	case 9:
		viewpoint 1,244,46,0,0xFF0000;
		viewpoint 1,273,235,1,0x00FFFF;
		break;
	case 10:
		viewpoint 1,273,235,1,0x00FFFF;
		break;
	}
	end;
}

job3_arch02.gat,113,327,5	script	���@���L���[�̈���	403,{
	switch(CHANGE_AB) {
	default:
		mes "�]�ڂ̑O�ɋ��̕\��𕂂���";
		mes "�@������\���郔�@���L���[��";
		mes "�@�p��������]";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[�̈���]";
		mes "�������������痧������I";
		mes "����킵�������ǂ��߁I";
		mes "���̐n�ŁA���̐g���o���o����";
		mes "�؂�􂩂ꂽ���̂��I";
		next;
		cutin "3rd_ab_anghilde03",255;
		mes "�]������̎p�������Ă��Ȃ��炵���B";
		mes "�@�ǂ���琳�C�������Ă���悤���]";
		close;
	case 8:
		mes "�]�ڂ̑O�ɋ��̕\��𕂂���";
		mes "�@������\���郔�@���L���[��";
		mes "�@�p��������]";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[�̈���]";
		mes "�������������痧������I";
		mes "����킵�������ǂ��߁I";
		mes "���̐n�ŁA���̐g���o���o����";
		mes "�؂�􂩂ꂽ���̂��I";
		next;
		mes "�]������̎p�������Ă��Ȃ��炵���B";
		mes "�@�ǂ���琳�C�������Ă���悤���]";
		next;
		mes "�]�Ȃ�Ƃ��Ȃ��߂�";
		mes "�@�b�𕷂������Ƃ��낾���c�c�]";
		next;
		if(select("�Â��ɖ����","�r�X���������") == 2) {
			cutin "3rd_ab_anghilde03",255;
			mes "�]�r�X��������̖��O�𖼏�����]";
			next;
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "�ق�A�����߁I";
			mes "�M�l�̖��O�Ȃǒm�������Ƃ��I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@�����U��񂵂Ė\��n�߂��]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]�b�𕷂��Ă��炤�͓̂�������B";
			mes "�@���΂炭���Ă���";
			mes "�@������x�b���|���Ă݂悤�]";
			close;
		}
		mes "�]�Â��Ɏ���̖��O�𖼏�����]";
		next;
		mes "[���@���L���[�̈���]";
		mes strcharinfo(0) + "���Ɓc�c�B";
		mes "���̖��O�͂ǂ����ŕ��������Ƃ��c�c�B";
		mes "�����c�c�v���o����c�c�B";
		next;
		if(select("�������g�����v���o���Ă�������","�܂��͗��������Ă�������") == 1) {
			cutin "3rd_ab_anghilde01",1;
			emotion 0;
			mes "[���@���L���[�̈���]";
			mes "�������I";
			mes "���̎g���́A��������������ǂ���";
			mes "�r�����邱�Ƃ��I";
			next;
			cutin "3rd_ab_anghilde03",1;
			mes "[���@���L���[�̈���]";
			mes "�܂��͋M�l����r�����Ă�낤�I";
			mes "���̐���ɐN���������Ƃ�";
			mes "������邪�����I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@�����U��񂵂Ė\��n�߂��]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]�b�𕷂��Ă��炤�͓̂�������B";
			mes "�@���΂炭���Ă���";
			mes "�@������x�b���|���Ă݂悤�]";
			close;
		}
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "���́A���̐������삷��ҁc�c�B";
		mes "�I�[�f�B���l�̖����󂯂�";
		mes "�h�����郔�@���L���[�c�c�B";
		next;
		mes "�]���@���L���[��";
		mes "�@���������������悤�Ɍ�����]";
		next;
		if(select("�f������C�ɋ߂Â�","�������ƈ���߂Â�") == 1) {
			cutin "3rd_ab_anghilde03",1;
			emotion 0;
			mes "[���@���L���[�̈���]";
			mes "�߂Â��ȁI";
			mes "������f�����悤�Ƃ����̂��I";
			mes "�c�O�����A����Ȏ�͒ʗp���Ȃ����I";
			next;
			mes "[���@���L���[�̈���]";
			mes "�����A�߂Â��Ă݂�I";
			mes "���̐g��^����ɂ��Ă����I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@�����U��񂵂Ė\��n�߂��]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]�b�𕷂��Ă��炤�͓̂�������B";
			mes "�@���΂炭���Ă���";
			mes "�@������x�b���|���Ă݂悤�]";
			close;
		}
		mes "[���@���L���[�̈���]";
		mes "�����c�c!?";
		mes "���̎p�́A�����ł͂Ȃ��̂��H";
		mes "����A�l�Ԃɉ������������������I";
		next;
		if(select("���₩�Ɏ^���̂��̂�","�������@��") == 2) {
			mes "�]���@���L���[���������@�����]";
			next;
			cutin "3rd_ab_anghilde03",1;
			emotion 0;
			mes "[���@���L���[�̈���]";
			mes "�M�l�͉��l�̂��肾�I";
			mes "���̋�Y��m�炸��";
			mes "����������肩�I";
			next;
			mes "[���@���L���[�̈���]";
			mes "����f�킷�����߁I";
			mes "�������ɁA���̑O�������������I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@�����U��񂵂Ė\��n�߂��]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]�b�𕷂��Ă��炤�͓̂�������B";
			mes "�@���΂炭���Ă���";
			mes "�@������x�b���|���Ă݂悤�]";
			close;
		}
		cutin "3rd_ab_anghilde01",255;
		misceffect 75,"";
		mes "�]���₩�Ɏ^���̂��̂��グ���]";
		next;
		cutin "3rd_ab_anghilde02",1;
		mes "[���@���L���[�̈���]";
		mes "�����c�c�B";
		mes "����́A�_���]����́I";
		mes "�Ȃ�ƐS�n�悢�����Ȃ̂��I";
		next;
		misceffect 77;
		mes "[���@���L���[�̈���]";
		mes "�����c�c�B";
		mes "���Ȃ�̐��ɂ����";
		mes "���̋�Y�������Ă����悤���c�c�B";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "�c�c�l�Ԃ�A�M�l�̂�������";
		mes "��Y����J������";
		mes "���C�����߂����Ƃ��ł����B";
		next;
		mes "[���@���L���[�̈���]";
		mes "�������A������ꎞ�I�Ȃ��Ƃ��c�c�B";
		mes "�����ɂ܂��A���͋�Y�Ɏ�����";
		mes "���܂����낤�c�c�����c�c�I";
		next;
		mes "[���@���L���[�̈���]";
		mes "�������C��ۂ��Ă���Ԃ�";
		mes "�����n���Ă����B";
		mes "��ꂽ�p�J�̌��Ђ��c�c�B";
		next;
		mes "[���@���L���[�̈���]";
		mes "���ꂾ���ł́A���ɗ����Ȃ��B";
		mes "����^FF00001�̌���^000000��T���̂��c�c�B";
		mes "���𐳋C�ɖ߂��Ă��ꂽ�M�l�Ȃ�";
		mes "�T���o�����Ƃ��ł���͂��B";
		next;
		if(checkitemblank() < 1) {
			mes "[���@���L���[�̈���]";
			mes "�ו���������";
			mes "��ꂽ�p�J�̌��Ђ����ĂȂ��悤���ȁB";
			mes "�����i�̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close2;
			cutin "3rd_ab_anghilde01",255;
			end;
		}
		mes "[���@���L���[�̈���]";
		mes "���񂾂��c�c�B";
		mes "�����A�����s���Ă���c�c�B";
		mes "���X�����A���̂悤�ȏ�Ȃ��p��";
		mes "�l�Ɍ���ꂽ���͂Ȃ��c�c�B";
		set CHANGE_AB,9;
		chgquest 2191,104275;
		getitem 6154,1;		// ��ꂽ�p�J�̌���
		viewpoint 1,244,46,0,0xFF0000;
		close2;
		cutin "3rd_ab_anghilde01",255;
		end;
	case 9:
	case 10:
	case 11:
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "��ꂽ�p�J�̌��Ђ�";
		mes "����1�T���̂��c�c�B";
		mes "���𐳋C�ɖ߂��Ă��ꂽ�M�l�Ȃ�";
		mes "�T���o�����Ƃ��ł���͂��B";
		next;
		mes "[���@���L���[�̈���]";
		mes "���񂾂��c�c�B";
		mes "�����A�����s���Ă���c�c�B";
		mes "���X�����A���̂悤�ȏ�Ȃ��p��";
		mes "�l�Ɍ���ꂽ���͂Ȃ��c�c�B";
		close2;
		cutin "3rd_ab_anghilde01",255;
		end;
	}
}

job3_arch02.gat,244,46,5	script	���@���L���[�̈���	403,{
	switch(CHANGE_AB) {
	default:
		mes "�]�����U��񂵖\��Ă���";
		mes "�@���@���L���[������]";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[�̈���]";
		mes "�O�D�D�I";
		mes "��������������ǂ��߁I";
		mes "�����{��̓S�Ƃ�";
		mes "�S�đł��ӂ��Ă��I";
		next;
		cutin "3rd_ab_anghilde03",255;
		mes "�]�{��̌`���ł������";
		mes "�@�ɂ݂��Ă���B";
		mes "�@���S�ɐ��C�������Ă���悤���]";
		close;
	case 8:
		mes "�]�����U��񂵖\��Ă���";
		mes "�@���@���L���[������]";
		next;
		mes "�]���������悤�Ƃ��邪";
		mes "�@�܂������߂Â����Ƃ��ł��Ȃ��]";
		next;
		mes "�]��������ʂ̏ꏊ��T����������";
		mes "�@�ǂ��������]";
		close;
	case 9:
		mes "�]�����U��񂵖\��Ă���";
		mes "�@���@���L���[������]";
		next;
		cutin "3rd_ab_anghilde03",1;
		mes "[���@���L���[�̈���]";
		mes "�O�D�D�I";
		mes "��������������ǂ��߁I";
		mes "�����{��̓S�Ƃ�";
		mes "�S�đł��ӂ��Ă��I";
		next;
		mes "�]�{��̌`���ł������";
		mes "�@�ɂ݂��Ă���B";
		mes "�@���S�ɐ��C�������Ă���悤���]";
		next;
		switch(select("�s���ɂݕԂ�","������C�ō����𑣂�","�ڂ�����ґz����")) {
		case 1:
			emotion 0;
			mes "[���@���L���[�̈���]";
			mes "�ق��A���Ɛn����������肩�I";
			mes "�ǂ��낤�A�䂪�K�E�̈ꌂ��";
			mes "�H�炤�������I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		case 2:
			emotion 0;
			mes "[���@���L���[�̈���]";
			mes "�b�������̎��Ԃ�";
			mes "���łɉ߂������Ă���I";
			mes "���݂͌��̌��Ō��������鎞���I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		case 3:
			break;
		}
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "�M�l�A���̂��肾�H";
		mes "�G��ڂ̑O�ɂ��Ėڂ����ȂǁI";
		mes "���̊o�傪�ł����Ƃ������Ƃ��I";
		next;
		switch(select("�}���ŕى�����","�Â����ґz�𑱂���","�吺�Ŏ^���̂��̂�")) {
		case 1:
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "�N���M�l�̂悤�Ȏ҂̘b��";
			mes "�����X������̂��I";
			mes "�������A�������s���Ă�����I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		case 2:
			break;
		case 3:
			cutin "3rd_ab_anghilde01",255;
			misceffect 75,"";
			mes "�]�^���̂����炩�ɉ̂��グ��]";
			next;
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "���͉̂Ȃǒ��������͂Ȃ��I";
			mes "���̌������I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		}
		mes "[���@���L���[�̈���]";
		mes "�c�c���Ɛ키�C�͖����ƌ������Ƃ��H";
		mes "���O�͈�̉��҂��B";
		mes "�Ȃ��A���̑O�ɗ��̂��H";
		next;
		mes "�]���@���L���[��";
		mes "�@���������������悤�Ɍ�����";
		next;
		switch(select("�ґz�𑱂���","�͂�����ƍ����𑣂�","�吺�Ŏ^���̂��̂�")) {
		case 1:
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "����ɓ�����C�͖����̂��ȁH";
			mes "�M�l�̂悤�Ȏ҂ɂ͋����͖����B";
			mes "���������̑O���玸����I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		case 2:
			break;
		case 3:
			cutin "3rd_ab_anghilde01",255;
			misceffect 75,"";
			mes "�]�^���̂����炩�ɉ̂��グ��]";
			next;
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "���͉̂Ȃǒ��������͂Ȃ��I";
			mes "���̌������I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		}
		emotion 1;
		mes "[���@���L���[�̈���]";
		mes "���ɍ߂���������ƌ����̂��H";
		mes "�h�����郔�@���L���[��";
		mes "��������߂Ȃǁc�c";
		next;
		cutin "3rd_ab_anghilde01",255;
		mes "[" + strcharinfo(0) + "]";
		mes "����̍߂��������邱�Ƃ�";
		mes "�ꂵ�����ł���";
		mes "�_�͕K���M���̍߂�";
		mes "�͂��Ă��������܂��B";
		next;
		mes "[" + strcharinfo(0) + "]";
		mes "�M���̋ꂵ�݂�";
		mes "�₪�Ċ���Ɏ���ł��傤�B";
		mes "�����A�M���̍߂�������";
		mes "�_�Ɏ͂��𐿂��̂ł��B";
		next;
		cutin "3rd_ab_anghilde02",1;
		mes "[���@���L���[�̈���]";
		mes "�����c�c";
		mes "�������ꂪ�����Ƃ����";
		mes "�ǂꂾ����΂������Ƃ��c�c�B";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "���͎���̕s���ӂ�";
		mes "�I�[�f�B���l�̘T�ł���";
		mes "�t���L�������Ă��܂����B";
		next;
		mes "[���@���L���[�̈���]";
		mes "�����č��́A�����ǂ��ɒǂ�����";
		mes "���̐_�a�����Ƃ����g��������";
		mes "��ꂸ�ɂ���I";
		next;
		mes "[���@���L���[�̈���]";
		mes "���̕s�b�㖳������";
		mes "�_�͎͂��Ă�������Ƃ����̂��I";
		next;
		if(select("���@���L���[�ɐ�����U�肩����","�����Ő���������") == 2) {
			cutin "3rd_ab_anghilde01",255;
			if(countitem(523) < 1) {
				mes "�]�������������Ƃ�����";
				mes "�@�����������Ă��Ȃ������]";
				next;
				mes "�]��������ɓ���Ă���";
				mes "�@�b���|�����ق����ǂ��������]";
				close;
			}
			mes "�]�����ɂ������ƌ��������B";
			mes "�@�������A�����N����C�z�͂Ȃ��]";
			next;
			cutin "3rd_ab_anghilde03",1;
			emotion 6;
			mes "[���@���L���[�̈���]";
			mes "��͂莄�̍߂͎͂���Ȃ��̂��I";
			mes "�Ȃ�΁A�N���҂����̐��悩��";
			mes "�ǂ��o���A�p�����������������I";
			next;
			mes "�]���@���L���[�͂���������";
			mes "�@������Ɍ����Ďa�肩�����Ă����]";
			next;
			cutin "3rd_ab_anghilde03",255;
			emotion 19,"";
			mes "�]���̏ꂩ��Q�Ăē����o�����B";
			mes "�@���΂炭���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		}
		cutin "3rd_ab_anghilde01",255;
		if(countitem(523) < 1) {
			mes "�]���@���L���[�ɐ�����";
			mes "�@�U�肩���悤�Ƃ�����";
			mes "�@�����������Ă��Ȃ������]";
			next;
			mes "�]��������ɓ���Ă���";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		}
		mes "�]���@���L���[�Ɏ����Ă���������";
		mes "�@�U�肩�����]";
		next;
		misceffect 78;
		cutin "3rd_ab_anghilde02",1;
		mes "[���@���L���[�̈���]";
		mes "�����A�Ȃ�Ƃ����������S�n���B";
		mes "���̂���܂ł̋�Y��";
		mes "�����Ă����悤���c�c";
		next;
		mes "�]���@���L���[�͕�������߂��";
		mes "�@�V�����ŋF�肾�����]";
		next;
		mes "�]�Ō�ɍs���̂́A�������c�c�]";
		next;
		if(select("�^���̂��̂��j������","�Â��ɗ�������") == 2) {
			cutin "3rd_ab_anghilde01",255;
			mes "�]���@���L���[�̋F���";
			mes "�@�ז����Ȃ��悤��";
			mes "�@���̏ꂩ��Â��ɗ����������]";
			next;
			mes "�]�������A�����i�W���Ă��Ȃ����Ƃ�";
			mes "�@�C�������]";
			next;
			mes "�]���΂炭���Ă���";
			mes "�@���@���L���[�ɍēx";
			mes "�@�b���|�����ق����ǂ��������]";
			close;
		}
		cutin "3rd_ab_anghilde01",255;
		misceffect 75,"";
		mes "�]�^���̂��̂�";
		mes "�@���@���L���[���j������]";
		next;
		misceffect 77;
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "�����c�c���͂���܂�";
		mes "�����ɐI�܂�A�������g����������";
		mes "�����悤���c�c�B";
		next;
		mes "[���@���L���[�̈���]";
		mes "�����A�M�l�̋F��̋V���ɂ����";
		mes "�悤�₭�������g��";
		mes "���߂����Ƃ��ł����B";
		mes "���ӂ��邼�A�l�ԁB";
		next;
		cutin "3rd_ab_anghilde01",255;
		mes "�]�����̊p�J�ɂ��Đq�˂��]";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "�����̊p�J���c�c�B";
		mes "�c�O�����A���������Ă���̂�";
		mes "���ꂽ�p�J�̕Њ���̂݁c�c�B";
		next;
		emotion 0;
		mes "[���@���L���[�̈���]";
		mes "�Ȃ�ƁI�@���łɂ����Е���";
		mes "���Ђ���ɓ���Ă����̂��B";
		mes "�Ȃ�΁A����������čs���������B";
		mes "����Ŋp�J�𕜌��ł��邾�낤�I";
		next;
		mes "[���@���L���[�̈���]";
		mes "�����A�܂��I����Ă͂��Ȃ����B";
		mes "���̈�ԍ����Ƃ���ɂ���";
		mes "^0000FF���󂵂��_�a^000000�Ɍ������̂��B";
		next;
		if(checkitemblank() < 1) {
			mes "[���@���L���[�̈���]";
			mes "�ށA�ו���������";
			mes "���Ђ����ĂȂ��悤���ȁB";
			mes "�����i�̎�ސ������炵�Ă���";
			mes "�܂����Ă���B";
			close2;
			cutin "3rd_ab_anghilde01",255;
			end;
		}
		mes "[���@���L���[�̈���]";
		mes "�����Ŋp�J���g�p�����";
		mes "�S�Ă��I��邾�낤�B";
		mes "�Ō�܂ŋC�𔲂��Ȃ�B";
		set CHANGE_AB,10;
		chgquest 104275,104280;
		getitem 6154,1;		// ��ꂽ�p�J�̌���
		viewpoint 2,1,1,0,0xFFFFFF;
		close2;
		cutin "3rd_ab_anghilde01",255;
		end;
	case 10:
	case 11:
		cutin "3rd_ab_anghilde01",1;
		mes "[���@���L���[�̈���]";
		mes "�܂��I����Ă͂��Ȃ����B";
		mes "���̈�ԍ����Ƃ���ɂ���";
		mes "^0000FF���󂵂��_�a^000000�Ɍ������̂��B";
		next;
		mes "[���@���L���[�̈���]";
		mes "�����Ŋp�J���g�p�����";
		mes "�S�Ă��I��邾�낤�B";
		mes "�Ō�܂ŋC�𔲂��ȁB";
		close2;
		cutin "3rd_ab_anghilde01",255;
		end;
	}
}

job3_arch02.gat,273,235,5	script	���@���L���[�̌��e	811,{
	switch(CHANGE_AB) {
	default:
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "���܂ł��M����";
		mes "�C�������E�҂ł���܂��悤�ɁI";
		mes "�����܂����@���n����";
		mes "��܂��傤�c�c";
		close2;
		cutin "3rd_ab_valkyrie",255;
		warp "hugel.gat",191,103;
		end;
	case 8:
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�����͐_�a�̒��ł���ԍ����ꏊ�B";
		mes "�����Ƃ��V�ɋ߂��ꏊ�ł��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�����̊p�J�������Ŏg����";
		mes "���@���L���[�̉��R���ĂԂ��Ƃ�";
		mes "�ł���ł��傤�B";
		next;
		switch(select("�����̊p�J�ɂ��ĕ���","��������o�����̂ł���","��b����߂�")) {
		case 1:
			mes "[���@���L���[�̌��e]";
			mes "�����̊p�J�́A�V��ւ̘A����i�B";
			mes "���̉����苿����";
			mes "���@���L���[������";
			mes "���̒n�ɏW������ł��傤�B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "�������A�A���O�q���f��";
			mes "�����ɔs�ꂽ��";
			mes "�p�J��2�Ɋ����Ă��܂��܂����B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "^FF00002��^000000�Ɋ���ꂽ�p�J��T���̂ł��B";
			mes "���̐_�a�̂ǂ����ɂ���͂��ł��B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "^FF0000�ł邱�ƂȂ��T�d�Ɏ���i�߂��^000000";
			mes "�K����ɓ���邱�Ƃ�";
			mes "�ł���͂��ł��B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			end;
		case 2:
			mes "[���@���L���[�̌��e]";
			mes "�킩��܂����B";
			mes "�A���O�q���f�̌���";
			mes "�߂��Ă����܂��傤�B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			warp "job3_arch01.gat",29,29;
			end;
		case 3:
			mes "[���@���L���[�̌��e]";
			mes "���������Ă͂����܂���B";
			mes "�K�v�Ȃ̂́A�ł炸��";
			mes "����i�߂�E�ϗ͂ł��B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			end;
		}
	case 9:
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�����͐_�a�̒��ł���ԍ����ꏊ�B";
		mes "�����Ƃ��V�ɋ߂��ꏊ�ł��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "��ꂽ�p�J�̌��Ђ�1��";
		mes "��ɓ��ꂽ�̂ł��ˁB";
		mes "����1�̌��Ђ������";
		mes "�p�J�����ɖ߂����Ƃ��ł��܂��B";
		next;
		switch(select("�����̊p�J�ɂ��ĕ���","��������o�����̂ł���","��b����߂�")) {
		case 1:
			mes "[���@���L���[�̌��e]";
			mes "����1�̉�ꂽ�p�J�̌��Ђ�";
			mes "��ɓ����K�v������܂��B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "���̂��߂ɂ́A^FF0000���n����̓��̂�^000000��";
			mes "�v���o���K�v��";
			mes "���邩������܂���B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "��Y����҂ɕK�v�Ȃ̂�";
			mes "�h�i�Ȃ�^FF0000�F��̋V��^000000�ł��B";
			mes "�M�����t�x���Q���~���̐�ɂ�";
			mes "�o�����Ă���͂��ł���B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			end;
		case 2:
			mes "[���@���L���[�̌��e]";
			mes "�킩��܂����B";
			mes "�A���O�q���f�̌���";
			mes "�߂��Ă����܂��傤�B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			warp "job3_arch01.gat",29,29;
			end;
		case 3:
			mes "[���@���L���[�̌��e]";
			mes "���������Ă͂����܂���B";
			mes "�K�v�Ȃ̂́A�ł炸��";
			mes "����i�߂�E�ϗ͂ł��B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			end;
		}
	case 10:
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�p�J�̌��Ђ��W�܂�܂����ˁB";
		mes "�����A������C�����Ă����܂��傤�B";
		next;
		cutin "3rd_ab_valkyrie",255;
		misceffect 82,"";
		mes "�]2�̌��Ђ�1�ɂȂ�";
		mes "�@�����̊p�J�Ƃ��ďC�����ꂽ�]";
		next;
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�����A���̊p�J�𐁂��炷�̂ł��B";
		mes "�V��܂ŁA���̉��F���͂��悤�ɁI";
		next;
		cutin "3rd_ab_valkyrie",255;
		mes "�]��Ɍ������Ďv���؂�p�J��";
		mes "�@�����炵���]";
		next;
		mes "�u�D�H�H�H�H�c�c";
		mes "�u�D�D�H�H�I�c�c�c";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f�̐�]";
		mes "���ɂ��̎��������̂��ȁI";
		mes "�p�J�̉����V��܂œ͂������I";
		next;
		mes "[�A���O�q���f�̐�]";
		mes "�I�[�f�B���l�̂����ׁI";
		mes "���@���n���̐퉳��������I";
		mes "�_�̐��悪�łɉ�����Ă��܂��I";
		next;
		mes "[�A���O�q���f�̐�]";
		mes "�ǂ����͂�݂��Ă��������I";
		mes "�͂������������ɑ���";
		mes "�ł�ł������Ă��������I";
		next;
		cutin "3rd_ab_valkyrie",1;
		mes "[�V��̐�]";
		mes "���S���Ȃ����A�A���O�q���f��B";
		mes "�M���̊肢�͊p�J�̉��F�Ƌ���";
		mes "���@���n���ɓ͂��܂����B";
		next;
		mes "[�V��̐�]";
		mes "�M���̊肢��";
		mes "�����Ɋ������邱�Ƃł��傤�B";
		mes "�����B�͑��̃��@���L���[�B�ɂ����";
		mes "���ׂď��f�����̂ł��B";
		next;
		cutin "3rd_ab_anghilde01",1;
		mes "[�A���O�q���f�̐�]";
		mes "�o���B�����Ă����̂ł��ˁI";
		mes "�Ȃ�΁A�����͂������S�Ȃ̂ł����H";
		next;
		cutin "3rd_ab_valkyrie",1;
		mes "[�V��̐�]";
		mes "�����ł��A�A���O�q���f�B";
		next;
		mes "[�V��̐�]";
		mes "�����ċM�����A�X�K���h����";
		mes "�Ǖ����ꂽ����A��l�ł��̐��n��";
		mes "��낤�Ƃ������т��F�߂��܂����B";
		next;
		mes "[�V��̐�]";
		mes "�����ɂł��M���̒Ǖ��͎͂���";
		mes "�V��ɖ߂��悤�ɂȂ�ł��傤�B";
		next;
		cutin "3rd_ab_anghilde02",1;
		mes "[�A���O�q���f�̐�]";
		mes "�����I�@�A�X�K���h�ɖ߂��Ȃ�āI";
		next;
		mes "[�A���O�q���f�̐�]";
		mes "�I�[�f�B���l�ɉh������I";
		mes "���b������A�������ŐS��������B";
		mes "���邭�āc�c�g�����c�c�����I";
		next;
		mes "�]�A���O�q���f�̊���̉̂�";
		mes "�@�����n��]";
		next;
		cutin "3rd_ab_anghilde02",255;
		emotion 1,"";
		mes "�]�������A���̉̐��͓ˑR";
		mes "�@�������Ȃ��Ȃ����]";
		next;
		mes "�]�s�v�c�Ɏv���Ă����";
		mes "�@�ڂ̑O�̃��@���L���[��";
		mes "�@��肩���Ă����]";
		next;
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�S�z���鎖�͂���܂���B";
		mes "�ޏ��͖{������ׂ��ꏊ��";
		mes "�߂����̂ł��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�c�c�A���O�q���f�͊��Ɏ���";
		mes "���@���L���[�������̂ł��B";
		next;
		emotion 0,"";
		mes "[���@���L���[�̌��e]";
		mes "�����͌�����F�߂��Ȃ�";
		mes "�A���O�q���f�̘c�񂾌��z�c�c";
		mes "���������ݏo������ԁB";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�ޏ��̍��͎���";
		mes "���̈����̒��ɕ����߂��";
		mes "�����Ƌꂵ��ł����̂ł��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�������A�M���̂�������";
		mes "�A���O�q���f�͋~���܂����B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�������E�̐_�a�ł�";
		mes "�������p�j�����܂܂ł���";
		mes "�ޏ��̍��͈����𓾂��̂ł��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�M���́A�o�����~���Ă���܂����B";
		mes "�{���Ɋ��ӂ������܂��B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "���Ђ�����������̂ł���";
		mes "���̏���Ń��@���n����";
		mes "���҂��邱�Ƃ͂ł��܂���B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "����ɃI�[�f�B���l����";
		mes "�^����ꂽ�͂�";
		mes "�M���ɐV�����͂������܂��傤�B";
		delitem 6154,countitem(6154);		// ��ꂽ�p�J�̌���
		set CHANGE_AB,11;
		chgquest 104280,104285;
		next;
		mes "[���@���L���[�̌��e]";
		mes "���̂��߂ɂ͏������K�v�ł��B";
		mes "�����⏊���i��a���A";
		mes "�X�L���|�C���g��";
		mes "���ׂď���Ă��Ă��������B";
		next;
		mes "[���@���L���[�̌��e]";
		mes "�������ł����琺���|���Ă��������B";
		mes "���͂����ł��҂����Ă���܂��B";
		close2;
		cutin "3rd_ab_valkyrie",255;
		end;
	case 11:
		cutin "3rd_ab_valkyrie",1;
		mes "[���@���L���[�̌��e]";
		mes "�V�����͂������鏀����";
		mes "�ł����̂ł����H";
		next;
		switch(select("�����͂ł��Ă��܂�","�܂��҂��Ă�������","�O�ɖ߂肽���ł�")) {
		case 1:
			mes "[���@���L���[�̌��e]";
			mes "����ł́A�M���ɐ��Ȃ�͂�";
			mes "�����܂��傤�I";
			next;
			if(Weight || checkitemblank() < 2 || checkcart() || checkfalcon() || checkriding() || checkdragon() || checkgear() || checkwolf() || sc_ison(SC_ALL_RIDING) || getpetinfo(0)) {
				mes "[���@���L���[�̌��e]";
				mes "�c�c����H";
				mes "�]�E�̏������ς�ł��܂����B";
				mes "�����A��Ă�����̂͑S�ĉ�����A";
				mes "�d�ʂ����镨�͎����Ȃ��ŗ���̂ł��B";
				next;
				cutin "3rd_ab_valkyrie",255;
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
				mes "[���@���L���[�̌��e]";
				mes "�]�E�̏������ł��Ă��܂����B";
				mes "������x�A�m�F���Ă݂Ă��������B";
				next;
				cutin "3rd_ab_valkyrie",255;
				mes "^FF0000�]�X�L���|�C���g���]���Ă���ꍇ��";
				mes "�@�S�ď���Ă��������]^000000";
				close;
			}
			if(Job != Job_Priest || Upper == UPPER_NORMAL || (Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {	// �O�̂��ߐE�`�F�b�N
				mes "[���@���L���[�̌��e]";
				mes "�]�E�̏������ł��Ă��܂����B";
				mes "������x�A�m�F���Ă݂Ă��������B";
				close2;
				cutin "3rd_ab_valkyrie",255;
				end;
			}
			set CHANGE_AB,0;
			chgquest 104285,201195;
			compquest 201195;
			resetstatus;
			resetskill;
			setoption 0;
			jobchange Job_ArchBishop;
			getitem 5747,1;		// �~�g��
			getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
			setquest 129700;	// �X�e�[�^�X���X�L���ꊇ���Z�b�g��
			mes "[���@���L���[�̌��e]";
			mes "�M���ɂ͂�������n�����܂��B";
			mes "���������󂯎���Ă��������B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "���܂ł��M����";
			mes "�C�������E�҂ł���܂��悤�ɁI";
			mes "�����܂����@���n����";
			mes "��܂��傤�c�c";
			next;
			cutin "3rd_ab_valkyrie",255;
			mes "[�C���t�H���[�V����]";
			mes "�]�E�����̃N���A��V";
			mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g����";
			mes "�t�^����܂����B";
			mes "�N�G�X�g�E�B���h�E�ŗ��p���@��";
			mes "�m�F�ł��܂��B";
			close2;
			warp "hugel.gat",191,103;
			end;
		case 2:
			mes "[���@���L���[�̌��e]";
			mes "�������ł����琺���|���Ă��������B";
			mes "���͂����ł��҂����Ă���܂��B";
			close2;
			cutin "3rd_ab_valkyrie",255;
			end;
		case 3:
			mes "[���@���L���[�̌��e]";
			mes "�킩��܂����B";
			mes "����ł͈�x�t�B�Q���ɑ���܂��B";
			next;
			mes "[���@���L���[�̌��e]";
			mes "�����ɗ���ۂ�";
			mes "^0000FF�V�X�^�[�E�A���W�F�Ɉē�����";
			mes "������Ă��������ˁB^000000";
			close2;
			cutin "3rd_ab_valkyrie",255;
			warp "hugel.gat",191,103;
			end;
		}
	}
}
