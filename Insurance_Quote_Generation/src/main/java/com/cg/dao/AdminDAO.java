package com.cg.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import com.cg.Exception.QGSException;
import com.cg.model.Accounts;
import com.cg.model.Policy;
import com.cg.model.UserRole;
	

	public class AdminDAO implements IAdminDAO{

		static Connection connection = null;
		static PreparedStatement prepareStatement = null;
		static ResultSet resultSet = null;

		
		
		
		public boolean loginValidation(String username, String password) throws QGSException {
			return false;
		
		}




		public String getRoleCode(String userName, String password) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public int addUser(UserRole userRole) throws QGSException {
			// TODO Auto-generated method stub
			return 0;
		}




		public String getLineOfBusinessIdByName(String lineOfBusinessName) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public boolean isUserExists(String userName) throws QGSException {
			// TODO Auto-generated method stub
			return false;
		}




		public int accountCreation(Accounts account, String userName) throws QGSException {
			// TODO Auto-generated method stub
			return 0;
		}




		public String getBusSegId(int accNumber) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public com.sun.xml.internal.bind.v2.schemagen.xmlschema.List getPolicyQuestions(String busSegId)
				throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public Integer createPolicy(Policy policy) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public Integer getPolicyNumber() throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public void addPolicyDetails(int polNumber, com.sun.xml.internal.bind.v2.schemagen.xmlschema.List questionIds,
				com.sun.xml.internal.bind.v2.schemagen.xmlschema.List selectedAnswers) throws QGSException {
			// TODO Auto-generated method stub
			
		}




		public com.sun.xml.internal.bind.v2.schemagen.xmlschema.List getPolicies() throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public Accounts getAccountDetails(Integer accNumber) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public String getBusSegName(String busSegId) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public Double getPolicyPremium(Integer polNum) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public com.sun.xml.internal.bind.v2.schemagen.xmlschema.List getSelectedAnswers(int polNum)
				throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}




		public Integer getPolicyPremiumAmount(Integer sumOfWeightages) throws QGSException {
			// TODO Auto-generated method stub
			return null;
		}
	}

