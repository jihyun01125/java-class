
public class B06_switch {

	public static void main(String[] args) {		
		// # switch-case��
		//	- ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
		//	- if������ �Ϻ��ϰ� ��ü �����ϴ� 
		//	- break�� �� ���� break�� ���������� ��� case�� �����Ѵ�
		
		int a = 11;
		switch (a % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		}
		
		String word = "Air";
		
		switch (word.charAt(0)) {
		case 'A': case 'a':
			System.out.println("a�� �����ϴ� �ܾ��Դϴ�.");
			break;
		case 'B': case 'b':
			System.out.println("b�� �����ϴ� �ܾ��Դϴ�.");
			break;
		case 'C': case 'c':
			System.out.println("c�� �����ϴ� �ܾ��Դϴ�.");
			break;
		default:
			System.out.println("���� case�� ��� �ƴմϴ�.");
			break;
		}
	}
	
}






