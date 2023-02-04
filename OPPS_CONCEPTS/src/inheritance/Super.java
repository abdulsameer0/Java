package inheritance;
class child{
	int a,b;
	void set(int x , int y) {
		a=x;
		b=y;
	}
}
class subChild extends child{
	int total;  
	void set() {
		total = a+b;
	}
}
public class Super {
  public static void main(String[] args) {
	subChild obj = new subChild();
	obj.set(80, 20);
	obj.set();
	System.out.println(obj.total);
}
}

