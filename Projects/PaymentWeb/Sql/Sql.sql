create database paymentweb;
Use paymentweb;
create table user(
	User_Id INT auto_increment not null,
    First_Name VARCHAR(25),
    Last_Name VARCHAR(25),
    Phone_No varchar(15) unique,
    Date_Of_Birth date,
    Email_Id varchar(40),
    Address VARCHAR(100),
    PassWord VARCHAR(25),
    Curr_Wallet_Balance double,
    PRIMARY KEY (User_Id)
    );
