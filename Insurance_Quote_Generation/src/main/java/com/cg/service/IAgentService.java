package com.cg.service;



import com.cg.Exception.QGSException;
import com.cg.model.Accounts;

public interface IAgentService {

	

	public boolean isUserExists(String userName) throws QGSException;

	public int accountCreation(Accounts account, String userName) throws QGSException;

	public boolean accountValidation(String userName) throws QGSException;

	public boolean isAccountExists(int accNumber) throws QGSException;


	public Accounts getAccountDetails(int accNumber) throws QGSException;


}
