package genereicservletexample;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class GenericServletExample  extends GenericServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destriyes");
		
	}


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("started");
		
	}

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("hi");
		res.getWriter().print("hello");
		
	}

}
