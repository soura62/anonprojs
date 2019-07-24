package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowCheck")
public class ShowCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ShowCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("uname");
		String[] Interests = request.getParameterValues("interest");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("Your name is "+ uName);
		for(String temp :Interests) {
			out.println(temp);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
