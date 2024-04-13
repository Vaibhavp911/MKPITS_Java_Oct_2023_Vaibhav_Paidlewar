<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List,com.mkpits.jdbc1.Student_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css"></link>
</head>
<%
//get the student the RequestDispatcher
List<Student_Model> theStudents = (List<Student_Model>) request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
		<input type="button" value="Add Student" onclick="window.location.href ='add-student-form.jsp';return false;"
		class="add-student-button">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				
				<!-- set up link for each student -->
				
				<c:url var="templink" value="StudentControllerServletNew">
				<c:param name="command" value="LOAD"></c:param>
				<c:param name="studentId" value="${tempStudent.id}"></c:param>
				
				</c:url>
				
				<c:url var="templink" value="StudentControllerServletNew">
				<c:param name="command" value="DELETE"></c:param>
				<c:param name="studentId" value="${tempStudent.id}"></c:param>
				
				</c:url>
				
                <tr>
				<td>${tempStudent.id}</td>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email}</td>
					<td><a href="${tempLink}">UPDATE</a>
					|
					<a href="${deleteLink}" onclick="if(!(confirm('Are you Sure to Delete Data?'))) return false">DELETE</a>
					</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>