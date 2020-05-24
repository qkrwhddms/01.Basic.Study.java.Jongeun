
public class Ex28 {

   public static void main(String[] args) {
    
      for(int a=3; a<9; a++) {
         if(a==3 || a==5) {
         System.out.println(a+"단");}
         for(int b=1; b<10; b++) {
            System.out.println(a+"*"+b+"="+(a*b));
         }
         System.out.println();
      
      }
   }

}