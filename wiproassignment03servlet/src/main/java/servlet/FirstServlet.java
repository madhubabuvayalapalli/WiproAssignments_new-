package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class FirstServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		HttpSession s=req.getSession();
		s.setAttribute("password",password);
		s.setAttribute("name",name);
		
		  PrintWriter out = res.getWriter();
		
		 out.println("<html><body>");
	        out.println("<h3>Login Info Stored in Session</h3>");
	        out.println("<a href='SecondServlet'>Go to Second Servlet</a>");
	        out.println("</body></html>");
		
		
		
		
	}

}
