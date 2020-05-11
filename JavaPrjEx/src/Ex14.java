import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		System.out.println("INPUT NUMBER : ");
		Scanner scn = new Scanner(System.in);
		int inputNum = scn.nextInt();

		for (int i = 1; i < 10; i++) { 
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));

		} 
	}

}
