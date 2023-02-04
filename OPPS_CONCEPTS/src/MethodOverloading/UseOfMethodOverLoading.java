package MethodOverloading;

public class UseOfMethodOverLoading {
       static void display(int a) {
    	   System.out.println("argumaent "+a);
       }
       static void display(int a, int b) {
    	   System.out.println(a+b+" argument ");
       }
       public static void main(String[] args) {
		display(10);
		display(10, 10);
	}
}
