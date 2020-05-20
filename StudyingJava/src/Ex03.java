import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while (true) {
			System.out.println("더할 첫 번째 수 입력 : ");
			a =s.nextInt();

			System.out.println("더할 두 번째 수 입력 : ");
			b =s.nextInt();
			
			System.out.println("a ="+ a + " b ="+ b + " a+b =" + (a+b));

		}

	}

}
