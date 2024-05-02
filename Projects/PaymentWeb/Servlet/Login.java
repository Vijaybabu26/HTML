package com.tmf.bank;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phno =request.getParameter("phno");
		String Password = request.getParameter("password");
		
		if(PaymentWebDao.Logindb(phno, Password)) {
			RequestDispatcher rd = request.getRequestDispatcher("/Dashboard.html");
			rd.forward(request, response);
			System.out.println("login Success");
			User u = new User();
			u.setPhno(phno);
			u.setPassword(Password);
			
		}else {
			response.setContentType("text/html");
			response.getWriter().write("<p style='color:red'>INVALID PASSWORD</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/Error.html");
			rd.include(request, response);
			System.out.println("login Failed");
		}
	}

}
