package com.cg.dao;

import com.cg.Exception.QGSException;
import com.cg.model.Accounts;
import com.cg.model.Policy;
import com.cg.model.UserRole;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.AbstractList;

public interface IAdminDAO<PolicyQuestions> {
	
public boolean loginValidation(String userName, String password) throws QGSException;
	
	public String getRoleCode(String userName, String password) throws QGSException;
	
	public int addUser(UserRole userRole) throws QGSException;
	
	public String getLineOfBusinessIdByName(String lineOfBusinessName) throws QGSException;

	public boolean isUserExists(String userName) throws QGSException;
	
	public int accountCreation(Accounts account, String userName) throws QGSException;

	
	public String getBusSegId(int accNumber) throws QGSException;
	
	public List getPolicyQuestions(String busSegId) throws QGSException;
	
	public Integer createPolicy(Policy policy) throws QGSException;
	
	public Integer getPolicyNumber() throws QGSException;
	
	public void addPolicyDetails(int polNumber, List questionIds, List selectedAnswers) throws QGSException;
	
	public List getPolicies() throws QGSException;
	
	public Accounts getAccountDetails(Integer accNumber) throws QGSException;
	
	public String getBusSegName(String busSegId) throws QGSException;

	public Double getPolicyPremium(Integer polNum) throws QGSException;

	public List getSelectedAnswers(int polNum) throws QGSException;

	public Integer getPolicyPremiumAmount(Integer sumOfWeightages) throws QGSException;

}



