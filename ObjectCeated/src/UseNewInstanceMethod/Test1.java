package UseNewInstanceMethod;

public class Test1 {
		String str ="raja";
	public static void main(String[] args) {
		try {
			Test1 obj  = Test1.class.newInstance();
			System.out.println(obj.str);
		} catch (Exception e) {
			System.out.println(e);
		}
	}		
}
 