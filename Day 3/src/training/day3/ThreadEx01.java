package training.day3;

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		BusinessLogic businessLogic = new BusinessLogic();
		
		businessLogic.setName("laptop");
		businessLogic.start();
		
		BusinessLogic businessLogic2 = new BusinessLogic();
		
		// MIN_Priority -1
		//MAX_Priority -10
		//Norm_Priority -5
		businessLogic2.setPriority(Thread.NORM_PRIORITY +1);
		businessLogic2.start();
		
	}

}
