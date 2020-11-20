package com.cg.service;


	import com.cg.dao.AgentDAO;
	import com.cg.dao.IAgentDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;

	public class AgentService implements IAgentService {

		IAgentDAO agentDao = new AgentDAO();
		
		

		
		public boolean isUserExists(String userName) throws QGSException {
			// TODO Auto-generated method stub
			return agentDao.isUserExists(userName);
		}

		
		public int accountCreation(Accounts account, String userName) throws QGSException {
			// TODO Auto-generated method stub
			return agentDao.accountCreation(account, userName);
		}

		
		public boolean accountValidation(String userName) throws QGSException {
			// TODO Auto-generated method stub
			return agentDao.accountValidation(userName);
		}

		
		public boolean isAccountExists(int accNumber) throws QGSException {
			// TODO Auto-generated method stub
			return agentDao.isAccountExists(accNumber);
		}

		
		
		
		public Accounts getAccountDetails(int accNumber) throws QGSException {
			
			return agentDao.getAccountDetails(accNumber);
		}



}
