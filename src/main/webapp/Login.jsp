<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
    <title>Document</title>
</head>
<body>

<section>
    <div class="imgae">
        <a href="index.html"><img src="img/back-arrow.png" alt=""></a>
    </div>
    <div class="login-box">
        <form action="Login" method="post">
            <h2>Login Form</h2>
            <div class="input-box">
                <span class="icon"><ion-icon name="mail"></ion-icon></span>
                <input type="email" name="email" required>
                <label >Email</label>
            </div>
            <div class="input-box">
                <span class="icon"><ion-icon name="lock-closed"></ion-icon></span>
                <input type="password" name="password" required>
                <label >Password</label>
            </div>
            <div class="remember-forgot">
                <label>
                    <input type="checkbox">Remember me
                    <a href="#">forgot password?</a>
                </label>
            </div>
            <button type="submit">Login</button>
            <div class="register-link">
                <p>Already have an account? <a href="login.jsp">Register Here</a></p>
                <p><% Object resultAttribute = request.getAttribute("result");
                    if (resultAttribute != null){%>
                    <%= resultAttribute %>
                    <%
                        }
                    %></p>
            </div>
        </form>
    </div>
</section>
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

</body>
</html>