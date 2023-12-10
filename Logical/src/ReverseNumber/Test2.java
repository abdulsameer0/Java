package ReverseNumber;

import java.util.Scanner;

public class Test2 {
   public static void main(String[] args) {
	   System.out.println("this any nnumber ");
	   int no;
	   int rem = 0;
	
	Scanner scanner = new Scanner(System.in);
	no=scanner.nextInt();
	while (no>0) {
		rem=(rem*10)+no%10;
		no=no/10;
	}
	System.out.println("this is a revese number "+no);
}
}
