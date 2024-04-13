<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List,com.mkpits.books.Book_Model" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
//get the books the RequestDispatcher
List<Book_Model> theBooks = (List<Book_Model>) request.getAttribute("BOOK_LIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
		<input type="button" value="Add Book" onclick="window.location.href = 'add-book-form.jsp';return false;"
		class="add-book-button">
			<table border="1">
				<tr>
				<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Characters</th>
					<th>Synopsis</th>
				</tr>
				<c:forEach var="tempBook" items="${BOOK_LIST}">
                <tr>
					<td>${tempBook.id}</td>
					<td>${tempBook.title}</td>
					<td>${tempBook.author}</td>
					<td>${tempBook.date}</td>
					<td>${tempBook.genres}</td>
					<td>${tempBook.characters}</td>
					<td>${tempBook.synopsis}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>