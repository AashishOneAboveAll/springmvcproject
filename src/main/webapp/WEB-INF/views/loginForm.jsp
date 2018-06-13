<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" />
<title>Insert title here</title>

<script src='https://www.google.com/recaptcha/api.js'></script>
</head>



<link rel="stylesheet" href="resources/css/style.css">
<body>


	<div class="login">
		<div class="login-triangle"></div>

		<h2 class="login-header">Log in</h2>

		<form class="login-container" action="login" method="post">
		<p style="color:red">${error}</p>
			<p>
				<input type="text" placeholder="username" name="username">
			</p>
			<p>
				<input type="password" placeholder="Password" name="password">
			</p>
			
			<div class="g-recaptcha" data-sitekey="6LdJx10UAAAAAHpZZeCcflO5I-mytiIOoNyeA7mN"></div>
			
			<p>
				<input type="submit" value="Log in">
			
			</p>
				<center><a href = "facebook"><i class = "fa fa-facebook-square"></i> Login with Facebook</a></center>
		</form>
	</div>

	
	
</body>
</html>