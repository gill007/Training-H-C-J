package com.jdbcConnection.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String username="adesh";
		Statement st=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/website?autoReconnect=true&useSSL=false","root","adesh");
			st=con.createStatement();
			
			String query="Select * from login where username='"+username+"';";
			System.out.println(query);
			ResultSet rs=st.executeQuery(query);
			System.out.println("hello");
		
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
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
		finally {
	        if (st != null) { st.close(); }
	    }
		

	}

}
