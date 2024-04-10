package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Test_Servlet
 */
@WebServlet("/Test_Servlet")
public class Test_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// Define datasource/connection pool for resource Injection 
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// set up the PrintWriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// get connection to the database 
		Connection myConn = null; //  connecting the database
		Statement myStmt = null;
		ResultSet myRst = null; // to data iterate
		
		try {
			myConn = dataSource.getConnection();
			
			// create a sql statement
			
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			// execute sql query
			myRst = myStmt.executeQuery(sql);
			
			// process the result
			while (myRst.next()) {
				
				String email = myRst.getString("email");
				out.println(email);
				out.println("<br>");
				
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
