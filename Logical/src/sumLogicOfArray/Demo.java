package sumLogicOfArray;

public class Demo {
	
   public static void main(String[] args) {
	   int a[] = {12,32,42,42,52,52,8};
	   
	   for(int i = 0; i<a.length; i++) {
		  for(int j = 0; j<i; j++) {
			  if(a[i]>= a[j]) {
				  System.out.println(a[i]);
			  }
		  }
		  
	   }
	 
   }
   
}

