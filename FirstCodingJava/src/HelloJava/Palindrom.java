package HelloJava;

public class Palindrom {
 public static void main(String[] args) {
	int no = 123;
	int temp = no;
	int rev = 0,rem;
	
	while (temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if (no==rev) {
		System.out.println(no + " "+"this is a palindrom");
	} else {
		System.out.println(no + " "+"this is a not palindrom");
	}
	
}
}
