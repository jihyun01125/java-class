
public class A01_Escape {
	public static void main(String[] args) {
	
	//#Escape���� 
	//-Ư���� ����� ���� ���� 
	//-�׳� ����Ϸ��� �ϸ� ������ ����� ���ڵ�
	//-�տ� \(��������)�� ���� ���ڴ� �̽������� ���ڷ� �����Ѵ�
	//-�ι��ڰ� ������ �ϳ��� ���ڷ� �νĵȴ�
	
	// \n:�ٹٲ��� ����� ���� Ư�� ����(linebreak,linefeed,newline..)
	System.out.println("�ȳ��ϼ���!\n�ݰ����ϴ�");
	
	// \t:tabŰ�� ����� ���� Ư�� ����
	System.out.println("�ȳ��ϼ���!\t�ݰ����ϴ�");
	System.out.println("�̸�\t������\t�ֱ���������");
	System.out.println("ȫ�浿\tA��\tNO");
	System.out.println("�Ӳ���\tO��\tYES");
	
	// \\:�׳� ���������� ����ϰ������ ����Ѵ� 
	//EX>C:\ProgramFiles\java\jdk�� ����ϰ� ���� ���
	System.out.println("C:\\ProgramFiles\\java\\jdk");
	
	// \" : �׳� ū ����ǥ�� ����ϰ� ������ ����Ѵ� 
	//EX> ������ "����"���� �Դ´�
	System.out.println("������ \"����\"���� �Դ´�");
	// \' : �׳� ���� ����ǥň ����ϰ� ������ ����Ѵ�
	System.out.println("��ħ�� \'���\'�ϰ� �Ծ�ֶ�");
	System.out.println("��ħ�� '���'�ϰ� �Ծ�ֶ�");
	System.out.println('\'');
	}
}
