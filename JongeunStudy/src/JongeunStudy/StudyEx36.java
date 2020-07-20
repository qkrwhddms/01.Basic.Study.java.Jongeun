package JongeunStudy;

public class StudyEx36 {

	public static void main(String[] args) {
		
		int a = 100, result;
		int i;
		
		for(i = 1; i <= 5; i++) {                                 // 왼쪽 시프트 연산을
			result = a<< i;                                       // 다섯번
			System.out.printf("%d << %d = %d\n", a, i, result);   // 반복해서
		}                                                         // 출력한다.
		
		for(i = 1; i <= 5; i++) {                                 // 오른쪽 시프트 연산을
			result = a >> i;                                      // 다섯번
		System.out.printf("%d >> %d = %d\n", a, i, result);       // 반복해서
		}                                                         // 출력한다.

	}

}
