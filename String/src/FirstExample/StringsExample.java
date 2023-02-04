package FirstExample;

public class StringsExample {
	
	public static void main(String[] args) {
		String s1="Raja";
		String s2="Arbaj";
		String s4="Raja";
		
		System.out.println(s1==s2);//False
		System.out.println(s1.equals(s4));//True
		System.out.println(s1==s4);

		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		
		char s3 = s2.charAt(3);
		System.out.println(s3);
		
		String str = "Welcome to Javatpoint portaL";   
	//  int length = str.length();
	//  char index = str.charAt(str.length()-1);
	 
	 // System.out.println(length);
	  //System.out.println(index);
	}

}
