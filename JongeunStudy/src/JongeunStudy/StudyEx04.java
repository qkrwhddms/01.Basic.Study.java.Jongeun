package JongeunStudy;

import java.util.Scanner;

public class StudyEx04 {

	public static void main(String[] args) {
		
		int a, b, c, d;  // 입력받을 변수 4개 선언
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();  // 키보드로 변수 a, b, c, d에 값을 입력
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();  // 키보드로 변수 a, b, c, d에 값을 입력
		System.out.print("세번째 계산할 값을 입력하세요 ==>");
		c = s.nextInt();  // 키보드로 변수 a, b, c, d에 값을 입력
		System.out.print("네번째 계산할 값을 입력하세요 ==>");
		d = s.nextInt();  // 키보드로 변수 a, b, c, d에 값을 입력
		
		result = a + b + c + d; // 변수 a, b, c, d의 값을 모두 더해 변수 result에 넣는다.
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
		                               // 변수 a, b, c, d와 result를 화면에 출력

	}

}
