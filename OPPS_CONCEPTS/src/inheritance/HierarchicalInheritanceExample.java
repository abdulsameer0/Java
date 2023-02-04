package inheritance;
class Bank{
	void loneBank() {
		System.out.println("this is a banking system");
	}
}
class PnbBank extends Bank{
	void loneBank1() {
		System.out.println("this is a banking not system");
	}
}
class IciciBank extends Bank{
	void LoneBank2() {
		System.out.println("yes icic bank allow");
	}
}
public class HierarchicalInheritanceExample {
			public static void main(String[] args) {
				IciciBank obj = new IciciBank();
				obj.loneBank();
				obj.LoneBank2();
				
				PnbBank obj1 = new PnbBank();
				obj1.loneBank1();
				obj1.loneBank();
				
				
			}
}
