package Day1;

public class Main {
  public static void main(String[] args) {
	
	  //by literal
	  
	   String name = "SAMEER";	  // 0 = s , 1= a , 2 = m , 3 = e , 4 = e , 5 = r
	   int lenString = name.length();  
	  
	  System.out.println("my name is a "+ name);
	  System.out.println("total lenght "+ lenString);
	  
	  
	  //string methods = lenght(),charAt(), toUpperCase(), toLowerCase();
	  
	  System.out.println(name.charAt(5));
	  System.out.println(name);
	  System.out.println(name.toUpperCase());
	  System.out.println(name.toLowerCase());
	  
	  String str = "juhi";
	  char[] ch = str.toCharArray();
	  System.out.println(ch);
	   
	  // next topic immutable
	   
	  String str2 = "raja";   // raja  logic = raja khan
	  str2 = str2.concat(" khan");
	     System.out.println(str2);  // raja khan
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
}
}




//create string 2 type 
//1 - by literal.
//2 - new keyword.
