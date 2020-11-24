package com.cg.dao;



	import java.util.List;

	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.model.Policy;
	import com.cg.model.PolicyQuestions;

	public interface IInsuredDAO {

		
			public boolean accountValidation(String username) throws QGSException;
			
			public String getLineOfBusinessIdByName(String lineOfBusinessName) throws QGSException;

			public boolean isUserExists(String userName) throws QGSException;
			
			public int accountCreation(Accounts account, String userName) throws QGSException;
			
			public List<Policy> getInsuredPolicies(int accNo) throws QGSException;
			
			public int getAccountNumber(String username) throws QGSException;
			
			public Accounts getAccountDetails(Integer accNo) throws QGSException;
			
			public String getBusSegName(String lineOfBusiness) throws QGSException;
			
			public Double getPolicyPremium(Integer polNum) throws QGSException;
			
			public List<PolicyQuestions> getPolicyQuestions(String lineOfBusiness) throws QGSException;
			
			public List<String> getSelectedAnswers(Integer polNum) throws QGSException;


		}
