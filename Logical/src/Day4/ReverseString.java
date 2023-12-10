package Day4;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter string");
	    String str = scanner.next();
	//String str = "sameer";
	int len = str.length();
	String revString = "";
	for(int i = len-1; i>=0; i--) {
		revString = revString + str.charAt(i);
		
	}
	System.out.println(revString);
}
}
