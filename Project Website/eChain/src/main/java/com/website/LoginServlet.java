package com.website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.MainClass;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i =request.getParameter("username");
		String j =request.getParameter("password");
		LoginDao ld=new LoginDao();
		MainClass m=ld.getData();
		
	    if(i.equals(m.getName()) & j.equals(m.getPassword()))
	    {
	    	System.out.println("Successfull Login");
	    }
	    else
	    System.out.println("UnSuccessfull Login");
		
		
	    
	    
	    	
	}

	

}
