package jdbc;
import java.sql.*;
public class First 
{
	public static void main(String...s)
	{
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Alld@123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from table1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" - "+rs.getString(3));
			}
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
