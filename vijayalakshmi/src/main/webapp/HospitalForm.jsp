<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Form</title>
</head>
<body>
    <h1>Hospital Registration Form</h1>
    <form action="/submit" method="post">
      Patient Name:
        <input type="text" id="patientName" name="patientName" >
        <br><br>

      Age:
        <input type="number" id="age" name="age" min="1" max="120" >
        <br><br>

      Gender:
       <select id="gender" name="gender" >
            <option value="">--Select--</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
       </select>
        <br><br>

       Contact Number:
        <input type="tel" id="contact" name="contact" >

        <br><br>

        Reason for Visit:
        <textarea id="reason" name="reason" rows="4" cols="30" ></textarea>
        <br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
