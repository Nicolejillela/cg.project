package com.cg.dao;

	
	import java.util.List;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.model.Policy;
	import com.cg.model.PolicyQuestions;
	import com.cg.model.UserRole;

	public interface IAdminDAO {

		public boolean loginValidation(String userName, String password) throws QGSException;
		
		
		
		public int addUser(UserRole userRole) throws QGSException;
		
		

		public boolean isUserExists(String userName) throws QGSException;
		
		public int accountCreation(Accounts account, String userName) throws QGSException;

		
		public Accounts getAccountDetails(Integer accNumber) throws QGSException;
		
		

	}
