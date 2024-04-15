<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css">
<link type="text/css" rel="stylesheet" href="CSS/add-student-style.css">

</head>
<body>
	<div id = "wrapper">
		<div id = "header">
			<h2>Books</h2>
		</div>
	</div>
	
	<div id = "container">
		<h3>Update Book Data</h3>
	</div>
	
	<form action="Books_Servlet" method="get">
		<input type="hidden" name="command" value="UPDATE">
		<input type="hidden" name="command" value="${THE_BOOK.id}">
		
		<table>
			<tbody>
				<tr>
					<td><label>Title</label></td>
					<td><input type="text" name="title" value="${THE_BOOK.title}"/></td>
				</tr>
				<tr>
					<td><label>Author</label></td>
					<td><input type="text" name="author" value="${THE_BOOK.author}"/></td>
				</tr>
				<tr>
					<td><label>Date</label></td>
					<td><input type="text" name="date" value="${THE_BOOK.date}"/></td>
				</tr>
				<tr>
					<td><label>Genres</label></td>
					<td><input type="text" name="genres" value="${THE_BOOK.genres}"/></td>
				</tr>
				<tr>
					<td><label>Characters</label></td>
					<td><input type="text" name="characters" value="${THE_BOOK.characters}"/></td>
				</tr>
				<tr>
					<td><label>Synopsis</label></td>
					<td><input type="text" name="synopsis" value="${THE_BOOK.synopsis}"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>