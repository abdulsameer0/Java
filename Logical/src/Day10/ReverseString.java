package Day10;

public class ReverseString {
  public static void main(String[] args) {
	String str = "sameer";
	int len = str.length();
	String revString = "";
	for(int i = len-1; i>=0; i--) {
		revString=revString+str.charAt(i);
	}
	System.out.println(revString);
}
}
