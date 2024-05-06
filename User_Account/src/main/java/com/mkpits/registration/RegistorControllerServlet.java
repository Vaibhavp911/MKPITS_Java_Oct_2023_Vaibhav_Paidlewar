package com.mkpits.registration;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 * Servlet implementation class RegistorControllerServlet
 */
@WebServlet("/RegistorControllerServlet")
public class RegistorControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private RegistrationDbUtil registrationDbUtil;
	
	@Resource(name="jdbc/user_registration_details")
	private DataSource dataSource;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		super.init();
		
		try {
			registrationDbUtil = new RegistrationDbUtil(dataSource);
		} catch (Exception exc) {
			
			throw new ServletException();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				addUser(request,response);
				
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String city = request.getParameter("city");
		String mobno = request.getParameter("mobno");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		
		RegistrationModel theregistration = new RegistrationModel(name, username, email, gender, dob, city, mobno, password, cpassword);
		
		registrationDbUtil.addUser(theregistration);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request,response);
	}
	

}
