package LogicalMethod;

public class PrimeNumber {
		public static void main(String[] args) {
			int num = 7;
			int temp = 1;
		 
			for (int i = 2; i < num-1; i++) {
				if (num == temp) {
					System.out.println(temp);
				}
			}
		}
}
