package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Result;

public class StudentDbUtility {

	private DataSource dataSource;
	public StudentDbUtility(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Student> getStudents() throws Exception {
		List<Student> students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRst = null;
		
		try {
			myConn = dataSource.getConnection();
			
			// create a sql statement
			
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			// execute sql query
			myRst = myStmt.executeQuery(sql);
			
			// process the result
			while (myRst.next()) {
				
				// retrive dat from result set
				int id = myRst.getInt("id");
				String firstName = myRst.getString("first_Name");
				String lastName = myRst.getString("last_Name");
				String email = myRst.getString("email");
				
				// create new student object
				
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				/// add it to the list of student
				students.add(tempStudent);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRst);
		}
		return students;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRst) {

		
		try {
			
			if(myRst != null ) {
				myRst.close();
			}
			
			if(myStmt != null ) {
				myStmt.close();
			}
			
			if(myConn != null ) {
				myConn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
