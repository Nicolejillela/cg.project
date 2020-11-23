package com.cg.dao;

public interface InsuredQuery {
	
	

		static String ACCOUNT_CREATION = "insert into accounts values(account_number.nextval,?,?,?,?,?,?,?)";
		
		static String VALIDATE_ACCOUNT_QUERY ="select * from accounts where username = ?";

		
		
		static String USER_EXISTS = "select * from userrole where username = ?";
		
		static String GET_ACCOUNT_DETAILS = "select * from accounts where accountnumber = ?";
		
		static String GET_ACCOUNT_NUMBER = "select accountnumber from accounts where username = ? ";
		
		
		
		
	}



