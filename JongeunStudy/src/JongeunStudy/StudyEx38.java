package JongeunStudy;

import java.util.Scanner;

public class StudyEx38 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;   // 입력한 돈과 각 동전의 개수를 저장할 변수를 선언한다.
		
		System.out.print(" ## 교환할 돈은 ? ");
		money = s.nextInt();   // 교환할 액수를 키보드로 입력받는다.
		
		c500 = money / 500;   // 500원짜리 동전의 개수를 계산한다.
		money = money % 500;   // 500원 짜리로 바꾼 후 나머지 금액을 계산한다.
		
		c100 = money / 100;   //     100원
		money = money % 100;   //     50원
		
		c50 = money / 50;   //     10원짜리
		money = money % 50;   //     동전의
		
		c10 = money / 10;   //     개수를
		money = money % 10;   //     계산한다.
		
		System.out.printf("\n 오백원짜리 ==> %d 개 \n", c500);
		System.out.printf(" 백원짜리 ==> %d 개 \n", c100);
		System.out.printf(" 오십원짜리 ==> %d 개 \n", c50);
		System.out.printf(" 십원짜리 ==> %d 개 \n", c10);
		System.out.printf(" 바꾸지 못한 잔돈 ==> %d 원 \n", money );   // 바꾸지 못한 나머지 돈은 money에 들어 있다.
	}

}
