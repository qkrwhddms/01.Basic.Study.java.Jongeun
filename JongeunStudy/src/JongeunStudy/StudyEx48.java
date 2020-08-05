package JongeunStudy;

import java.util.Scanner;

public class StudyEx48 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = s.nextInt();          // 점수(100점 만점)를 입력한다.
		
		if(a >= 90)  
			System.out.printf("A");  
		else if(a >= 80)  
				System.out.printf("B"); 
			else if(a >= 70) 
					System.out.printf("C"); 
				else if(a >= 60) 
						System.out.printf("D");
					else 
						System.out.printf("F");
		
		System.out.printf(" 학점 입니다. \n");
				
					

	}

}
