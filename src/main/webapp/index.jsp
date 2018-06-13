<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
				<a href="facebook">Login With Facebook</a>
			</p>
		</form>
	</div>

	
	
</body>
</html>