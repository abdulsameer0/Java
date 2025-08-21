package Day1;

public class Main1 {
public static void main(String[] args) {
	String str = "tanishka";
	int len = str.length();
	
	String revString = "";
	
	for(int i = len-1; i>=0; i--) {
		revString = revString + str.charAt(i);
	}
	System.out.println(revString);
}
}
