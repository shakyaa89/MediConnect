package com.islington.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import com.islington.model.UserModel;
import com.islington.service.RegisterService;
import com.islington.util.RedirectionUtil;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/register" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize = 1024 * 1024 * 50)
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RegisterService registerService;
	private RedirectionUtil redirectionUtil;
	
	public void init() throws ServletException {
		this.registerService = new RegisterService();
		this.redirectionUtil = new RedirectionUtil();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserModel userModel = extractUserModel(request, response);
		Boolean isAdded = registerService.addUser(userModel);
		
		if(isAdded == null) {
			System.out.println("Error adding");
		}else if(isAdded) {
			System.out.println("Hello");
			redirectionUtil.redirectToPage(request, response, RedirectionUtil.loginUrl);
			return;
		}
    }
	
	private UserModel extractUserModel(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String username = request.getParameter("username");
		String location = request.getParameter("location");
		String email = request.getParameter("email");
		LocalDate birthday = LocalDate.parse(request.getParameter("dateOfBirth"));
		String phoneNum = request.getParameter("phoneNumber");
		String gender = request.getParameter("gender");
		
		String pass = request.getParameter("password");
		String repass = request.getParameter("retypePassword");
		
		if(!isValidPassword(pass, repass) || !isPasswordSame(pass, repass)) {
			System.out.println("error password");
		}
		
		return new UserModel("NULL", name, lastName, username, email, phoneNum, gender, birthday, location, pass, "Customer");
	}
	
	

//    // Helper methods for validations
//    private boolean isValidName(String name) {
//        // Implement name validation logic
//        return !name.matches(".*\\d.*") && !name.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
//    }
//    
//    private boolean isValidUsername(String username) {
//        // Implement username validation logic
//        return username.length() > 6 && !username.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
//    }
//
//    private boolean isValidPhoneNumber(String phoneNumber) {
//        // Implement phone number validation logic
//        return phoneNumber.startsWith("+") && phoneNumber.length() == 14;
//    }
//
    private boolean isValidPassword(String password, String retypePassword) {
        // Implement password validation logic
        return password.length() > 6 && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")
                && password.matches(".*[A-Z].*");
    }
	
    private boolean isPasswordSame(String password, String retypePassword){
    	return password.equals(retypePassword);
    }
    
//    private boolean isValidEmail(String email) {
//    	return email.matches(".*@.*[.].*") || email.matches(".*[.].*@.*");
//    }

}