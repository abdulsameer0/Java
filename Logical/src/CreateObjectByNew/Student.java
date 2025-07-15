package CreateObjectByNew;

class Student {
    //instance variables
	
    String name;
    int age;
    
    

	 Student(String n , int a) {
		name = n;
		age = a;
	}
	
	 Student() {
		
	}
	
	void display() {
		System.out.println("Name  "+ name);
		System.out.println("Age "+ age);
	}
}
