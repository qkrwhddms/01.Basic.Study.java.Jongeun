package JongeunStudy;

import java.util.Scanner;

public class StudyEx39 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("연도를 입력하세요 : ");
		year = s.nextInt();   // 계산할 연도를 입력받는다.
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		// 운년은 연도가 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않아야 한다. 또는 400으로 나누어 떨어진다.
		System.out.printf("%d 년은 윤년입니다. \n", year);
		}
		else
			System.out.printf("%d 년은 윤년이 아닙니다. \n", year);
		
	}

}
