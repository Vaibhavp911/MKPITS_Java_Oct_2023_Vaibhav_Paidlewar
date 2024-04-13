package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	public void addStudent(Student_Model theStudent) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get db connection
			myConn = dataSource.getConnection();
			
			//create sql for insert
			String sql = "insert into student(first_name,last_name,email) values(?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			//set the param values for the student
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			
			//execute SQL insert
			myStmt.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(myConn, myStmt, null);
		}
		
	}

	public Student_Model loadStudents(String theStudentId) throws Exception {
		
		Student_Model theStudent = null;
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRst = null;
		int studentId;
		
		try {
			// convert student id into integer
			studentId = Integer.parseInt(theStudentId);
			
			// get database connection
			myConn = dataSource.getConnection();
			
			// create sql to get selected student
			String sql = "select * from student where id ?";
			
			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, studentId);
			
			// execute statement
			myRst = myStmt.executeQuery();
			
			//retrive Data from result set row
			if (myRst.next()) {
				String firstName = myRst.getString("first_Name");
				String lastName = myRst.getString("last_Name");
				String email = myRst.getString("email");
				
				// use the studentId during construction
				theStudent = new Student_Model(studentId,firstName,lastName,email);
			}else {
				throw new Exception("Could not find studentId "+studentId);
			}
		}
		finally {
			// TODO: handle finally clause
			close(myConn, myStmt, myRst);
		}
		
		return theStudent;
	}
	
	public void updateStudent(Student_Model theStudent) throws Exception {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get bd connection
			myConn = dataSource.getConnection();
			
			// create sql to get update student
			String sql = "update student set first_name = ?, last_name = ?, email = ? where id =?";
			
			//create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setInt(4, theStudent.getId());

			//excute SQL
			myStmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			close(myConn, myStmt, null);
		}
	}
	
	public void deleteStudent(String studentId) throws Exception {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		try {
			// convert student to integer
			int theStudentId = Integer.parseInt(studentId);
			
			// get Db connection
			myConn = dataSource.getConnection();
			
			// create sql to get update student
			String sql = "delete from student where id = ?";
			
			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, theStudentId);
			
			// execute sql
			myStmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(myConn, myStmt, null);
		}
	}
}
