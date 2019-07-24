package training.servlets.service;

import training.servlets.bean.Loginbean;

public class userBL {
	public boolean validateUser(Loginbean lb) {
		return(lb.getUn().equalsIgnoreCase("india")&& lb.getP().equalsIgnoreCase("Sapient"));
	}

}
