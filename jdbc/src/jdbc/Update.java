package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Update 
{
	public static void main(String[] args)
	{
		String name,city;
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter changed name ");
		name=sc.nextLine();
		System.out.println("Enter changed city ");
		city=sc.nextLine();
		System.out.println("Enter id where are you change");
		id=sc.nextInt();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Alld@123");
			Statement st=con.createStatement();
			int i=st.executeUpdate("update table1 set name = '"+name+"', city= '"+city+"' where id="+id);
			
			if(i>0)
				System.out.println("updated successfull.....");
				else
				System.out.println("Something went wrong");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
