package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	protected  void doGet(HttpServletRequest req,HttpServletResponse res) throws  ServletException,IOException
	{
		
		  PrintWriter out = res.getWriter();
		
		HttpSession se=req.getSession();
		String n=(String)se.getAttribute("name");
		String p =(String)se.getAttribute("password");
		
		   out.println("<html><body>");
           out.println("<h3>Data from Session:</h3>");
           out.println("Name: " + n + "<br>");
           out.println("Password: " + p + "<br>");
           out.println("</body></html>");
		
		
		
		
		
	}

}
