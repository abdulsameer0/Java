package Day6;

public class ReverseNumber {
  public static void main(String[] args) {
	int no =12345;
	int r = 0;
	while(no>0) {
		r=(r*10)+no%10;
		no=no/10;
	}
	System.out.println(r);
}
}
