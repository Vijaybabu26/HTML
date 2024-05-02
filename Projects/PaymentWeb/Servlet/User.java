package com.tmf.bank;

public class User {
	private int UserId;
	private String Fname;
	private String Lname;
	private String Phno;
	private String Dob;
	private String Email_Id;
	private String Address;
	private String Password;
	private double CurrWalBal;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getPhno() {
		return Phno;
	}
	public void setPhno(String phno2) {
		Phno = phno2;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getCurrWalBal() {
		return CurrWalBal;
	}
	public void setCurrWalBal(double currWalBal) {
		CurrWalBal = currWalBal;
	}
	
	
}
