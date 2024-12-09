< html>
<head>
    <title>Bank Account Form</title>
</head>
<body>
    <h1>Bank Account Registration Form</h1>
    <form action="/submit" method="POST">
        Account Holder Name<br>
        <input type="text" id="accountHolderName" name="accountHolderName" required><br><br>

        Account Number<br>
        <input type="number" id="accountNumber" name="accountNumber" ><br><br>

        Account Balance<br>
        <input type="number" id="accountBalance" name="accountBalance" ><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
