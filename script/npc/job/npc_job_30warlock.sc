//= Auriga Script ==============================================================
// Ragnarok Online Warlock Jobchange Script	by Blaze
//- Registry -------------------------------------------------------------------
// CHANGE_WL -> 0�`9
//==============================================================================

//============================================================
// �}�b�v�t���O
//------------------------------------------------------------
job3_war01.gat	mapflag	nomemo		dummy
job3_war01.gat	mapflag	noteleport	dummy
job3_war01.gat	mapflag	nosave		SavePoint
job3_war01.gat	mapflag	nobranch	dummy
job3_war01.gat	mapflag	nopenalty	dummy
job3_war01.gat	mapflag	noicewall	dummy
job3_war02.gat	mapflag	nomemo		dummy
job3_war02.gat	mapflag	noteleport	dummy
job3_war02.gat	mapflag	nosave		SavePoint
job3_war02.gat	mapflag	nobranch	dummy
job3_war02.gat	mapflag	nopenalty	dummy
job3_war02.gat	mapflag	noicewall	dummy

//============================================================
// �����X�^�[
//------------------------------------------------------------
spl_fild02.gat,0,0,0,0	monster	���͂ɐ�����B�S�[����	2049,20,5000,0,0
spl_fild02.gat,0,0,0,0	monster	���͂ɐ������i�[�K		2047,20,5000,0,0

//============================================================
// �ȈՑq�Ɂinpc_misc_storage.sc���j
//------------------------------------------------------------
splendide.gat,209,110,4	script	�q�ɊǗ��l	80,{
	callfunc "Func_StorageManager",50,0;
	close;
}
splendide.gat,206,108,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
splendide.gat,208,108,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
splendide.gat,210,108,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
splendide.gat,212,108,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �J�nNPC
//------------------------------------------------------------
morocc.gat,97,144,0	script	�c�񂾋��#morroc	723,{
	if(Job == Job_Warlock) {
		mes "�]��Șc�݂�������]";
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
	emotion 1,"";
	mes "�]����܂Ŋ��������Ƃ̖���";
	mes "�@���͂Ȗ��͂��ڂ̑O�̋�Ԃ���";
	mes "�@���o�Ă���̂�������]";
	next;
	if(select("���ׂĂ݂�","��������") == 2) {
		mes "�]�����N���邩�킩��Ȃ��B";
		mes "�@�ߊ��Ȃ������ǂ��������]";
		close;
	}
	if(Job == Job_Warlock) {

	}
	if(Job != Job_Wizard || Upper == UPPER_NORMAL) {
		emotion 9,"";
		mes "�]�߂Â������������Ȃ��B";
		mes "�@�C�ɂ��Ȃ������ǂ��������]";
		close;
	}
	if((Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {
		mes "�]�߂Â����A���͂Ȗ��͂�";
		mes "�@����������ł��܂�";
		mes "�@�߂Â����Ƃ��ł��Ȃ��]";
		next;
		if(Upper == UPPER_HIGH)
			mes  "-^3377FFBaseLv��90�ȏ�^000000��";
		else
			mes  "-^3377FFBaseLv��99�AJobLv��50^000000��";		// �{�q�̂Ƃ�������
		mes "�@�グ�Ă���";
		mes "�@�ēx�A���ׂ邱�Ƃɂ��悤�]";
		close;
	}
	mes "�]�L�B�B�B�B�B�B�B�B�C���]";
	next;
	mes "�]���L�΂���";
	mes "�@�����̖��͂Ɣ��������̂�";
	mes "�@�����񂴂��悤�ȍ����Ƌ���";
	mes "�@�ڂ̑O�̋�Ԃ����˂�n�߂��]";
	if(CHANGE_WL == 0) {
		next;
		if(strnpcinfo(2) == "splendide")
			set '@npcname$,"�]�E��s�W#WL2";
		else
			set '@npcname$,"�]�E��s�W#WL";
		cloakoffnpc '@npcname$;
		misceffect 78,'@npcname$;
		if(callfunc("Func_Job3rd",Job_Warlock)) {
			cloakonnpc '@npcname$;
			end;
		}
		cloakonnpc '@npcname$;
		set CHANGE_WL,1;
		setquest 104505;
	}
	else {
		close2;
	}
	warp "spl_in02.gat",79,102;
	end;
}

splendide.gat,141,284,0	duplicate(�c�񂾋��#morroc)	�c�񂾋��#splendide	723

morocc.gat,94,149,3	script(CLOAKED)	�]�E��s�W#WL	888,{
	cloakonnpc;
	end;
}

splendide.gat,140,285,3	duplicate(�]�E��s�W#WL)	�]�E��s�W#WL2	888

//============================================================
// �}�X�^�[�̕���
//------------------------------------------------------------
spl_in02.gat,80,108,5	script	�}�X�^�[	465,{
	if(Job == Job_Warlock) {
		cutin "3rd_wl_queen03",1;
		mes "[�G�O�m�����A]";
		mes "��Ɏ��Ȃ̗͗ʂ�";
		mes "���m�ɔc�����邱�Ƃ��B";
		next;
		mes "[�G�O�m�����A]";
		mes "���ꂪ�ł����A�g�̏�ɍ���Ȃ�";
		mes "�͂��g���������";
		mes "�����������g�̗͂�";
		mes "����Ă��܂����낤�B";
		next;
		cutin "3rd_wl_queen05",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "���ɂ����Ȃ����";
		mes "�C����ӂ�Ȃ����Ƃ��B";
		mes "�t�t�t�c�c�B";
		close2;
		cutin "3rd_wl_queen05",255;
		end;
	}
	switch(CHANGE_WL) {
	case 0:
	case 1:
		if(YGG_1QUE < 100) {	// �m�b�̉��̎w�փN�G�X�g
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "Ikaga�@Waba�H";
			mes "Zalgu�@Qaguasre";
			mes "Kguawi�@GakitWama�H";
			next;
			cutin "war_y3",2;
			emotion 0,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "Haytaw�I";
			mes "DatguaZe�@Lta�I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "Fooalzwa";
			mes "Atugaz�@NataMauta";
			mes "Maitaga�H";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "Paie�@Mlzgaa�I";
			mes "Wmagataz�@Kutta�I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "�c�cRtaal�B";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "Xata�@Xatayi�I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "Owagzkg�@Qgalbia";
			mes "RgaBlata�@Matwaty";
			mes "Watagaz�@Lalta�H";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "Ettu�@Ata�@AgaIluti�I";
			mes "Vrgao�@Girwttn�c�c";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "Eatakl�c�c�B";
			mes "Qazlga�@Xtowna";
			mes "Lgarw�@Mmata";
			next;
			mes "[�d��]";
			mes "MushSartas�@Ir�@Cyamar";
			mes "UdenLo";
			if(CHANGE_WL == 0) {
				close2;
				cutin "3rd_wl_queen01",255;
				warp "splendide.gat",200,100;
				end;
			}
			next;
			cutin "3rd_wl_queen01",255;
			misceffect 235,"";
			mes "�]�ΐF�̔��������d����";
			mes "�@�������������u��";
			mes "�@���܂Ŋ��������Ƃ�����";
			mes "�@���͂Ȗ��͂��̂��ݍ���ł����]";
			next;
			cutin "3rd_wl_queen02",1;
			emotion 0;
			mes "[�d��]";
			mes "�ق��`�A�ʔ�������Ȃ��B";
			mes "�l�Ԃ̕��ۂŁA���̎��̖��@��";
			mes "��R����Ȃ�āB";
			next;
			mes "[�d��]";
			mes "�������̌��t���킩��Ȃ�";
			mes "�݂���������";
			mes "�������̌��t�Řb������";
			mes "�������B";
			mes "���ʃT�[�r�X��B";
			next;
			emotion 0,"";
			mes "[�d��]";
			mes "�ʂɋ����قǂ̂��Ƃł͂Ȃ���B";
			mes "�l�Ԃ����̂��Ƃ́A�ȑO����";
			mes "�m���Ă�����́c�c�B";
			mes "�t�t�t�b�c�c";
			next;
		}
		else {
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "���̑����H";
			mes "�ґz���͐Â��ɂ��Ȃ�����";
			mes "���������Ă���͂������ǁH";
			next;
			cutin "war_y3",2;
			emotion 0,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "������I";
			mes "���A�\���󂠂�܂���I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "�ق��`�B";
			mes "���̖ڂ̑O�ɐl�Ԃ�����悤������";
			mes "����͂��������A�ǂ��������ƁH";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "�\���󂠂�܂���I";
			mes "���A�������ǂ������܂��I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "�c�c���b�u�B";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "�́A�͂������I";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "���O�̌��ɁA�J����������";
			mes "���[�v�|�[�^��������悤������";
			mes "���̌��ԈႢ������H";
			next;
			cutin "war_y3",2;
			emotion 19,"�����ȗd��#WL";
			mes "[�������d��]";
			mes "�������A���݂܂���I";
			mes "�܂��A��������Ɓc�c";
			next;
			cutin "3rd_wl_queen01",1;
			mes "[�d��]";
			mes "���̋����҂߁c�c�B";
			mes "���O�ւ̎d�u���́A���̐l�Ԃ�";
			mes "�ǂ��o���Ă���ɂ��悤�B";
			next;
			mes "[�d��]";
			mes "MushSartas�@Ir�@Cyamar";
			mes "UdenLo";
			if(CHANGE_WL == 0) {
				close2;
				cutin "3rd_wl_queen01",255;
				warp "splendide.gat",200,100;
				end;
			}
			next;
			cutin "3rd_wl_queen01",255;
			misceffect 235,"";
			mes "�]�ΐF�̔��������d����";
			mes "�@�������������u��";
			mes "�@���܂Ŋ��������Ƃ�����";
			mes "�@���͂Ȗ��͂��̂��ݍ���ł����]";
			next;
			cutin "3rd_wl_queen02",1;
			emotion 0;
			mes "[�d��]";
			mes "�ق��`�A�ʔ�������Ȃ��B";
			mes "�l�Ԃ̕��ۂŁA���̎��̖��@��";
			mes "��R����Ȃ�āB";
			next;
		}
		cutin "3rd_wl_queen03",1;
		emotion 5;
		mes "[�d��]";
		mes "�Ӂ`��c�c�B";
		mes "�ǂ�������A���Ȃ苻���[��";
		mes "�l�Ԃ���Ȃ��B";
		next;
		menu "���Ȃ��͂��������H",-;
		mes "[�G�O�m�����A]";
		mes "����^FF0000�E�H�[���b�N^000000�̎w���ҁB";
		mes "^FF0000�V���[�E�G�O�m�����A^000000�B";
		mes "�M�������@�g���𖼏��Ȃ�";
		mes "���̖��O���o���Ă����Ȃ����B";
		next;
		menu "�E�H�[���b�N�H",-;
		emotion 5;
		mes "[�G�O�m�����A]";
		mes "�ق��c�c�B";
		mes "^FF0000�E�H�[���b�N^000000�ɋ���������݂����ˁH";
		next;
		mes "[�G�O�m�����A]";
		mes "�ł��A�E�H�[���b�N��";
		mes "�l�q�𒴂�������Ȗ��@���g���ҁB";
		mes "���t�Ő����ł��鑶�݂ł͂Ȃ��B";
		next;
		cutin "3rd_wl_queen05",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "�c�c����Ȗ��́B";
		mes "���ꂾ�����A���̑��݂��������́B";
		mes "�t�t�t�c�c�B";
		next;
		menu "�����E�H�[���b�N�ɂȂ�܂����H",-;
		cutin "3rd_wl_queen06",1;
		emotion 56;
		mes "[�G�O�m�����A]";
		mes "���͂͂͂͂́I";
		mes "�l�Ԃł��邨�O��";
		mes "�E�H�[���b�N�ɂȂ肽�����āH";
		next;
		emotion 56;
		mes "[�G�O�m�����A]";
		mes "���͂͂͂͂́I";
		mes "�{���ɖʔ����l�ԂˁB";
		mes "�����ǁA�l�Ԃ��E�H�[���b�N��";
		mes "�Ȃ�͖̂����Șb��B";
		next;
		mes "[�G�O�m�����A]";
		mes "�E�H�[���b�N�̋���Ȗ��͂�";
		mes "���O�̓��ȓ��̂������";
		mes "���܂������B";
		next;
		cutin "3rd_wl_queen05",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "�͂��߂��玀�ʂ���Ȃ�";
		mes "���@�������Ă����Ă��������H";
		mes "�t�t�t�c�c�B";
		next;
		set @menu,select("���@�������Ă�������","���߂ė�������");
		break;
	case 2:
		cutin "3rd_wl_queen01",1;
		mes "[�G�O�m�����A]";
		mes "�������ɗ����́H";
		mes "���ɗp�ł�����̂�����H";
		next;
		set @menu,select("�E�H�[���b�N�ɂȂ肽���ł�","�p���͂���܂���");
		break;
	case 3:
		cutin "3rd_wl_queen04",1;
		mes "[�G�O�m�����A]";
		mes "���͂��ꂩ���ґz�ɓ��邩��B";
		mes "�����́u�o�i�i�̔�v�݂����Ȃ��";
		mes "�b�𕷂��Ȃ����B";
		close2;
		cutin "3rd_wl_queen04",255;
		end;
	case 5:
		cutin "3rd_wl_queen05",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "���b�u����b�͕�������B";
		mes "���Ȃ莿�̂������΂�";
		mes "�o�����悤�ˁB";
		mes "�t�t�t�c�c�B";
		next;
		mes "[�G�O�m�����A]";
		mes "���͂�����΂͔��������̂ق�";
		mes "�������͂��h���̂�B";
		next;
		cutin "3rd_wl_queen05",1;
		mes "[�G�O�m�����A]";
		mes "�c�c�V�F�[�Y�B";
		next;
		cutin "3rd_wl_queen05",255;
		mes "[�V�F�[�Y]";
		mes "���Ăтł����A�}�X�^�[�B";
		next;
		cutin "3rd_wl_queen05",1;
		mes "[�G�O�m�����A]";
		mes "���̎҂Ɂu���͂̕����v��";
		mes "�g�p����^�����B";
		mes "���O���ē����Ă��悤�ɁB";
		next;
		cutin "3rd_wl_queen05",255;
		mes "[�V�F�[�Y]";
		mes "�������܂����A�}�X�^�[�B";
		set CHANGE_WL,6;
		chgquest 11108,11109;
		close;
	case 9:
		cutin "3rd_wl_queen04",1;
		mes "[�G�O�m�����A]";
		mes "���������ˁc�c�B";
		mes "���O�̍���������̐΂�";
		mes "���O�̍��̂��Ƃ�B";
		mes "���̑z���ȏゾ��B";
		next;
		mes "[�G�O�m�����A]";
		mes "�����A�����̐΂��󂯎��Ȃ����B";
		mes "�����g�ɕt���邱�Ƃ�";
		mes "���O�̖]�ޑ��݂ɂȂ���B";
		next;
		if(select("�����̐΂��󂯎��","�S�̏������ł��Ă��܂���") == 2) {
			cutin "3rd_wl_queen06",1;
			emotion 56;
			mes "[�G�O�m�����A]";
			mes "���͂͂͂́I";
			mes "���̊��ɋy��ŉ������̂��H";
			mes "�t�t�t�c�c�ʔ������c���B";
			close2;
			cutin "3rd_wl_queen06",255;
			end;
		}
		mes "[�G�O�m�����A]";
		mes "��낵���B";
		mes "�����A�󂯎��Ȃ����B";
		next;
		if(Weight || checkitemblank() < 2 || checkcart() || checkfalcon() || checkriding() || checkdragon() || checkgear() || checkwolf() || sc_ison(SC_ALL_RIDING) || getpetinfo(0)) {
			cutin "3rd_wl_queen03",1;
			mes "[�G�O�m�����A]";
			mes "�����������Ă��Ȃ���B";
			mes "��U�A�����A��Ă�����̂͑S�ĉ�����A";
			mes "�d�ʂ����镨�͑S�ėa���Ă��Ȃ����B";
			next;
			cutin "3rd_wl_queen06",255;
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
			cutin "3rd_wl_queen03",1;
			mes "[�G�O�m�����A]";
			mes "�����������Ă��Ȃ���B";
			mes "�X�L���|�C���g���c���Ă��邩��";
			mes "���ׂĎg���؂��Ă��Ȃ����B";
			close2;
			cutin "3rd_wl_queen03",255;
			end;
		}
		if(Job != Job_Wizard || Upper == UPPER_NORMAL || (Upper == UPPER_HIGH && BaseLevel < 90) || (Upper == UPPER_BABY && (BaseLevel < 99 || JobLevel < 50))) {	// �O�̂��ߐE�`�F�b�N
			cutin "3rd_wl_queen03",1;
			mes "[�G�O�m�����A]";
			mes "�����������Ă��Ȃ���B";
			close2;
			cutin "3rd_wl_queen03",255;
			end;
		}
		set CHANGE_WL,0;
		chgquest 11112,201185;
		compquest 201185;
		resetstatus;
		resetskill;
		setoption 0;
		jobchange Job_Warlock;
		getitem 5753,1;		// ���͐΂̖X�q
		getitem 2795,1;		// �n���Ă��Ȃ������S�̎w��
		setquest 129700;	// �X�e�[�^�X���X�L���ꊇ���Z�b�g��
		cutin "3rd_wl_queen06",1;
		mes "[�G�O�m�����A]";
		mes "���������B������n���Ă�����B";
		mes "���΂炭�͖��ɗ��ł���B";
		next;
		mes "[�G�O�m�����A]";
		mes "���߂łƂ��A�ƌ����Ă�����B";
		mes "�܂����l�Ԃ��������Ɠ������݂�";
		mes "�Ȃ��Ƃ͎v���Ă��Ȃ��������ǁB";
		next;
		cutin "3rd_wl_queen03",1;
		mes "[�G�O�m�����A]";
		mes "�v���΁A���O�������ɗ����̂�";
		mes "�����̉^���������̂�������Ȃ��B";
		mes "�t�t�t�c�c�B";
		next;
		mes "[�G�O�m�����A]";
		mes "����́A�E�H�[���b�N�Ƃ��Ă�";
		mes "�ւ������";
		mes "���̗͂���肭�g�����Ƃ��B";
		next;
		cutin "3rd_wl_queen01",1;
		mes "[�G�O�m�����A]";
		mes "�c�c�Ƃ͌����A�ꉞ�������Ă������B";
		next;
		mes "[�G�O�m�����A]";
		mes "��Ɏ��Ȃ̗͗ʂ�";
		mes "���m�ɔc�����邱�Ƃ��B";
		next;
		mes "[�G�O�m�����A]";
		mes "���ꂪ�ł����A�g�̏�ɍ���Ȃ�";
		mes "�͂��g���������";
		mes "�����������g�̗͂�";
		mes "����Ă��܂����낤�B";
		next;
		cutin "3rd_wl_queen05",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "���ɂ����Ȃ����";
		mes "�C����ӂ�Ȃ����Ƃ��B";
		mes "�t�t�t�c�c�B";
		next;
		cutin "3rd_wl_queen05",255;
		mes "[�C���t�H���[�V����]";
		mes "�]�E�����̃N���A��V";
		mes "�X�e�[�^�X�E�X�L���ꊇ���Z�b�g����";
		mes "�t�^����܂����B";
		mes "�N�G�X�g�E�B���h�E�ŗ��p���@��";
		mes "�m�F�ł��܂��B";
		close;
	default:
		cutin "3rd_wl_queen01",1;
		mes "[�G�O�m�����A]";
		mes "�c�c�B";
		next;
		cutin "3rd_wl_queen01",255;
		mes "[�C�x�C��]";
		mes "�G�O�m�����A�l���ґz���ł��B";
		mes "���Â��Ɋ肢�܂��B";
		close;
	}
	// case1�`2����
	if(@menu == 2) {
		cutin "3rd_wl_queen04",1;
		emotion 29;
		mes "[�G�O�m�����A]";
		mes "�c�c�܂�Ȃ�����������";
		mes "���ꂪ�����Ȕ��f�Ƃ������̂ˁB";
		mes "���F�A�l�ԂƂ͂��̒��x�̑��݁B";
		mes "�t�t�t�c�c�B";
		set CHANGE_WL,2;
		close2;
		cutin "3rd_wl_queen04",255;
		warp "splendide.gat",200,100;
		end;
	}
	cutin "3rd_wl_queen02",1;
	emotion 1;
	mes "[�G�O�m�����A]";
	mes "�c�c�{�C�Ō����Ă���́H";
	mes "����قǗ͂����߂Ă���Ɓc�c�H";
	next;
	cutin "3rd_wl_queen05",1;
	mes "[�G�O�m�����A]";
	mes "�c�c�C�ɓ�������B";
	mes "��苭�͂ȗ͂����߂�~�]������";
	mes "����������P������B";
	next;
	mes "[�G�O�m�����A]";
	mes "���̑O�ɂ���Ȏ��i������̂�";
	mes "�ؖ����Ă����Ȃ��ƂˁB";
	next;
	cutin "3rd_wl_queen01",1;
	mes "[�G�O�m�����A]";
	mes "�c�c���b�u�B";
	next;
	cutin "war_y3",2;
	emotion 19,"�����ȗd��#WL";
	mes "[�������d��]";
	mes "�́A�͂������I";
	next;
	cutin "3rd_wl_queen01",1;
	mes "[�G�O�m�����A]";
	mes "�b�͕����Ă�����ˁH";
	mes "���̐l�ԂɁA^FF0000�����̐�^000000��";
	mes "�^����悤�ɁB";
	next;
	cutin "3rd_wl_queen04",1;
	mes "[�G�O�m�����A]";
	mes "�l�Ԃ�A�����́u�o�i�i�̔�v����";
	mes "�b�𕷂��Ȃ����B";
	mes "��������΂����������Ă���邩��B";
	set CHANGE_WL,3;
	chgquest 104505,11106;
	close2;
	cutin "3rd_wl_queen04",255;
	end;
}

spl_in02.gat,77,107,5	script	�����ȗd��#WL	446,{
	if(Job == Job_Warlock) {
		cutin "war_y4",2;
		emotion 2;
		mes "[���b�u]";
		mes "�ӂ��Ӂ`��I";
		mes "�u���͂̕����v�́A���̃��b�u�l��";
		mes "�Z�p�̐����W�߂č����";
		mes "���̖��@����Ȃ̂��B";
		next;
		mes "[���b�u]";
		mes "�����̒��œ|���������X�^�[�̖��͂�";
		mes "���@�΂̌��΂Ɏ��k������";
		mes "���͂Ȗ��@�΂𐶐��ł���̂��I";
		mes "����������I";
		close2;
		cutin "war_y4",255;
		end;
	}
	switch(CHANGE_WL) {
	case 0:
	case 1:
		if(YGG_1QUE < 100) {	// �m�b�̉��̎w�փN�G�X�g
			cutin "war_y1",2;
			emotion 0;
			mes "[�������d��]";
			mes "Lhagam!!�@Kighala!?";
			mes "JatgaWagmaula�I";
			mes "Luatana�@Notyazutawe";
			mes "Kizgatayue�I";
			close2;
			cutin "war_y1",255;
			end;
		}
		cutin "war_y1",2;
		emotion 0;
		mes "[���b�u]";
		mes "����!!�@�l��!?";
		mes "�ǂ�����āA�����ɓ����Ă����񂾁I";
		mes "�����͓���Ȕ��ł���";
		mes "����Ȃ��͂��Ȃ̂ɁI";
		close2;
		cutin "war_y1",255;
		end;
	case 2:
		cutin "war_y1",2;
		emotion 0;
		mes "[���b�u]";
		mes "�������I�@���O�͂��̑O�́I";
		next;
		mes "[���b�u]";
		mes "���O�̂����łǂꂾ��";
		mes "�}�X�^�[�ɓ{��ꂽ�̂�";
		mes "�m���Ă�̂���I";
		next;
		emotion 6;
		mes "[���b�u]";
		mes "�p�������Ȃ炩";
		mes "�������Əo�čs���Ă����I";
		next;
		if(select("�o��","�o�Ȃ�") == 2) {
			emotion 32;
			mes "[���b�u]";
			mes "�ӂ���I";
			mes "��������A�D���ɂ����B";
			mes "�ǂ����A�}�X�^�[�ɒǂ��o������";
			mes "���܂��Ă�񂾂���I";
			close2;
			cutin "war_y1",255;
			end;
		}
		emotion 32;
		mes "[���b�u]";
		mes "�ӂ���I";
		mes "�������A����ł����񂾁I";
		close2;
		cutin "war_y1",255;
		warp "splendide.gat",200,100;
		end;
	case 3:
		cutin "war_y3",2;
		emotion 23;
		mes "[���b�u]";
		mes "�u�o�i�i�̔�v���Ȃ�āc�c�B";
		mes "������O����ŃZ�b�e�B���O����";
		mes "�����̔��^�Ȃ̂ɁI";
		next;
		cutin "3rd_wl_queen01",1;
		mes "[�G�O�m�����A]";
		mes "���邳�����I";
		mes "���͂܂��ґz�ɓ��邩��";
		mes "�w���������Ƃ͂���Ă����悤�ɁB";
		next;
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "�����`�B";
		next;
		mes "[���b�u]";
		mes "�c�c���O�A�E�H�[���b�N��";
		mes "�Ȃ肽���񂾂��āH";
		next;
		emotion 32;
		mes "[���b�u]";
		mes "���̃��b�u�l�����X��";
		mes "�E�H�[���b�N�ɂȂ邽�߂̕��@��";
		mes "�����Ă�邩��A�悭������I";
		next;
		mes "[���b�u]";
		mes "���������l�Ԃ̑̂���";
		mes "�E�H�[���b�N�̋���Ȗ��͂�";
		mes "�ς����Ȃ��񂾁B";
		next;
		mes "[���b�u]";
		mes "����Ȗ��͂ɑς��邽�߂ɂ�";
		mes "���ʂȕ�΂�g�ɒ�����K�v������B";
		mes "���̕�΂�����΁A�Ў�Ȑl�Ԃ̑̂ł�";
		mes "���͂ɑς�������Đ��@���B";
		next;
		mes "[���b�u]";
		mes "�Ƃ����킯�ŁA���ꂩ�炨�O��";
		mes "���̕�΂�����Ă��炤�B";
		mes "�܂��͍ޗ��W�߂��炾�B";
		next;
		mes "[���b�u]";
		mes "^FF0000�P������^000000��";
		mes "^FF0000����ȃu���f�B�E���̔j��^000000��";
		mes "^0000FF1���W�߂Ă���񂾁B^000000";
		next;
		mes "[���b�u]";
		mes "�X�v�����f�B�b�h�t�B�[���h�@02�ɂ���";
		mes "^FF0000���͂ɐ����������X�^�[^000000��";
		mes "�|���Η��Ƃ��͂����B";
		next;
		mes "[���b�u]";
		mes "�킩�������H";
		mes "����ƁA�A�N�Z�T���[��݂��Ă��B";
		mes "^FF0000����𑕔����邱�Ƃ�";
		mes "�ړI�̃A�C�e������ɓ���͂����B^000000";
		next;
		cutin "war_y1",2;
		emotion 32;
		mes "[���b�u]";
		mes "�������A�݂��Ă�邾��������ȁI";
		mes "�厖�ɂ��Ă��镨������";
		mes "��Ő�΂ɕԂ���I";
		next;
		mes "[���b�u]";
		mes "�����A���������肵����c�c";
		mes "���b�u�l�̒��▂�@��";
		mes "�M�b�^���M�b�^���ɂ��Ă�邩��ȁI";
		next;
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "�ޗ����W�܂�����";
		mes "�I���̌������Ɏ����ė����B";
		mes "�ޗ��𒲍�����@�ނ����邩��ȁB";
		next;
		mes "[���b�u]";
		mes "^0000FF�������́A�O����n �X�v�����f�B�b�h��";
		mes "�k���ɂ���B^000000";
		mes "�����Ɏ����ė��Ă�";
		mes "��΂͍��Ȃ����璍�ӂ����B";
		next;
		if(checkitemblank() < 2) {
			mes "[���b�u]";
			mes "�c�c���ƁA���̑O��";
			mes "�������Ă�A�C�e���̎�ނ�";
			mes "�������邶��Ȃ����B";
			next;
			mes "[���b�u]";
			mes "��ɃA�C�e���̏����������炵��";
			mes "���Ă����B";
			mes "�n�����̂�����񂾂���B";
			close2;
			cutin "war_y2",255;
			end;
		}
		mes "[���b�u]";
		mes "^0000FF�C�x�C��^000000�ɘb���������";
		mes "�O�ɑ����Ă����B";
		mes "�܂��A���X����΂��B";
		set CHANGE_WL,4;
		chgquest 11106,11107;
		getitem 2796,1;		// ���͂��߂��΁i�X�v�����f�B�b�h�j
		getitem 2797,1;		// ���͂��߂��΁i�}�k�N�j
		close2;
		cutin "war_y2",255;
		end;
	case 4:
		if(countitem(6151) > 0 && countitem(6152) > 0) {
			cutin "war_y2",2;
			mes "[���b�u]";
			mes "�����Ă��A�C�e���������Ă����̂��H";
			mes "�ł��A�������Ⴀ��Ƃ��o���Ȃ�����";
			mes "�I���̌������Ɏ����ė��Ă����B";
			next;
			mes "[���b�u]";
			mes "^0000FF�������́A�O����n �X�v�����f�B�b�h��";
			mes "�k���ɂ��邩��ȁB^000000";
			close2;
			cutin "war_y2",255;
			end;
		}
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "^FF0000�P������^000000��";
		mes "^FF0000����ȃu���f�B�E���̔j��^000000��";
		mes "^0000FF1���W�߂Ă���񂾁B^000000";
		next;
		mes "[���b�u]";
		mes "�X�v�����f�B�b�h�t�B�[���h�@02�ɂ���";
		mes "^FF0000���͂ɐ����������X�^�[^000000��";
		mes "�|���Η��Ƃ��͂����B";
		next;
		mes "[���b�u]";
		mes "�݂��Ă�����A�N�Z�T���[��";
		mes "^FF0000�������邱�Ƃ�";
		mes "�ړI�̃A�C�e������ɓ���B^000000";
		next;
		cutin "war_y1",2;
		emotion 32;
		mes "[���b�u]";
		mes "�������A�݂��Ă�邾��������ȁI";
		mes "�厖�ɂ��Ă��镨������";
		mes "��Ő�΂ɕԂ���I";
		next;
		mes "[���b�u]";
		mes "�����A���������肵����c�c";
		mes "���b�u�l�̒��▂�@��";
		mes "�M�b�^���M�b�^���ɂ��Ă�邩��ȁI";
		next;
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "�ޗ����W�܂�����";
		mes "�I���̌������Ɏ����ė����B";
		mes "�ޗ��𒲍�����@�ނ����邩��ȁB";
		next;
		mes "[���b�u]";
		mes "^0000FF�������́A�O����n �X�v�����f�B�b�h��";
		mes "�k���ɂ���B^000000";
		mes "�����Ɏ����ė��Ă�";
		mes "��΂͍��Ȃ����璍�ӂ����B";
		close2;
		cutin "war_y2",255;
		end;
	case 5:
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "�������������΂̌��΂�";
		mes "�}�X�^�[�ɓn���Ă���B";
		next;
		mes "[���b�u]";
		mes "�}�X�^�[�ɘb��������";
		mes "���ɂǂ������炢���������񂾂ȁB";
		close2;
		cutin "war_y2",255;
		end;
	default:
		cutin "war_y4",2;
		emotion 2;
		mes "[���b�u]";
		mes "�ӂ��Ӂ`��I";
		mes "�u���͂̕����v�́A���̃��b�u�l��";
		mes "�Z�p�̐����W�߂č����";
		mes "���̖��@����Ȃ̂��B";
		next;
		mes "[���b�u]";
		mes "�����̒��œ|���������X�^�[�̖��͂�";
		mes "���@�΂̌��΂Ɏ��k������";
		mes "���͂Ȗ��@�΂𐶐��ł���̂��I";
		mes "����������I";
		close2;
		cutin "war_y4",255;
		end;
	}
}

spl_in02.gat,84,103,3	script	�������d��	439,{
	if(Job == Job_Warlock) {
		mes "[�V�F�[�Y]";
		mes "�M�����狭�͂Ȗ��@�������܂��B";
		mes "������Ƃ����܂����ł��c�c�B";
		mes "�ӂӂ��B";
		next;
		mes "[�V�F�[�Y]";
		mes "���͂ȗ͂𑀂�ɂ�";
		mes "����ɉ������㉿���K�v�ł��B";
		mes "�߂���Ƃ��Ȃ��悤��";
		mes "�C�����Ă��������B";
		close;
	}
	switch(CHANGE_WL) {
	case 0:
	case 1:
		if(YGG_1QUE < 100) {	// �m�b�̉��̎w�փN�G�X�g
			mes "[�������d��]";
			mes "Magigwa�@Grzl�H";
			mes "Oagyzywl�@SaiLa�H";
			close;
		}
		// fall through
	case 2:
		mes "[�V�F�[�Y]";
		mes "�Ȃ��l�Ԃ������ɁH";
		mes "�c�c�����������̗p�ł��傤���H";
		close;
	case 6:
		mes "[�V�F�[�Y]";
		mes "���ꂩ�����Ă��炤���Ƃ�";
		mes "�������܂��B";
		next;
		mes "[�V�F�[�Y]";
		mes "������u���͂̕����v�ƌĂ΂��";
		mes "�����ɓ����Ă��炢";
		mes "���b�u�ɍ���Ă���������΂�";
		mes "���͂����߂��Ƃ��s���܂��B";
		next;
		mes "[�V�F�[�Y]";
		mes "����l����K�v�͂���܂���B";
		mes "�M���́u���͂̕����v�̒��Ɍ����";
		mes "�����X�^�[��|�������ł��B";
		next;
		mes "[�V�F�[�Y]";
		mes "�u���͂̕����v�Ń����X�^�[��|����";
		mes "�|���������X�^�[�̖��͂����k����";
		mes "���@�΂̌��΂ɖ��͂��h��̂ł��B";
		next;
		mes "[�V�F�[�Y]";
		mes "�������A���Ԃ��󂯂��ɖ��͂�";
		mes "���k������K�v������܂��B";
		mes "���������X�^�[���ᖂ�͗ʂ������̂�";
		mes "���Ԃ����X�󂢂Ă����v�ł����c�c";
		next;
		mes "[�V�F�[�Y]";
		mes "�ア�����X�^�[�͖��͗ʂ����Ȃ��̂�";
		mes "�Ԓf�Ȃ��|���Ȃ���";
		mes "���͂������ɖ��U���Ă��܂��܂��B";
		mes "���ӂ��Ă��������B";
		next;
		if(checkitemblank() < 4) {
			mes "[�V�F�[�Y]";
			mes "���n�����������̂�����̂ł���";
			mes "�������Ă���A�C�e���̎�ނ�";
			mes "��������悤�ł��B";
			mes "�A�C�e���̏����������炵�Ă���";
			mes "������x���Ă��������B";
			close;
		}
		if(MaxWeight - Weight < 1000) {
			mes "[�V�F�[�Y]";
			mes "���n�����������̂�����̂ł���";
			mes "�������Ă���A�C�e���̏d�ʂ�";
			mes "�d������悤�ł��B";
			mes "�A�C�e���̏����������炵�Ă���";
			mes "������x���Ă��������B";
			close;
		}
		mes "[�V�F�[�Y]";
		mes "�����^FF0000���F�̃��r�[^000000��";
		mes "4�킨�n�����܂��B";
		if(countitem(12384)) delitem 12384,countitem(12384);	// ���F�̃��r�[(��)
		if(countitem(12386)) delitem 12386,countitem(12386);	// ���F�̃��r�[(��)
		if(countitem(12387)) delitem 12387,countitem(12387);	// ���F�̃��r�[(�n)
		if(countitem(12385)) delitem 12385,countitem(12385);	// ���F�̃��r�[(��)
		getitem 12384,5;	// ���F�̃��r�[(��)
		getitem 12386,5;	// ���F�̃��r�[(��)
		getitem 12387,5;	// ���F�̃��r�[(�n)
		getitem 12385,5;	// ���F�̃��r�[(��)
		next;
		mes "[�V�F�[�Y]";
		mes "�����r�[�ɂ́A�E�H�[���b�N�̖��@��";
		mes "���߂��Ă��܂��B";
		mes "^FF0000���ꂩ��ē�����";
		mes "�����̒��ł����g���܂���^000000��";
		mes "�L���Ɏg���Ă��������B";
		next;
		mes "[�V�F�[�Y]";
		mes "����ł́A�u���͂̕����v��";
		mes "���ē����܂��B";
		set CHANGE_WL,7;
		chgquest 11109,11110;
		close2;
		warp "job3_war01.gat",23,20;
		end;
	case 7:
		mes "[�V�F�[�Y]";
		mes "�u���͂̕����v�Ń����X�^�[��|����";
		mes "�|���������X�^�[�̖��͂����k����";
		mes "���@�΂̌��΂ɖ��͂��h��̂ł��B";
		next;
		mes "[�V�F�[�Y]";
		mes "�������A���Ԃ��󂯂��ɖ��͂�";
		mes "���k������K�v������܂��B";
		mes "���������X�^�[���ᖂ�͗ʂ������̂�";
		mes "���Ԃ����X�󂢂Ă����v�ł����c�c";
		next;
		mes "[�V�F�[�Y]";
		mes "�ア�����X�^�[�͖��͗ʂ����Ȃ��̂�";
		mes "�Ԓf�Ȃ��|���Ȃ���";
		mes "���͂������ɖ��U���Ă��܂��܂��B";
		mes "���ӂ��Ă��������B";
		next;
		mes "[�V�F�[�Y]";
		mes "����ł́A������x�A����ł��ˁB";
		mes "���F�̃��r�[�͍Ďx�����܂��B";
		next;
		if(checkitemblank() < 4) {
			mes "[�V�F�[�Y]";
			mes "����H";
			mes "�������Ă���A�C�e���̎�ނ�";
			mes "��������悤�ł��B";
			mes "�A�C�e���̏����������炵�Ă���";
			mes "������x���Ă��������B";
			close;
		}
		if(MaxWeight - Weight < 1000) {
			mes "[�V�F�[�Y]";
			mes "����H";
			mes "�������Ă���A�C�e���̏d�ʂ�";
			mes "�d������悤�ł��B";
			mes "�A�C�e���̏����������炵�Ă���";
			mes "������x���Ă��������B";
			close;
		}
		if(countitem(12384)) delitem 12384,countitem(12384);	// ���F�̃��r�[(��)
		if(countitem(12386)) delitem 12386,countitem(12386);	// ���F�̃��r�[(��)
		if(countitem(12387)) delitem 12387,countitem(12387);	// ���F�̃��r�[(�n)
		if(countitem(12385)) delitem 12385,countitem(12385);	// ���F�̃��r�[(��)
		getitem 12384,5;	// ���F�̃��r�[(��)
		getitem 12386,5;	// ���F�̃��r�[(��)
		getitem 12387,5;	// ���F�̃��r�[(�n)
		getitem 12385,5;	// ���F�̃��r�[(��)
		close2;
		warp "job3_war01.gat",23,20;
		end;
	case 8:
		mes "[�V�F�[�Y]";
		mes "�����̐΂̌������ɐ�������Ȃ��";
		mes "�������Ƃł���B";
		mes "�����A�M���̗͂��^���Ă��܂����B";
		mes "�c�c���߂�Ȃ����B";
		next;
		mes "[�V�F�[�Y]";
		mes "����ŖړI�̕�΂͍쐬�ł��܂����B";
		mes "^0000FF�}�X�^�[�ɕ񍐂��Ă��������B^000000";
		if(countitem(12384)) delitem 12384,countitem(12384);	// ���F�̃��r�[(��)
		if(countitem(12386)) delitem 12386,countitem(12386);	// ���F�̃��r�[(��)
		if(countitem(12387)) delitem 12387,countitem(12387);	// ���F�̃��r�[(�n)
		if(countitem(12385)) delitem 12385,countitem(12385);	// ���F�̃��r�[(��)
		set CHANGE_WL,9;
		chgquest 11111,11112;
		close;
	case 9:
		mes "[�V�F�[�Y]";
		mes "�ړI�̕�΂͍쐬�ł��܂����B";
		mes "^0000FF�}�X�^�[�ɕ񍐂��Ă��������B^000000";
		close;
	default:
		mes "[�V�F�[�Y]";
		mes "�M�����b��������ׂ������";
		mes "���ł͂���܂����B";
		close;
	}
}

spl_in02.gat,78,110,5	script	�������d��	437,{
	if(Job == Job_Warlock) {
		mes "[�C�x�C��]";
		mes "�}�X�^�[���ґz���ł��̂�";
		mes "���Â��Ɋ肢�܂��B";
		next;
		if(select("�O�ɏo��","��߂�") == 2) {
			mes "[�C�x�C��]";
			mes "�c�c�B";
			close;
		}
		mes "[�C�x�C��]";
		mes "�ł́A���C�����āB";
		close2;
		warp "splendide.gat",200,100;
		end;
	}
	switch(CHANGE_WL) {
	case 0:
	case 1:
		if(YGG_1QUE < 100) {	// �m�b�̉��̎w�փN�G�X�g
			mes "[�������d��]";
			mes "�c�c";
			mes "Dogi�@YahlsaKa";
			mes "Yahwagu";
			mes "Cagaiw�@QugaYua";
			next;
			if(select("�O�ɏo����","��߂�") == 2) {
				mes "[�������d��]";
				mes "�c�c�B";
				close;
			}
			mes "[�������d��]";
			mes "�c�c�H";
			close2;
			warp "splendide.gat",200,100;
			end;
		}
		mes "[�C�x�C��]";
		mes "�c�c�B";
		mes "�ǂ�����āA�����ɓ������̂�";
		mes "������܂���";
		mes "�o�Ă����������g�̂��߂ł���B";
		break;
	case 2:
		mes "[�C�x�C��]";
		mes "�c�c�B";
		mes "�p�������Ȃ�A�o�Ă����Ă��������B";
		mes "�O�ɂ́A�������ē����܂��̂ŁB";
		break;
	case 3:
		mes "[�C�x�C��]";
		mes "�c�c�B";
		mes "���́u�o�i�i�̔�v�ł͂���܂���B";
		break;
	default:
		mes "[�C�x�C��]";
		mes "�}�X�^�[���ґz���ł��̂�";
		mes "���Â��Ɋ肢�܂��B";
		break;
	}
	next;
	if(select("�O�ɏo��","��߂�") == 2) {
		mes "[�C�x�C��]";
		mes "�c�c�B";
		close;
	}
	mes "[�C�x�C��]";
	mes "�ł́A���C�����āB";
	close2;
	warp "splendide.gat",200,100;
	end;
}

//============================================================
// ������쐬
//------------------------------------------------------------
spl_in02.gat,60,231,5	script	�������d��	446,{
	if(Job == Job_Warlock) {
		// �{�I�͓]�E�O�N�G�X�g���i�s�ł����̃��b�Z�[�W�ɂȂ�s�����
		cutin "war_y4",2;
		mes "[���b�u]";
		mes "�����A���O���B���q�͂ǂ����H";
		mes "�I���́A�}�X�^�[����̖��߂�";
		mes "�����Ȗ�������쐬���Ă�񂾁B";
		mes "���Ȃ�r���オ�����񂾂��H";
		next;
		emotion 2;
		mes "[���b�u]";
		mes "�c�c���������@����";
		mes "������쐬�̍˔\������݂����B";
		next;
		cutin "war_y1",2;
		emotion 23;
		mes "[���b�u]";
		mes "�͂��I";
		mes "���Ƃ��Ă��A�I���͘B���p�t��";
		mes "�Ȃ肽���킯����Ȃ�����ȁI";
		next;
		emotion 19;
		mes "[���b�u]";
		mes "�}�X�^�[�ɔF�߂Ă��炤�ׂ�";
		mes "�ꐶ�����ɕ׋����Ă�񂾂���ȁI";
		close2;
		cutin "war_y1",255;
		end;
	}
	switch(CHANGE_WL) {
	case 0:
	case 1:
	case 2:
	case 3:
		if(YGG_1QUE < 100) {	// �m�b�̉��̎w�փN�G�X�g
			cutin "war_y1",2;
			mes "[�������d��]";
			mes "Xaga�@Lritau�H";
			mes "Puaga�@Tattiba�I";
			close2;
			cutin "war_y1",255;
			end;
		}
		cutin "war_y1",2;
		mes "[�������d��]";
		mes "�Ȃ񂾂�H";
		mes "�����̎ז�������o�Ă��Ă����I�I";
		close2;
		cutin "war_y1",255;
		end;
	case 4:
		cutin "war_y2",2;
		mes "[���b�u]";
		mes "�����Ă��ޗ��͎����ė����̂��H";
		next;
		switch(select("�ޗ��������Ă��܂���","�؂肽�A�C�e����Y��܂���","���ł�����܂���")) {
		case 1:
			if(countitem(6151) == 0 || countitem(6152) == 0) {
				cutin "war_y1",2;
				mes "[���b�u]";
				mes "�c�c�����ĂȂ�����Ȃ����I";
				mes "�I���͖Z�����񂾂���";
				mes "��Ԏ�炷�Ȃ�I";
				next;
				cutin "war_y2",2;
				mes "[���b�u]";
				mes "^FF0000�P������^000000��";
				mes "^FF0000����ȃu���f�B�E���̔j��^000000��";
				mes "^0000FF1���W�߂Ă���񂾁B^000000";
				next;
				mes "[���b�u]";
				mes "�X�v�����f�B�b�h�t�B�[���h�@02�ɂ���";
				mes "^FF0000���͂ɐ����������X�^�[^000000��";
				mes "�|���Η��Ƃ��͂����B";
				next;
				mes "[���b�u]";
				mes "�݂��Ă�����A�N�Z�T���[��";
				mes "^FF0000�������邱�Ƃ�";
				mes "�ړI�̃A�C�e������ɓ���B^000000";
				next;
				cutin "war_y1",2;
				emotion 32;
				mes "[���b�u]";
				mes "�������A�݂��Ă�邾��������ȁI";
				mes "�厖�ɂ��Ă��镨������";
				mes "��Ő�΂ɕԂ���I";
				next;
				mes "[���b�u]";
				mes "�����A���������肵����c�c";
				mes "���b�u�l�̒��▂�@��";
				mes "�M�b�^���M�b�^���ɂ��Ă�邩��ȁI";
				close2;
				cutin "war_y1",255;
				end;
			}
			if(equippeditem(2796) || equippeditem(2797)) {
				mes "[���b�u]";
				mes "��`���A���ꂶ�Ⴀ";
				mes "��ɑ݂��Ă�����A�N�Z�T���[��";
				mes "�Ԃ��Ă���B";
				next;
				mes "[���b�u]";
				mes "��H�@���������܂܂���Ȃ����B";
				mes "��������O���Ă����`�B";
				close2;
				cutin "war_y2",255;
				end;
			}
			// �A�N�Z�T���[���������A������
			if(countitem(2796) == 0 || countitem(2797) == 0) {
				mes "[���b�u]";
				mes "��`���A���ꂶ�Ⴀ";
				mes "��ɑ݂��Ă�����A�N�Z�T���[��";
				mes "�Ԃ��Ă���B";
				next;
				mes "[���b�u]";
				mes "��H�@�A�N�Z�T���[��";
				mes "�����ĂȂ��悤�����ǁc�c";
				mes "�܂����A���������肵�ĂȂ����!?";
				mes "�����Ǝ����Ă��Ă���I";
				close2;
				cutin "war_y2",255;
				end;
			}
			mes "[���b�u]";
			mes "���񂤂�A�ޗ��͑S�������Ă�ȁI";
			mes "���Ⴀ�A^0000FF�}�X�^�[�̂Ƃ����";
			mes "�߂��Ă���B^000000";
			mes "�}�X�^�[�̂Ƃ���ɂ�";
			mes "�؂̉��ɍ~���";
			mes "�k���̒[����s���邺�B";
			next;
			mes "[���b�u]";
			mes "��Ƃ��I�������";
			mes "�I�����������ɍs�����炳�B";
			set CHANGE_WL,5;
			chgquest 11107,11108;
			delitem 2796,countitem(2796);	// ���͂��߂��΁i�X�v�����f�B�b�h�j
			delitem 2797,countitem(2797);	// ���͂��߂��΁i�}�k�N�j
			delitem 6151,countitem(6151);	// ����ȃu���f�B�E���̔j��
			delitem 6152,countitem(6152);	// �P������
			close2;
			cutin "war_y2",255;
			end;
		case 2:
			cutin "war_y1",2;
			mes "[���b�u]";
			mes "�ȂɁ`�I";
			mes "�������Ȃ��悤�ɂ���";
			mes "������������̂ɁI";
			next;
			mes "[���b�u]";
			mes "���������܂܂���Ȃ��̂��H";
			mes "���̋��ɓ����ĂȂ����H";
			mes "�����ƒT���Ă݂Ă�I";
			next;
			if(select("����܂���","����܂���") == 1) {
				mes "[���b�u]";
				mes "��������Ȃ�I";
				mes "���̖{���ɑ�ς������񂾂��I";
				close2;
				cutin "war_y1",255;
				end;
			}
			if((equippeditem(2796) || countitem(2796)) && (equippeditem(2797) || countitem(2797))) {
				if(equippeditem(2796) || equippeditem(2797)) {
					cutin "war_y2",2;
					emotion 9;
					mes "[���b�u]";
					mes "�I���̖ڂɂ͂��񂽂�";
					mes "�������Ă���悤�Ɍ����邯�ǁH";
					close2;
					cutin "war_y2",255;
					end;
				}
				emotion 9;
				mes "[���b�u]";
				mes "���Ⴀ�A���񂽂������Ă���";
				mes "����͂Ȃ�Ȃ񂾂�I";
				close2;
				cutin "war_y1",255;
				end;
			}
			// �A�N�Z�T���[���������A������
			mes "[���b�u]";
			mes "�Ȃ񂾂���!?";
			mes "�厖�ɂ��Ă��镨������";
			mes "����������Ȃ����I";
			mes "������������Ă��܂��Ȃ�āc�c";
			next;
			mes "[���b�u]";
			mes "�d���Ȃ��������̂��̂����̂�";
			mes "^0000FF�_�C�������h�R�J���b�g^000000��^0000FF1��^000000";
			mes "�����Ă��Ă���B";
			mes "����Ŏ��łƂ�����Ȃ����B";
			if(countitem(732) < 1) {
				close2;
				cutin "war_y1",255;
				end;
			}
			next;
			if(select("�����Ă��܂���","�����҂��Ă�������") == 2) {
				mes "[���b�u]";
				mes "�厖�ȃA�N�Z�T���[�����������񂾂���";
				mes "���O�̐��ӂ������Ă����B";
				mes "^0000FF�_�C�������h�R�J���b�g^000000��^0000FF1��^000000";
				mes "������ȁI";
				close2;
				cutin "war_y1",255;
				end;
			}
			if(checkitemblank() < 2) {
				mes "[���b�u]";
				mes "�c�c���ƁA���̑O��";
				mes "�������Ă�A�C�e���̎�ނ�";
				mes "�������邶��Ȃ����B";
				next;
				mes "[���b�u]";
				mes "��ɃA�C�e���̏����������炵��";
				mes "���Ă����B";
				mes "�n�����̂�����񂾂���B";
				close2;
				cutin "war_y2",255;
				end;
			}
			mes "[���b�u]";
			mes "�m���Ɏ󂯎�������B";
			mes "�ق�A�V�����A�N�Z�T���[���B";
			mes "�����������񂶂�Ȃ����I";
			delitem 732,1;
			if(equippeditem(2796) == 0 && countitem(2796) == 0) {
				getitem 2796,1;		// ���͂��߂��΁i�X�v�����f�B�b�h�j
			}
			if(equippeditem(2797) == 0 && countitem(2797) == 0) {
				getitem 2797,1;		// ���͂��߂��΁i�}�k�N�j
			}
			close2;
			cutin "war_y2",255;
			end;
		case 3:
			cutin "war_y3",2;
			emotion 6;
			mes "[���b�u]";
			mes "�Ȃ񂾂�`�B";
			mes "�Z��������ז����Ȃ��ł����`�B";
			close2;
			cutin "war_y3",255;
			end;
		}
	case 5:
		mes "[���b�u]";
		mes "���Ⴀ�A^0000FF�}�X�^�[�̂Ƃ����";
		mes "�߂��Ă���B^000000";
		mes "�}�X�^�[�̂Ƃ���ɂ�";
		mes "�؂̉��ɍ~���";
		mes "�k���̒[����s���邺�B";
		next;
		mes "[���b�u]";
		mes "��Ƃ��I�������";
		mes "�I�����������ɍs�����炳�B";
		close2;
		cutin "war_y2",255;
		end;
	default:
		cutin "war_y4",2;
		mes "[���b�u]";
		mes "�����A���O���B���q�͂ǂ����H";
		mes "�I���́A�}�X�^�[����̖��߂�";
		mes "�����Ȗ�������쐬���Ă�񂾁B";
		mes "���Ȃ�r���オ�����񂾂��H";
		next;
		emotion 2;
		mes "[���b�u]";
		mes "�c�c���������@����";
		mes "������쐬�̍˔\������݂����B";
		next;
		cutin "war_y1",2;
		emotion 23;
		mes "[���b�u]";
		mes "�͂��I";
		mes "���Ƃ��Ă��A�I���͘B���p�t��";
		mes "�Ȃ肽���킯����Ȃ�����ȁI";
		next;
		emotion 19;
		mes "[���b�u]";
		mes "�}�X�^�[�ɔF�߂Ă��炤�ׂ�";
		mes "�ꐶ�����ɕ׋����Ă�񂾂���ȁI";
		close2;
		cutin "war_y1",255;
		end;
	}
}

//============================================================
// ���͂̕���
//------------------------------------------------------------
job3_war01.gat,22,22,7	script	�V�F�[�Y	439,{
	mes "[�V�F�[�Y]";
	mes "�����ɗ����Ă���^0000FF�C�x�C��^000000��";
	mes "���͂̕����ɑ����Ă���܂��B";
	mes "���̏ꏊ�ɖ߂肽���ꍇ��";
	mes "�C�x�C���ɘb�������Ă��������B";
	close;
}

job3_war01.gat,29,25,0	script	�C�x�C��#WL	437,{
	mes "[�C�x�C��]";
	mes "�u���͂̕����v�ɓ���̂ł����H";
	mes "�ҋ@���ɓ������瑗���Ă����܂��B";
	next;
	mes "[�C�x�C��]";
	mes "��Ɂu���͂̕����v��";
	mes "�g���Ă���҂������ꍇ��";
	mes "���X�҂��Ă��炢�܂����B";
	next;
	if(select("�u���͂̕����v�ɍs������","�O�ɏo����") == 1) {
		mes "[�C�x�C��]";
		mes "�ł́A�ҋ@���ɓ����Ă��҂��������B";
		close;
	}
	mes "[�C�x�C��]";
	mes "����ł́A���̏ꏊ�ɑ���܂��傤�B";
	close2;
	warp "spl_in02.gat",79,102;
	end;
OnInit:
	waitingroom "���͂̕���",20,"�C�x�C��#WL::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	donpcevent "���͂̕���#WL1::OnStart";
	warpwaitingpc "job3_war02.gat",29,25;
	initnpctimer;
	end;
OnTimer10000:
	if(getmapusers("job3_war02.gat") > 0) {
		initnpctimer;
		end;
	}
	killmonster "job3_war02.gat","���͂̕���#WL1::OnKilled";
	killmonster "job3_war02.gat","���͂̕���#WL2::OnKilled";
	killmonster "job3_war02.gat","���͂̕���#WL3::OnKilled";
	killmonster "job3_war02.gat","�����̐�#WL::OnKilled";
	stopnpctimer "���͂̕���#WL1";
	stopnpctimer "���͂̕���#WL2";
	stopnpctimer "���͂̕���#WL3";
	stopnpctimer "�����̐�#WL";
	stopnpctimer;
	enablewaitingroomevent;
	end;
}

job3_war02.gat,0,0,0	script	���͂̕���#WL1	-1,{
OnStart:
	// �X�^�b�N���W�ŏo��̂ō��W��{�I���炸�炷
	//monster "job3_war02.gat",23,32,"���͂ɐ����������X�^�[",2047,1,strnpcinfo(0) + "::OnKilled";
	//monster "job3_war02.gat",23,21,"���͂ɐ����������X�^�[",2048,1,strnpcinfo(0) + "::OnKilled";
	//monster "job3_war02.gat",34,32,"���͂ɐ����������X�^�[",2049,1,strnpcinfo(0) + "::OnKilled";
	//monster "job3_war02.gat",34,21,"���͂ɐ����������X�^�[",2050,1,strnpcinfo(0) + "::OnKilled";
	monster "job3_war02.gat",20,32,"���͂ɐ����������X�^�[",2047,1,strnpcinfo(0) + "::OnKilled";
	monster "job3_war02.gat",20,21,"���͂ɐ����������X�^�[",2048,1,strnpcinfo(0) + "::OnKilled";
	monster "job3_war02.gat",31,32,"���͂ɐ����������X�^�[",2049,1,strnpcinfo(0) + "::OnKilled";
	monster "job3_war02.gat",31,21,"���͂ɐ����������X�^�[",2050,1,strnpcinfo(0) + "::OnKilled";
	initnpctimer;
	end;
OnTimer2000:
	announce "���͂̕��� : �����X�^�[���o�����܂���",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer4000:
	announce "���͂̕��� : 5���ȓ��ɑS�Ẵ����X�^�[��|���Ă�������",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer6000:
	announce "���͂̕��� : �������Ԃ��z����ƏW�߂����͂����U���Ă��܂��܂�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer63000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��4���c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer123000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��3���c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer183000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��2���c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer243000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��1���c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer273000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��30�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer283000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��20�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer293000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��10�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer303000:
	announce "���͂̕��� : �W�߂����͂����U���܂����B���s�ł��B",0x9,0xFFFF00,0x190,12,0,0;
	killmonster "job3_war02.gat",strnpcinfo(0) + "::OnKilled";
	end;
OnTimer305000:
	mapwarp "job3_war02.gat","spl_in02.gat",79,102;
	stopnpctimer;
	end;
OnKilled:
	if(getmapmobs("job3_war02.gat",strnpcinfo(0) + "::OnKilled") == 0) {
		if(strnpcinfo(2) == "WL1") {
			announce "���͂̕��� : ���@�ΐ����̑�P�i�K���I�����܂���",0x9,0xFFFF00,0x190,12,0,0;
			donpcevent "���͂̕���#WL2::OnStart";
		}
		else if(strnpcinfo(2) == "WL2") {
			announce "���͂̕��� : ���@�ΐ����̑�Q�i�K���I�����܂���",0x9,0xFFFF00,0x190,12,0,0;
			donpcevent "���͂̕���#WL3::OnStart";
		}
		stopnpctimer;
	}
	end;
}

job3_war02.gat,0,0,0	duplicate(���͂̕���#WL1)	���͂̕���#WL2	-1

job3_war02.gat,0,0,0	script	���͂̕���#WL3	-1,{
OnStart:
	// �X�^�b�N���W�ŏo��̂ō��W��{�I���炸�炷
	//monster "job3_war02.gat",23,32,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	//monster "job3_war02.gat",23,21,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	//monster "job3_war02.gat",34,32,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	//monster "job3_war02.gat",34,21,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	monster "job3_war02.gat",20,32,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	monster "job3_war02.gat",20,21,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	monster "job3_war02.gat",31,32,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	monster "job3_war02.gat",31,21,"���͂ɐ����������X�^�[",1002,2,"���͂̕���#WL3::OnKilled";
	initnpctimer;
	end;
OnTimer2000:
	announce "���͂̕��� : �����X�^�[���o�����܂���",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer4000:
	announce "���͂̕��� : 1���ȓ��ɑS�Ẵ����X�^�[��|���Ă�������",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer6000:
	announce "���͂̕��� : �������Ԃ��z����ƏW�߂����͂����U���Ă��܂��܂�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer33000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��30�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer43000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��20�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer53000:
	announce "���͂̕��� : �������Ԃ܂Ŏc��10�b�c�c",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer63000:
	announce "���͂̕��� : �W�߂����͂����U���܂����B���s�ł��B",0x9,0xFFFF00,0x190,12,0,0;
	killmonster "job3_war02.gat","���͂̕���#WL3::OnKilled";
	end;
OnTimer65000:
	mapwarp "job3_war02.gat","spl_in02.gat",79,102;
	stopnpctimer;
	end;
OnKilled:
	if(getmapmobs("job3_war02.gat","���͂̕���#WL3::OnKilled") == 0) {
		announce "���͂̕��� : �����̐΂����̉����܂�",0x9,0xFFFF00,0x190,12,0,0;
		donpcevent "�����̐�#WL::OnStart";
		stopnpctimer;
	}
	end;
}

job3_war02.gat,0,0,0	script	�����̐�#WL	-1,{
OnStart:
	monster "job3_war02.gat",29,27,"�����̐�",2035,1,"�����̐�#WL::OnKilled";
	initnpctimer;
	end;
OnTimer2000:
	announce "�����̐� : �����̐΂͖��͂��z�����鐫���������Ă��܂�",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer4000:
	announce "�����̐� : 10���ȓ��ɋ����̐΂ɖ��͂�^���āA�����������Ă�������",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer303000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��5���c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer363000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��4���c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer423000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��3���c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer483000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��2���c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer543000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��1���c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer573000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��30�b�c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer583000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��20�b�c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer593000:
	announce "�����̐� : ���������o���Ȃ��Ȃ�܂Ŏc��10�b�c�c�B",0x9,0xFFFF00,0x190,12,0,0;
	end;
OnTimer603000:
	announce "�����̐� : �����̐΂��������ł��܂���ł����B���s�ł��B",0x9,0xFFFF00,0x190,12,0,0;
	killmonster "job3_war02.gat","�����̐�#WL::OnKilled";
	end;
OnTimer605000:
OnTimer616000:
	mapwarp "job3_war02.gat","spl_in02.gat",79,102;
	stopnpctimer;
	end;
OnKilled:
	announce "�����̐� : �����̐΂𐸐����邽�߂̖��͂��W�܂�܂���",0x9,0xFFFF00,0x190,12,0,0;
	if(CHANGE_WL == 7) {
		set CHANGE_WL,8;
		chgquest 11110,11111;
	}
	setnpctimer 610000;
	end;
}
