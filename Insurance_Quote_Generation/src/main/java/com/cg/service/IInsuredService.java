package com.cg.service;



	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;

	public interface IInsuredService {

		

		boolean isUserExists(String userName) throws QGSException;

		int accountCreation(Accounts account, String userName) throws QGSException;

		public boolean accountValidation(String username) throws QGSException;

		public int getAccountNumber(String username) throws QGSException;

		

		public Accounts getAccountDetails(int accNo) throws QGSException;

	


}
