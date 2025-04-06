<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MediConnect</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css" />
</head>
<body>
	<jsp:include page="header.jsp" />

	<section class="main-container">
      <div>
        <form action="" method="post" class="form-container">
          <img src="${pageContext.request.contextPath}/images/logoblack.png" alt="Logo" height="50px" />

          <h1>Welcome to MediConnect</h1>

          <div class="label-div">
            <label for="username">Username</label>
          </div>
          <input type="text" name="username" id="username" />
          <div class="label-div">
            <label for="password">Password</label>
          </div>
          <input type="password" name="password" id="password" />
          <button class="login-btn-form">Login</button>
          <p>Don't have an account? <a href="register">Register here</a></p>
        </form>
      </div>
    </section>
    
    <jsp:include page="footer.jsp" />
</body>
</html>