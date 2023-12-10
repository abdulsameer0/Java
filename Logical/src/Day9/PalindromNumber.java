package Day9;

public class PalindromNumber {
  public static void main(String[] args) {
	String str = "sameer";
	int len = str.length();
	String revString = "";
	for(int i = len-1; i>=0; i--) {
		revString=revString+str.charAt(i);
	}if(revString.equals(str)) {
		System.out.println("this is a palindrom ");
	}else {
		System.out.println("this is a palindrom ");
	}
}
}
