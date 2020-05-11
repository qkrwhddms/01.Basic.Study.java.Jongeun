import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner age = new Scanner(System.in);
		int a;
		
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		a=age.nextInt();
		if (a<=10)
			System.out.println("��� �Դϴ�");
		else if(a<=19)
				System.out.println("û�ҳ��Դϴ�");
			else if(a>19)
			System.out.println("�����Դϴ�");

	}

}
