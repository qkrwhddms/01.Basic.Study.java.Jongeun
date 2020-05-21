
public class Ex25 {

	public static void main(String[] args) {
		
			      int a =2;
			      int b = 1;
			      
			      while (a < 10) {
			         if(a==3 || a==5)
			         System.out.println(a+"단");
			         
			         while(b < 10) {
			            System.out.println(a+"*"+b+"="+(a*b));
			            b++;
			         }
			         a++;
			         b=1;
			         System.out.println();
			      }   
			 
	}
			 	
}