package JongeunStudy;

public class StudyEx32 {

	public static void main(String[] args) {
		
		byte a = 'A', b;   // 
		byte mask = 0x0F;   // 
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask);   // 'A'와 0x0F의 논리곱
		System.out.printf("%X | %X = %X \n", a, mask, a | mask);   // 및 논리합을 수행한다.
		
		mask = 'a' -'A';   // 'a'와 'A'의 차이는 32이다.
		
		b = (byte) (a ^ mask);   // 'A'와 마스크(32)의 배타적 논리합을 수행한다.
		System.out.printf("%c ^ %d = %c \n", a, mask, b);
		b = (byte) (b ^ mask);   // 'a'와 마스크(32)의 배타적 논리합을 수행한다.
		System.out.printf("%c ^ %d = %c \n", b, mask, a);

	}

}
