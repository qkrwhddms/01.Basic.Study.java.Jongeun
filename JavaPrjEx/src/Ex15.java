import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		System.out.println("INPUT NUMBER : ");
		
		Scanner scn = new Scanner(System.in);
		int inputNum = scn.nextInt();
		
		for (int i = 0 ; i < 10; i++) {
			System.out.println(inputNum * i);
			
		}
	}

}
