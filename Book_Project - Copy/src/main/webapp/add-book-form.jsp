<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Library</h2>
		</div>
	</div>
	<div id="container">
		<h3>Add Book</h3>
	
	<form action="Books_Servlet" method="get">
		<input type="hidden" name="command" value="ADD">
		<table>
			<tbody>
				<tr>
					<td><label>Title</label></td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td><label>Author</label></td>
					<td><input type="text" name="author" /></td>
				</tr>
				<tr>
					<td><label>Date</label></td>
					<td><input type="date" name="date" /></td>
				</tr>
				<tr>
					<td><label>Genres</label></td>
					<td><input type="text" name="genres" /></td>
				</tr>
				<tr>
					<td><label>Characters</label></td>
					<td><input type="text" name="characters" /></td>
				</tr>
				<tr>
					<td><label>Synopsis</label></td>
					<td><input type="text" name="synopsis" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save" class="save">
			</tbody>
		</table>
	</form>
	<div style="clear: both;"></div>
	<p>
		<a href="Books_Servlet">Back To List</a>
	</p>
	</div>
</body>
</body>
</html>