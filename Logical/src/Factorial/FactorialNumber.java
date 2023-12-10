package Factorial;

public class FactorialNumber {
     public String fact(int no) {
    	 int f = 1;
    	 if(no==0 || no==1) {
    		 
			return "this is a factorial "+ f;
    	 }else {
    		 for(int i=no; i>0; i--) {
    			 f=f*i;
    		 }
    		 return "this is a factorial "+ f;
    	 }
     }
     public static void main(String[] args) {
    	 FactorialNumber factorialNumber = new FactorialNumber();
    	 System.out.println(factorialNumber.fact(5));
	}
     
    		 
}
