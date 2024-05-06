package com.mkpits.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;


public class RegistrationDbUtil {
	
	private DataSource dataSource;

	public RegistrationDbUtil(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}
	

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void addUser(RegistrationModel theregistration) {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String sql = "insert into user_details(name,username,email,gender,dob,city,mobno,password,cpassword) values(?,?,?,?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			myStmt.setString(1, theregistration.getName());
			myStmt.setString(2, theregistration.getUsername());
			myStmt.setString(3, theregistration.getEmail());
			myStmt.setString(4, theregistration.getGender());
			myStmt.setString(5, theregistration.getDob());
			myStmt.setString(6, theregistration.getCity());
			myStmt.setString(7, theregistration.getMobno());
			myStmt.setString(8, theregistration.getPassword());
			myStmt.setString(9, theregistration.getCpassword());
			
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
	}

	

}
