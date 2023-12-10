package Day1;

public class ReverseNumber {
   public static void main(String[] args) {
	int no = 1234;
	int revNum = 0;
	while(no>0) {
		revNum = (revNum*10)+no%10;
		no=no/10;
	}
	System.out.println(revNum);
}
}

