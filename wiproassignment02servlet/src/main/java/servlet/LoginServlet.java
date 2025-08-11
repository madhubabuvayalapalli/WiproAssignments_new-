package servlet;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
	String name=	req.getParameter("name");
	String  password  =req.getParameter("password");
	
	
	if(name.equals("admin") && password.equals("wipro"))
	{
		//res.sendRedirect("success.html");
		RequestDispatcher rd = req.getRequestDispatcher("success.html");
		rd.forward(req, res);
		
	}else
	{
		//res.sendRedirect("fail.html");
		RequestDispatcher rd = req.getRequestDispatcher("fail.html");
		rd.forward(req, res);
		
	}
	
	
	}

}
