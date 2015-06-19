package com.iwinner.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

public static void main(String[] args) {
	
	
	// Step 1: Loading Driver 
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
		// Step 2 : Connection With Databse	
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/iwinner", "root", "root");
			
		//	Step 3: DML Opeations 
			Statement stmt=conn.createStatement();
			
			// Delete Operation
			//int x=stmt.executeUpdate("DELETE from TBL_EMPLOYEE WHERE EMP_ID=30"); // delete Operation
			
			// Insert Operation
			//int x=stmt.executeUpdate("INSERT INTO TBL_EMPLOYEE(EMP_ID,EMP_NAME,EMP_DESG,EMP_SAL) values(16,'rps','account',3000)");  //insertion
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int number=sc.nextInt();
			//Update Operation
			int x=stmt.executeUpdate("UPDATE tbl_employee SET EMP_SAL =20000 WHERE EMP_ID="+number); // update
			
			
			if(x==1){
			System.out.println("Employee Updated");	
			}else{
				System.out.println("Employee Not updated");
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
