import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		System.out.print("INPUT NUMBER : ");
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int i = 1;
		
		while (i < 10) {  
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
			
		}
	}

}
