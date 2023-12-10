package Day7;

public class AramstrongNumber {
public static void main(String[] args) {
	int no = 153;
	int temp = no;
	int r = 0;
	int sum = 0;
	while(no>0) {
		r=no%10;
		no=no/10;
		sum = sum + r *r *r;
	}if(temp==sum) {
		System.out.println("this is aramstrong number");
	}else {
		System.out.println("this is a not aramstrong number");
	}
}
}
