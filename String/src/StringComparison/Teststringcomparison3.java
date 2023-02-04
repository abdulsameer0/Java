package StringComparison;

public class Teststringcomparison3 {
    public static void main(String[] args) {
		String str = "sameer";
		String str1 = "sameer";
		String str2 = new String("sameer");
		System.out.println(str==str1);//true (because both refer to same instance
		System.out.println(str==str2);//false(because s3 refers to instance created in nonpool)  
	
}
    }
