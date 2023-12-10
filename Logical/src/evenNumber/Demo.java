package evenNumber;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("pleace enter any number");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("this is a even number ");
		}else {
			System.out.println("this is a odd number");
		}
	}

}
