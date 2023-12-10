package demo;

public class A {
  public static void main(String[] args) {
	//  String s1 = new String("Hello");  
	 // String s2 = new String("Hello");
	 // String s1 = "abc";
	///  StringBuffer s2 = new StringBuffer(s1);
	 // System.out.println(s1.equals(s2));
	  
	  String s1 = "abc";
	  String s2 = "abc";
	  String s3 = new String("abc");

	  System.out.println("s1 == s2 ? " + (s1 == s2));  //true
	  System.out.println("s1 == s3 ? " + (s1 == s3));   // false
	  System.out.println("s1 equals s3 ? " + (s1.equals(s3)));  // true
	

}
}
