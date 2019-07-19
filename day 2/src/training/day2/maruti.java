package training.day2;

public class maruti extends FourWheeler{
	private String engineStd;
	
	

	public maruti(int noOfDoors, fuelType fuelType, String engineStd) {
		super(noOfDoors, fuelType);
		this.engineStd = engineStd;
	}


	public void engineStandard() {
		System.out.println("The Maruti is "+ engineStd);
	}


	@Override
	public void doors(int noOfDoors) {
		System.out.println("The Maruti has"+noOfDoors + "doors");
	}


	@Override
	public void move() {
		System.out.println("The Maruti moves");
	}


	@Override
	public void stop() {
		System.out.println("The Maruti stops");
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
