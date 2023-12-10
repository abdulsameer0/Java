package ReverseNumber;

import java.util.Scanner;

public class Text {
 public static void main(String[] args) {
	System.out.println("enter any number");
	
	int n;int rev =0;
	Scanner scanner = new Scanner(System.in);
     n =	scanner.nextInt();
     
     while (n>0) {          //123
		rev=(rev*10)+n%10;  // 0=(0*10)+123%10 = 3 , // 3=(0*10)+12%10=32
		n=n/10;
	}
     System.out.println("reverse number " + rev);
	
}
}
