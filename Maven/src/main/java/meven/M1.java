package meven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=Darshanbr2001@");
			 Statement st=con.createStatement();
			 st.executeUpdate("create database emp1");
			 
			 System.out.println("created successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
