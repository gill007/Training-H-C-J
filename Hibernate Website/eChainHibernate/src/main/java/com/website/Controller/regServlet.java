package com.website.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.website.model.RegBean;
import com.website.model.RegDao;


public class regServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i =request.getParameter("firstname");
		String j =request.getParameter("lastname");
		String k =request.getParameter("phonenumber");
		String l =request.getParameter("email");
		String m=request.getParameter("username");
		String n =request.getParameter("password");
		
		RegBean rg=new RegBean();
		rg.setFirstname(i);
		rg.setLastname(j);
		rg.setPhonenumber(k);
		rg.setEmail(l);
		rg.setUsername(m);
		rg.setPassword(n);
		
		RegDao rd= new RegDao(rg);
		int result=rd.putData();
		if(result>0)
		{
			RequestDispatcher d=request.getRequestDispatcher("/success.jsp");
			System.out.println("moving to login page");
			d.forward(request, response);
		}
		
		else
		{
			System.out.println("Error");
		}
		
		
	}

}
