package Abstraction;

abstract class Main{
	public void show() {
		System.out.println("my name is abdul sameer");
	}
}
class Language extends Main{
    public static void main(String[] args) {
   Main obj = new Language();
   obj.show();
		
		   
		
		
	}
}
