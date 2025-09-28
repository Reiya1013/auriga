//= Auriga Script ==============================================================
// Ragnarok Online Storage NPC Script	by Blaze
//==============================================================================

//============================================================
// Function
//------------------------------------------------------------
// Func_StorageManager
//   arg(0)�FZeny
//   arg(1)�F���b�Z�[�W�^�C�v�i0:�J�v���T�[�r�X�A1:�L�j
function	script	Func_StorageManager	{
	mes "[�q�ɊǗ��l]";
	switch(getarg(1)) {
	default:
		mes "����ɂ��́`";
		mes "������ł́A���J�v���T�[�r�X���";
		mes "�����ȋƖ��ϑ����󂯂�";
		mes "�ȈՓI�ȑq�ɃT�[�r�X��";
		mes "�񋟂��Ă���܂��I";
		break;
	case 1:
		mes "�ɂ�ɂ�I";
		mes "������ł́A";
		mes "�ȈՓI�ȑq�ɃT�[�r�X��";
		mes "�񋟂��Ă���ɂ�I";
		break;
	}
	next;
	mes "[�q�ɊǗ��l]";
	mes "^0000FF���C���q��^000000��";
	mes "^FF0000�T�u�q��^000000��";
	mes "�ꔭ�ȒP ^FF0000" +getarg(0)+ " Zeny^000000�ŃI�[�v���\�I";
	mes "���񂲗��p���������ˁ`��";
	return;
}

// Func_Storage
//   arg(0)�FZeny
//   arg(1)�F�q�ɔԍ��i�������j
function	script	Func_Storage	{
	if(basicskillcheck() && getskilllv(1) < 6 && getskilllv(5018) < 1) {
		mes "[�q�ɊǗ��l]";
		mes "�q�ɋ@�\�͊�{�X�L���̕ۊǑq�Ɏg�p��";
		mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
		close2;
		return;
	}
	else if(Zeny < getarg(0)) {
		mes "[�q�ɊǗ��l]";
		mes "���̑q�ɂ𗘗p����ɂ�";
		mes "^FF0000 " +getarg(0)+ " Zeny^000000���K�v�ł��B";
		close2;
		return;
	}
	set Zeny,Zeny - getarg(0);
	openstorage;
	return;
}

//============================================================
// �����N
//------------------------------------------------------------
morocc.gat,182,56,4	script	�q�ɊǗ��l#moc	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
morocc.gat,179,55,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
morocc.gat,181,55,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
morocc.gat,183,55,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
morocc.gat,185,55,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �t�F�C����
//------------------------------------------------------------
payon.gat,180,67,4	script	�q�ɊǗ��l#pay	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
payon.gat,177,66,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
payon.gat,179,66,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
payon.gat,179,66,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
payon.gat,179,66,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �A���x���^
//------------------------------------------------------------
alberta.gat,147,62,4	script	�q�ɊǗ��l#alb	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
alberta.gat,144,61,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
alberta.gat,146,61,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
alberta.gat,148,61,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
alberta.gat,150,61,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �A���f�o����
//------------------------------------------------------------
aldebaran.gat,172,126,4	script	�q�ɊǗ��l#alde	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
aldebaran.gat,169,125,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
aldebaran.gat,171,125,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
aldebaran.gat,173,125,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
aldebaran.gat,175,125,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �R���h
//------------------------------------------------------------
comodo.gat,165,177,4	script	�q�ɊǗ��l#cmd	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
comodo.gat,162,176,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
comodo.gat,164,176,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
comodo.gat,166,176,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
comodo.gat,168,176,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// ���q�^���[��
//------------------------------------------------------------
lighthalzen.gat,169,124,4	script	�q�ɊǗ��l#lhz	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
lighthalzen.gat,166,123,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
lighthalzen.gat,168,123,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
lighthalzen.gat,170,123,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
lighthalzen.gat,172,123,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �~�b�h�K���h�A���R���Ԓn
//------------------------------------------------------------
mid_camp.gat,46,163,4	script	�q�ɊǗ��l#mid	553,{
	callfunc "Func_StorageManager",50,1;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
mid_camp.gat,43,161,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
mid_camp.gat,45,161,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
mid_camp.gat,47,161,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
mid_camp.gat,49,161,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �u���W���X
//------------------------------------------------------------
brasilis.gat,177,225,4	script	�q�ɊǗ��l#bra	80,{
	callfunc "Func_StorageManager",50,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q�� �y50Zeny�z",0;
	end;
}
brasilis.gat,174,224,6	script	���C���q��	464,{
	callfunc "Func_Storage",50,0;
	end;
}
brasilis.gat,176,224,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",50,1;
	end;
}
brasilis.gat,178,224,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",50,2;
	end;
}
brasilis.gat,180,224,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",50,3;
	end;
}

//============================================================
// �����̋���
//------------------------------------------------------------
dali02.gat,102,94,5	script	�q�ɊǗ��l#dali	80,{
	callfunc "Func_StorageManager",40,0;
	close;
OnInit:
// signboard�\������ꍇ�̓R�����g�A�E�g
	waitingroom "�q��",0;
	end;
}
dali02.gat,106,93,6	script	���C���q��	464,{
	callfunc "Func_Storage",40,0;
	end;
}
dali02.gat,109,94,4	script	�T�u�q��1	464,{
	callfunc "Func_Storage",40,1;
	end;
}
dali02.gat,112,95,4	script	�T�u�q��2	464,{
	callfunc "Func_Storage",40,2;
	end;
}
dali02.gat,115,96,4	script	�T�u�q��3	464,{
	callfunc "Func_Storage",40,3;
	end;
}
