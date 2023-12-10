package Day4;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	   String str = scanner.next();
  //	String str = "raja";
	int len = str.length();
	String revString = "";
	for(int i = len-1; i>=0; i--) {
		revString=revString+str.charAt(i);
	}
	if(revString.equals(str))
	{
		System.out.println("this is a palindrom");
	}else {
		System.out.println("this is a not palindrom");
	}
}
}
