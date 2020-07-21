package JongeunStudy;

import java.util.Scanner;

public class StudyEx37 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float a, b;   // 실수 변수를 
		float result;   // 선언한다.
		
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		a = s.nextFloat();   // 키보드로 실수를 입력받는다.
		System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
		b = s.nextFloat();   // 키보드로 실수를 입력받는다.
		
		result = a + b;   // 실수의 덧셈 연산을 한다.
		System.out.printf(" %5.2f + %5.2f = %5.2f \n", a, b, result);
		result = a - b;   // 실수의 뺄셈 연산을 한다.
		System.out.printf(" %5.2f - %5.2f = %5.2f \n", a, b, result);
		result = a * b;   // 실수의 곱셈 연산을 한다.
		System.out.printf(" %5.2f * %5.2f = %5.2f \n", a, b, result);
		result = a / b;   // 실수의 나눗셈 연산을 한다.
		System.out.printf(" %5.2f / %5.2f = %5.2f \n", a, b, result);
		result = (int) a % (int) b;   // 나머지 연산을 위해 실수를 정수로 강제 형 변환한다.
		System.out.printf(" %d %% %d = %d \n", (int) a, (int) b, (int) result);
		

	}

}
