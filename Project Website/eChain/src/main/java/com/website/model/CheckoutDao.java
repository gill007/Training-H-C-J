package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckoutDao 
{
	public int putData(String buyername,String itemname, String amount)
	{
		String query="insert into ordertable(buyername,orderday,totalamount,productname) values('"+buyername+"',sysdate(),"+amount+",'"+itemname+"');";
		int result=0;
		System.out.println(query);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/website?autoReconnect=true&useSSL=false","root","adesh");
			Statement st=con.createStatement();
			result=st.executeUpdate(query);
			System.out.println("Executed");
			st.close();
			con.close();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Check jdbc Driver");
		    } 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Check url,username,password");
		}

		return result;
	
}
}
