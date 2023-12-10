package Day4;

public class PrimeNumbet {
public static void main(String[] args) {
	int no = 72;
	int temp = 0;
	for(int i = 2; i<7; i++) {
		if(no%i==0) {
			temp=temp+i;
		}
	}if(temp>0) {
		System.out.println("this is a not prime number");
	}else {
		System.out.println("this is a prime number");
	}
}
}
