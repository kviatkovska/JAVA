<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Successful login page</title>
</head>
<body>
<br>
<h1>User login successfully</h1>
<jsp:useBean id="user" class="edu.servletsexample.models.User" scope="application"/>
User: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Address: <%= user.getAddress()%><br>
Phone: <%= user.getPhone()%><br>
</body>
</html>