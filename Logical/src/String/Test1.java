package String;

public class Test1 {
 public static void main(String[] args) {
	String str = "sameer";
	String str1 = "sameer";
	String str2 = new String("sameer");
	String str3 = new String("sameer");
	
	//System.out.println(str2==str3);
	System.out.println(str2.equals(str3));
}
}	
							