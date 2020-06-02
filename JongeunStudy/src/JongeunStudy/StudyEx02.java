package JongeunStudy;

public class StudyEx02 {

	public static void main(String[] args) {
		
		int a, b;     //정수형 변수 a와 b를 선언
		int result;   //정수형 변수 result를 선언
		
		a = 100;
		b = 50;         // a에는 100을, b에는 50을 대입
		
		result = a + b;      // a와 b를 더한 결과를 result에 넣음
		System.out.println(a + "+" + b + "=" + result);   // 화면에 a, b, result를 출력

		result = a - b;      // a와 b를 뺀 결과를 result에 넣음
		System.out.println(a + "-" + b + "=" + result);   // 화면에 a, b, result를 출력

		result = a * b;      // a와 b를 곱한 결과를 result에 넣음
		System.out.println(a + "*" + b + "=" + result);   // 화면에 a, b, result를 출력
		
		result = a / b;      // a와 b를 나눈 결과를 result에 넣음
		System.out.println(a + "/" + b + "=" + result);   // 화면에 a, b, result를 출력
	}

}
