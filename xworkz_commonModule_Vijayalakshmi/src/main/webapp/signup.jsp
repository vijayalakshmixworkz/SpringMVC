<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('background.jpg') no-repeat center center fixed;
            background-size: cover;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .signup-form {
            background-color: rgba(255, 255, 255, 0.9); /* Transparent white background */
            color: #333;
            border-radius: 10px;
            padding: 20px 30px;
            width: 400px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .signup-form h2 {
            margin-bottom: 20px;
        }

        .signup-form label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .signup-form input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .signup-form button {
            width: 100%;
            padding: 10px;
            background-color: #9575cd;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .signup-form button:hover {
            background-color: #7e57c2;
        }
    </style>
</head>
<body>
    <div class="signup-form">
        <h2>Sign Up</h2>
        <form action="signup" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your name" required onchange="onNameChange()">
            <span id="displayName" style:"color= red"></span>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required onchange="onEmailChange()">
            <span id="displayEmail" style:"color= red"></span>

            <label for="alternative_email">Alternate Email:</label>
            <input type="email" id="alt-email" name="alternative_email" placeholder="Enter your alternate email" required onchange="onAltEmailChange()">
            <span id="displayAltEmail" style:"color= red"></span>

            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" placeholder="Enter your phone number" required onchange="onPhoneChange()">
            <span id="displayPhone" style:"color= red"></span>

            <label for="alternative_phone">Alternate Phone Number:</label>
            <input type="tel" id="alt-phone" name="alternative_phone" placeholder="Enter your alternate phone number"required onchange="onAltPhoneChange()">
            <span id="displayAltPhone" style:"color= red"></span>


                <label for="location" >Location:</label>
                <select id="location" name="location">
                               <option value=""> select the option</option>
                               <c:forEach items="${locationListSend}" var="location">
                               <option value="${location}"> ${location}</option>
                               </c:forEach>
                               </select>

            <button type="submit">Sign Up</button>
        </form>
        ${message}
    </div>
    <!-- JavaScript Functions -->
            <script>
                function onNameChange() {
                    var name = document.getElementById('name').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/name/" + name, true);
                    xhttp.send();
                    xhttp.onload=function(){
                    document.getElementById("displayName").innerHTML=this.responseText;
                }
                }

                function onEmailChange() {
                    var email = document.getElementById('email').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/email/" + email, true);
                    xhttp.send();
                     xhttp.onload=function(){
                                        document.getElementById("displayEmail").innerHTML=this.responseText;
                                    }
                }

                function onAltEmailChange() {
                    var altEmail = document.getElementById('alt-email').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/altEmail/" + altEmail, true);
                    xhttp.send();
                     xhttp.onload=function(){
                                        document.getElementById("displayAltEmail").innerHTML=this.responseText;
                                    }
                }

                function onPhoneChange() {
                    var phone = document.getElementById('phone').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/phone/" + phone, true);
                    xhttp.send();
                     xhttp.onload=function(){
                                        document.getElementById("displayPhone").innerHTML=this.responseText;
                                    }
                }

                function onAltPhoneChange() {
                    var altPhone = document.getElementById('alt-phone').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/altPhone/" + altPhone, true);
                    xhttp.send();
                     xhttp.onload=function(){
                                        document.getElementById("displayAltPhone").innerHTML=this.responseText;
                                    }
                }

                function onLocationChange() {
                    var location = document.getElementById('location').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8088/xworkz_commonModule_Vijayalakshmi/location/" + location, true);
                    xhttp.send();
                     xhttp.onload=function(){
                                        document.getElementById("displayLocation").innerHTML=this.responseText;
                                    }
                }
                    </script>

</body>
</html>
