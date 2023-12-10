package Day3;

public class ArmstrongNumber {
   public static void main(String[] args) {
	int no = 153;
	int temp = no;
	int r;
	int sum =0;
	
	
	while(no>0) {
		r=no%10; //53
		no=no/10; // 
		sum = sum + r*r*r;
	}
	if(temp==sum) {
		System.out.println("this is a aramstrong number");
	}else {
		System.out.println("this is a not aramstrong number");

	}
}
}
