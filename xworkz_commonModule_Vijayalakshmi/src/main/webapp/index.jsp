<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
           <!-- background-image: url('https://us.123rf.com/450wm/kreangagirl/kreangagirl1706/kreangagirl170600086/80674129-flat-lay-of-accessories-on-green-desk-background-of-traveler-voyage-concept.jpg?ver=6');-->
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #333;
        }

        .header {
            padding: 15px;
            background-color: rgba(0, 0, 0, 1);
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 2px solid #5c6bc0;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.2);
        }

        .logo img {
            height: 90px;
        }

        .auth-links a {
            font-size: 1.2em;
            margin-right: 15px;
            text-decoration: none;
            color: white; /* Changed color to white */
            font-weight: bold;
            transition: color 0.3s;
        }

        .auth-links a:hover {
            color: #9575cd; /* Hover color remains as purple */
        }

        .container {
            background-color: rgba(255, 255, 255, 0.9);
            border-radius: 15px;
            padding: 40px;
            box-shadow: 10px 30px 155px rgba(0, 0, 0, 0.3);
            margin-top: 150px;
            width: 600px; /* Adjusted width */
            max-width: 90%; /* Responsive width */
            margin-left: auto; /* Center horizontally */
            margin-right: auto; /* Center horizontally */
        }

        h1 {
            font-size: 2.8rem;
            margin-bottom: 20px;
            color: #512da8;
            font-weight: bold;
        }

        p {
            font-size: 1.2em;
            color: #3f51b5;
        }

        footer {
            margin-top: 50px;
            text-align: center;
            color: #d1c4e9;
            font-size: 1em;
            padding: 10px;
            background-color: rgba(63, 81, 181, 0.7);
        }

        footer p {
            margin: 0;
        }
    </style>
</head>
<body>

    <!-- Header -->
    <div class="header">
        <div class="logo">
            <img src="https://th.bing.com/th?id=OIP.5W588qZyeMAuWUs1PAIKyAAAAA&w=250&h=250&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2" alt="Logo">
        </div>
        <div class="auth-links">
            <a href="signup.jsp" class="signup-link">SignUp</a>
            <a href="signin.jsp" class="signin-link">SignIn</a>
            <a class="nav-link" href="signUpAgain">SignUpAgain</a>
        </div>
    </div>

    <!-- Body Content -->
    <div class="container text-center">
        <h1>Welcome to X-workz</h1>
        <p>Registration for Java classes for any graduates in any stream</p>
        <p> we are Experienced Trainers</p>
         <p> we are Experienced Trainers</p>
         <p> we are software Trainers</p>
         <p> we are working proffessionals</p>

   <!-- </div>
    <div class= " Teaching stuff">
    <h1> We Teach</h1>
    <p> Java, Spring, MySQL,Js,HTML,CSs,Hibernate,Github</p>
    </div>-->


    <!-- Scripts -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.4.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
