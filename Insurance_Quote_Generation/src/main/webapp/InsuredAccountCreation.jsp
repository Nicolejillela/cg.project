<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Account Creation</title>
<style>
 

.adminHP {
			width: 38%;
			height: 95%;
			background: none;
			position: absolute;
			top: 47%;
			left: 19%;
			transform: translate(-50%, -50%);
		}
		.header {
			background-color: rgba(28, 22, 23, 1);
			width:263%;
			height: 11%;
			
		}
		.header button {
			float:left;
			color: white;
			margin: 2px;
			
			cursor: pointer;
			text-align: right;
			padding: 20px 30px;
			text-decoration: none;
			font-size: 120%;
			position: relative;
			top:7%;
			left:0%;
			border: none;
		}
		.header-right {
			float: right;
			top:-17%;
			right : 0%;
			border: none;
			position: relative;
			padding: 20px 0px
			
		}
		.header button:hover {
			
			color: black;
			
		}


.accountbox {
	width: 580px;
	height: 750px;
	background: rgba(235, 242, 242, 0.7);
	color: black;
	top: 52%;
	left: 50%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	padding: 60px 30px;
	box-shadow: 0 15px 25px rgba(0,0,0,0.3);
}

h1 {
	margin: 0;
	padding: 15 0 20px;
	text-align: center;
	font-size: 35px;
}

.accountbox p {
	margin: 0;
	padding: 0;
	font-weight: bold;
}

.accountbox input[type = "text"] {
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

.accountbox select {
	width: 100%;
	height: 30px;
	background: transparent;
	border: 1px solid black;
	cursor: pointer;
}

.accountbox input[type = "submit"] {
	border: none;
	outline: none;
	height: 30px;
	width: 50%;
	background: black;
	color: #fff;
	font-size: 18px;
	border-radius: 15px;
}

.accountbox input[type = "submit"]:hover {
	cursor: pointer;
	background: #708090;
	color: white;
}

</style>
</head>

<body>


<div class="adminHP">
		<div class="header">
			
			<div class="header-right">
				<button class="active" href="homepage2new.html"></button>
			</div>
		</div>
		</div>

	<div class = "accountbox">
	<h1>Account Creation</h1>
	<br>
	<form action = "AccountCreationServlet" method = "post">
		<p>User Name</p>
		<input type = "text" name = "userName"   required>
		<p>Insured Name</p>
		<input type = "text" name = "insuredName"  required>
		<p>Insured Street</p>
		<input type = "text" name = "insuredStreet"  required>
		<p>Insured City</p>
		<input type = "text" name = "insuredCity"  required>
		<p>Insured State</p>
		<input type = "text" name = "insuredState"   required>
		<p>Insured zip</p>
		<input type = "text" name = "insuredZip" required><br><br>
		<p>Business Segment</p>
		<br><select name = "busSegName">
			<option value = "Business Auto">Business Auto</option>
			<option value = "Restaurant">Restaurant</option>
			<option value = "Apartment">Apartment</option>
			<option value = "General Merchant">General Merchant</option>
			<!-- <option value = "life">Life</option> -->
		</select><br><br><br><br>
		<center><input type = "submit" name = "submit" value = "Create Account"></center>
	</form>
</body>

</html>