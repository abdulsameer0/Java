package inheritance;
class Bank1{
	void show() {
		System.out.println("this is a show is a running");
	}
}
class EncomTexOffice extends Bank1{
	void display(){
		System.out.println("this is a display is a running");
	}
}
class VIPPerson extends Bank1{
	void male() {
		System.out.println("male is a vip person in tha area");
	}
}
public class HierarchicalInharetence {
  public static void main(String[] args) {
   VIPPerson obj = new VIPPerson();
   obj.show();
   obj.male();
   EncomTexOffice obj1 = new EncomTexOffice();
   obj1.display();
}
}
