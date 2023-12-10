package Day2;

public class StringRevese {
	public static void main(String[] args) {
         String str = "raja";
         int len = str.length();
         String revString = " ";
         for(int i = len-1; i>=0; i--) {
        	 revString=revString+str.charAt(i);
         }
         System.out.println(revString);
	}
}
