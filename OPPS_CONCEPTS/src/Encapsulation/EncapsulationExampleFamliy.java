package Encapsulation;

public class EncapsulationExampleFamliy {
		private int NumberOfFamliy;
		private String NameOfFamliy;
		
		private String name;
		private String schoolName;

public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

public 	int getNumberOfFamliy(){
	return NumberOfFamliy;
	
}

public String getNameOfFamliy() {
	return NameOfFamliy;
	
}

public void setNumberOfFamliy(int NumberOfFamliy) {
	this.NumberOfFamliy=NumberOfFamliy;
}

public void setNameOfFamliy(String NameOfFamliy) {
	this.NameOfFamliy=NameOfFamliy;
}
		
}
