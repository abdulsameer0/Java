package Day9;
class A extends Thread{
	Table table;
	public A(Table table) {
		this.table=table;
	}
	@Override
	public void run() {
	    table.table(5);
	}
}
class B extends Thread{
	Table table;
	public B(Table table) {
		this.table=table;
	}
	@Override
	public void run() {
	    table.table(6);
	}
}
class C extends Thread{
	Table table;
	public C(Table table) {
		this.table=table;
	}
	@Override
	public void run() {
	    table.table(20);
	}
}
public class TheradTable {
public static void main(String[] args) {
	Table table = new Table();
	A a = new A(table);
	B b = new B(table);
	C c = new C(table);
	a.start();
	b.start();
	c.start();
	
	
}
}
