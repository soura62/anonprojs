package training.day4.collection;

import java.util.HashSet;

class Device{
	private int dId;
	private String dName;
	private double dPrice;
	public Device(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	
	@Override
	public int hashCode() {
	
		return this.dName.charAt(0);
	}
	

	@Override
	public boolean equals(Object obj) {
	
		Device device =(Device) obj;
		if( this.dId == device.dId
			&& (this.dName).equals(device.dName)
			&& (this.dPrice).equals(device.dPrice)
			)
	}

	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	
	
}

public class CollEx05 {
	public static void main(String[] args) {
		
		HashSet<Device> set = new HashSet<>();
		
		set.add( new Device(101, "laptop", 900));
		set.add( new Device(102, "keyBoard", 300));
		set.add( new Device(103, "Monitor", 500));
		set.add( new Device(104, "CPU", 600));
		set.add( new Device(105, "Mouse", 100));
		
		for(Device d : set) {
			System.out.println(d.getdId());
		}
		
	}

}
