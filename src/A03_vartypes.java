
public class A03_vartypes {
	public static void main(String[] args) {

		//#������ ����
		//-Ÿ�� ������;
		
		/*
		 #����Ÿ��(''���� Ÿ�� ���� ���� ����� �޴´�)
		 -byte	(1byte)	0000 0000 ~ 1111 1111, -128 ~ +127,8bit
		 -char	(2byte)	0 ~ 65535 (65536��,���ڿ� ����ȭ)
		 -short	(2byte) -32768 ~ +32767(65536��)
		 -int	(4byte)	-22�� ~ +22��(2^32��)
		 -long	(8byte)	��û ū ����
		  */
		
		 byte _byte=127;//ǥ���� �� �ִ� ���ڰ� ���� ��� ������ ������ �� �ִ�
		 char _char=0;
		 short _short=-32768;
		 int _int=2100000000;
		 //int�� ������ ����� ���ڸ� ������ �ڿ� L�� �ٿ����Ѵ�
		 long _long=90000000000L;
		 
		 /*
		  #�Ǽ� Ÿ��(���� �׷��� ��꿡�� ���ȴ�)
		  �غε��Ҽ��� ����� �����
		  -float (4byte)
		  -double(8byte)
		  */
		 
		 float _float=123.123F;//float���� ������ �ڿ� f/F�� �ٿ����Ѵ�
		 double _double =123.123;
		 
		 //���ͷ�(literal)
		 //-�׳� ���� ��
		 //-"",'',�Ҽ�,�Ҽ�f,����,����L
		 //-0���ڴ�(8),0x����(16),0b(2)
		 //true,false
		 System.out.println("111(10) : "+111);
		 System.out.println("111(8) : "+0111);
		 System.out.println("111(16) : "+0x111);
		 System.out.println("111(2) : "+0b111);
		 
		 /*
		  #��/���� Ÿ��
		  -boolean:true,false �ΰ����� ���� ������ �� �ִ� ���� Ÿ��
		   */
		 boolean _boolean=false;
		 boolean goonpil=false;
		 boolean passExam=true;
		 boolean complete=true;
		 
		 /*
		  #������ Ÿ��	(Ŭ���� Ÿ��)
		  -String :���ڿ�
		  -�׿� ��� Ŭ������...
		  �ش빮�ڷ� �����ϴ� Ÿ�Ե��� ������ Ÿ���̴�
		  */
		 
		 String himsg="Hi,nice to meet you!";
		 String byemsg="Good bye!";
		 
		 System.out.println(himsg);
		 System.out.println(byemsg+byemsg+byemsg);
	}
}
