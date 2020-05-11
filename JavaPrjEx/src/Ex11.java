import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a;
		
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		a=scn.nextInt();
		
		if (a>19) {
			System.out.println("���� �Դϴ�");
		}
		if (a<=19) {
			System.out.println("�̼����� �Դϴ�");
		}
		if (a<=10) {
			System.out.println("��� �Դϴ�");
			
		}
		scn.close();
	}

}
