package JongeunStudy;

public class StudyEx15 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		
		a = 100 + 100;   // a에 두 숫자의 계산결과를 대입
		b = a + 100;   // b에 변수와 숫자의 계산 결과를 대입
		c = a + b - 100;   // c에 변수의 계산 결과와 숫자의 계산 결과를 대입
		d = a + b + c;   // d에 a, b, c의 덧셈 결과를 대입
		System.out.printf("a, b, c , d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);
		
		a = b = c = d = 100;   // a,b,c,d에 모두 같은 값 100을 대입(한문장으로 처리)
		System.out.printf("a, b, c , d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);
		
		a = 100;
		a = a + 200;   // 자신의 a값과 200을 더한 값을 다시 a에 대입
		System.out.printf("a의 값 ==> %d \n", a);

	}

}
