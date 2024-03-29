package training.day2;

class Customer{	
	private String customerName;
	private String email;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}

public class UserDefExceptionEx {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("Ha");
		int amount = 100;
		try {
			performTransaction(customer, amount);
		} catch (NameTooSmallException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	private static void performTransaction( Customer customer, int amount) throws NameTooSmallException {
		if(customer.getCustomerName().length()<3) {
			throw new NameTooSmallException("Sorry Transaction cannot be performed coz of(" + customer.getCustomerName()+ ") is small");
		}
		if(amount>100) {
			System.out.println("Transaction successfully to" + customer.getCustomerName());
		}else {
			System.out.println("Sorry Amount not valid");
		}
			
	}

}
