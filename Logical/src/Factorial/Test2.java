package Factorial;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(" please enter any number");
     Scanner sc = new Scanner(System.in);
      int u = sc.nextInt();
      int fact = 1;
      if(u<10) {
    	  System.out.println("error");
      }
      else {
    	  for(int i = 1; i<=u; i++) {
        	  fact = fact*i;
          }
    	  System.out.println(fact);
	}
      
      
	}
}
