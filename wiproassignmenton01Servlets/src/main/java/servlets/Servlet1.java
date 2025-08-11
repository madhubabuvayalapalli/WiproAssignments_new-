package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Servlet1 {

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	        response.setContentType("text/html");
	        
	  
	        String name = request.getParameter("name");
	        String password = request.getParameter("password");
	        
	        
     PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h2>Received Data:</h2>");
	        out.println("<p><strong>Name:</strong> " + name + "</p>");
	        out.println("<p><strong>Password:</strong> " + password + "</p>");
	        out.println("</body></html>");

	}

}
