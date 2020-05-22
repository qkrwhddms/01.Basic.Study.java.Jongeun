import java.util.Scanner;

public class Ex26 {

   public static void main(String[] args) {

   Scanner scn = new Scanner(System.in);
   
   System.out.println("단 입력");
   
   int a= scn.nextInt();
   int b=1;
   if(a==3||a==5) 
      System.out.println(a+"단");
   
   while(b<10) {
   System.out.println(a+"X"+b+"="+a*b);
   b++;   
   }
   b=1;
System.out.println();
   
   
   
}

   }