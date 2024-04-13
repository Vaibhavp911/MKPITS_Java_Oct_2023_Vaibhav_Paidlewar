package com.mkpits.jdbc1;

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


// @webservelt --> target the class to run on browser
	
//	private DataSource dataSource;
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDbUtility1 studentDbUtility1;
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
    public void init() throws ServletException {
        super.init();
        // TODO Auto-generated constructor stub
        // create our student db util .. and pass in the conn pool  / datasource
        try {
			studentDbUtility1 = new StudentDbUtility1(dataSource);
		} catch (Exception exe) {
			// TODO: handle exception
			throw new ServletException(exe);
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// if the request is of GET type use doGet() method
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			//read the "command" parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing, then default to listing student
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			//route to the appropriate method
			switch (theCommand) {
			case "LIST" : 
				listStudents(request,response);
				break;
			case "ADD" :
				addStudent(request,response);
				break;
			case "LOAD" :
				loadStudent(request,response);
				break;
			case "UPDATE" :
				updateStudent(request,response);
				break;
			case "DELETE" :
				deleteStudent(request,response);
				break;
			default:
			listStudents(request, response);
		} 
		}
			catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		// readd student id ferom from data
		String studentId = request.getParameter("studentId");
		
		// delete student from database
		studentDbUtility1.deleteStudent(studentId);
		
		// send back to again "list-student.jsp"
		listStudents(request, response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String studentId = request.getParameter("studentId");
		int id = Integer.parseInt(studentId);
		
		// read student data from from 
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		// create a new student object
		Student_Model theStudent = new Student_Model(id,firstName,lastName,email);
		
		//perform update on databse
		studentDbUtility1.updateStudent(theStudent);
		
		// send them back to the list "list-students" page
		listStudents(request,response);
		
		
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// read student id from d=from-data
		
		String theStudentId = request.getParameter("studentId");
		
		// get student from database (DbUtility)
		Student_Model theStudent = studentDbUtility1.loadStudents(theStudentId);
		
		//place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);
		
		// send to JSP (view)
				RequestDispatcher dispatcher = request.getRequestDispatcher("/update-list-student.jsp");
				dispatcher.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)throws Exception{
		// TODO Auto-generated method stub
		//read student data from form
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String email = request.getParameter("email");
				
				// create new Student_Model object
				Student_Model theStudent = new Student_Model(firstName, lastName, email);
				
				////add student to the database
				studentDbUtility1.addStudent(theStudent);
				
				//send back to main page (the student list)
				listStudents(request, response);

	}

	protected void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get student from db utility
		List<Student_Model> student_Models =studentDbUtility1.getStudents();
		
		System.out.println(student_Models.toString());
		// add statement to the request
		request.setAttribute("STUDENT_LIST", student_Models);
		
		// send to JSP (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student-button.jsp");
		dispatcher.forward(request, response);
	}
	
}
