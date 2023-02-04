package Interface;

 class OldCar implements Polo{

	public int getArea(int length, int weight) {
		return weight*length;
		//System.out.println("this is a area of car "+(length*weight));
		
	}
	
}

public class Car {

	public static void main(String[] args) {
		Polo obj = new OldCar();
		System.out.println(obj.getArea(5, 6));
		
	}
	
		
}
