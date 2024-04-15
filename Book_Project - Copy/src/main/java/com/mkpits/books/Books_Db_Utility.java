package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class Books_Db_Utility {

	private DataSource dataSource;
	
	public Books_Db_Utility(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Book_Model> getBooks() throws Exception {
		List<Book_Model> book_Models = new ArrayList<Book_Model>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRst = null;
		
		try {
			myConn = dataSource.getConnection();
			
			// create a sequel statement
			
			String sql = "select * from books order by id";
			myStmt = myConn.createStatement();
			
			// execute sequel query
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
			myConn = dataSource.getConnection();
			
			//create sequel for insert
			String sql = "insert into books(title, author, date, genres, characters, synopsis) values(?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			//set the @param values for the student
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

	public void deleteBook(String bookId) {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			// Convert student to integer
			int theBookId = Integer.parseInt(bookId);
			
			// get DB COnnection
			myConn = dataSource.getConnection();
			
			// create sequel to get delete book
			String sql = "delete from book where id = ?";
			
			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set @params
			myStmt.setInt(1, theBookId);
			
			// execute sequel
			myStmt.execute();
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
		
	}

	public void updatBook(Book_Model theBook) {
	
		Connection myConn = null ;
		PreparedStatement myStmt = null;
		
		try {
			// get DB connection
			myConn = dataSource.getConnection();
			
			// create sequel to get update books
			String sql = "update book set title = ?, author = ?, date = ?, genres = ?, characters = ?, synopsis = ? where id = ?";
			
			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set @params
			myStmt.setString(1, theBook.getTitle());
			myStmt.setString(2, theBook.getAuthor());
			myStmt.setString(3, theBook.getDate());
			myStmt.setString(4, theBook.getGenres());
			myStmt.setString(5, theBook.getCharacters());
			myStmt.setString(6, theBook.getSynopsis());
			myStmt.setInt(7, theBook.getId());
			
			// execute sql
			myStmt.execute();
			
		} catch (Exception e) {
			
			close(myConn, myStmt, null);
		}
		
	}

	public Book_Model loadBook(String theBookId) throws Exception {
		
		Book_Model theBook = null;
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRst = null;
		int bookId;
		
		try {
			// convert book id into Integer
			bookId = Integer.parseInt(theBookId);
			
			// get database connection
			myConn = dataSource.getConnection();
			
			// create sequel to get selected book
			String sql = "select * from book where id=?";
			
			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set @params
			myStmt.setInt(1, bookId);
			
			// execute statement 
			myRst = myStmt.executeQuery();
			
			// Retrieve data from result set row
			if (myRst.next()) {
				String title = myRst.getString("title");
				String author = myRst.getString("author");
				String date = myRst.getString("date");
				String genres = myRst.getString("genres");
				String characters = myRst.getString("characters");
				String synopsis = myRst.getString("synopsis");
				
				// use the bookId during construction
				theBook = new Book_Model(title, author, date, genres, characters, synopsis);
				
			} else {
				throw new Exception("Could not find bookId "+bookId);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRst);
		}
		
		return theBook;
	}
}
