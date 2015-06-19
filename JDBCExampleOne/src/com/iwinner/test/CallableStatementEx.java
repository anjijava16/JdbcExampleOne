package com.iwinner.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementEx {

	public static Connection getConnection(){
		
		Connection con=null;
		try {
			// Step 1: Load Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2: Connection with DB
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iwinner", "root", "root");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}
	public static void main(String[] args) {
		try{
		// Calling the procedure	
		CallableStatement call=getConnection().prepareCall("{call PRO_TBL_USER(?,?,?,?)}");
		call.setInt(1, 30);
		call.setString(2, "iwinner");
		call.setString(3, "Banglore");
		call.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
		// execute getDBUSERByUserId store procedure
		call.executeUpdate();
		
		}catch(Exception e){
		    e.printStackTrace();	
		}
	}
}
