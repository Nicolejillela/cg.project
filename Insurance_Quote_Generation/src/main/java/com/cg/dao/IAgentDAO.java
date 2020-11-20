package com.cg.dao;

import com.cg.Exception.QGSException;
import java.sql.ResultSet;
import java.util.List;

import com.cg.Exception.QGSException;
import com.cg.model.Accounts;
import com.cg.model.Policy;
import com.cg.model.PolicyQuestions;

public interface  IAgentDAO {
	

	public boolean isUserExists(String userName) throws QGSException;

	public int accountCreation(Accounts account, String userName) throws QGSException;
	
	public boolean accountValidation(String userName) throws QGSException;

	public boolean isAccountExists(int accNumber) throws QGSException;

	

	public Accounts getAccountDetails(int accNumber) throws QGSException;

	
}

                        


