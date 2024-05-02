<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
    <link rel="icon" type="image/x-icon" href="https://static.vecteezy.com/system/resources/previews/000/354/777/original/bank-vector-icon.jpg">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body{
            background-image: url('https://s1.1zoom.me/big3/357/Dollars_Money_Banknotes_556215_5000x2750.jpg');
            background-size: cover;
            background-attachment: fixed;
            text-shadow: 2px 2px 6px black;
        }
        .register{
            height: 800px;
            width: 600px;
            backdrop-filter: blur(30px);
            border: 2px solid white;
            border-radius: 16px;
        }
        .registerbox{
          height: 40px;
            width: 450px;
        }
    </style>
</head>
<body>
    <center>
    
        <h1 style="font-size:xxx-large; color: rgb(255, 255, 255);">PAYMENT WEBAPP</h1><br>
        <h4 style="font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;  color: rgb(255, 255, 255); ">Payment Web Application is a digital platform designed to handle online transactions seamlessly.</h4>
        <h4 style="font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;  color: rgb(255, 255, 255);">It provides a secure and efficient method for businesses and individuals to send, receive, and process payments over the internet.</h4>
        <br>
       
        <div class="register">
          <br>
          <svg xmlns="http://www.w3.org/2000/svg" width='50px' height='50px' fill="currentColor" class="bi bi-people-fill" viewBox="0 0 16 16" style="color: aliceblue;">
            <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6m-5.784 6A2.24 2.24 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.3 6.3 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1zM4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5"/>
          </svg>
        <h1 style=" color: rgb(255, 255, 255); font-size: xxx-large;">REGISTER</h1><br>
            <div class="registerbox">
            <form action="http://localhost:8080/Payment/Register" method="post" >
                <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="" name="fname">
                <label for="floatingInput">First Name</label>
                </div>
              <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="" name="lname">
                <label for="floatingInput">Last Name</label>
              </div>
              <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="1234564889" name="Mobile">
                <label for="floatingInput">Mobile No</label>
              </div>
              <div class="form-floating mb-3">
                <input type="date" class="form-control" id="floatingInput" placeholder="" name="Dob">
                <label for="floatingInput">Date Of Birth</label>
              </div>
              <div class="form-floating mb-3">
                <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="Email">
                <label for="floatingInput">Email address</label>
              </div>
              
              <div class="form-floating mb-3">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="address"></textarea>
                <label for="floatingInput">Address</label>
              </div>
              <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
                <label for="floatingPassword">Password</label>
              </div><br>
              <button type="submit" class="btn btn-success">SUBMIT</button><br>
            </form><br>

            <div class="Login">
                <a href="" style="text-decoration: none; color: rgb(255, 255, 255);"><h3>Already A User</h3> </a>
            </div><br>
          </div>
        </div><br><br>
        

    </center>

</body>
</html>