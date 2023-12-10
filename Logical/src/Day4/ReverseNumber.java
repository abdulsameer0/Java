package Day4;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any number");
	   int no = scanner.nextInt();
	//int no = 1234;
	int rev = 0;
	while(no>0) {
		rev = (rev*10)+no%10;
		no=no/10;
	}
	System.out.println(rev);
}
}
