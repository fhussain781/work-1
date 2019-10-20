package object;

public class newCar {
	String newCarName;
	String newCarBrand;
	int newCarModel;
	public newCar() {
	}
	public newCar(String newCarName) {
		this.newCarName = newCarName;
		System.out.println("");
	}
	public newCar(String newCarName, String newCarBrand) {
		this.newCarName = newCarName;
		this.newCarBrand = newCarBrand;
	}
	public newCar(String newCarName, String newCarBrand, int newCarModel) {
		super();
		this.newCarName = newCarName;
		this.newCarBrand = newCarBrand;
		this.newCarModel = newCarModel;
	}
	
	

}
