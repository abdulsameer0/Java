package Day4;

public class FactorialNumber {
public static void main(String[] args) {
	int no = 5;
	int temp = 1;
	for(int i = 1; i<=no; i++) {
		temp = temp*i;
	}
	System.out.println("this is a fatorial number = " + temp);
}
}
