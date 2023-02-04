package Palindrome;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "maham";
		int len = str.length();
		String revString = "";
		
		for(int i = len-1; i>=0; i--) {
			revString = revString+str.charAt(i);
		}
		//System.out.println(revString);
		if (str.equals(revString)) {
			System.out.println("this is a palindrome");
		}
		else {
			System.out.println("this is a not palindrome");
		}
	}
}
