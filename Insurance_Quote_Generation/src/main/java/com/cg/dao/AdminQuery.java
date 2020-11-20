package com.cg.dao;

public  interface AdminQuery {
	
	String VALIDATE_USER_QUERY = "select * from userrole where username = ? and password = ?";
	
	String ADD_USER = "insert into userRole values(?,?,?)";
	
	String ACCOUNT_CREATION = "insert into accounts values(account_number.nextval,?,?,?,?,?,?,?)";
	
	String USER_EXISTS = "select * from userrole where username = ?";
	
	String GET_ACCOUNT_DETAILS = "select * from accounts where accountnumber = ?";
	
	
	
}
