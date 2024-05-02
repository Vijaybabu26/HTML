package com.tmf.bank;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phno = request.getParameter("Mobile");
		String Dob = request.getParameter("Dob");
		String Email = request.getParameter("Email");
		String Address = request.getParameter("address");
		String Password = request.getParameter("password");
		
		PaymentWebDao db = new PaymentWebDao();
		db.registerdb(fname, lname, phno, Dob, Email, Address, Password);
		
		RequestDispatcher rd = request.getRequestDispatcher("Dashboard.jsp");
		rd.forward(request, response);
		
	}

}
