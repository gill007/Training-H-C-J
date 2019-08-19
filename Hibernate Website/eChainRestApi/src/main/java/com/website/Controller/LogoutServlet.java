package com.website.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("session invalidated");
		HttpSession session=request.getSession();
		HttpSession session1=request.getSession();
		session.removeAttribute("cartData");
	    
		session1.removeAttribute("removeData");
		session.invalidate();
	
		System.out.println("/n");
		System.out.println("session invalidated");
		RequestDispatcher d=request.getRequestDispatcher("/index.jsp");
		System.out.println("moving to login page");
		d.forward(request, response);
		
	}

}
