<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
	<link type="text/css" rel="stylesheet" href="CSS/forgot-password.css"></link>
</head>
<body>
<div class="main">
        <h1>Forgot Password</h1>
        <h3>Enter your Registered Email ID</h3>
        <form action="">
            <label for="first">
                  Username:
              </label>
            <input type="text"
                   id="first"
                   name="first"
                   placeholder="Enter your Username" required>

            <div class="wrap">
                <button type="submit"
                        onclick="solve()">
                    Send Reset Link
                </button>
            </div>
        </form>
    </div>
</body>
</html>