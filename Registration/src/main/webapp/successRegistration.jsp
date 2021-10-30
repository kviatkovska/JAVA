<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Confirmation page of successful user registration </title>
</head>
<body>
<h1> User registration completed successfully </h1>
<jsp:useBean id="user" class="edu.servletsexample.models.User" scope="application"/>
User: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Address: <%= user.getAddress()%><br>
Phone: <%= user.getPhone()%><br>
Registered.<br><br>
<a href="login.html"> Sign in </a>
</body>
</html>