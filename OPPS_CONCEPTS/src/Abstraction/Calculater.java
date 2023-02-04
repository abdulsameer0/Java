package Abstraction;

abstract class Add{
	int a = 10;
	int b = 20;
	
	public void sub() {
		System.out.println(a+b);
	}
}
class Add1 extends Add{
	public void sub() {
		System.out.println(a+b);
	}
}
public class Calculater extends Add1 {
  public static void main(String[] args) {
	Add1 obj = new Add1();
	obj.sub();
	
}
}
