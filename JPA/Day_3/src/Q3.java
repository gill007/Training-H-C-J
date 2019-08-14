import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class Q3 {
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt=null;
		String stq="select empno,ename,job from emp where empno=?;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign7","root","adesh");  
			stmt=conn.prepareStatement(stq);  
			stmt.setInt(1,7902);
			ResultSet rs=stmt.executeQuery(); 
			
		    boolean b=false;
			while(rs.next())  {
		  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		    b=true;
			}
			
			if(!rs.next()&& b==false)
			{
				System.out.println("No Record Found");
			}
		   conn.close();
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Check jdbc Driver");
		    } 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
			
			
	}
		
	}
}
		






