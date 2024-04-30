package ser.app.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Paymentdao {
public void registerdb(String fname, String lname,String phno,String Dob,String Email,String Address,String Password) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paymentapp","root","root");
			java.sql.Statement st =  con.createStatement();
			String query= "insert into User_Info(First_Name,Last_Name,Phone_No,Date_Of_Birth,Email_Id,Address,PassWord,Curr_Wallet_Balance) values"
					+ "('"+fname+"','"+lname+"','"+phno+"','"+Dob+"','"+Email+"','"+Address+"','"+Password+"','"+0+"')";
			st.executeUpdate(query);
			System.out.println(query);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
public static boolean Logindb(String Phno ,String PassWord) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Paymentapp", "root", "root");
		Statement Stm = Con.createStatement();

//		String Uquery = "Select User_Id,PassWord from User_Info where User_Id = '"+u.getUserId()+"'and PassWord ='"+u.getPassWord()+"'";
//		ResultSet res = Stm.executeQuery(Uquery);	
//		res.next();
//		return;
		   String Uquery = "Select Phone_No,PassWord from User_Info where Phone_No = ? and PassWord = ?";
//            PreparedStatement ps = Con.prepareStatement(Uquery);
//            ps.setString(1, Phno);
//            ps.setString(2, PassWord);
//            ResultSet res = ps.executeQuery();
//            return res.next();	
//            
		   Statement st = Con.createStatement();
			String loginValidateQuery = "SELECT Phone_No, PassWord FROM User_Info WHERE (( Phone_No = '" + Phno + "') && PassWord ='" + PassWord
					+ "')";
			ResultSet rs = st.executeQuery(loginValidateQuery);
			while (rs.next()) {
				System.out.println("Login Successfull !!");
				return true;
			}
			Con.close();
			
	} catch (ClassNotFoundException | SQLException e) {	
		e.printStackTrace();
	}
	return false;

	
}
}

