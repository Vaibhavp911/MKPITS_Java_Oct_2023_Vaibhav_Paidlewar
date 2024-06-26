<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
	<link type="text/css" rel="stylesheet" href="CSS/registration.css"></link>
</head>

<style>
	body{
		background-image: url("images/bg.jpg");
		width: 100%;
		height: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
		overflow-x: hidden;
		
	}
	.main{
		
		background-color: rgba(23, 23, 92, 0.15);
		backdrop-filter: blur(10px)  saturate(180%);
	}
</style>
<body>
<div class="main">
        <h1>Register</h1>
        <form action="RegistorControllerServlet" method="get"> 
            <label for="first">
                  Name:
              </label>
            <input type="text"
                   id="first"
                   name="name"
                   placeholder="Enter your Name" required>
 
            <label for="second">
                    Username:
                </label>
              <input type="text"
                     id="second"
                     name="username"
                     placeholder="Enter your Username" required>

            <label for="third">
                        Email:
                    </label>
                <input type="email"
                         id="third"
                         name="email"
                         placeholder="Enter your Email" required>

            <label for="fourth">
                        Gender:
                        </label>
                      <input type="text"
                             id="fourth"
                             name="gender"
                             placeholder="Enter your Gender" required>

            <label for="fifth">
                            Date of Birth:
                            </label>
                          <input type="date"
                                 id="fifth"
                                 name="dob"
                                 placeholder="Select Date" required>

            <label for="sixth">
                            City:
                            </label>
                            <input type="text"
                                id="sixth"
                                name="city"
                                placeholder="Enter your City" required>

            <label for="seventh"> 
                            Mobile:
                            </label>
                                <input type="number"
                                    id="seventh"
                                    name="mobno"
                                    placeholder="Enter your Mobile No." required>
                                    
            <label for="password">
                            Password:
                            </label>
                                <input type="password"
                                    id="password"
                                    name="password"
                                    placeholder="Enter your Password" required>

            <label for="cpassword">
                  Confirm Password:
              </label>
            <input type="password"
                   id="cpassword"
                   name="cpassword"
                   placeholder="Confirm your Password" required>
 
            <div class="wrap">
                <button type="submit"
                        onclick="solve()">
                    Submit
                </button>
            </div>
        </form>
    </div>
</body>
</html>