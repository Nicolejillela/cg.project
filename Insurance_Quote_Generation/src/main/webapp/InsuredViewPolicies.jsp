

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
		
		
		body {
			overflow: hidden;
			margin: 0;
			padding: 0;
			background: url("pic6.jpg");
			background-size: cover;
			background-position: center;
		}
	
	
 	.container{ 
		width: 100%;
		
	}
	.container th {
		background-color: #412252;	
		opacity: 0.8;
  		color:white;		
	}
	.container table {
		position: absolute;
		top: 15%;
		left: 20%;
		background-color: #ced2cc;
		border-style:none;		
	}
	.container tr {
		background-color: #ced2cc;
		color: black;
	}
	
		
		.table {
			height: 70px;
			width: 900px; 
			text-align:center;
			font-family:"Times New Roman";
			overflow:scroll;
			
		}
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
			background-color: #ddd;
			color: black;
			
		}
		
</style>

</head>
<body>

	<div class="adminHP">
		
		</div>
	
	<div class = "container">
	
	
	<table class = "table" cellpadding="20px" border="0px">
		<th>Policy Number
		<th>Policy Premium
		<th>
		<c:forEach items="${policies}" var="policy">
			<tr class = "tr">
				<td><c:out value="${policy.policyNumber}" /><br>
				<td><c:out value="${policy.policyPremium}" /><br>
				<td><a href="InsuredReportGenerationServlet?accNumber=${policy.accNumber}&polNumber=${policy.policyNumber}">View Policy</a>
			</tr>
		</c:forEach>
	</table>
	</div>
	
	
</body>
</html>