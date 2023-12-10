package Day2;

import java.util.Scanner;

public class AramstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number");
		int n = scanner.nextInt();
		int temp = n;
		int r;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;

		}
		if (sum == temp) {
			System.out.println("this is a aramstrong number");
		} else {
			System.out.println("this is a aramstrong not number");
		}
	}
}
