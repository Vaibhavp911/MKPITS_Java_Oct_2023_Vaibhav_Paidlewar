<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
	<link type="text/css" rel="stylesheet" href="CSS/login.css"></link>
</head>
<style>
	body{
		background-image: url("images/bg.jpg");
		width: 100%;
		height: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
		overflow: hidden;
		
	}
	.main{
		
		background-color: rgba(23, 23, 92, 0.10);
		backdrop-filter: blur(10px)  saturate(180%);
	}
</style>

<body>
<div class="main">
        <h1>Login</h1>
        <h3>Enter your login credentials</h3>
        <form action="logincontrollerservlet" method = "get">
            <label for="second">
                  Username:
              </label>
            <input type="text"
                   id="second"
                   name="username"
                   placeholder="Enter your Username" required>
 
            <label for="password">
                  Password:
              </label>
            <input type="password"
                   id="password"
                   name="password"
                   placeholder="Enter your Password" required>
 
            <div class="wrap">
                <button type="submit"
                        onclick="solve()">
                    Submit
                </button>
            </div>
        </form>
        <p>Forgot Password/ 
              <a href="forgot-password.jsp"
               style="text-decoration: none;">
                Forgot
            </a>
        </p>
        <p>Not registered? 
              <a href="registration.jsp"
               style="text-decoration: none;">
                Register
            </a>
        </p>
    </div>
</body>
</html>