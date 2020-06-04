package JongeunStudy;

import java.util.Scanner;

public class StudyEx05 {

	public static void main(String[] args) {
		
		int a, b;
		int result;  // 계산 방식을 선택할 변수를 선언
		int k;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();  // 계산할 숫자를 입력
		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==> ");
		k = s.nextInt();  // 연산자를 선택한다. 1은 덧셈, 2는 뺄셈, 3은 곱셈, 4는 나눗셈
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();  // 계산할 숫자를 입력
		
		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}                // 입력한 k가 1이면 덧셈을 수행
		if (k == 2) {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}               // 입력한 k가 2이면 뺄셈을 수행
		if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}               // 입력한 k가 3이면 곱셈을 수행
		if (k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}               // 입력한 k가 4이면 나눗셈을 수행

	}

}
