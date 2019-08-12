package com.website.Controller;

import com.website.model.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.LoginBean;


@SuppressWarnings("serial")

public class LoginServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		
		String uname= request.getParameter("username");
		session.setAttribute("loginUsername",uname);
		String i =request.getParameter("username");
		String j =request.getParameter("password");
		
		LoginDao ld=new LoginDao(i,j);
		LoginBean m=ld.getData();
		if(i.equals(m.getName()) & j.equals(m.getPassword()))
	    {
			RequestDispatcher d=request.getRequestDispatcher("/MainServlet");
			//response.sendRedirect("/MainServlet");
			System.out.println("moving to main servlet");
			d.forward(request, response);
	    }
	    else
	    {
	    	RequestDispatcher d=request.getRequestDispatcher("/index.jsp");
			System.out.println("moving to login page");
			d.forward(request, response);
			
	    	
	    }
		
		
	    
	    
	    	
	}

	

}
