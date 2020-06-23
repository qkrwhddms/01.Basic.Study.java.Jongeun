package JongeunStudy;

public class StudyEx18 {

	public static void main(String[] args) {
		
		char a, b, c, d, e;   // 문자형 변수 5개를 선언
		
		a = 'A';   // 문자형 변수a에 'A'를 대입
		System.out.printf(" %c \t", a);        // 문자형 변수 a를 
		System.out.printf(" %d \n",(int) a);   // 문자형과 정수형으로 출력

		b = 'a';   // 문자형 변수 b에 'a'를 대입
		c = (char) (b + 1);   // 문자형 변수 b에 1를 더하여 문자형 변수 c에 대입한다.(결과는 char로 캐스팅한다)
		System.out.printf(" %c \t", b);
		System.out.printf(" %c \n", c);
		
		d = 90;   // 문자형 변수 d에 숫자 90을 대입
		System.out.printf(" %c \n", d);
		
		d = '가';   // 문자형 변수 d에 한글을 대입
		e = (char) (d + 1);   // 문자형 변수 e에 1를 더하여 문자형 변수  c에 대입한다. 결과는 char로 캐스팅한다
		System.out.printf(" %d \t", (int) d);
		System.out.printf(" %c \n", e);
		
	}

}
