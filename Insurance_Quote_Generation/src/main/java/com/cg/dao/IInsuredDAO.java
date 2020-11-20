package com.cg.dao;



	import java.util.List;

	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.model.Policy;
	import com.cg.model.PolicyQuestions;

	public interface IInsuredDAO {

		public boolean accountValidation(String username) throws QGSException;
		
		

		public boolean isUserExists(String userName) throws QGSException;
		
		public int accountCreation(Accounts account, String userName) throws QGSException;
		
		
		
		public int getAccountNumber(String username) throws QGSException;
		
		public Accounts getAccountDetails(Integer accNo) throws QGSException;
		
		

	


}
