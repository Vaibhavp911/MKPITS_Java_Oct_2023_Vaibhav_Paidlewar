package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class Books_Db_Utility {

	private DataSource datasrc;
	
	public Books_Db_Utility(DataSource datasrc) {
		this.datasrc = datasrc;
	}
	
	public List<Book_Model> getBooks() throws Exception {
		List<Book_Model> book_Models = new ArrayList<Book_Model>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRst = null;
		
		try {
			myConn = datasrc.getConnection();
			
			// create a sql statement
			
			String sql = "select * from books order by id";
			myStmt = myConn.createStatement();
			
			// execute sql query
			myRst = myStmt.executeQuery(sql);
			
			// process the result
			while (myRst.next()) {
				
				// Retrieve data from result set
				int id = myRst.getInt("id");
				String title = myRst.getString("title");
				String author = myRst.getString("author");
				String date = myRst.getString("date");
				String genres = myRst.getString("genres");
				String characters = myRst.getString("characters");
				String synopsis = myRst.getString("synopsis");
				
				// create new student object
				
				Book_Model tempBook = new Book_Model(id, title, author, date, genres, characters, synopsis);
				
				/// add it to the list of student
				book_Models.add(tempBook);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRst);
		}
		return book_Models;
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
	
	public void addBooks(Book_Model theBook) {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			//get database connection
			myConn = datasrc.getConnection();
			
			//create sequel for insert
			String sql = "insert into books(title, author, date, genres, characters, synopsis) values(?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			//set the param values for the student
			myStmt.setString(1, theBook.getTitle());
			myStmt.setString(2, theBook.getAuthor());
			myStmt.setString(3, theBook.getDate());
			myStmt.setString(4, theBook.getGenres());
			myStmt.setString(5, theBook.getCharacters());
			myStmt.setString(6, theBook.getSynopsis());
			
			//execute SQL insert
			myStmt.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(myConn, myStmt, null);
		}
		
	}
}
