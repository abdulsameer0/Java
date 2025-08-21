package CreateObjectByNew;

public class MainNew {
  public static void main(String[] args) {
	  SubMain new1 = new SubMain("sameer", 24, "java");
	
	  
	  new1.details();
	 
	  	  
	  
}
}



class SubMain{
	String name;
	int age;
	//String course;
	
	SubMain(String n, int a, String d){
		name = n ;
		age = a ;
	//	course = d;
	}
	
	void details() {
		System.out.println("Student Name :" + name);
		System.out.println("Age :" + age);
		//System.out.println("Course :" + course);
		
		System.out.println("..............................");
	}
	
}
