package HelloJava;

import java.util.Scanner;

public class TextOne {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter your name ");
    String name = obj.nextLine();
    System.out.println("my name is " +name);
}
}
