<%--
  Created by IntelliJ IDEA.
  User: HP-
  Date: 18/02/2024
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/sign.css">
    <title>Document</title>
</head>
<body>

<section>
    <div class="imgae">
        <a href="index.html"><img src="img/back-arrow.png" alt=""></a>
    </div>
    <div class="login-box">
        <form action="signup" method="post">
            <h2>Sign UP Form</h2>
            <div class="input-box">
                <span class="icon"><ion-icon name="lock-user"></ion-icon></span>
                <input type="text" name="username" required>
                <label >Username</label>
            </div>
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
                </label>
            </div>
            <button type="submit">Sign Up</button>
            <div class="register-link">
                <p>Already have an account? <a href="Login.jsp">Login</a></p>
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