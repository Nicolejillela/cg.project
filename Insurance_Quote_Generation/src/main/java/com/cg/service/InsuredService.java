package com.cg.service;



	import com.cg.dao.IInsuredDAO;
	import com.cg.dao.InsuredDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;

	public class InsuredService implements IInsuredService{

		IInsuredDAO insuredDao = new InsuredDAO();
	

		
		
		public boolean isUserExists(String userName) throws QGSException {
			// TODO Auto-generated method stub
			return insuredDao.isUserExists(userName);
		}

		
		public int accountCreation(Accounts account, String userName) throws QGSException {
			// TODO Auto-generated method stub
			return insuredDao.accountCreation(account, userName);
		}


		
		public boolean accountValidation(String username) throws QGSException {
			// TODO Auto-generated method stub
			return insuredDao.accountValidation(username);
		}


		
		public int getAccountNumber(String username) throws QGSException {
			// TODO Auto-generated method stub
			return insuredDao.getAccountNumber(username);
		}


		
		public Accounts getAccountDetails(int accNo) throws QGSException {
			// TODO Auto-generated method stub
			return insuredDao.getAccountDetails(accNo);
		}



}
