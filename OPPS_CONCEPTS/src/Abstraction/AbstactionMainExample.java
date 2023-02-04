package Abstraction;

abstract class Animals{
	abstract void makeSound();
	
	
	public void eat() {
		System.out.println("i can do it");
	}
}
class Dog extends Animals{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("i can't do its");
	}
	
}

public class AbstactionMainExample {
   public static void main(String[] args) {
	Object o=new Object();
	
	   Dog obj = new Dog();
	   obj.makeSound();
	try {
		Animals animal = Animals.class.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
}
}



