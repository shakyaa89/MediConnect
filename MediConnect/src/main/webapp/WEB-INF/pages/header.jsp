<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/header.css" />
</head>
<body>
	<header class="header">
      <div class="header-content">
        <div class="logo">
          <img src="${pageContext.request.contextPath}/images/logowhite.png" alt="Company Logo"/>
        </div>
        <div class="header-element">
          <nav>
            <ul>
              <li><a href="index">Home</a></li>
              <li><a href="#">Blog</a></li>
              <li><a href="#">About Us</a></li>
              <li><a href="#">Contact Us</a></li>
            </ul>
          </nav>
          <button class="button login-btn"  onclick="window.location.href='login';">Login</button>
          <button class="button register-btn" onclick="window.location.href='register';">Register</button>
        </div>
      </div>
    </header>
</body>
</html>