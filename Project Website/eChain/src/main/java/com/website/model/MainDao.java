package com.website.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class MainDao {
	
	
	
	public ArrayList<MainBean> getImage()
	{
		
		ArrayList<MainBean> mb=new ArrayList<MainBean>();
		String query="select * from product;"; 
				
		
		System.out.println(query);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/website?autoReconnect=true&useSSL=false","root","adesh");
			Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				MainBean m=new MainBean();
				m.setItemName(rs.getString(2));
				m.setPrice(Integer.parseInt(rs.getString(4)));
				m.setQuantity(Integer.parseInt(rs.getString(3)));
			    m.setImageUrl(rs.getString(6));
			    m.setId(Integer.parseInt(rs.getString(5)));
			    mb.add(m);
			}
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

		 return mb;
	}

}
