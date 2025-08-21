package CreateObjectByNew;

class Student {
	public static void main(String[] args) {
		SubStudent student = new SubStudent("sameer", 24);
		System.out.println(student.name);
		System.out.println(student.age);
	}
	
}
class SubStudent{
//instance variables
	
    String name;
    int age;
    
	SubStudent(){
	    	System.out.println("constructor called");
	    }

    SubStudent(String n , int a) {
		name = n;
		age = a;
	}
    
    
    
    
	
	
	
}
