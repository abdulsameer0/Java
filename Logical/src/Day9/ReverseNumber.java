package Day9;

public class ReverseNumber {
public static void main(String[] args) {
	int no = 1234;
	int rev = 0;
	while(no>0) {
		rev = (rev*10)+no%10;
		no=no/10;
	}
	System.out.println(rev);
}
}
