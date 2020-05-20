
public class Ex24 {

	public static void main(String[] args) {

		int i=1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",2,i,(2*i)); i++; }
		System.out.println(); i=2;
		
		while(i<10) { 
			int j=1; 
			while(j<10) { 
				System.out.printf("%d * %d = %d\n",i,j,(i*j)); j++; } i++; }


	}

}
