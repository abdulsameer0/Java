package Day9;

public class MainCustomException {
   public static void main(String[] args) {
	  try {
		int no = 115;
		if(no<=18) {
			throw new AgeOfBoundException();
		}else {
			System.out.println("you are eligible give to vote");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
