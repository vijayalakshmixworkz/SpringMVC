<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-container {
            border: 1px solid #ddd; /* Light border */
            border-radius: 10px; /* Rounded corners */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for shading */
            padding: 20px; /* Space inside the form */
            background-color: #f9f9f9; /* Light background color */
            max-width: 500px; /* Limit form width */
            margin: 20px auto; /* Center form on the page */
        }

        .error {
            color: red;
            font-size: 12px;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h3 class="text-center mb-4">Sign up</h3>
    <form action="signupact" method="post" onsubmit="return validateForm()">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name" oninput="validateName()">
            <p id="nameError" class="error" style="display: none;">Name should be at least 10 characters long.</p>
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" class="form-control" id="age" name="age" placeholder="Enter your age">
            <p id="ageError" class="error" style="display: none;">Age should be greater than 18.</p>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email">
            <p id="emailError" class="error" style="display: none;">Please enter a valid Gmail address.</p>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password">
            <p id="passwordError" class="error" style="display: none;">Password should be at least 7 characters long and contain special characters.</p>
        </div>
        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm your password">
            <p id="confirmPasswordError" class="error" style="display: none;">Passwords should match.</p>
        </div>
        <div class="mb-3">
            <label for="phonenumber" class="form-label">Phone Number</label>
            <input type="tel" class="form-control" id="phonenumber" name="phonenumber" placeholder="Enter your phone number">
            <p id="phoneError" class="error" style="display: none;">Phone number should start with 9 and contain 10 digits.</p>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>

<script>
    function validateName() {
        const nameField = document.getElementById('name');
        const nameError = document.getElementById('nameError');

        if (nameField.value.length < 10) {
            nameError.style.display = 'block';
        } else {
            nameError.style.display = 'none';
        }
    }

    function validateForm() {
        let isValid = true;

        const nameField = document.getElementById('name');
        const nameError = document.getElementById('nameError');
        if (nameField.value.length < 10) {
            nameError.style.display = 'block';
            isValid = false;
        } else {
            nameError.style.display = 'none';
        }


        return isValid;
    }
</script>
</body>
</html>