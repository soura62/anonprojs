package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
        super();
       
    }
    public void init() {
    	System.out.println("Hi im in Init,helloWorld");
    }
    public void destroy() {
    	System.out.println("im going out(Destroy) from hello world");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html>");
		out.print("<head><title>Hello World in servlet</title></head>");
		out.print("<body><h1>Welcome to Servlets</h1></body>");
		out.print("</html>");
		}

}
