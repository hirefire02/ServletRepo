package servletBasedProject.com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
	
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter p = res.getWriter();
		int f = Integer.parseInt(req.getParameter("first"));
		int s = Integer.parseInt(req.getParameter("second"));
		
		int k = f+s;
		
		req.setAttribute("k", k);
		
		p.println("Sum is " + k);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
	}
	

}
