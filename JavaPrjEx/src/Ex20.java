import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		System.out.println("�� ���α׷��� �𷡽ð踦 ����� ���α׷��Դϴ�.");
		System.out.println("�𷡽ð踦 ����� ���� �� ���� �Է��ϼ��� : ");
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=0,j=0,cnt=1,s=0,e=n;
		int[][] arr = new int[n][n];
		
		for (i=0; i<n; i++) {
			for (j=s;j<e;j++) {
				arr[i][j]=cnt++;
			if (i>=(n/2)) {
				s--;
				e++;	
			}else {
				s++;
				e--;
			}
				
		}
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}
			
		}
		
		}
	}

}
