<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MediConnect</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/register.css" />
</head>
<body>
	<jsp:include page="header.jsp" />

	<div class="register">
        <div class="register-container">
            <div class="register-form">
                <div class="form-header">
                    <img src="${pageContext.request.contextPath}/images/logoblack.png"/>
                    <h3>Welcome to Mediconnect</h3>
                </div>
                <form class="form-section" action="register" method="post">
                <div>
                <div class="form-row">
                        <div class="form-column">
                            <label for="firstname">First Name</label> 
                            <input type="text" id="firstname" name="firstname" required>
                        </div>
                        <div class="form-column">
                            <label for="lastname">Last Name</label> 
                            <input type="text" id="lastname" name="lastname" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-column">
                            <label for="username">Username</label> 
                            <input type="text" id="username" name="username" required>
                        </div>
                        <div class="form-column">
                            <label for="location">Location</label> 
                            <input type="text" id="location" name="location" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-column">
                            <label for="email">Email</label> 
                            <input type="email" id="email" name="email" required>
                        </div>
                        <div class="form-column">
                            <label for="phoneNumber">Phone Number</label> 
                            <input type="text" id="phoneNumber" name="phoneNumber" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-column">
                            <label for="gender">Gender</label> 
                            <select name="gender" id="gender">
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="others">Others</option>
                          </select>
                        </div>
                        <div class="form-column">
                            <label for="dateOfBirth">Date of Birth</label> 
                            <input type="date" id="dateOfBirth" name="dateOfBirth" required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-column">
                            <label for="password">Password</label> 
                            <input type="password" id="password" name="password" required>
                        </div>
                        <div class="form-column">
                            <label for="retypePassword">Retype Password</label> 
                            <input type="password" id="retypePassword" name="retypePassword" required>
                        </div>
                    </div>
                </div>
                  <div class="signup-buttons">
                    <button class="signup">Sign up</button>
                    <p>Already have an account? <a href="login">Login</a> here</p>
                </div>
                </form>
                
            </div>
        </div>
    </div>
    
    <jsp:include page="footer.jsp" />
</body>
</html>