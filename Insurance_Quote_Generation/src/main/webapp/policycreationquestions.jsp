<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

.loginbox {
	width: 730px;
	height: 950px;
	background: rgba(235, 242, 242, 0.7);
	color: black;
	top: 100%;
	left: 50%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	padding: 50px 30px;
	box-shadow: 0 15px 50px rgba(0,0,0,0.3);
}
.loginbox input[type = "radio"] {
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
	height: 30px;
	width: 50%;
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
<div class = "loginbox">
<% int count = 0; %>
<form action = "PremiumGenerationServlet" method = post>
 <c:forEach items = "${questions}" var = "ques">
 		<%count++; %>
		<b><c:out value="${ques.polQuesDesc}"/></b><br>
		<input type = "radio" name = "${ques.polQuesSeq }" value="${ques.polQuesId }!${ques.polQuesAns1}!${ques.polQuesAns1Weightage}"><c:out value="${ques.polQuesAns1}"/><br>
	    <input type = "radio" name = "${ques.polQuesSeq }" value="${ques.polQuesId }!${ques.polQuesAns2}!${ques.polQuesAns2Weightage}"><c:out value="${ques.polQuesAns2}"/><br>
		<input type = "radio" name = "${ques.polQuesSeq }" value="${ques.polQuesId }!${ques.polQuesAns3}!${ques.polQuesAns3Weightage}"><c:out value="${ques.polQuesAns3}"/><br><br>
	</c:forEach>
	<input type="hidden" name = "numofquestions" value="<%=count %>">
	<input type = "submit" value="Create Policy">
  </form>
</div>
  </body>
</html>