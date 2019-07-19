package training.day2;

public class NameTooSmallException extends Exception {
	
	private String message;
	public NameTooSmallException(String message) {
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
