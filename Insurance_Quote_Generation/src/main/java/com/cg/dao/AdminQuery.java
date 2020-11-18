package com.cg.dao;

public class AdminQuery {

String VALIDATE_USER_QUERY = "select * from UserRole where UserName = ? and Password = ?";
	
	String GET_ROLECODE = "select RoleCode from UserRole where UserName = ? and Password = ?";
	
	String ADD_USER = "insert into UserRole values(?,?,?)";
	
	String ACCOUNT_CREATION = "insert into Accounts values(Account_Number.nextval,?,?,?,?,?,?,?)";
	
	String GET_LOB_NAME = "select Bus_Seg_Id from BusinessSegment where Bus_Seg_Name = ?";
	
	String USER_EXISTS = "select * from UserRole where UserName = ?";
	
	
	
}

