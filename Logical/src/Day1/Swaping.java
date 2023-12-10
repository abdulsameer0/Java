package Day1;

public class Swaping {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("before swaping " + a);
		System.out.println("before swaping " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("..............");

		System.out.println("after swaping " + a);
		System.out.println("after swaping " + b);
	}
}
