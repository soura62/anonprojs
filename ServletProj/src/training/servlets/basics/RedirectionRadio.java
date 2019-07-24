package training.servlets.basics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectionRadio")
public class RedirectionRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String interest = request.getParameter("interest");
		
		if(interest.equals("sports")) {
			response.sendRedirect("https://www.espncricinfo.com/");
		}else if(interest.equals("politics")) {
			response.sendRedirect("https://www.youtube.com/channel/UCgRvm1yLFoaQKhmaTqXk9SA");
		}else if(interest.equals("business")) {
			response.sendRedirect("https://economictimes.indiatimes.com/news");
		}else if(interest.equals("others")) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,"We do not provide this support");
		}
	};
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
