package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegDao {
	
	private RegBean rb;
	
	public RegDao(RegBean rb)
	{
		this.rb=rb;
	}
	
	public int putData()
	{
		System.out.println(rb.getUsername());
		int result=0;
		String query="insert into registration values('"+rb.getFirstname()+""
				+ "','"+rb.getLastname()+"','"+rb.getEmail()+"','"+rb.getPhonenumber()+"',"
						+ "'"+rb.getUsername()+"','"+rb.getPassword()+"');";
		
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
