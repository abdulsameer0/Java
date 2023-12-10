package primeNumber;

class Demo {
	public int primeNumber(int no) {
		int prime = 0;
		for (int i = 0; i < no; i++) {
			if (no == 0) {
				prime = prime + no;
			}
		}
		return prime;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Demo obj = new Demo();

		System.out.println(obj.primeNumber(7));
	}

}
