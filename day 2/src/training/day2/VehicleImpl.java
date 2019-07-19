package training.day2;

public class VehicleImpl {
	public static void main(String []args) {
		Vehicle [] vehicles = new Vehicle[5];
		
		vehicles[0] = new BMW(2, fuelType.PETROL, "Sony");
		vehicles[1] = new maruti(4,fuelType.CNG, "BS4");
		vehicles[2] = new maruti(3,fuelType.CNG, "BS4");
		vehicles[3] = new BMW(1,fuelType.PETROL, "Sony");
		vehicles[4] = new maruti(3,fuelType.CNG, "BS4");
		
		DisplayVehicle.showVehicle(vehicles);
	}

}
