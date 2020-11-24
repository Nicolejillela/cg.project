package com.cg.service;

import java.util.List;

	import com.cg.dao.AdminDAO;

	import com.cg.dao.IAdminDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.model.Policy;
	import com.cg.model.PolicyQuestions;
	import com.cg.model.UserRole;

	public class AdminService implements IAdminService {

		

			IAdminDAO adminDao = new AdminDAO();
			
			public boolean loginValidation(String username, String password) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.loginValidation(username, password);
			}

			
			public String getRoleCode(String username, String password) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getRoleCode(username, password);
			}

			
			public int addUser(UserRole userRole) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.addUser(userRole);
			}
			
			
			public int accountCreation(Accounts account, String userName) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.accountCreation(account,userName);
			}

			
			public String getLineOfBusinessIdByName(String busSegName) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getLineOfBusinessIdByName(busSegName);
			}

			
			public boolean isUserExists(String userName) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.isUserExists(userName);
			}

			
			public String getBusSegId(int accNumber) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getBusSegId(accNumber);
			}

			
			public List<PolicyQuestions> getPolicyQuestions(String busSegId) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getPolicyQuestions(busSegId);
			}

			
			public int getPolicyPremiumAmount(int sumOfWeightages) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getPolicyPremiumAmount(sumOfWeightages);
			}

			
			public int createPolicy(Policy policy) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.createPolicy(policy);
			}

			
			public int getPolicyNumber() throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getPolicyNumber();
			}

			
			public void addPolicyDetails(int polNumber, List<String> questionIds, List<String> selectedAnswers)
					throws QGSException {
				// TODO Auto-generated method stub
				adminDao.addPolicyDetails(polNumber, questionIds, selectedAnswers);
			}

			
			public List<Policy> getPolicies() throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getPolicies();
			}

			
			public Accounts getAccountDetails(int accNumber) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getAccountDetails(accNumber);
			}

			
			public String getBusSegName(String lineOfBusiness) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getBusSegName(lineOfBusiness);
			}

			
			public Double getPolicyPremium(int polNum) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getPolicyPremium(polNum);
			}

			
			public List<String> getSelectedAnswers(int polNum) throws QGSException {
				// TODO Auto-generated method stub
				return adminDao.getSelectedAnswers(polNum);
			}
			

		}
