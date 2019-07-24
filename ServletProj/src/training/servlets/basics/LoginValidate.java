package training.servlets.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.bean.Loginbean;
import training.servlets.service.userBL;


public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginValidate() {
        super();}
    userBL userbl;
    public void init() {
    	userbl = new userBL();
    }
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		Loginbean loginBean = new Loginbean(userName, password);
		//invoke business logic
		if(userbl.validateUser(loginBean)) {
			//send it to sucsess
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			rd.forward(request, response);
			//no statement
		}else {
			//send to failure
			
			request.getRequestDispatcher("Failure").include(request, response);
			request.getRequestDispatcher("/login.html").include(request, response);
	}


}
}