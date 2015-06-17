package com.iwinner.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

public static void main(String[] args) {
	
	
	// Step 1: Loading Driver 
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
		// Step 2 : Connection With Databse	
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/iwinner", "root", "root");
			//Insertion 
			Statement stmt=conn.createStatement();
			int x=stmt.executeUpdate("DELETE from TBL_EMPLOYEE WHERE EMP_ID=30"); //Inser ,delete,update 
			if(x==1){
			System.out.println("Employee Deleted");	
			}else{
				System.out.println("Employee Not Found");
			}
			
			//System.out.println(conn.getClass());// class com.mysql.jdbc.JDBC4Connection
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	
}
