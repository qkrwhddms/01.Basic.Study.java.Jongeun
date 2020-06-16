package JongeunStudy;

public class StudyEx13 {

	public static void main(String[] args) {
		
		int a;   // 정수형 변수 a를 선언
		float b;   // 실수형 변수 b를 선언
		
		a = (int) 123.45f;   // 정수형 변수에 실수를 대입 -> 바람직하지않다. 오류를방지하기위해
		                     // (int)를 붙여서 정수로 변환
		b = 200;   // 실수형 변수에 정수를 대입 -> 바람직하지 않다.
		
		System.out.printf("a의 값 ==> %d \n", a);
		System.out.printf("b의 값 ==> %f \n", b);

	}

}
