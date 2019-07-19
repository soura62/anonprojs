package training.day3;

class SomeClass{}

public class BusinessLogic extends SomeClass implements Runnable  {
	private Thread t;
	public  MyBusinessLogic(String name, int priority) {
		t= new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();	}
	public void run() {
		System.out.println("the thread name in run() is"+ Thread.currentThread().getName());
 //simulating to kill time
		
		for(int i=0; i<1000;i++){
		{System.out.println("Value of i is"+ i + "in Thread"+ Thread.currentThread().getName());
		}
		System.out.println("existing:" + Thread.currentThread().getName());
		}
	}


		
	
}

