package Abstraction;
abstract class NewMain{
    public void show() {
    	System.out.println("car is a working");
    }
	
}

class OldMain extends NewMain{
	public void display() {
		System.out.println("display is a working");
	}
}
public class Car  {
  public static void main(String[] args) {
	OldMain obj = new OldMain();
	obj.show();
	obj.display();
}
}
