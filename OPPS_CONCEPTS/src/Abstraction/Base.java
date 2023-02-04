package Abstraction;



abstract class SunSter{
	abstract void printInfo();
}

class Employye extends SunSter {
	 public void printInfo() {
		String name = "sameer";
		int age = 23;
		float salary = 23000;
		System.out.println(name);
		System.out.println(age );
		System.out.println(salary);
		
				
	}
}

public class Base extends Employye {
      
   public static void main(String[] args) {
	Employye obj = new Employye();
	 obj.printInfo();
}
     
      
}


