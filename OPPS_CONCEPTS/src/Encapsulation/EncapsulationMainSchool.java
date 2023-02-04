package Encapsulation;

public class EncapsulationMainSchool { 
	
	public static void main(String[] args) {
		 EncapculationExampleSchool obj = new EncapculationExampleSchool();
         obj.SetSchoolName("Simran public school maihar");
         obj.SetSchoolNumber(12345);
         obj.SetTotelOfStudent(180090);
         System.out.println("my school name is a = "+obj.GetSchoolName());
         System.out.println("my school number is a = "+ obj.GetSchoolNumber());
         System.out.println("my school is a total of a student = "+obj.GetTotelOfStudent());
	}
		   
}
