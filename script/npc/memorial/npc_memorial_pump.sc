//= Auriga Script ==============================================================
// Ragnarok Online Malangdo Pump Script	by Blaze
//- Registry -------------------------------------------------------------------
// PUMP_1QUE -> 0�`3
//==============================================================================

//============================================================
// NPC
//------------------------------------------------------------
mal_in01.gat,172,28,2	script	�A���{	561,{
	mes "[�A���{]";
	mes "��X�͂������ɗ����Ă���";
	mes "�~�V���l�̕����������B";
	mes "�ȑO�͂��̕ۊǌɂ�";
	mes "�Ǘ����s���Ă����̂��B";
	next;
	mes "[�A���{]";
	mes "����������A";
	mes "�傫�ȗh��ƂƂ��ɐZ�����n�܂����B";
	mes "�ۊǌɂ͐��Z���ɂȂ�A";
	mes "�ۊǂ��Ă������M�d�i��";
	mes "���ׂė���Ă��܂����̂��I";
	next;
	mes "[�A���{]";
	mes "����Ă�������͔r���H�ɂȂ��Ă���B";
	mes "�Z���͂����ɐ���ł���z��̎d�Ƃ�";
	mes "�Ⴂ�Ȃ��̂��I";
	next;
	mes "[�A���{]";
	mes "����ɓz��́I";
	mes "�Z����h�����Ƃ��Ă���";
	mes "�~�V���l�̎ז������I";
	mes "���܂����~�V���l��`�������̂�!!";
	next;
	mes "[�A���{]";
	mes "��X�͓z����΂ɋ����Ȃ��I";
	mes "���̃����X�^�[�ǂ��́A";
	mes "�Ō�̈�C�܂Ŏh�g�ɂ���";
	mes "���T�r�����ĐH���Ă��!!";
	next;
	mes "^0000ff-�j���[�ƌ����Ȃ���S�g�̖т𗧂āA";
	mes "�@�n���r���H�Ɍ���";
	mes "�@�{���I��ɂ��Ă���-^000000";
	close;
}

mal_in01.gat,172,26,2	script	�}�f�J	544,{
	mes "[�}�f�J]";
	mes "�j���[�j���[!!!!";
	mes "�����C�Y����";
	mes "䥂ł���Ă����肵��";
	mes "�H�ׂ��Ⴄ�j���[�I";
	close;
}

//============================================================
// �_���W��������NPC
//------------------------------------------------------------
mal_in01.gat,160,34,4	script	�ۊǌɂ̊Ǘ��l�~�V��	545,{
	if(BaseLevel < 40) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���[�A";
		mes "���̗p�����͂킩��Ȃ�����";
		mes "���̐�͍s������_���j���B";
		mes "�g�[�}�X��̖��߃j���B";
		next;
		mes "-���̃N�G�X�g��i�s����ɂ�";
		mes "�@���x���������Ȃ��悤�ł��B";
		mes "�@^ff0000Base���x��40�ȏ�^000000�ɂȂ�����";
		mes "�@�ēx�b�������Ă�������-";
		close;
	}
	if(PUMP_1QUE == 0) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���j���j���A�c�c�B";
		mes " ";
		mes "-�Ђǂ����Ă���L������B";
		mes "�@�є�ł킩��ɂ������A";
		mes "�@���F���ǂ��Ȃ��悤��-";
		next;
		if(select("�q�Q���Ђ��ς�","�ǂ������̂�����")==1) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�j���[�[�[!!!?";
			mes " ";
			mes "-���Ȃ����q�Q���Ђ��ς�ƁA";
			mes "�@�L�͐����ɔ�яオ����-";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�ȁA��������j��!!";
			mes "�~�V���͈ꏊ����^ff0000�n���r���H^000000�����";
			mes "�Z����H���~�߂Ă���j���I";
			mes "�n���r���H�͊댯�Ȃ̃j���I";
			mes "�ז�����ȃj���I";
			close;
		}
		emotion 54;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���������܂�";
		mes "^ff0000�n���r���H^000000�̑|�������Ă��j���B";
		mes "�����̂��ƃj���A�B";
		mes " ";
		mes "-�L�͂��ߑ�������-";
		next;
		menu "�n���r���H�H",-;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���A�B";
		mes "���X�A�����͋M�d�i�����܂�";
		mes "�ۊǌɂ������j���B";
		next;
		emotion 28;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�ł��A������A";
		mes "�����傫���h�ꂽ�Ǝv������";
		mes "�n���r���H����̐Z���������āA";
		mes "�ۊǌɂ����Z���ɂȂ����j���B";
		mes "���Z�����ᕨ��ۊǂł��Ȃ��j���c�c�B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�ł��A�~�V���͕ۊǌɂ̊Ǘ��l�j���I";
		mes "���߂Ȃ��j���I";
		mes "�n���r���H����̐Z����h���ŁA";
		mes "�ۊǌɂ𕜊������邽�߂ɁA";
		mes "�����������Ă���j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�c�c�ł������Ă��邱�Ƃ�����ɂ�B";
		mes "�n���r���H�ɂ�";
		mes "�~�V�����o�J�ɂ����炪";
		mes "����ł���̃j���A�c�c�B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�~�V���͂��Ɛ���Ă���j���I";
		mes "���ӂ̔L�L�b�N�ɔL�p���`�I";
		mes "�~�V���͋����j�������Ȃ��j���A�I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�c�c�B";
		mes "�ł������A�키�̂ɔ��Ă����j���B";
		mes "1���ɉ�������\�������Ă�������";
		mes "������ꂪ���E���j���A�c�c�B";
		next;
		menu "��߂�΂�������Ȃ�",-;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "����͂���j���B";
		mes "�~�V���͂���ǂ��o���āA";
		mes "�Z�����~�߂āA";
		mes "�ۊǌɂ𕜊�������񂾃j���A�B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "����ɁA���܂ɕۊǌɂɓ���Ă�";
		mes "�󕨂𔭌��ł����肷��j���B";
		mes "���������ʋl���Q�b�g�ł���j���[�B";
		next;
		if(select("�撣���Ă��������B�ł͂��悤�Ȃ�","��������`����") == 1) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�j���j���A����΂�j���A�I";
			mes "�~�V���͕ۊǌɂ𕜊�������j���B";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�z���g�j���H";
		mes "�E�\�����Ȃ��j���H";
		next;
		if(select("�͂�","���߂�Ȃ����B���͉R�ł�") == 2) {
			emotion 6;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�R�j���H";
			mes "�R���͂ǂ����֍s���j��!!";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���ꂵ���j��!!";
		mes "�{���ɂ��肪�Ƃ��j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�ł́A�N�ɂ͒n���r���H�ł�";
		mes "�|������`���Ă��炤�j���B";
		mes "�|���̏ڂ���������";
		mes "���̎��ɂȂ����狳����j���B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���ƁA�n���r���H�͑|������";
		mes "�~�V�����o�J�ɂ����炪";
		mes "�ז������Ă���댯�ȏꏊ�j���B";
		mes "����Ƃ���^ff0000�p�[�e�B�[��g��ŁA^000000";
		mes "�~�V���Ɠ���葱��������j���B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�Í��������邩��A";
		mes "����葱��������Ƃ��̓~�V����";
		mes "�p�[�e�B�[�̃{�X��";
		mes "^ff0000���̈Í�^000000�������j���B";
		mes " ";
		mes "^990000�w�ʋl�H�׉߂��������o��ɂ�x^000000";
		next;
		menu "�ʋl�H�׉߂��������o��ɂ�",-;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�����񑩂��Ă����Ȃ�A";
		mes "�~�V����^ff0000�n���r���H^000000��";
		mes "�ē�����j���A�B";
		set PUMP_1QUE,1;
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���j���A";
		mes "�p�[�e�B�[����邩";
		mes "�������ĂȂ���";
		mes "^ff0000�n���r���H^000000�ɂ͓�����Ȃ��j���I";
		close;
	}
	if(checkquest(12254) || checkquest(71495)) {
		if(checkquest(12254)&2 == 0 || checkquest(71495)&2 == 0) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���͂��|�����Ȃ��Ă����v�j���`�B";
			mes "���ꂵ�Ă��玟��";
			mes "^ff0000�ߑO5���ȍ~^000000�ɂȂ�����";
			mes "�܂����Ăق����̃j���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂���܂ł�";
			mes "���|�����Ȃ��Ă����v�j���B";
			mes "�����A���̑O�ɗ��Ă�";
			mes "���ɂ͓���Ȃ����璍�ӂ���j���B";
			close;
		}
		delquest 12254;
		delquest 71495;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�ǂ������j���H";
	mes "�~�V���ɂ��p���H";
	next;
	while(1) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			set '@str$,"�ʋl�H�׉߂��������o��ɂ�";
		switch(select("�n���r���H�̍s�����𕷂�����",'@str$,"�n���r���H�ɍs��","�Ȃ�ł�����܂���")) {
		case 1:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�n���r���H�̍s�������j���H";
			mes "�n���r���H�ɍs���ɂ̓p�[�e�B�[��";
			mes "�g��ł���K�v������j���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�n���r���H�̓������J��������΁A";
			mes "�p�[�e�B�[�̃{�X��";
			mes "�~�V���ɈÍ��������j���B";
			mes "����������~�V����";
			mes "�n���r���H�̓������J���j���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���ƁA�n���r���H�́A";
			mes "���ꂵ�Ă���1��ڂ�";
			mes "^ff0000�ߑO5��^000000���}�����";
			mes "������x����ł���悤�ɂȂ�j���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ȃ���";
			mes "����ł��Ȃ��̃j���B";
			mes " ";
			mes "���������͑̂ɗǂ��Ȃ��j���B";
			mes "�Œ�ł�1���Ԃ͂������x�ރj���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���ɂȂɂ����邩�j���H";
			next;
			continue;
		case 2:
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�~�V���Ƙb���Ă���Ԃ�";
				mes "�p�[�e�B�[�̃{�X����";
				mes "�Ȃ��Ȃ����̂��j���H";
				mes "�{�X����Ȃ���";
				mes "�n���r���H�͊J���Ȃ��j���I";
				close;
			}
			mdcreate "Pump";
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�p�[�e�B�[����";
			mes getpartyname(getcharid(1))+ "�B";
			mes "�p�[�e�B�[���[�_�[��";
			mes getpartyleader(getcharid(1))+ "���j���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "^ff0000�n���r���H^000000�ւ̓������";
			mes "�J������j���B";
			mes "�m�F������A������x";
			mes "�~�V���ɘb�������ăj���B";
			close;
		case 3:
			mes "-�n���r���H�ɓ��ꂵ�܂�-";
			close2;
			switch(mdenter("Pump")) {
			case 0:	// �G���[�Ȃ�
				announce "�������A���_���W����[Pump]�ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ "�i" +strcharinfo(0)+ "�j",0x9,0x00FF99;
				setquest 12254;
				setquest 71495;
				delquest 97100;
				set PUMP_1QUE,1;	// �G�L�X�p�[�g�̓����t���O��߂�
				end;
			case 1:	// �p�[�e�B�[������
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�j���j���c�c";
				mes "���A��������J�����p�[�e�B�[��";
				mes "�������ĂȂ��j���B";
				mes "^ff0000�n���r���H^000000�ɂ�";
				mes "��������_���j���B";
				close;
			case 2:	// �_���W�������쐬
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�j���j���c�c";
				mes "^ff0000�n���r���H^000000�̓������";
				mes "���܂��J���Ȃ������j���B";
				mes "�p�[�e�B�[���[�_�[���܂�";
				mes "�Í��������Ă��Ȃ��̃j���B";
				close;
			default:	// ���̑��G���[
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�j���j���c�c";
				mes "^ff0000�n���r���H^000000�̓������";
				mes "���܂��J���Ȃ������j���B";
				close;
			}
		case 4:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�Ȃ�ł��Ȃ��j���H";
			close;
		}
	}
OnInit:
	waitingroom "�n���r���H",0;
	end;
}

//============================================================
// �n���r���H�i���|���r�M�i�[�j
//------------------------------------------------------------
1@pump.gat,63,100,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump0	545,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�N�B�̃{�X�Ƙb�����Ă��邩��A";
		mes "������Ƒ҂��ăj���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�����͒��Ԃ����ƈꏏ��";
	mes "�|��������n���r���H�j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�Ƃ���ŌN�c�c";
	mes "�|���͓��ӂ��j���H";
	mes "�|���̃G�L�X�p�[�g����Ȃ�A";
	mes "���̕����̑|����";
	mes "�ł��邩������Ȃ��j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�����͋��������X�^�[���o�Ă��邵�A";
	mes "�|������ӏ���������";
	mes "������Ɠ���j���B";
	mes "�N�͂ǂꂭ�炢���|���ł���j���H";
	next;
	if(select("���|���r�M�i�[","���|���G�L�X�p�[�g(BaseLv90����I���\)") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���������j���B";
		mes "����Ȃ炢���|�������Ă���";
		mes "���̔r���H�̑|����C����j���I";
		next;
		if(select("������Ƒ҂���","�킩����") == 1) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "��H�܂��������ł��ĂȂ��̂��j���H";
			mes "�������ł�����";
			mes "������x�b�������Ăق����j���B";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�E�[�ɍs���ď��������邩��";
		mes "���ė���j���I";
		hideonnpc;
		hideoffnpc getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump1-1");
		announce "�~�V�� : �}�b�v��3�������Ɉړ�������A�~�V���ɘb��������j���I",0x9,0x00FFCC,0x190,15,0,0;
		close;
	}
	if(BaseLevel < 90) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���[�c�c";
		mes "�����܂ŋ������ɂ͌����Ȃ��j���B";
		mes "�������Ȃ��Ă������j���H";
		next;
		mes "-���̐�ɐi�ނɂ�";
		mes "�@�����Ƌ����Ȃ�K�v�����肻�����B";
		mes "�@^990000Base���x����90�ȏ�^000000�ɂ��Ă���";
		mes "�@�܂����Ă݂悤-";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�r�Ɏ��M������j���H";
	mes "�j����قǁA�j����قǁc�c�B";
	mes "�N�͉��̕����ɋ����͂��邩�j���H";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�����͖{���ɒ����ԁA";
	mes "�|�������Ă��Ȃ��ꏊ������";
	mes "�ǂ�ȋ��낵�������X�^�[��";
	mes "����ł��邩�킩��Ȃ��j���B";
	mes "�s���Ă݂邩�j���H";
	next;
	if(select("���߂�Ȃ����B���h�𒣂��Ă܂���","�s���Ă݂悤") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���񂾁A�����j���̂��B";
		mes "����������K�v�̓j�����j���B";
		close;
	}
	mes "-^FF0000Base���x��90������";
	mes "�@�p�[�e�B�[�����o�[�������ꍇ�A";
	mes "�@���̃����o�[�͉��ɐi�߂܂���B";
	mes "�@�܂��A���ւƐi�ޒʘH��";
	mes "�@1���o�߂���ƕ��A";
	mes "�@�ēx�J�����Ƃ͂ł��܂���^000000-";
	next;
	mes "-���ɐi�݂܂����H-";
	next;
	if(select("������","�͂�") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���񂾁A�����j���̂��B";
		mes "����������K�v�̓j�����j���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l �~�V��]";
	mes "�킩�����j���I";
	mes "���ꂶ�Ⴀ�|�����n�߂�̃j���B";
	mes "�~�V������ɓ��邩��";
	mes "���ė���j���I";
	hideonnpc;
	enablenpc getmdnpcname("#PumpWarp1");
	initnpctimer getmdnpcname("#PumpWarp1");
	announce "�~�V�� : �~�V������ɓ��邩����ė���j���I�@3���̕����̏o��������J���Ă����j���I",0x9,0x00FFCC,0x190,15,0,0;
	areamonster getmdmapname("2@pump.gat"),0,0,0,0,"�q�h��",1068,20;
	close;
}

1@pump.gat,83,105,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump1-1	545,{
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�|�����@���ȒP�ɋ����Ă�����j���B";
	mes "���ӂɔr���H������̂������邩�j���H";
	next;
	if(select("�r���H�H","�����Ă���") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "��H�@�r���H�͏��߂Č���j���H";
		mes "���̎��ӂɂ͔r���H�ƌĂ΂��";
		mes "�@�B������������j���B";
		mes "��x���ė���Ƃ����j���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���̔r���H���d�v�j���I";
	mes "6����r���H�ɁA";
	mes "�C�����t���Ȃ��悤";
	mes "�ꏊ�����ɑ|��������񂾃j���I";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�|�������Ă���ƃ����X�^�[��";
	mes "�ז������Ă��邯�ǁA";
	mes "�r���H��|�����Ă���l��";
	mes "��������X�L�����g���Ȃ�����A";
	mes "���ӂ���j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�r���H�͑S����10��J���j���B";
	mes "���̓��A�r���H��^ff0000�S����5����";
	mes "�|���ł�����I���j���I^000000";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�J�����r���H�́A�����������Ă��";
	mes "�C�����l�܂��Ă��܂��j���B";
	mes "^ff0000�|���I���܂łɊC����6�t������";
	mes "�|���͎��s�j���A�B^000000";
	mes "���s������A";
	mes "�~�V�����N�B���Ăі߂��j���I";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�r���H�̑|���́A���s���Ă�";
	mes "�C�����l�܂��Ă��܂��j���B";
	mes "^ff00002��܂ł͂�蒼�����ł���^000000�j���B";
	mes "����ȏ�͎��Ԃ������肷�����";
	mes "�݂�Ȃ��S�z���邩��A";
	mes "�����̂��|���͒��߂Ĉ����グ��j���B";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�N�B�̃{�X���������I������";
		mes "�n�߂邩��A�S�̏��������Ă���j���I";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�|�����鏀���͂ł����̂��j���H";
	next;
	if(select("������Ƒ҂���","�����ł��Ă��") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�܂��������ł��ĂȂ��̂��j���H";
		mes "�������ł�����";
		mes "������x�b�������Ăق����j���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�킩�����j���I�@�ł͎n�߂�j���I";
	hideonnpc;
	donpcevent getmdnpcname("PumpControl1-1")+"::OnStart";
	set '@chid,getcharid(3);
	set '@map$,getmapname("");
	getpartymember getcharid(1);
	for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
		if(attachrid(getcharid(3,$@partymembername$['@i]))){
			if('@map$ == getmapname("")) {
				viewpoint 1,58,101,0,0xFFFF00;
				viewpoint 1,68,124,1,0xFFFF00;
				viewpoint 1,80,114,2,0xFFFF00;
				viewpoint 1,75,80,3,0xFFFF00;
				viewpoint 1,40,80,4,0xFFFF00;
				viewpoint 1,36,111,5,0xFFFF00;
			}
			detachrid;
		}
	}
	if(!attachrid('@chid)) {
		end;
	}
	close;
OnInit:
	hideonnpc;
	end;
}

1@pump.gat,83,105,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump1-2	545,{
	if('retry < 3) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���s���Ă��܂����j���c�c�B";
		mes " ";
		mes "�ł��~�V���B�͒��߂Ȃ��j���B";
		mes "�撣�낤�j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�f������Ƃ����Ȃ���";
		mes "�C���������t���Ă��܂��j���B";
		mes "�O�Y�O�Y���Ă����炷�ׂĂ�";
		mes "�r���H���C���ŋl�܂��Ă��܂��j���I";
		next;
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�N�B�̃{�X�Ƃǂ����邩";
			mes "���k���Ă�j���I";
			mes "����������Ƒ҂��Ăق����j���`�B";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���C���c���Ă���j����A";
		mes "������x���킷�邩�j���H";
		mes "^ff0000����"+3-'retry+"��A���킷�邱�Ƃ��ł���^000000�j���B";
		next;
		switch(select("������Ƒ҂���","������x���킷��","������߂ċA��")) {
		case 1:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���܂�����Ă��鎞�Ԃ͂Ȃ��j���B";
			mes "�������ł����琺�������Ăق����j���B";
			close;
		case 2:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�킩�����j���B�ł͎n�߂�j���I";
			hideonnpc;
			donpcevent getmdnpcname("PumpControl1-1")+"::OnStart";
			close;
		case 3:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�j��!?";
			mes "������߂Ēn��ɋA�肽���̂��j���H";
			next;
			if(select("�܂��撣��","������߂ċA��") == 1) {
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�ق�ƃj���H";
				mes "�ǂ������j���`�I";
				close;
			}
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�c�O�����ǎd���Ȃ��j���c�c�B";
			mes "�����܂Ŏ�`���Ă����";
			mes "���肪�ƃj���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�A��̏o���͍��̂ق��j���B";
			mes "�܂��ǂ��������`���ė~�����j���I";
			set 'retry,3;
			enablenpc getmdnpcname("#PumpExit1");
			close;
		}
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���s���Ă��܂����j���c�c�B";
	mes "���x��������߂���";
	mes "���킵�Ă���Ċ��������ǁA";
	mes "���낻�뎞�Ԃ��}�Y���j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�c�O�����ǒn��֖߂�j���c�c�B";
	mes "�����܂Ŏ�`���Ă����";
	mes "���肪�ƃj���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�A��̏o���͍��̂ق��j���B";
	mes "�܂��ǂ��������`���ė~�����j���I";
	enablenpc getmdnpcname("#PumpExit1");
	close;
OnStart:
	hideoffnpc;
	set 'retry,'retry+1;
	end;
OnInit:
	hideonnpc;
	set 'retry,0;
	end;
}

1@pump.gat,83,105,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump1-3	545,{
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�͂����`�т����肵���j���[�I";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "����ȕςȊL�͏��߂Č����j���B";
	mes "�����āA�U���U�����ĂāA";
	mes "�s�C���ŕ|�������j���c�c�B";
	mes "�|���Ă���Ă��肪�ƃj���I";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���Ƃ̓~�V�������������邩��A";
	mes "�N�B�͉ו���Z�߂�";
	mes "���Ε����̏o�������ɏo�Ă���j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���A����Ɓc�c";
	mes "���������Ō������Ƃ�";
	mes "�閧�ɂ��Ă��Ăق����j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�g�[�}�X���������������Ⴄ�ƁA";
	mes "�~�V�����N�B��";
	mes "�d���������Ȃ��Ă��܂��j���B";
	if(checkquest(97100)) {
		if(checkquest(97100)&4) {
			next;
			if(checkitemblank() < 1) {
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "���A�ו��������ς��̂悤���j���B";
				mes "�ו��𐮗����āA";
				mes "������x���������ăj���B";
				close;
			}
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���Ƃ����";
			mes "��`���Ă��ꂽ���炾�j���B";
			mes "�ǂ�������܂���`���ė~�����j���B";
			getitem 12636,50;
			set '@base,50;
			set '@job,20;
			if(getonlinepartymember() > 1) {
				set '@base,'@base+25;
				set '@job,'@job+10;
			}
			for(set '@i,0; '@i < '@base; set '@i,'@i+1) {
				getexp 10000,0;
			}
			for(set '@i,0; '@i < '@job; set '@i,'@i+1) {
				getexp 0,10000;
			}
		}
		delquest 97100;
	}
	close;
OnInit:
	hideonnpc;
	end;
}

1@pump.gat,0,0,0	script	PumpControl1-1	-1,{
OnStart:
	set 'phase,0;
	set 'success,0;
	set 'fail,0;
	initnpctimer;
	announce "�~�V�� : 5�b��ɍŏ��̔r���H���J���j���I�@�J���ꂽ�r���H��T���ăN���b�N���|�����n�߂�j��!!",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer5000:
	if('success < 5) {
		if('phase < 10) {
			set 'phase,'phase+1;
			set '@rand,rand(6);
			donpcevent getmdnpcname("#Pump1-"+'@rand)+"::OnStart";
			switch('@rand) {
			case 0:
				set '@pos$,"�����t��";
				set '@x1,54;
				set '@y1,97;
				set '@x2,62;
				set '@y2,105;
				break;
			case 1:
				set '@pos$,"1������";
				set '@x1,64;
				set '@y1,120;
				set '@x2,72;
				set '@y2,128;
				break;
			case 2:
				set '@pos$,"2������";
				set '@x1,76;
				set '@y1,110;
				set '@x2,84;
				set '@y2,118;
				break;
			case 3:
				set '@pos$,"5������";
				set '@x1,71;
				set '@y1,76;
				set '@x2,79;
				set '@y2,84;
				break;
			case 4:
				set '@pos$,"7������";
				set '@x1,36;
				set '@y1,76;
				set '@x2,44;
				set '@y2,84;
				break;
			case 5:
				set '@pos$,"10������";
				set '@x1,32;
				set '@y1,107;
				set '@x2,40;
				set '@y2,115;
				break;
			}
			announce "�~�V�� : "+'@pos$+"�̔r���H���J�����j���I",0x9,0x00FFCC,0x190,15,0,0;
			if(rand(2)) {
				areamonster getmdmapname("1@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃o�h��",2174,rand(2,3),getmdnpcname("PumpControl1-1")+"::OnKilled";
				areamonster getmdmapname("1@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�[�C�̃J�j",2176,rand(2,3),getmdnpcname("PumpControl1-1")+"::OnKilled";
			}
			else {
				areamonster getmdmapname("1@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�[�C�̃J�i�g�E�X",2177,rand(2,3),getmdnpcname("PumpControl1-1")+"::OnKilled";
				areamonster getmdmapname("1@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃N�N��",2179,rand(2,3),getmdnpcname("PumpControl1-1")+"::OnKilled";
			}
		}
	}
	else {
		donpcevent getmdnpcname("PumpControl1-2")+"::OnStart";
		stopnpctimer;
	}
	end;
OnTimer50000:
	initnpctimer;
	end;
OnSuccess:
	set 'success,'success+1;
	announce "�~�V�� : "+'success+"�ڂ̔r���H�̑|�������������j���`�I",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnFail:
	set 'fail,'fail+1;
	killmonster getmdmapname("1@pump.gat"),getmdnpcname("PumpControl1-1")+"::OnKilled";
	areamonster getmdmapname("1@pump.gat"),55,99,61,105,"����ȊC��",2191,1,getmdnpcname("PumpControl1-1")+"::OnKilled2";
	announce "�~�V�� : ����ȊC�����t���Ă��܂����j���I�@��"+'fail+"�s���j���I",0x9,0xFF3333,0x190,15,0,0;
	if('fail >= 6) {
		killmonster getmdmapname("1@pump.gat"),getmdnpcname("PumpControl1-1")+"::OnKilled2";
		announce "�~�V�� : ����ȊC�����r���H�𕢂��Ă���j���I�@�|���͎��s���j���`�B�Ƃ肠�����~�V���̏��܂ŗ��Ăق����j��!!",0x9,0xFF88FF,0x190,15,0,0;
		donpcevent getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump1-2")+"::OnStart";
		stopnpctimer;
	}
	end;
OnKilled:
OnKilled2:
	end;
}

1@pump.gat,0,0,0	script	PumpControl1-2	-1,{
OnStart:
	if(getvariableofnpc('fail,getmdnpcname("PumpControl1-1")) == 0) {
		announce "�~�V�� : �|���I���j���I�@�����ɑ|���ł�������A����ȊC���͋l�܂�Ȃ������j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	else {
		announce "�~�V�� : ����ȊC���͑S����"+getvariableofnpc('fail,getmdnpcname("PumpControl1-1"))+"�s�j���B�|���I���j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	initnpctimer;
	end;
OnTimer5000:
	if(getvariableofnpc('fail,getmdnpcname("PumpControl1-1")) == 0) {
		announce "�~�V�� : ���ށI�@�N�B�ӊO�Ƃ��j��!!",0x9,0x00FFCC,0x190,15,0,0;
	}
	else {
		announce "�~�V�� : �Ȃ��Ȃ��ǂ��|���������j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	end;
OnTimer10000:
	announce "�~�V�� : �ł͉ו���Z�߂ď�Ɂc�c�@�j���A�A�A!?",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer15000:
	announce "�~�V�� : �����σj������������!!�@�o���o�����Ɗ댯�j���I�@�^�񒆂ɏW�܂�j��!!",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer17000:
	mapwarp "this",getmdmapname("1@pump.gat"),61,96;
	hideoffnpc getmdnpcname("#PumpBoss1");
	end;
OnTimer22000:
	hideonnpc getmdnpcname("#PumpBoss1");
	announce "�~�V�� : �N�B���ْ��������j�����ŁA�퓬�̏���������j���I",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer24000:
	monster getmdmapname("1@pump.gat"),57,107,"�[�C�̂������L",2178,1,getmdnpcname("PumpControl1-2")+"::OnKilled";
	announce "�[���̒�����w�[�C�̂������L�x���o���I",0x9,0xFF88FF,0x190,40,0,0;
	stopnpctimer;
	end;
OnKilled:
	announce "�r���H���猻�ꂽ�[�C�̂������L��|���܂����B�험�i�����͂ɂ΂�܂���Ă���̂ŁA�n�ʂ��悭���ׂČ��܂��傤�B",0x9,0xFFFF00,0x190,15,0,0;
	for(set '@i,0; '@i<10; set '@i,'@i+1) {
		if(rand(6400) < 6000) {
			dropitem "this",rand(40,77),rand(87,120),12636,1,0;		// �}���������Y�ʋl
		}
		else {
			dropitem "this",rand(40,77),rand(87,120),12623,1,0;		//��������̔�
		}
	}
	hideoffnpc getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump1-3");
	enablenpc getmdnpcname("#PumpExit1");
	end;
}

1@pump.gat,58,101,0	script	#Pump1-0	844,14,14,{
	if(getnpctimer(1)) {
		progressbar 5;
	}
	if(getnpctimer(1) == 0) {
		mes "-�r���H�͕��Ă���-";
		close;
	}
	misceffect 16;
	stopnpctimer;
	donpcevent getmdnpcname("PumpControl1-1")+"::OnSuccess";
	end;
OnStart:
	set 'count,50;
OnTimer1000:
	set 'count,'count-1;
	if('count == 10) {
		announce "�~�V�� : 10�b�ȓ���"+getvariableofnpc('phase,getmdnpcname("PumpControl1-1"))+"�ڂ̔r���H�̑|�����I��点��j���I�@�}���j���[!!",0x9,0x00FFCC,0x190,15,0,0;
	}
	if('count > 0) {
		misceffect 109;
		initnpctimer;
		end;
	}
	stopnpctimer;
	donpcevent getmdnpcname("PumpControl1-1")+"::OnFail";
	end;
OnTouch:
	if(getnpctimer(1)) {
		misceffect 247;
	}
	end;
}

1@pump.gat,68,124,0		duplicate(#Pump1-0)	#Pump1-1	844,14,14
1@pump.gat,80,114,0		duplicate(#Pump1-0)	#Pump1-2	844,14,14
1@pump.gat,75,80,0		duplicate(#Pump1-0)	#Pump1-3	844,14,14
1@pump.gat,40,80,0		duplicate(#Pump1-0)	#Pump1-4	844,14,14
1@pump.gat,36,111,0		duplicate(#Pump1-0)	#Pump1-5	844,14,14

1@pump.gat,61,95,0	script	#PumpBoss1	111,14,14,{
OnTouch:
	setquest 97100;
	end;
OnInit:
	hideonnpc;
	end;
}

1@pump.gat,32,100,0	script	#PumpExit1	45,3,3,{
OnTouch:
	if(checkquest(97100)) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���j��!?";
		mes "������Ƒ҂��Ă���j���B";
		mes "�~�V���Ƃ��b���ė~�����j���I";
		close;
	}
	mes "-�n���r���H����O�ɏo�܂����H-";
	next;
	if(select("�O�ɏo�Ȃ�","�O�ɏo��") == 1) {
		mes "-���Ȃ��͂��̏ꂩ�痣�ꂽ-";
		close;
	}
	mes "-�O�֏o�܂�-";
	close2;
	warp "mal_in01.gat",161,32;
	end;
OnInit:
	disablenpc;
	end;
}

1@pump.gat,84,105,0	script	#PumpWarp1	45,3,3,{
OnTouch:
	if(getnpctimer(1)) {
		if(BaseLevel < 90) {
			mes "-Base���x��90�����̏ꍇ�A";
			mes "�@���Ɉړ��͂ł��܂���-";
			close2;
			warp getmdmapname("1@pump.gat"),74,105;
			end;
		}
		warp getmdmapname("2@pump.gat"),38,88;
		end;
	}
	mes "-���̕��ő���������������";
	mes "�@���|�������Ɏn�܂��Ă���";
	mes "�@�����獇������͓̂�������B";
	mes " ";
	mes "�@�O�ɏo�܂����H-";
	next;
	if(select("�O�ɏo��","�O�ɏo�Ȃ�") == 2) {
		mes "-�������������ɂ��鎖�ɂ���-";
		close;
	}
	mes "-���Ȃ��͊O�ɏo��-";
	close2;
	warp "mal_in01.gat",161,32;
	end;
OnTimer2000:
	announce "�~�V�� : ���̕����ɂ͋��낵�������X�^�[�������ς��j���I�@1��������o������߂邩��A�����ړ����ė~�����j��!!",0x9,0x0FFCC,0x0190,15,0,0;
	end;
OnTimer60000:
	announce "�~�V�� : ���̕����ւ̏o������߂�j���`�I",0x9,0x0FFCC,0x0190,15,0,0;
	stopnpctimer;
	end;
OnInit:
	disablenpc;
	end;
}

//============================================================
// �n���r���H �ŉ����i���|���G�L�X�p�[�g�j
//------------------------------------------------------------
2@pump.gat,40,88,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump2	545,{
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�N�B�̃{�X���������I������";
		mes "�n�߂邩��A�S�̏��������Ă���j���I";
		close;
	}
	switch(getvariableofnpc('level,getmdnpcname("PumpControl2-1"))) {
	case 0:
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�|�����@���ȒP�ɋ����Ă�����j���B";
		mes "���ӂɔr���H������̂������邩�j���H";
		next;
		if(select("�r���H�H","�����Ă���") == 1) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "��H�@�r���H�͏��߂Č���j���H";
			mes "���̎��ӂɂ͔r���H�ƌĂ΂��";
			mes "�@�B������������j���B";
			mes "��x���ė���Ƃ����j���B";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���̔r���H���d�v�j���I";
		mes "10����r���H�ɁA";
		mes "�C�����t���Ȃ��悤";
		mes "�ꏊ�����ɑ|��������񂾃j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�|�������Ă���ƃ����X�^�[��";
		mes "�ז������Ă��邯�ǁA";
		mes "�r���H��|�����Ă���l��";
		mes "��������X�L�����g���Ȃ�����A";
		mes "���ӂ���j���B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�r���H�͑S����10��J���j���B";
		mes "���̓��A�r���H��^ff0000�S����5����";
		mes "�|���ł�����I���j���I^000000";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�J�����r���H�́A�����������Ă��";
		mes "�C�����l�܂��Ă��܂��j���B";
		mes "^ff0000�|���I���܂łɊC����6�t������";
		mes "�|���͎��s�j���A�B^000000";
		mes "���s������A";
		mes "�~�V�����N�B���Ăі߂��j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�r���H�̑|���́A���s���Ă�";
		mes "�C�����l�܂��Ă��܂��j���B";
		mes "^ff00002��܂ł͂�蒼�����ł���^000000�j���B";
		mes "����ȏ�͎��Ԃ������肷�����";
		mes "�݂�Ȃ��S�z���邩��A";
		mes "�����̂��|���͒��߂Ĉ����グ��j���B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "����ƁA";
		mes "���|���G�L�X�p�[�g����ɂ�";
		mes "��Փx��I��Ŗ���Ă�j���B";
		mes "�ǂ�ɂ���j���H";
		while(1) {
			next;
			switch(select("��Փx�F3�_����","��Փx�F6�_����","��Փx�F�M�K�~�b�N�X����")) {
			case 1:
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "^ff0000��Փx�F3�_����^000000";
				mes "^0000ff������^000000�̍U�������Ă��郂���X�^�[��";
				mes "����r���H��|������j���B";
				mes "^0000ff������^000000�ɗL���ȑ����Œ���ł���j���B";
				mes " ";
				mes "����ł������j���H";
				set '@str$,"3�_����";
				set '@level,1;
				break;
			case 2:
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "^ff0000��Փx�F6�_����^000000";
				mes "^0000ff������^000000��^00ff00������^000000��";
				mes "�U�������Ă��郂���X�^�[������";
				mes "�r���H��|������j���B";
				mes "^0000ff������^000000��^00ff00������^000000�ɗL����";
				mes "�����Œ���ł���j���B";
				next;
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "^ff0000��Փx�F6�_����^000000�ł������j���H";
				set '@str$,"6�_����";
				set '@level,2;
				break;
			case 3:
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "^ff0000��Փx�F�M�K�~�b�N�X����^000000";
				mes "^0000ff������^000000��^00ff00������^000000��";
				mes "�U�������Ă��郂���X�^�[������";
				mes "�r���H��|������j���B";
				mes "�����̎��^ff0000�V�[���J���X��";
				mes "���C���o�Ă������ȋC������^000000�j���c�c�B";
				next;
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "^0000ff������^000000��^00ff00������^000000�ɗL����";
				mes "�����Œ���ł���j���B";
				mes "^ff0000��Փx�F�M�K�~�b�N�X����^000000";
				mes "�ł������j���H";
				set '@str$,"�M�K�~�b�N�X����";
				set '@level,3;
				break;
			}
			next;
			if(select("������","�͂�") == 1) {
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�j���j���H";
				mes "�ǂ�ɂ���j���H";
				continue;
			}
			break;
		}
		set getvariableofnpc('level,getmdnpcname("PumpControl2-1")),'@level;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���������j���I";
		mes "��Փx��"+'@str$+"�ł����j���I";
		mes "�����ǂ�"+'@str$+"�Ȃ̂��́A";
		mes "�N�������g�̖ڂ�";
		mes "�m���߂ė~�����j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�����A���낻�남�|���̎��ԃj���B";
		break;
	case 1:
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�I�񂾓�Փx��";
		mes "3�_���肾�j���I";
		break;
	case 2:
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�I�񂾓�Փx��";
		mes "6�_���肾�j���I";
		break;
	case 3:
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�I�񂾓�Փx��";
		mes "�M�K�~�b�N�X���肾�j���I";
		break;
	}
	mes "�|�����鏀���͂ł����̂��j���H";
	next;
	if(select("������Ƒ҂���","�����ł��Ă��") == 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�܂��������ł��ĂȂ��̂��j���H";
		mes "�������ł�����";
		mes "������x�b�������Ăق����j���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���������j���I�@�ł͎n�߂�j���I";
	hideonnpc;
	donpcevent getmdnpcname("PumpControl2-1")+"::OnStart";
	set '@chid,getcharid(3);
	set '@map$,getmapname("");
	getpartymember getcharid(1);
	for(set '@i,0; '@i<$@partymembercount; set '@i,'@i+1) {
		if(attachrid(getcharid(3,$@partymembername$['@i]))){
			if('@map$ == getmapname("")) {
				viewpoint 1,79,109,0,0xFFFF00;
				viewpoint 1,98,98,1,0xFFFF00;
				viewpoint 1,114,114,2,0xFFFF00;
				viewpoint 1,100,74,3,0xFFFF00;
				viewpoint 1,115,50,4,0xFFFF00;
				viewpoint 1,81,63,5,0xFFFF00;
				viewpoint 1,57,70,6,0xFFFF00;
				viewpoint 1,47,49,7,0xFFFF00;
				viewpoint 1,62,96,8,0xFFFF00;
				viewpoint 1,53,114,9,0xFFFF00;
			}
			detachrid;
		}
	}
	if(!attachrid('@chid)) {
		end;
	}
	close;
}

2@pump.gat,39,88,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump2-2	545,{
	if('retry < 3) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���s���Ă��܂����j���c�c�B";
		mes " ";
		mes "�ł��~�V���B�͒��߂Ȃ��j���B";
		mes "�撣�낤�j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�f������Ƃ����Ȃ���";
		mes "�C���������t���Ă��܂��j���B";
		mes "�O�Y�O�Y���Ă����炷�ׂĂ�";
		mes "�r���H���C���ŋl�܂��Ă��܂��j���I";
		next;
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�N�B�̃{�X�Ƃǂ����邩";
			mes "���k���Ă�j���I";
			mes "����������Ƒ҂��Ăق����j���`�B";
			close;
		}
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���C���c���Ă���j����A";
		mes "������x���킷�邩�j���H";
		mes "^ff0000����"+3-'retry+"��A���킷�邱�Ƃ��ł���^000000�j���B";
		next;
		switch(select("������Ƒ҂���","������x���킷��","������߂ċA��")) {
		case 1:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���܂�����Ă��鎞�Ԃ͂Ȃ��j���B";
			mes "�������ł����琺�������Ăق����j���B";
			close;
		case 2:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "��������Ǝv�����j���I";
			mes "��Փx�͂ǂ�ɂ���j���H";
			while(1) {
				next;
				switch(select("��Փx�F3�_����","��Փx�F6�_����","��Փx�F�M�K�~�b�N�X����")) {
				case 1:
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "^ff0000��Փx�F3�_����^000000";
					mes "^0000ff������^000000�̍U�������Ă��郂���X�^�[��";
					mes "����r���H��|������j���B";
					mes "^0000ff������^000000�ɗL���ȑ����Œ���ł���j���B";
					mes " ";
					mes "����ł������j���H";
					set '@str$,"3�_����";
					set '@level,1;
					break;
				case 2:
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "^ff0000��Փx�F6�_����^000000";
					mes "^0000ff������^000000��^00ff00������^000000��";
					mes "�U�������Ă��郂���X�^�[������";
					mes "�r���H��|������j���B";
					mes "^0000ff������^000000��^00ff00������^000000�ɗL����";
					mes "�����Œ���ł���j���B";
					next;
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "^ff0000��Փx�F6�_����^000000�ł������j���H";
					set '@str$,"6�_����";
					set '@level,2;
					break;
				case 3:
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "^ff0000��Փx�F�M�K�~�b�N�X����^000000";
					mes "^0000ff������^000000��^00ff00������^000000��";
					mes "�U�������Ă��郂���X�^�[������";
					mes "�r���H��|������j���B";
					mes "�����̎��^ff0000�V�[���J���X��";
					mes "���C���o�Ă������ȋC������^000000�j���c�c�B";
					next;
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "^0000ff������^000000��^00ff00������^000000�ɗL����";
					mes "�����Œ���ł���j���B";
					mes "^ff0000��Փx�F�M�K�~�b�N�X����^000000";
					mes "�ł������j���H";
					set '@str$,"�M�K�~�b�N�X����";
					set '@level,3;
					break;
				}
				next;
				if(select("������","�͂�") == 1) {
					mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
					mes "�j���j���H";
					mes "�ǂ�ɂ���j���H";
					continue;
				}
				break;
			}
			set getvariableofnpc('level,getmdnpcname("PumpControl2-1")),'@level;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���������j���I";
			mes "��Փx��"+'@str$+"�ł����j���I";
			mes "�����ǂ�"+'@str$+"�Ȃ̂��́A";
			mes "�N�������g�̖ڂ�";
			mes "�m���߂ė~�����j���I";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "���ꂶ�Ⴀ�n�߂�j���I";
			hideonnpc;
			donpcevent getmdnpcname("PumpControl2-1")+"::OnStart";
			close;
		case 3:
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�j��!?";
			mes "������߂Ēn��ɋA�肽���̂��j���H";
			next;
			if(select("�܂��撣��","������߂ċA��") == 1) {
				mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
				mes "�ق�ƃj���H";
				mes "�ǂ������j���`�I";
				close;
			}
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�c�O�����ǎd���Ȃ��j���c�c�B";
			mes "�����܂Ŏ�`���Ă����";
			mes "���肪�ƃj���B";
			next;
			mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
			mes "�A��̏o���͍��̂ق��j���B";
			mes "�܂��ǂ��������`���ė~�����j���I";
			set 'retry,3;
			enablenpc getmdnpcname("#PumpExit2");
			close;
		}
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���s���Ă��܂����j���c�c�B";
	mes "���x��������߂���";
	mes "���킵�Ă���Ċ��������ǁA";
	mes "���낻�뎞�Ԃ��}�Y���j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�c�O�����ǒn��֖߂�j���c�c�B";
	mes "�����܂Ŏ�`���Ă����";
	mes "���肪�ƃj���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�A��̏o���͍��̂ق��j���B";
	mes "�܂��ǂ��������`���ė~�����j���I";
	enablenpc getmdnpcname("#PumpExit2");
	close;
OnStart:
	hideoffnpc;
	set 'retry,'retry+1;
	end;
OnInit:
	hideonnpc;
	set 'retry,0;
	end;
}

2@pump.gat,41,88,4	script	�ۊǌɂ̊Ǘ��l�~�V��#Pump2-3	545,{
	if(PUMP_1QUE != 2) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���肪�Ƃ��j���B";
		mes "�ǂ�������܂���`���ė~�����j���B";
		close;
	}
	set '@kill,getvariableofnpc('kill,getmdnpcname("PumpControl2-2"));
	if('@kill == 0) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�N�B��������z�̓V�[���J���X�̒��ł�";
		mes "����Ƃ��Ĉ����Ă���z���j���B";
		mes "����܂ŉ��x�����킵�Ă������ǁA";
		mes "���̓x�Ɏ��s���Ă����j���B";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�Ƃ肠������l�����A���Ă����";
		mes "�ǂ������j���B";
	}
	else {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�������z��|�����j���I";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�N�B���|�����z�̓V�[���J���X�̒��ł�";
		mes "�����ċ��\�ȓz���j���B";
		mes "����܂ŉ��x�����킵�Ă������ǁA";
		mes "���̓x�Ɏ��s���Ă����j���B";
		next;
		emotion 21;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�܂���"+('@kill == 0? "�A�C�c��": '@kill == 4? "4�C�Ƃ�": '@kill+"�C��")+"�|����Ƃ�";
		mes "�v���ĂȂ������j���B";
		mes "�������j���I�@�������j��!!";
		next;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�t�[�I";
		mes "�t�[!!";
		next;
		emotion 32;
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�Ӂ[�c�c";
		mes "�v���Ԃ�ɃG�L�T�C�g����";
		mes "���܂����j���B";
	}
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���Ƃ̓~�V�������������邩��A";
	mes "�N�B�͉ו���Z�߂�";
	mes "���Ε����̏o�������ɏo�Ă���j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���A����Ɓc�c";
	mes "���������Ō������Ƃ�";
	mes "�閧�ɂ��Ă��Ăق����j���B";
	next;
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "�g�[�}�X���������������Ⴄ�ƁA";
	mes "�~�V�����N�B��";
	mes "�d���������Ȃ��Ă��܂��j���B";
	next;
	if(checkitemblank() < 1) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "���A�ו��������ς��̂悤���j���B";
		mes "�ו��𐮗����āA";
		mes "������x���������ăj���B";
		close;
	}
	mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
	mes "���Ƃ����";
	mes "��`���Ă��ꂽ���炾�j���B";
	mes "�ǂ�������܂���`���ė~�����j���B";
	switch(getvariableofnpc('level,getmdnpcname("PumpControl2-1"))) {
	case 1:		// 3�_����
		getitem 6423,2;
		getexp 3000000, 0;
		getexp 0, 1500000;
		break;
	case 2:		// 6�_����
		getitem 6423,5;
		if(BaseLevel < 100) {
			getexp 3000000,0;
			getexp 0,1500000;
		}
		else if(BaseLevel < 110) {
			getexp 4000000,0;
			getexp 0,2000000;
		}
		else if(BaseLevel < 120) {
			getexp 5000000,0;
			getexp 0,2500000;
		}
		else if(BaseLevel < 130) {
			getexp 7000000,0;
			getexp 0,3500000;
		}
		else {
			getexp 10000000,0;
			getexp 0,5000000;
		}
		break;
	case 3:		// �M�K�~�b�N�X����
		switch('@kill) {
		case 0:
			getitem 6423,3;
			if(BaseLevel < 100) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 110) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 120) {
				getexp 4000000,0;
				getexp 0,2000000;
			}
			else if(BaseLevel < 130) {
				getexp 5000000,0;
				getexp 0,2500000;
			}
			else {
				getexp 6000000,0;
				getexp 0,3000000;
			}
			break;
		case 1:
			getitem 6423,8;
			if(BaseLevel < 100) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 110) {
				getexp 4000000,0;
				getexp 0,2000000;
			}
			else if(BaseLevel < 120) {
				getexp 5000000,0;
				getexp 0,2500000;
			}
			else if(BaseLevel < 130) {
				getexp 7000000,0;
				getexp 0,3500000;
			}
			else {
				getexp 10000000,0;
				getexp 0,5000000;
			}
			break;
		case 2:
			getitem 6423,12;
			if(BaseLevel < 100) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 110) {
				getexp 4500000,0;
				getexp 0,2250000;
			}
			else if(BaseLevel < 120) {
				getexp 6000000,0;
				getexp 0,3000000;
			}
			else if(BaseLevel < 130) {
				getexp 9000000,0;
				getexp 0,4500000;
			}
			else {
				getexp 12000000,0;
				getexp 0,6000000;
			}
			break;
		case 3:
			getitem 6423,15;
			if(BaseLevel < 100) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 110) {
				getexp 5000000,0;
				getexp 0,2500000;
			}
			else if(BaseLevel < 120) {
				getexp 7000000,0;
				getexp 0,3500000;
			}
			else if(BaseLevel < 130) {
				getexp 11000000,0;
				getexp 0,5500000;
			}
			else {
				getexp 15000000,0;
				getexp 0,7500000;
			}
			break;
		case 4:
			getitem 6423,15;
			if(BaseLevel < 100) {
				getexp 3000000,0;
				getexp 0,1500000;
			}
			else if(BaseLevel < 110) {
				getexp 6000000,0;
				getexp 0,3000000;
			}
			else if(BaseLevel < 120) {
				getexp 10000000,0;
				getexp 0,5000000;
			}
			else if(BaseLevel < 130) {
				getexp 16000000,0;
				getexp 0,8000000;
			}
			else {
				getexp 20000000,0;
				getexp 0,10000000;
			}
			break;
		}
		break;
	}
	set PUMP_1QUE,3;
	close;
OnInit:
	hideonnpc;
	end;
}

2@pump.gat,0,0,0	script	PumpControl2-1	-1,{
OnStart:
	set 'phase,0;
	set 'success,0;
	set 'fail,0;
	initnpctimer;
	announce "�~�V�� : 5�b��ɍŏ��̔r���H���J���j���I�@�J���ꂽ�r���H��T���ăN���b�N���|�����n�߂�j��!!",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer5000:
	if('success < 5) {
		if('phase < 10) {
			set 'phase,'phase+1;
			set '@rand,rand(6);
			donpcevent getmdnpcname("#Pump2-"+'@rand)+"::OnStart";
			switch('@rand) {
			case 0:
				set '@pos$,"12������";
				set '@x1,75;
				set '@y1,105;
				set '@x2,83;
				set '@y2,113;
				break;
			case 1:
				set '@pos$,"2������";
				set '@x1,94;
				set '@y1,94;
				set '@x2,102;
				set '@y2,102;
				break;
			case 2:
				set '@pos$,"2������";
				set '@x1,110;
				set '@y1,110;
				set '@x2,118;
				set '@y2,118;
				break;
			case 3:
				set '@pos$,"5������";
				set '@x1,96;
				set '@y1,70;
				set '@x2,104;
				set '@y2,78;
				break;
			case 4:
				set '@pos$,"5������";
				set '@x1,111;
				set '@y1,46;
				set '@x2,119;
				set '@y2,54;
				break;
			case 5:
				set '@pos$,"6������";
				set '@x1,77;
				set '@y1,59;
				set '@x2,85;
				set '@y2,67;
				break;
			case 6:
				set '@pos$,"8������";
				set '@x1,53;
				set '@y1,66;
				set '@x2,61;
				set '@y2,74;
				break;
			case 7:
				set '@pos$,"8������";
				set '@x1,43;
				set '@y1,45;
				set '@x2,51;
				set '@y2,53;
				break;
			case 8:
				set '@pos$,"10������";
				set '@x1,58;
				set '@y1,92;
				set '@x2,66;
				set '@y2,100;
				break;
			case 9:
				set '@pos$,"10������";
				set '@x1,49;
				set '@y1,110;
				set '@x2,57;
				set '@y2,118;
				break;
			}
			announce "�~�V�� : "+'@pos$+"�̔r���H���J�����j���I",0x9,0x00FFCC,0x190,15,0,0;
			switch('level) {
			case 1:
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃\�[�h�t�B�b�V��",2181,rand(1,2),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃}���N",2182,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃I�{���k",2184,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				break;
			case 2:
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃\�[�h�t�B�b�V��",2181,rand(1,2),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃}���N",2182,rand(1,2),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃I�{���k",2184,rand(1,2),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق̃X�g���E�t",2180,rand(1,2),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق̃A�m���A��",2183,1,getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق͓̉�",2185,1,getmdnpcname("PumpControl2-1")+"::OnKilled";
				break;
			case 3:
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃\�[�h�t�B�b�V��",2181,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃}���N",2182,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�Ñ�̃I�{���k",2184,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق̃X�g���E�t",2180,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق̃A�m���A��",2183,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				areamonster getmdmapname("2@pump.gat"),'@x1,'@y1,'@x2,'@y2,"�ψق͓̉�",2185,rand(2,3),getmdnpcname("PumpControl2-1")+"::OnKilled";
				break;
			}
		}
	}
	else {
		donpcevent getmdnpcname("PumpControl2-2")+"::OnStart";
		stopnpctimer;
	}
	end;
OnTimer40000:
	initnpctimer;
	end;
OnSuccess:
	set 'success,'success+1;
	announce "�~�V�� : "+'success+"�ڂ̔r���H�̑|�������������j���`�I",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnFail:
	set 'fail,'fail+1;
	killmonster getmdmapname("2@pump.gat"),getmdnpcname("PumpControl2-1")+"::OnKilled";
	areamonster getmdmapname("2@pump.gat"),75,78,85,88,"����ȊC��",2191,1,getmdnpcname("PumpControl2-1")+"::OnKilled2";
	announce "�~�V�� : ����ȊC�����t���Ă��܂����j���I�@��"+'fail+"�s���j���I",0x9,0xFF3333,0x190,15,0,0;
	if('fail >= 6) {
		killmonster getmdmapname("2@pump.gat"),getmdnpcname("PumpControl2-1")+"::OnKilled2";
		announce "�~�V�� : ����ȊC�����r���H�𕢂��Ă���j���I�@�|���͎��s���j���`�B�Ƃ肠�����~�V���̏��܂ŗ��Ăق����j��!!",0x9,0xFF88FF,0x190,15,0,0;
		donpcevent getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump2-2")+"::OnStart";
		stopnpctimer;
	}
	end;
OnKilled:
OnKilled2:
	end;
}

2@pump.gat,0,0,0	script	PumpControl2-2	-1,{
OnStart:
	if(getvariableofnpc('fail,getmdnpcname("PumpControl2-1")) == 0) {
		announce "�~�V�� : �|���I���j���I�@�����ɑ|���ł�������A����ȊC���͋l�܂�Ȃ������j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	else {
		announce "�~�V�� : ����ȊC���͑S����"+getvariableofnpc('fail,getmdnpcname("PumpControl2-1"))+"�s�j���B�|���I���j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	initnpctimer;
	end;
OnTimer5000:
	if(getvariableofnpc('fail,getmdnpcname("PumpControl2-1")) == 0) {
		announce "�~�V�� : ���ށI�@�N�B�ӊO�Ƃ��j��!!",0x9,0x00FFCC,0x190,15,0,0;
	}
	else {
		announce "�~�V�� : �Ȃ��Ȃ��ǂ��|���������j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	end;
OnTimer10000:
	announce "�~�V�� : �ł͉ו���Z�߂ď�Ɂc�c�@�j���A�A�A!?",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer15000:
	announce "�~�V�� : �����σj������������!!�@�o���o�����Ɗ댯�j���I�@�^�񒆂ɏW�܂�j��!!",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer17000:
	mapwarp "this",getmdmapname("2@pump.gat"),74,88;
	hideoffnpc getmdnpcname("#PumpBoss2");
	end;
OnTimer22000:
	hideonnpc getmdnpcname("#PumpBoss2");
	announce "�~�V�� : �N�B���ْ��������j�����ŁA�퓬�̏���������j���I",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer24000:
	switch(getvariableofnpc('level,getmdnpcname("PumpControl2-1"))) {
	case 1:
		monster getmdmapname("2@pump.gat"),79,92,"�Í��̃V�[���J���X",2187,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		announce "�r���H�̉��ꂩ��w�Í��̃V�[���J���X�x���o���I",0x9,0xFF88FF,0x190,40,0,0;
		break;
	case 2:
		monster getmdmapname("2@pump.gat"),79,92,"�\�s�̃V�[���J���X",2190,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		announce "�r���H�̉��ꂩ��w�\�s�̃V�[���J���X�x���o���I",0x9,0xFF88FF,0x190,40,0,0;
		break;
	default:
		monster getmdmapname("2@pump.gat"),94,97,"�Í��̃V�[���J���X",2187,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		monster getmdmapname("2@pump.gat"),97,71,"�ٌ`�̃V�[���J���X",2188,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		monster getmdmapname("2@pump.gat"),60,68,"�\�s�̃V�[���J���X",2189,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		monster getmdmapname("2@pump.gat"),66,97,"�ψق̃V�[���J���X",2190,1,getmdnpcname("PumpControl2-2")+"::OnKilled";
		announce "�r���H�̉��ꂩ��4�C�̃V�[���J���X���o���I",0x9,0xFF88FF,0x190,40,0,0;
		break;
	}
	end;
OnTimer27000:
	announce "�~�V�� : �A�C�c�͂����|�����ז����鈫�����c���j���I",0x9,0x00FFCC,0x190,15,0,0;
	end;
OnTimer30000:
	if(getvariableofnpc('level,getmdnpcname("PumpControl2-1")) < 3) {
		announce "�~�V�� : �ł��Ȃ񂾂��l�q�����������j���B�@����Ă�݂������j���c�c�B",0x9,0x00FFCC,0x190,15,0,0;
	}
	else {
		announce "�~�V�� : �A�C�c���3���ԃR�R���r�炵����A�������ꏊ�֋A���Ă��܂��j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	end;
OnTimer33000:
	if(getvariableofnpc('level,getmdnpcname("PumpControl2-1")) < 3) {
		announce "�~�V�� : ��`���A���܂̂����j���I�@������ǂ��ς���ė~�����j���I",0x9,0x00FFCC,0x190,15,0,0;
		stopnpctimer;
	}
	else {
		announce "�~�V�� : 3���ȓ��ɃA�C�c���������ė~�����j���I�@���񂾃j���I",0x9,0x00FFCC,0x190,15,0,0;
	}
	end;
OnTimer93000:
	announce "�~�V�� : 1���o�߂����j���I�@�܂��������Ԃ͂���j���I",0x9,0xFF88FF,0x190,15,0,0;
	end;
OnTimer153000:
	announce "�~�V�� : 2���o�߂����j���I�@�c��1���A�}���j��!!",0x9,0xFF88FF,0x190,15,0,0;
	end;
OnTimer213000:
	killmonster getmdmapname("2@pump.gat"),getmdnpcname("PumpControl2-2")+"::OnKilled";
	hideoffnpc getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump2-3");
	enablenpc getmdnpcname("#PumpExit2");
	announce "�~�V�� : �V�[���J���X�������A���Ă��j���c�c�B�Ƃ肠��������S���j���B",0x9,0xFF88FF,0x190,15,0,0;
	end;
OnTimer216000:
	announce "�~�V�� : �����A���x�����A��j���B���̑O�Ƀ~�V���ɘb�����ė~�����j���I",0x9,0xFF88FF,0x190,15,0,0;
	stopnpctimer;
	end;
OnKilled:
	set 'kill,'kill+1;
	if(getmapmobs(getmdmapname("2@pump.gat"),getmdnpcname("PumpControl2-2")+"::OnKilled") > 0) {
		announce "�܂������X�^�[���c���Ă��܂��B",0x9,0x00FF99,0x190,20,0,0;
		end;
	}
	stopnpctimer;
	announce "�r���H���猻�ꂽ�V�[���J���X��|���܂����B�험�i�����͂ɂ΂�܂���Ă���̂ŁA�n�ʂ��悭���ׂČ��܂��傤�B",0x9,0xFFFF00,0x190,15,0,0;
	for(set '@i,0; '@i<10; set '@i,'@i+1) {
		if(rand(4000) < 5000) {
			dropitem "this",rand(40,77),rand(87,120),12636,1,0;		// �}���������Y�ʋl
		}
		else {
			dropitem "this",rand(40,77),rand(87,120),12623,1,0;		//��������̔�
		}
	}
	hideoffnpc getmdnpcname("�ۊǌɂ̊Ǘ��l�~�V��#Pump2-3");
	enablenpc getmdnpcname("#PumpExit2");
	end;
}

2@pump.gat,79,109,0	script	#Pump2-0	844,14,14,{
	if(getnpctimer(1)) {
		progressbar 5;
	}
	if(getnpctimer(1) == 0) {
		mes "-�r���H�͕��Ă���-";
		close;
	}
	misceffect 16;
	stopnpctimer;
	donpcevent getmdnpcname("PumpControl2-1")+"::OnSuccess";
	end;
OnStart:
	set 'count,40;
OnTimer1000:
	set 'count,'count-1;
	if('count == 10) {
		announce "�~�V�� : 10�b�ȓ���"+getvariableofnpc('phase,getmdnpcname("PumpControl2-1"))+"�ڂ̔r���H�̑|�����I��点��j���I�@�}���j���[!!",0x9,0x00FFCC,0x190,15,0,0;
	}
	if('count > 0) {
		misceffect 109;
		initnpctimer;
		end;
	}
	stopnpctimer;
	donpcevent getmdnpcname("PumpControl2-1")+"::OnFail";
	end;
OnTouch:
	if(getnpctimer(1)) {
		misceffect 247;
	}
	end;
}

2@pump.gat,98,98,0		duplicate(#Pump2-0)	#Pump2-1	844,14,14
2@pump.gat,114,114,0	duplicate(#Pump2-0)	#Pump2-2	844,14,14
2@pump.gat,100,74,0		duplicate(#Pump2-0)	#Pump2-3	844,14,14
2@pump.gat,115,50,0		duplicate(#Pump2-0)	#Pump2-4	844,14,14
2@pump.gat,81,63,0		duplicate(#Pump2-0)	#Pump2-5	844,14,14
2@pump.gat,57,70,0		duplicate(#Pump2-0)	#Pump2-6	844,14,14
2@pump.gat,47,49,0		duplicate(#Pump2-0)	#Pump2-7	844,14,14
2@pump.gat,62,96,0		duplicate(#Pump2-0)	#Pump2-8	844,14,14
2@pump.gat,53,114,0		duplicate(#Pump2-0)	#Pump2-9	844,14,14

2@pump.gat,79,85,0	script	#PumpBoss2	111,14,14,{
OnTouch:
	set PUMP_1QUE,2;
	switch(getvariableofnpc('level,getmdnpcname("PumpControl2-1"))) {
	case 1:
		viewpoint 1,79,92,0,0x0000FF;
		break;
	case 2:
		viewpoint 1,79,92,0,0x00FF00;
		break;
	case 3:
		viewpoint 1,94,97,0,0x0000FF;
		viewpoint 1,97,71,1,0x0000FF;
		viewpoint 1,60,68,2,0x00FF00;
		viewpoint 1,66,97,3,0x00FF00;
		break;
	}
	end;
OnInit:
	hideonnpc;
	end;
}

2@pump.gat,38,100,0	script	#PumpExit2	45,3,3,{
OnTouch:
	if(PUMP_1QUE == 2) {
		mes "[�ۊǌɂ̊Ǘ��l�~�V��]";
		mes "�j���j��!?";
		mes "������Ƒ҂��Ă���j���B";
		mes "�~�V���Ƃ��b���ė~�����j���I";
		close;
	}
	mes "-�n���r���H����O�ɏo�܂����H-";
	next;
	if(select("�O�ɏo�Ȃ�","�O�ɏo��") == 1) {
		mes "-���Ȃ��͂��̏ꂩ�痣�ꂽ-";
		close;
	}
	mes "-�O�֏o�܂�-";
	close2;
	warp "mal_in01.gat",161,32;
	end;
OnInit:
	disablenpc;
	end;
}
