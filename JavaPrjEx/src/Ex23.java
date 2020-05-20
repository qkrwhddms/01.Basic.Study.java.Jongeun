
public class Ex23 {

	public static void main(String[] args) {
	
		int dan = 1; 
        int su = 1;
        while(dan <= 9){
            while(su <= 9){
                System.out.println(dan+"단 : "+dan+"*"+su+"="+(dan * su));
                su++;
            }
            dan++; su = 1;
            System.out.println();
        }
        
	}

}
