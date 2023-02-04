package inheritance;
class Animal1{
	void dog() {
		System.out.println("dog is a broken but awesome");
	}
}
class NewAnimal extends Animal1{
	void cat() {
		System.out.println("cat can be tiger");
	}
}
public class SingleInheritanceExample {
    public static void main(String[] args) {
		NewAnimal obj = new NewAnimal();
		
		obj.dog();
		obj.cat();
	}
 }
