package inheritance;
class Collage{
	
	String collageName = "patel collage of science and technology"; 
	String collageAddress = "Bhopal";
   	
}
 class School extends Collage{
	String schoolNmae = "nav joyti academy higher secondory school";
	String  schoolAddress = "manpur district umaria";
 }
 
public class SingleText1 extends School{
	String collageNmae1 = "aditya collage of sience";
	String collageAddress1 = "Satna";
       public static void main(String[] args) {
	 SingleText1 obj = new SingleText1();
	 System.out.println(obj.collageName);
	 System.out.println(obj.collageNmae1);
	 System.out.println(obj.schoolNmae);
	 System.out.println(obj.schoolAddress);
	 System.out.println(obj.collageAddress);
	 System.out.println(obj.collageAddress1);
}
}
