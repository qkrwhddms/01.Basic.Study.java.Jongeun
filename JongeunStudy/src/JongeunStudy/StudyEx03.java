package JongeunStudy;

import java.util.Scanner;

public class StudyEx03 {

	public static void main(String[] args) {
		
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");  // 도움말을 출력
		a = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==>");  // 도움말을 출력
		b = s.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
	}

}
