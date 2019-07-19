package training.day2;

public class FourWheeler extends Vehicle {
	private int noOfDoors;
	private fuelType FuelType;
	

	public FourWheeler(int noOfDoors, fuelType fuelType) {
		super();
		this.noOfDoors = noOfDoors;
		FuelType = fuelType;
	}



	public void doors( int noOfDoors) {
		System.out.println("Four Wheeler has" +noOfDoors + "doors");
	}
/*	public void fuelType(String type) {
		System.out.println("This four wheeeler runs on" + fuelType);
	}*/
}
