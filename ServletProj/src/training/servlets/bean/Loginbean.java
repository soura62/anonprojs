package training.servlets.bean;

public class Loginbean {
	private String un;
	private String p;
	
	
	public Loginbean(String un, String p) {
		super();
		this.un = un;
		this.p = p;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
	

}
