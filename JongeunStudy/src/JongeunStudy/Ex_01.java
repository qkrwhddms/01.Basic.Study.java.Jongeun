package 개인공부.ch04;

public class Ex_01 {

	public static void main(String[] args) {
		
		//   반복문, 조건문
		//  if-else문
		
		int score = 95;
		
		if (score >= 90) {
			System.out.println("입력하신 점수는 " + score + "점 입니다 ");
			System.out.println("점수가 85점 이상입니다.");
			System.out.println("A등급입니다.");	
		}else {    //  score 가 90 이하 일 경우 
			System.out.println("입력하신 점수는 " + score + "점 입니다 ");
			System.out.println("점수가 85점 이하입니다.");
			System.out.println("B등급 입니다.");
		}

	}

}
