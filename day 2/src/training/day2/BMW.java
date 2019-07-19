package training.day2;

public class BMW extends FourWheeler{
	String musicSys;
	
	public BMW(int noOfDoors, fuelType fuelType, String musicSys) {
		super(noOfDoors, fuelType);
		this.musicSys = musicSys;
	}

	public void musicPlayer() {
		System.out.println("BMW comes witha Sony music system");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("BMW moves with Auto Gear");
	}

	@Override
	public void stop() {
		System.out.println("BMW stops with ABS");
	}

}
