package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Insert 
{
	public static void main(String...s)
	{
		String name,city;
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter your city");
		city=sc.nextLine();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Alld@123");
			PreparedStatement pst=con.prepareStatement("insert into table1(name,city) value(?,?)");
			
			pst.setString(1,name);
			pst.setString(2, city);
			int i=pst.executeUpdate();
			if(i>0)
			System.out.println("inserted successfull.....");
			else
			System.out.println("Something went wrong");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
