package MethodOverloading;

public class UseOfMethodOverLoading1 {
         private static void display(int a ) {
        	 System.out.println(a);
         }
         private static void display(int a , int b) {
        	 System.out.println(a+b);
         }
         public static void main(String[] args) {
			display(10);
			display(10, 10);
		}
}
