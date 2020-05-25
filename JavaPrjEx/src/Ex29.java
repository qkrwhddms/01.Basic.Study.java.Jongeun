import java.util.Scanner;

public class Ex29 {

   public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      int a,b,c,d;
      int hap;
      
      System.out.printf("1번째 숫자를 입력하세요 : ");
      a = scn.nextInt();
      System.out.printf("2번째 숫자를 입력하세요 : ");
      b = scn.nextInt();
      System.out.printf("3번째 숫자를 입력하세요 : ");
      c = scn.nextInt();
      System.out.printf("4번째 숫자를 입력하세요 : ");
      d = scn.nextInt();
      
      hap = a + b + c + d;
      
      System.out.printf(" 합계 ==> %d \n", hap);
   }

}