//------------------------------
// �G���E�I���ꊇ������
//------------------------------

prontera.gat,166,196,5	script	�����B�l	84,{

	mes "[�����B�l]";
	mes "�Z�k�I���f�I�R���A";
	mes "�Z�k�G���j�E�����炻�ꂼ��";
	mes "���ǌ^�Z�k�I���f�I�R���A���ǌ^�Z�k�G���j�E����";
	mes "�\�Ȍ��萸�����܂��B";
	mes "��Ƃ�I��ł��������B";
	next;
	menu "���ǌ^�Z�k�G���j�E��",L1,"���ǌ^�Z�k�I���f�I�R��",L2,"����ς�߂�B",L3;

L1:

	// �������𒲂ׂ�
	set '@count, countitem(7619); // 7619#�Z�k�G���j�E��#

	if ( '@count < 10 ){
		mes "[�����B�l]";
		mes "�A�C�e�����s�����Ă��܂�";
		mes "�Z�k�G���j�E����5�ȏ㎝���Ă��Ă��������B";
		close;
	}

		set '@give, '@count / 10;


	if( checkweight( 6241, '@give ) == 0){
		mes "[�����B�l]";
		mes "�d�ʃI�[�o�[�ł��B";
		mes "�ו������炷���a���Ă���";
		mes "�܂����Ă��������B";
		close;
	}

	delitem 7619, '@give * 10;	//7619#�Z�k�G���j�E��# �폜
	getitem 6241, '@give;		//6241#���ǌ^�Z�k�G���j�E��# �擾

	mes "[�����B�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;

L2:

	// �������𒲂ׂ�
	set '@count, countitem(7620); // 7620#�Z�k�I���f�I�R��#

	if ( '@count < 10 ){
		mes "[�����B�l]";
		mes "�A�C�e�����s�����Ă��܂�";
		mes "�Z�k�I���f�I�R����10�ȏ㎝���Ă��Ă��������B";
		close;
	}

		set '@give, '@count / 10;


	if( checkweight( 6240, '@give ) == 0){
		mes "[�����B�l]";
		mes "�d�ʃI�[�o�[�ł��B";
		mes "�ו������炷���a���Ă���";
		mes "�܂����Ă��������B";
		close;
	}

	delitem 7620, '@give * 10;	//984#�Z�k�I���f�I�R��# �폜
	getitem 6240, '@give;		//6240#���ǌ^�Z�k�I���f�I�R��# �擾

	mes "[�����B�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;

L3: //����ς�߂�

	mes "[�����B�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;
}

prontera.gat,163,194,5	script	�����E�l	84,{

	mes "[�����E�l]";
	mes "�I���f�I�R���A";
	mes "�G���j�E�����炻�ꂼ��";
	mes "�Z�k�I���f�I�R���A�Z�k�G���j�E����";
	mes "�\�Ȍ��萸�����܂��B";
	mes "��Ƃ�I��ł��������B";
	next;
	menu "�Z�k�G���j�E��",L1,"�Z�k�I���f�I�R��",L2,"����ς�߂�B",L3;

L1:

	// �������𒲂ׂ�
	set '@count, countitem(985); // 985#�G���j�E������#

	if ( '@count < 10 ){
		mes "[�����E�l]";
		mes "�A�C�e�����s�����Ă��܂�";
		mes "�G���j�E����5�ȏ㎝���Ă��Ă��������B";
		close;
	}

		set '@give, '@count / 10;


	if( checkweight( 7619, '@give ) == 0){
		mes "[�����E�l]";
		mes "�d�ʃI�[�o�[�ł��B";
		mes "�ו������炷���a���Ă���";
		mes "�܂����Ă��������B";
		close;
	}

	delitem 985, '@give * 10;	//985#�G���j�E������# �폜
	getitem 7619, '@give;		//6300#�G���j�E��# �擾

	mes "[�����E�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;

L2:

	// �������𒲂ׂ�
	set '@count, countitem(984); // 984#�I���f�I�R������#

	if ( '@count < 10 ){
		mes "[�����E�l]";
		mes "�A�C�e�����s�����Ă��܂�";
		mes "�I���f�I�R����10�ȏ㎝���Ă��Ă��������B";
		close;
	}

		set '@give, '@count / 10;


	if( checkweight( 7620, '@give ) == 0){
		mes "[�����E�l]";
		mes "�d�ʃI�[�o�[�ł��B";
		mes "�ו������炷���a���Ă���";
		mes "�܂����Ă��������B";
		close;
	}

	delitem 984, '@give * 10;	//984#�I���f�I�R������# �폜
	getitem 7620, '@give;		//7620#�I���f�I�R��# �擾

	mes "[�����E�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;

L3: //����ς�߂�

	mes "[�����E�l]";
	mes "�����p���肪�Ƃ��������܂����B";
	close;

}