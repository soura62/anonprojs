package training.servlets.basics;

public class UserLog {
	private String un;
	private String lid;
	
	public UserLog() {
		// TODO Auto-generated constructor stub
	}

	public UserLog(String un, String lid) {
		super();
		this.un = un;
		this.lid = lid;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}
	

}
