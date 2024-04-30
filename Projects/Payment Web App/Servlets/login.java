package ser.app.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phno =request.getParameter("phno");
		String Password = request.getParameter("password");
		
		
		if(Paymentdao.Logindb(phno, Password)) {
			RequestDispatcher rd = request.getRequestDispatcher("/Dashboard.html");
			rd.forward(request, response);
			System.out.println("login Success");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/Error.html");
			rd.include(request, response);
			System.out.println("login Failed");
		}
	}

}
