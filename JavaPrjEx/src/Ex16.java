import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1;
		float num2;
		
		System.out.print("ù��° ���� �Է� : ");
		num1 = scn.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = scn.nextFloat();
		
		System.out.printf("%d + %3.1f = %4.1f\n", num1, num2, num1+num2);
		System.out.printf("%d / %3.1f = %5.0f", num1, num2, Math.floor(num1/num2));
	}

}
