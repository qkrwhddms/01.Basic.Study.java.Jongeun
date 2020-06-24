package JongeunStudy;

public class StudyEx19 {

	public static void main(String[] args) {
		
		int a, b;
		char c, d;
		
		a = 0xF90A;   // 정수형 변수에 a에 16진수 0xF90A를 대입하고
		b = 0x50;     // b에 0x50을 대입
		
		System.out.printf("%c \n", a);   // 정수형 변수 a를 문자형으로 출력
		
		c = (char) b;   // 문자형 변수 c에 정수형 변수 b값을 대입
		System.out.printf("%c \n", c);   // 문자형 변수 c를 문자형으로 출력
		
		d = '#';   // 문자형 변수 d에 '#'를 대입
		System.out.printf("%c의 ASCII값은 %d 입니다 \n", d, (int) d);   // 문자형 변수 d를 두 가지 형태로 출력

	}

}
