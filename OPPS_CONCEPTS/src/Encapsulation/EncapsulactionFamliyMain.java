package Encapsulation;

public class EncapsulactionFamliyMain {
   public static void main(String[] args) {
	   EncapsulationExampleFamliy obj = new EncapsulationExampleFamliy();
	   
	   

	   obj.setNumberOfFamliy(5);
	   obj.setNameOfFamliy("Abdul Aziz,\"Safina begam\",\"Nageena bee Noori\",\"Abdul Sameer\",\"Mahek bee Noori\"");
	   System.out.println("my number of famliy = "+obj.getNumberOfFamliy());
	   
	   System.out.println("my name of famliy = "+obj.getNameOfFamliy());
	   
	   
}
}
