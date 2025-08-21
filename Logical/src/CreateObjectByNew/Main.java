package CreateObjectByNew;

public class Main {
    public static void main(String[] args) {
    	StudentNew new1 = new StudentNew("mahak", 18);
    	new1.display();
    	
    	StudentNew new2 = new StudentNew("juhi", 48);
    	new2.display();
	}
}


class StudentNew{
	
	String name;
	int age;
	
	 StudentNew(String n, int a) {
		name = n;
		age = a;
	}
	 
	 StudentNew() {
		
	}
	
	void display() {
		System.out.println("your name " + name);
		System.out.println("your age " + age);
	}
	
	
}
