package JongeunStudy;

public class StudyEx23 {

	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 4;   // 정수형 변수를 선언한다.
		int result1, mok, namugi;   // 정수형 변수를 선언한다.
		float result2;   // 실수형 변수를 선언한다.
		
		result1 = a + b - c;   // 더하기와 빼기 연산을 동시에 수행한다.
		System.out.printf(" %d + %d - %d = %d \n", a, b, c, result1);
		
		result1 = a + b * c;   // 더하기와 곱하기 연산을 동시에 수행한다.
		System.out.printf(" %d + %d * %d = %d \n", a, b, c, result1);
		
		result2 = a * b / (float) c;   // 정수 c를 실수로 강제 형 변환한 다음 연산한다.
		System.out.printf(" %d * %d / %d = %f \n", a, b, c, result2);
		
		mok = c / b;   // 몫을 구한다.
		System.out.printf(" %d / %d 의 몫은 %d \n", c, b, mok);
		
		namugi = c % b;   // 나머지를 구한다.
		System.out.printf(" %d / %d 의 나머지는 %d \n", c, b, namugi);
	
	}

}
