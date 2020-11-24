package com.cg.dao;

	
	import java.util.List;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.model.Policy;
	import com.cg.model.PolicyQuestions;
	import com.cg.model.UserRole;

	public interface IAdminDAO {

		

			public boolean loginValidation(String userName, String password) throws QGSException;
			
			public String getRoleCode(String userName, String password) throws QGSException;
			
			public int addUser(UserRole userRole) throws QGSException;
			
			public String getLineOfBusinessIdByName(String lineOfBusinessName) throws QGSException;

			public boolean isUserExists(String userName) throws QGSException;
			
			public int accountCreation(Accounts account, String userName) throws QGSException;

			
			public String getBusSegId(int accNumber) throws QGSException;
			
			public List<PolicyQuestions> getPolicyQuestions(String busSegId) throws QGSException;
			
			public Integer createPolicy(Policy policy) throws QGSException;
			
			public Integer getPolicyNumber() throws QGSException;
			
			public void addPolicyDetails(int polNumber, List<String> questionIds, List<String> selectedAnswers) throws QGSException;
			
			public List<Policy> getPolicies() throws QGSException;
			
			public Accounts getAccountDetails(Integer accNumber) throws QGSException;
			
			public String getBusSegName(String busSegId) throws QGSException;

			public Double getPolicyPremium(Integer polNum) throws QGSException;

			public List<String> getSelectedAnswers(int polNum) throws QGSException;

			public Integer getPolicyPremiumAmount(Integer sumOfWeightages) throws QGSException;

		}
