package Day3;
class A extends Thread{
	private ThreadClass a;
	public A(ThreadClass a) {
		this.a=a;
	}
	public void run() {
		a.table(2);
	}
}
class B extends Thread{
	private ThreadClass b;
	public B(ThreadClass b) {
		this.b=b;
	}
	public void run() {
		b.table(5);
	}
}
class C extends Thread{
	private ThreadClass c;
	public C(ThreadClass c) {
		this.c=c;
	}
	public void run() {
		c.table(12);
	}
}
public class MainThreadClass {
public static void main(String[] args) {
	ThreadClass obj = new ThreadClass();
	A a = new A(obj);
	a.start();
	B b = new B(obj);
	b.start();
	C c = new C(obj);
	c.start();
}
}
