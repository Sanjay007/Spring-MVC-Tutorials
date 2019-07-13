package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.LeafElement;

/**
 * Servlet implementation class loginServlet
 */

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public loginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("<h1>Sanjay</h1> ").append(request.getContextPath());
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Satya</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");*/
		
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletService serv=new ServletService();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	System.out.println(username);
		if(serv.login(username, password)){
			out.println("Successfully logged In");
			
		}else{
			out.println("Unsuccessful login");
		}
		out.println("</body>");
		out.println("</html>");
		
//		response.getWriter().append("Postrequest at: ").append(request.getContextPath());
	}

	@Override
	protected void doDelete(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		super.doDelete(arg0, arg1);
	}
	
	
	
}

