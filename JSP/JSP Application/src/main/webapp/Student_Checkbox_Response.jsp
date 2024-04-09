<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The Student is Register : ${param.fName}  ${param.lName}
<br> 
Student Country is : ${param.country}
<br>
Favourite language is: ${param.favLanguage}
<br>
Checkbox for language is: 
<ul>
<%-- jsp scriplet --%>
<%
String[] fLanguage = request.getParameterValues("fLanguage");
for (String temp : fLanguage) {
	out.println("<li>" + temp + "</li>");
}
%>
</ul>
</body>
</html>