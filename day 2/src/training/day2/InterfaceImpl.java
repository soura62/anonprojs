package training.day2;

class AcceptCommand{
	public static void checkDevice(RemoteControl device) {
		device.on();
		device.off();
	}
}
public class InterfaceImpl {
	public static void main(String []args) {
		RemoteControl d=new NightLamp();
		AcceptCommand.checkDevice(d);
	}

}
