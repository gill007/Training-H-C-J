package com.website.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.MainBean;
import com.website.model.MainDao;


public class MainServlet extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MainDao md=new MainDao();
		
		  ArrayList<MainBean> mb= md.getImage(); ArrayList<String> data=new
		  ArrayList<String>(); for(MainBean m:mb ) { String
		  e=m.getItemName()+" "+m.getPrice()+" "+m.getQuantity()+" "+m.getId()+" "+m.
		  getImageUrl(); data.add(e); System.out.println(e); }
		 
		
		HttpSession session=request.getSession();
		
		session.setAttribute("objectData",mb);
		
		RequestDispatcher d=request.getRequestDispatcher("/mainpage.jsp");
		System.out.println("moving to main page");
		d.forward(request, response); 
	}

}
