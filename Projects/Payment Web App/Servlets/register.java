package ser.app.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phno = request.getParameter("Mobile");
		String Dob = request.getParameter("Dob");
		String Email = request.getParameter("Email");
		String Address = request.getParameter("address");
		String Password = request.getParameter("password");
		
		Paymentdao db = new Paymentdao();
		db.registerdb(fname, lname, phno, Dob, Email, Address, Password);
		
	}

}
