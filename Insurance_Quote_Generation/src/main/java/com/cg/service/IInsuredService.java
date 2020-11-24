package com.cg.service;



	import java.util.List;

import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
import com.cg.model.Policy;
import com.cg.model.PolicyQuestions;

	public interface IInsuredService {

		

		
		
			public String getLineOfBusinessIdByName(String busSegName) throws QGSException;

			boolean isUserExists(String userName) throws QGSException;

			int accountCreation(Accounts account, String userName) throws QGSException;

			public boolean accountValidation(String username) throws QGSException;

			public int getAccountNumber(String username) throws QGSException;

			public List<Policy> getInsuredPolicies(int accNo) throws QGSException;

			public Accounts getAccountDetails(int accNo) throws QGSException;

			public String getBusSegName(String lineOfBusiness) throws QGSException;

			public Double getPolicyPremium(int polNum) throws QGSException;

			public List<PolicyQuestions> getPolicyQuestions(String lineOfBusiness) throws QGSException;

			public List<String> getSelectedAnswers(int polNum) throws QGSException;

			
			

		}
