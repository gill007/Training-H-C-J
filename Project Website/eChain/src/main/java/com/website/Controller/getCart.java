package com.website.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class getCart
 */
public class getCart extends HttpServlet {
	
	public ArrayList<String> car=new ArrayList<String>();
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bab=request.getParameter("unique");
		String top=request.getParameter("bab");
		if("36".equals(top))
		{  
		car.clear();
          
		RequestDispatcher d=request.getRequestDispatcher("/logoutServlet");
		System.out.println("moving to Logout page");
		d.forward(request, response); 
	   }
		
		
		else if("35".equals(bab))
		{   HttpSession session=request.getSession();
		
		    session.setAttribute("cartData",car);
              
			RequestDispatcher d=request.getRequestDispatcher("editcart.jsp");
			System.out.println("moving to editcart page");
			d.forward(request, response); 
		}
		
		else {
	
		String st=(String)request.getParameter("url");
		String name=(String)request.getParameter("name");
		String Quantity=(String)request.getParameter("quantity");
		String price=(String)request.getParameter("price");
		String e=st+" "+Quantity+" "+price+" "+name;
		System.out.println("doGet of cart Servlet "+e);
		car.add(e);
		
		response.sendRedirect("mainpage.jsp");
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
