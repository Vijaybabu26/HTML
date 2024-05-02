package com.tmf.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentWebDao {
	public boolean registerdb(String fname, String lname,String phno,String Dob,String Email,String Address,String Password) {
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paymentweb","root","root");
				java.sql.Statement st =  con.createStatement();
				String query= "insert into user(First_Name,Last_Name,Phone_No,Date_Of_Birth,Email_Id,Address,PassWord,Curr_Wallet_Balance) values"
						+ "('"+fname+"','"+lname+"','"+phno+"','"+Dob+"','"+Email+"','"+Address+"','"+Password+"','"+0+"')";
				st.executeUpdate(query);
				System.out.println(query);
			} catch (Exception e) {
				
				e.printStackTrace();
				return false;
			}
			return true;
			
		}
	public static boolean Logindb(String Phno ,String PassWord) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paymentweb","root","root");
			
			Statement st = con.createStatement();
			String loginValidateQuery = "SELECT Phone_No, PassWord FROM User_Info WHERE (( Phone_No = '" + Phno + "') && PassWord ='" + PassWord
					+ "')";
			ResultSet rs = st.executeQuery(loginValidateQuery);
			while (rs.next()) {
				System.out.println("Login Successfull !!");
				return true;
			}
			con.close();
			
	} catch (ClassNotFoundException | SQLException e) {	
		e.printStackTrace();
	}
	return false;
	}
}
