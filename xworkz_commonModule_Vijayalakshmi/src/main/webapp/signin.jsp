<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url('data:image/jpeg;base64,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') no-repeat center center fixed;
            background-size: cover;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .signin-form {
            background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent white background */
            color: #333;
            border-radius: 10px;
            padding: 20px 30px;
            width: 350px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .signin-form h2 {
            margin-bottom: 20px;
        }

        .signin-form label {
            display: block;
            text-align: left;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .signin-form input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }

        .signin-form button {
            width: 100%;
            padding: 10px;
            background-color: #9575cd;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .signin-form button:hover {
            background-color: #7e57c2;
        }

        .signin-form a {
            text-decoration: none;
            color: #9575cd;
            font-size: 14px;
        }

        .signin-form a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="signin-form">
        <h2>Sign In</h2>
        <form action="#" method="post">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            <button type="submit">Sign In</button>
            <p><a href="#">Forgot Password?</a></p>
        </form>
    </div>
</body>
</html>
