package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.website.model.*;

public class LoginDao {
	
	private String username;
	private String password;


	
	public LoginDao(String i, String j) {
		// TODO Auto-generated constructor stub
		this.username=i;
		this.password=j;
	}

	public LoginBean getData()
	{
		LoginBean m= new LoginBean();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/website?autoReconnect=true&useSSL=false","root","adesh");
			Statement st=con.createStatement();
			
			String query="Select * from login where username='"+username+"' and password='"+password + "';";
			
			ResultSet rs=st.executeQuery(query);
			
		
			
			while(rs.next())
			{
				m.setName(rs.getString(1));
			    m.setPassword(rs.getString(2));
			}
			rs.close();
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
		return m;
	}
}
