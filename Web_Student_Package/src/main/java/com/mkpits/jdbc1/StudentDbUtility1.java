package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class StudentDbUtility1 {

	private DataSource dataSource;
	public StudentDbUtility1(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Student_Model> getStudents() throws Exception {
		List<Student_Model> student_Models = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRst = null;
		
		try {
			myConn = dataSource.getConnection();
			
			// create a sql statement
			
			String sql = "select * from student order by id";
			myStmt = myConn.createStatement();
			
			// execute sql query
			myRst = myStmt.executeQuery(sql);
			
			// process the result
			while (myRst.next()) {
				
				// retrive dat from result set
				int id = myRst.getInt("id");
				String firstName = myRst.getString("first_name");
				String lastName = myRst.getString("last_name");
				String email = myRst.getString("email");
				
				// create new student object
				
				Student_Model tempStudent = new Student_Model(id, firstName, lastName, email);
				
				/// add it to the list of student
				student_Models.add(tempStudent);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRst);
		}
		return student_Models;
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
