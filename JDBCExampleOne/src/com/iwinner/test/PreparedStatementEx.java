package com.iwinner.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class PreparedStatementEx {
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
	
		
		
	 try {
		
		 // Step 1 Load driver
		 Class.forName("com.mysql.jdbc.Driver");
		 
		 // Step 2 Connection with DB
		 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iwinner", "root", "root");
		 
		 //Statement stmt=conn.createStatement();
		 PreparedStatement pstmt=con.prepareStatement("DELETE from TBL_EMPLOYEE WHERE EMP_ID=?");
		 
		 // UPDATE TBL_EMPLOYEE SET SAL=? ,DESG=?,ADDR=? WHERE EMP=?,EMP_NAME=?
		 pstmt.setInt(1, 20);
		 //pstmt.setString(2, "Account");
		 
		 int x=pstmt.executeUpdate();
		 
		 if(x==1){
			 System.out.println("Employee Deleted");
		 }else{
			 System.out.println("Employee  Not Found");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try{
		
		String insertQuery="INSERT INTO TBL_EMPLOYEE(EMP_ID,EMP_NAME,EMP_DESG,EMP_SAL) VALUES(?,?,?,?)";
		
		// Step 1: Start PreparedStatment
		PreparedStatement pstmt=getConnection().prepareStatement(insertQuery);
		pstmt.setInt(1, 55);
		pstmt.setString(2, "Ness");
		pstmt.setString(3, "Account");
		pstmt.setInt(4, 6000);
        
		// execute Update the statement
		int x=pstmt.executeUpdate();
		if(x==1){
		System.out.println("Employee Created");	
		}else{
			System.out.println("Employee Not created");
		}
		
		}catch(Exception e){
		    e.printStackTrace();	
		}
	}*/
		
		
	}

}
