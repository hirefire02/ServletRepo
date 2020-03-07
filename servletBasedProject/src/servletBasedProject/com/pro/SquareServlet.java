package servletBasedProject.com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		PrintWriter p = res.getWriter();
		
		int k = (int) req.getAttribute("k");
		k = k * k;
		
		p.println(k);
		
	}
	

}
