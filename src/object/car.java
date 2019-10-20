package object;

public class car {
	String carName;
	String carBrand;
	public car () {
		System.out.println("Default constructor of car class");
	}
	public car(String carName) {
		this.carName=carName;   ///it is initializing a carname
		System.out.println(carName);
	}
	public car (String brand, String carName) {
		this.carBrand=brand;
		this.carName=carName;
		
	}
}
