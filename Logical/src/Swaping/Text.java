package Swaping;

public class Text {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("before sawping");
		System.out.println(a);
		System.out.println(b);

		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 20

		System.out.println("after sawping");
		System.out.println(a);
		System.out.println(b);

	}
}
