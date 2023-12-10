package Day3;

public class Palindrom {
	public static void main(String[] args) {
		String str = "maham";
		int len = str.length();
		String revString = "";
		for (int i = len - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);

		}
          if(str.equals(revString)) {
        	  System.out.println("this is a palindrom");
          }else {
        	  System.out.println("this is a not palindrom");
          }
	}
}
