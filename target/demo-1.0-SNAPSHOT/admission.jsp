<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admission letter</title>
    <link rel="stylesheet" href="css/addmission.css">
</head>
<body>

<div class="section">
  <h2>Admission letter </h2>
  <div class="mid-6">
    <label>First Name:</label><br><br>
    <label>Last Name:</label><br><br>
    <label>Email:</label><br><br>
    <label>Password:</label><br><br>
    <label>phone:</label><br><br>
    <label>Address:</label><br><br>
    <label>City:</label><br><br>
    <label>STate:</label><br><br>

    <p>Thank you for believing in us, We are happy to be with you!!!</p>
  </div>
  <div class="mid-7">
    <label> <%= request.getAttribute("fname") %> </label><br><br>
    <label> <%= request.getAttribute("lname") %> </label><br><br>
    <label> <%= request.getAttribute("email") %> </label><br><br>
    <label> <%= request.getAttribute("pass") %> </label><br><br>
    <label> <%= request.getAttribute("phone") %> </label><br><br>
    <label> <%= request.getAttribute("address") %> </label><br><br>
    <label> <%= request.getAttribute("city") %> </label><br><br>
    <label> <%= request.getAttribute("state") %> </label><br><br>
  </div>
</div>

</body>
</html>