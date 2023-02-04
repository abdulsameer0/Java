package HelloJava;

public class Adder {
	
	public static void main(String[] args) {
		int no = 123;
		int rem =0    ;
		int rev  = 0;
			while (no != 0) {
				rev = rev*10+rem;
				no=no%10;
			}
			
    System.out.println(rem);
		
		
}
}