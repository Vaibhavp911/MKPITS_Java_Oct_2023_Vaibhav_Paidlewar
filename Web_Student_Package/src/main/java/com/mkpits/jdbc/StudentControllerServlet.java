package com.mkpits.jdbc;

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
 * Servlet implementation class StudentControllerServlet
 */

	
	
//	private DataSource dataSource;
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDbUtility studentDbUtility;
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init() throws ServletException {
        super.init();
        // TODO Auto-generated constructor stub
        // create our student db util .. and pass in the conn pool  / datasource
        try {
			studentDbUtility = new StudentDbUtility(dataSource);
		} catch (Exception exe) {
			// TODO: handle exception
			throw new ServletException(exe);
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			listStudents(request, response);
		} catch (Exception e) {
			throw new ServletException();
		}
	}

	protected void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get student from db util
		List<Student> students =studentDbUtility.getStudents();
		
		// add statement to the request
		request.setAttribute("STUDENT_LIST", students);
		
		// send to JSP (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student.jsp");
		dispatcher.forward(request, response);
	}
	
}
