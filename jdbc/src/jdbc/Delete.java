package jdbc;
import java.util.Scanner;
import java.sql.*;
public class Delete 
{
	public static void main(String...s)
	{
		int s_no;
		System.out.println("inter id which row you want delete");
		Scanner sc=new Scanner(System.in);
		s_no=sc.nextInt();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Alld@123");
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from table1 where Id ="+s_no);
			if(i>0)
				System.out.println("deleted...");
			else
				System.out.println("Something went wrong");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
