package Day1;

public class ReveseString {
	public static void main(String[] args) {
		String str = "raja";
		int len = str.length();
		String revString = "";
		for (int i = len - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
		
		System.out.println("....................Two ways of return String........................");
		StringBuilder buffer = new StringBuilder("raja");
		StringBuilder rev = buffer.reverse();
		System.out.println(rev);
	}
	
	  
}
