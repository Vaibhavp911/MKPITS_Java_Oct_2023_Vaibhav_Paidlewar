package com.mkpits.books;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 * Servlet implementation class Books_Servlet
 */
@WebServlet("/Books_Servlet")
public class Books_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Books_Db_Utility books_Db_U;
	@Resource(name="jdbc/books_gatik")
	private DataSource dataSrc;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {
        // create our student db util .. and pass in the conn pool  / datasource
		super.init();
		try {
			books_Db_U = new Books_Db_Utility(dataSrc);
		} catch (Exception e) {
			
			throw new ServletException(e);
		}
	}

	/**
	 * @throws ServletException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		try {
			//read the "command" parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing, then default to listing books
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			//route to the appropriate method
			switch (theCommand) {
			case "LIST" : 
				listBooks(request,response);
				break;
			case "ADD" :
				addBooks(request,response);
				break;
			case "LOAD" :
				loadBook(request,response);
				break;
			case "UPDATE" :
				updateBook(request,response);
				break;
			case "DELETE" :
				deleteBook(request,response);
				break;
			default:
			listBooks(request, response);
			break;
		} 
			listBooks(request, response);
		}
			catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// read book id from form data
		String bookId = request.getParameter("bookId");
		
		// delete book from database
		books_Db_U.deleteBook(bookId);
		
		// send back to again "list-book.jsp"
		listBooks(request, response);
		
	}

	private void updateBook(HttpServletRequest request, HttpServletResponse response) {
		
		String bookId = request.getParameter("bookId");
		int id  = Integer.parseInt(bookId);
		
		//read student data form data
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");
		
		// create a new book object
		Book_Model theBook = new Book_Model(title, author, date, genres, characters, synopsis);
		
		// perform update on database
		books_Db_U.updatBook(theBook);
	}

	private void loadBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// read student id from form Data
		String theBookId = request.getParameter("theBook");
		
		// get student from database (DbUtility)
		Book_Model theBook = books_Db_U.loadBook(theBookId);
		
		// place student in the request attribute
		request.setAttribute("theBookId", theBook);
		
		// send to JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-list-book.jsp");
		dispatcher.forward(request, response);
	}

	private void addBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//read student data from form 
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");
		
		// create new Student_Model object
		Book_Model theBook = new Book_Model(title, author, date, genres, characters, synopsis);
		
		////add student to the database
		books_Db_U.addBooks(theBook);
		
		//send back to main page (the student list)
		listBooks(request, response);
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// get student from db utility
		List<Book_Model> book_Models = books_Db_U.getBooks();
		
				
				System.out.println(book_Models.toString());
				// add statement to the request
				request.setAttribute("BOOK_LIST", book_Models);
			
				// send to JSP (view)
				RequestDispatcher dispatcher = request.getRequestDispatcher("/list-book.jsp");
				dispatcher.forward(request, response);
		
	}

}
