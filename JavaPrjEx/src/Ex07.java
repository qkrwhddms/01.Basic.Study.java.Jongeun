import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num, cend, st, end;
		
		System.out.println("������ ����� ���α׷��Դϴ�.\n");
		System.out.println("������ ����� ���� �� ���� �Է����ּ��� : ");
		num=scn.nextInt();
		
		cend = (num+1)/2;
		st = end = cend;
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= end; j++) {
				if (j<st) {
					System.out.print(" ");
				}else System.out.print("*");
			}
				if (i<cend) {
					st--;
					end ++;
				}else {
					st++;
					end --;
				}
				System.out.println();
			}
			scn.close();

	}

}
