package training.day3;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withDraw(int amount) {
		if(amount <  balance) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException)
			
		}else {
			System.out.println("Sorry dont have sufficient amount" +"withdraw of" + amount + "discarded");
		}
	}

}
