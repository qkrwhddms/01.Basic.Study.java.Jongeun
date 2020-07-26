package JongeunStudy;

public class StudyEx41 {

	public static void main(String[] args) {
		
		int a = 200;
		
		if(a < 100)
			System.out.printf("100보다 작군요..\n");             // 5행이 참이면 수행할 것으로
			System.out.printf("거짓이므로 이 문장은 안보이겠죠?\n");    // 예상된다.
			
		System.out.printf("프로그램 끝!\n");   // 5행이 거짓이면 6,7행을 수행하지 않고 9행을 수행할 것으로 예상된다.

	}

}
