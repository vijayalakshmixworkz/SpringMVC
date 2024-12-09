<html>
<head>
    <title>Passport Registration Form</title>
</head>
<body>
    <h1>Passport Registration Form</h1>
    <form action="/pass" method="post">
        <label for="applicationType">Register to apply at:</label>
        <select id="applicationType" name="applicationType" required>
            <option value="">-- Select --</option>
            <option value="cpvDelhi">CPV Delhi</option>
            <option value="passportOffice">Passport Office</option>
        </select>
        <p>Select the 'CPV Delhi' option to apply for Diplomatic/Official passport at Consular, Passport and Visa (CPV) division, Delhi.</p>
        <br>

        <label for="passportOffice">Passport Office (As per Present Residential Address):</label>
        <select id="passportOffice" name="passportOffice" required>
            <option value="">-- Select --</option>
            <option value="delhi">Delhi</option>
            <option value="other">Other</option>
        </select>
        <p>Tibetan Refugees applying for Identity Certificate must register with 'Delhi' Passport Office.</p>
        <br>

        <label for="givenName">Given Name (Max 45 Characters):</label>
        <input type="text" id="givenName" name="givenName" maxlength="45" placeholder="First Name + Middle Name" required>
        <p>Initials and honorifics (e.g. Dr., Col., etc.) are not allowed.</p>
        <br>

        <label for="surname">Surname (Max 45 Characters):</label>
        <input type="text" id="surname" name="surname" maxlength="45">
        <br><br>

        <label for="dob">Date of Birth (DD/MM/YYYY):</label>
        <input type="date" id="dob" name="dob" required>
        <p>Provide the date in DD/MM/YYYY format.</p>
        <br>

        <label for="email">E-mail Id (Max 35 Characters):</label>
        <input type="email" id="email" name="email" maxlength="35" required>
        <br><br>

        <label for="useEmailAsLogin">Do you want your Login Id to be same as E-mail Id?</label>
        <input type="radio" id="loginYes" name="useEmailAsLogin" value="yes" required> Yes
        <input type="radio" id="loginNo" name="useEmailAsLogin" value="no" required> No
        <br><br>

        <label for="loginId">Login Id:</label>
        <input type="text" id="loginId" name="loginId" required>
        <button type="button">Check Availability</button>
        <br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <a href="#">Password Policy</a>
        <br><br>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>
        <br><br>

        <label for="hintQuestion">Hint Question:</label>
        <select id="hintQuestion" name="hintQuestion" required>
            <option value="">-- Select --</option>
            <option value="birthCity">What is the city of your birth?</option>
            <option value="petName">What is your pet's name?</option>
            <option value="schoolName">What was the name of your first school?</option>
        </select>
        <br><br>

        <label for="hintAnswer">Hint Answer:</label>
        <input type="text" id="hintAnswer" name="hintAnswer" required>
        <br><br>

        <button type="submit">Register</button>
    </form>
</body>
</html>
