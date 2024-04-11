<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List"%>
<%@ page import="com.mkpits.jdbc1.Student_Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.ArrayList" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker App</title>
<link type= "text/css" rel= "stylesheet" href= "CSS/style.css" ></link>
</head>
<%List<Student_Model> theStudents =(List<Student_Model>)request.getAttribute("STUDENT_LIST"); %>
<body>
<div id="wrapper">
		<div id = "header">
			<h2>MKPITS</h2>
		</div>
</div>

<div id = "container">
	<div id = "content">
		<table border="1">
		<tr>
			<th>id </th>
			<th>First Name </th>
			<th>Last Name </th>
			<th>Email </th>
		</tr>
		<c:forEach var="tempStudent" items="${STUDENT_LIST}" >
      <tr>
      		<td>${tempStudent.id}</td>
         	<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.email}</td>      
      
      </tr>
      
      
      </c:forEach>
		</table>
	</div>
</div>
</body>
</html>