package JongeunStudy;

import java.util.Scanner;

public class StudyEx47 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = s.nextInt();                   // 점수(100점 만점)를 입력한다.
		
		if(a >= 90)                    // 입력한 점수가 90점 이상이면
			System.out.printf("A");     // A를 출력한다.
		else                                              // 입력한 점수가
			if(a >= 80)                                   // 80점 이상이면 
				System.out.printf("B");                   // B,
			else                                          // 70점 이상이면
				if(a >= 70)                               // C,
					System.out.printf("C");               // 60점 이상이면
				else                                      // D
					if(a >= 60)                           // 를 출력한다.
						System.out.printf("D");           //   
					else                          // 입력한 점수가 60점 미만이면
						System.out.printf("F");   // F를 출력한다.
		
		System.out.printf(" 학점 입니다. \n");
				
					

	}

}
