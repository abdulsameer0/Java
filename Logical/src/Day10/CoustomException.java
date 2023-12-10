package Day10;

public class CoustomException {
   public static void main(String[] args) {
	try {
		int age = 33;
		if(age<=18) {
		throw new AgeIndexOfBoundException(); 
		}else {
			System.out.println("you are eligible please give the vote");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
