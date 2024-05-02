<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
    <link rel="icon" type="image/x-icon" href="https://static.vecteezy.com/system/resources/previews/000/354/777/original/bank-vector-icon.jpg">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body{
            background-image: url('https://images7.alphacoders.com/979/979778.jpg');
            background-size: cover;
            background-attachment: fixed;
            
        }
        .header{
            text-align: center;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            color: white;
            img{
                height: 250px;
                width: 300px;
            }    
                 
        }
        .Login{
            height: 500px;
            width: 500px;
            backdrop-filter: blur(30px);
            border: 2px solid white;
            border-radius: 16px;

        }
        .loginbox{
            height: 40px;
            width: 450px;
           
    
        }
    </style>
</head>
<body>
    <center>
    <div class="header">
        <marquee><h1 style="font-size: xxx-large; ">WELCOME TO PAYMENT WEBAPP</h1></marquee>
        <h1 style="font-size: xxx-large; "></h1>
        <img src="https://cdn-icons-png.freepik.com/512/3458/3458714.png" >
        <h1 style="font-size:xxx-large;;">PAYMENT WEBAPP</h1><br>
        <h4>Payment Web Application is a digital platform designed to handle online transactions seamlessly.</h4>
        <h4>It provides a secure and efficient method for businesses and individuals to send, receive, and process payments over the internet.</h4>
        <br>
        <button type="button" class="btn btn-outline-light" onclick="scrollToWel()">LOGIN</button>
    </div><br><br>

    
    
    <div class="Login">
        <br>
        <h1 style="font-size: xxx-large; color: whitesmoke;"> LOGIN </h1>
        <br>
        <div class="loginbox">
        <form action="http://localhost:8080/Payment/Login" method="post">
        
        <div class="form-floating mb-3">
            <input type="Text" class="form-control" id="floatingInput" placeholder="No" name="phno">
            <label for="floatingInput">Mobile No</label>
        </div><br>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
            <label for="floatingPassword">Password</label>
           
        </div><br>
        
        <button type="submit" class="btn btn-success">SUBMIT</button><br>
        <svg xmlns="http://www.w3.org/2000/svg" width='50px' height='50px' fill="currentColor" class="bi bi-people-fill" viewBox="0 0 16 16" style="color: aliceblue;">
            <path d="M7 14s-1 0-1-1 1-4 5-4 5 3 5 4-1 1-1 1zm4-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6m-5.784 6A2.24 2.24 0 0 1 5 13c0-1.355.68-2.75 1.936-3.72A6.3 6.3 0 0 0 5 9c-4 0-5 3-5 4s1 1 1 1zM4.5 8a2.5 2.5 0 1 0 0-5 2.5 2.5 0 0 0 0 5"/>
          </svg>
       <a href="" style=" color: rgb(255, 255, 255); font-size: xxx-large; text-decoration: none;"> <h1 >REGISTER</h1><br></a>
    
        </form>
        <br><br>
        </div>
        
    </div><br><br>

    
    
</center>
</body>
</html>
<script>
    function scrollToWel() {
        var element = document.querySelector('.Login');
        element.scrollIntoView({behavior: "smooth"});
    }
</script>