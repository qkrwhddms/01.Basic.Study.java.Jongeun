package 개인공부.ch04;

public class Ex_02 {

	public static void main(String[] args) {
		
		// if-else if-else문
		
		int score = 86;
		
		if (score >= 90) {
			System.out.println("입력하신 점수는 " + score + "점 입니다.");
			System.out.println("90점 이상입니다.");
			System.out.println("A등급입니다.");
		}else if(score >= 80){
			System.out.println("입력하신 점수는 " + score + "점 입니다.");
			System.out.println("80점 이상입니다.");
			System.out.println("B등급입니다.");
		}else if(score >= 70) {
			System.out.println("입력하신 점수는 " + score + "점 입니다.");
			System.out.println("70점 이상입니다.");
			System.out.println("C등급입니다.");
		}else if(score >= 60) {
			System.out.println("입력하신 점수는 " + score + "점 입니다.");
			System.out.println("60점 이상입니다.");
			System.out.println("D등급입니다.");
		}else {
			System.out.println("입력하신 점수는 " + score + "점 입니다.");
			System.out.println("60점 이하입니다.");
			System.out.println("F등급입니다.");
		}

	}

}
