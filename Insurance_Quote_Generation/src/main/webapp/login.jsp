<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>First Login Page</title>
<style>
body {
	margin: 0;
	padding: 0;
	background: url("loginBackground.jpg");
	background-size: cover;
	background-position: center;
	font-family: sans-serif;
}
	.adminHP {
			width: 590px;
			height: 590px;
			background: none;
			color: black;
			top: 290px;
			left: 293px;
			position: absolute;
			transform: translate(-50%, -50%);
		}

		.header {
			background-color: black;
			width:327%;
			height: 17%;
		}
		.header a {
			float:left;
			color: white;
			background-color: rgba(117, 149, 199, 0.4);
			cursor: pointer;
			text-align: right;
			padding: 35px 40px;
			text-decoration: none;
			font-size: 25px;
			top:250px;
			left:100px;
			border: none;
		}
		.header-right {
			float: right;
			left: 110px;
		}

		.header a:hover {
			background-color: #ddd;
			color: black;
			
		}
		

.loginbox {
	width: 330px;
	height: 370px;
	background: rgba(235, 242, 242, 0.7);
	color: black;
	top: 80%;
	left: 160%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	padding: 50px 30px;
	box-shadow: 0 15px 50px rgba(0,0,0,0.3);
}

.avtaar {
	width: 100px;
	heigth: 100px;
	border-radius: 10%;
	position: absolute;
	top: -50px;
	left: calc(50% - 50px);	
}

h1 {  
	margin: 0;
	padding: 15 0 20px;
	text-align: center;
	font-size: 25px;
}

.loginbox p {
	margin: 0;
	padding: 0;
	font-weight: bold;
}

.loginbox input[type = "text"], input[type = "password"] {
	border: none;
	width: 100%;
	border-bottom: 1px solid black;
	background: transparent;
	outline: none;
	height: 22px;
	color: black;
    font-size: 16px;
	padding: 0px;
	margin: 10px 10 10px 0;
}



.loginbox input[type = "submit"] {
	border: none;
	outline: none;
	height: 40px;
	width: 100%;
	background: black;
	color: #fff;
	font-size: 18px;
	border-radius: 15px;
}

.loginbox input[type = "submit"]:hover {
	cursor: pointer;
	background: #708090;
	color: white;
}
</style>
</head>

<body>
	<div class="adminHP">		
		<div class="header">		
			<a href="index.html" class="logo"></a>
			<div class="header-right">
			 <a href="index.html" class="logo">Home</a>
			</div>			
		</div>
	<div class = "loginbox">
	<img src = "avtaar.png" class = "avtaar">
		<h1>Login</h1>

		
		<form action = "LoginServlet" method = "post">
			<p>User Name</p>
			<input type = "text" name = "username" required>
			<p>Password</p>
			<input type = "password" name = "password" required>
			<br><br><br>
			<input type = "submit" name = "submit" value = "Login">
		</form>		
	</div>
	
</body>

</html>