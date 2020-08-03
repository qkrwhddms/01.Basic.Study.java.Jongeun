package JongeunStudy;

import java.util.Scanner;

public class StudyEx45 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("정수를 입력하세요 : ");
		a = s.nextInt();  // 정수를 입력받는다.
		
		if(a%2 == 0) {     // 입력한 값을 2로 나누어 나머지가 0이면(즉 짝수이면)
			System.out.printf("짝수를 입력했군요..\n");   // 입력한 값이 짝수이면 실행한다.
		}else {
			System.out.printf("홀수를 입력했군요..\n");   // 입력한 값이 짝수가 아니면 실행한다.
		}

	}

}
