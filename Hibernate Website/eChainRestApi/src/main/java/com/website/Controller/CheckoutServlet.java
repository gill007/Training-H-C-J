package com.website.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.website.model.CheckoutDao;


public class CheckoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println(" you are in do GET");
	HttpSession session1=request.getSession();
	int id=Integer.parseInt(request.getParameter("id"));
	ArrayList ls=(ArrayList)session1.getAttribute("removeData");
	ls.remove(id);
	session1.setAttribute("removeData",ls);
	
	response.sendRedirect("editcart.jsp");
	}
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		ArrayList<String> st=(ArrayList)session.getAttribute("removeData");
	    String name=(String)session.getAttribute("loginUsername");
	    CheckoutDao ds=new CheckoutDao();
	    System.out.println("Hello Username "+name);
	    for(String g:st)
	    {
	    	System.out.println(g);
	    	String[] arr=g.split(" ");
	    	String[] e=Arrays.copyOfRange(arr, 3, arr.length);
	    	String gg="";
	    		for(String y:e)
	    		{
	    			gg+=y+" ";
	    		}
	    		// System.out.println(gg+arr[2]);
	    		 ds.putData(name, gg, arr[2]);
	    }
	    System.out.println();
	   
	    response.sendRedirect("SuccessCheckout.jsp");
	}

}
