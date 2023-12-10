package Day8;
class Demo{
	public void table(int no) {
		for(int i = 1; i<=10; i++) {
			System.out.println(no*i);
		}
	}
}
public class Table {
public static void main(String[] args) {
	Demo demo = new Demo();
	demo.table(4);
}
}
