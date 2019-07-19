package training.day2;

public class DisplayVehicle {
	public static void showVehicle(Vehicle...vehicles) {
		if(vehicles == null)
		{	System.out.println("Sorry no vehicle found");
		return; }
		
		for(Vehicle temp : vehicles) {
			System.out.println("---------------------------");
			temp.move();
			temp.stop();
		}
/*		if(temp instanceof FourWheeler) {
			((BMW)temp).musicPlayer();
		}else if (temp instanceof Maruti) {
			((maruti)temp).engineStd
		}*/
	}

}
