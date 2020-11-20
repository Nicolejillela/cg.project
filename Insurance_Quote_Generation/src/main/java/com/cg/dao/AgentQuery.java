package com.cg.dao;



	public interface AgentQuery{


		
		 
		 String USER_EXISTS_IN_ACCOUNT = "select username from accounts where username = ?";
		 
		 String ACCOUNT_CREATION = "insert into accounts values(?,?,?,?,?,?,?,?)";
		 
		 String VALIDATE_ACCOUNT_QUERY ="select * from accounts where username = ?";
		 

		String VALIDATE_ACCOUNT = "select * from accounts where accountnumber = ?";

		String GET_ACCOUNT_DETAILS = "select * from accounts where accountnumber = ?";
		


	

}
