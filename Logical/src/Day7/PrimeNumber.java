package Day7;

public class PrimeNumber {
public static void main(String[] args) {
	int no = 15;
	int temp = 0;
	for(int i = 2; i<no; i++) {
		if(no%i==0) {
			temp=temp+i;
		}
	}if(temp==0) {
		System.out.println("this is a  prime number");
	}else {
		System.out.println("this is a not prime number");
	}
}
}
