package Polymorphism;
class Number{
	void add() {
		System.out.println("this is a non-parameters");
	}
	void add(int x) {
		System.out.println("this is a single parameters "+x);
	}
	void add(int x , int y) {
		System.out.println("this is a two parameters "+(x+y));
	}
}
public class Student {
  public static void main(String[] args) {
	Number obj = new Number();
	obj.add();
	obj.add(10);
	obj.add(10,90);
 //this is a method overloading.
	
}
}
