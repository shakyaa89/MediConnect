<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="userSession" value="${pageContext.session}" />
<c:set var="currentUser" value="${userSession.getAttribute('username')}" />
<c:set var="currentRole" value="${userSession.getAttribute('role')}" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

  
  
  <!DOCTYPE html>
		<html>
		<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/CustomerList.css" />
		<link
		      rel="stylesheet"
		      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
		    />
		<title>MediConnect - Admin</title>
		</head>
		<body>
		
		<c:choose>
		    <c:when test="${empty currentUser}">
			<div class="error-message">
				<h2>Access Denied</h2>
		        <p>You do not have permission to access the admin dashboard.</p>
		        <p><a href="login">You are not logged in!!</a></p>
			</div>
		    </c:when>
		
		    <c:when test="${currentRole != 'Admin' && currentRole != 'Staff'}">
		        <div class="error-message">
				<h2>Access Denied</h2>
		        <p>You do not have permission to access the admin dashboard.</p>
		        <p><a href="index">You are not an admin!!</a></p>
			</div>
		    </c:when>
		    
		     <c:otherwise>
		        <jsp:include page="header.jsp"/>
		
		<section class="main-content">
		      <jsp:include page="leftNavigation.jsp"/>
		
		      <div class="list-content">
            <div class="patient-container">
                <div class="patient-head">
                    <h1>Customer List</h1>
                    <form action="">
                        <input type="text" placeholder="Search">
                    </form>
                </div>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Username</th>
                            <th>Gender</th>
                            <th>Address</th>
                            <th>Date of Birth</th>
                            <th>Email</th>
                            <th>Phone No</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>101</td>
                            <td>Emily Watson</td>
                            <td>ewatson</td>
                            <td>Female</td>
                            <td>Brooklyn, NY</td>
                            <td>1988-05-14</td>
                            <td>emily.watson@example.com</td>
                            <td>+1 555-1122</td>
                        </tr>
                        <tr>
                            <td>102</td>
                            <td>John Smith</td>
                            <td>jsmith</td>
                            <td>Male</td>
                            <td>Queens, NY</td>
                            <td>1990-08-22</td>
                            <td>john.smith@example.com</td>
                            <td>+1 555-3344</td>
                        </tr>
                        <tr>
                            <td>103</td>
                            <td>Linda Lee</td>
                            <td>llee</td>
                            <td>Female</td>
                            <td>Bronx, NY</td>
                            <td>1992-03-18</td>
                            <td>linda.lee@example.com</td>
                            <td>+1 555-5566</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
		      
		    </section>
		    </c:otherwise>
		</c:choose>
		
		
		    
		</body>
		</html>
  
