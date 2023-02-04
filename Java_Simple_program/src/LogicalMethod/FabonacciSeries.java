package LogicalMethod;

public class FabonacciSeries {
		public static void main(String[] args) {
			int a = 1; 
			int b = 2;
			int c;
			for (int i = 1; i < 10; i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
}
