package inheritance;
class MyHome{
	void  myroom(){
		System.out.println("this is a my room");
	}
}
class myshop extends MyHome{
	void mynemshop() {
		System.out.println("this is a my new shop");
	}
}
class myBike extends myshop{
	void NewBike() {
		System.out.println("this is a my new bike");
	}
}
public class MultilevelInheritanceExample extends myBike{
	void oldBike(){
		System.out.println("this is a my old bike ");
	}
	public static void main(String[] args) {
		MultilevelInheritanceExample obj = new MultilevelInheritanceExample();
	      obj.myroom();
	      obj.NewBike();
	      obj.mynemshop();
	      obj.oldBike();
				
	}
}
