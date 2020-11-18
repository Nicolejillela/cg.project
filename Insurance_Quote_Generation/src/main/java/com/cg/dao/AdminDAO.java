package com.cg.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import com.cg.Exception.QGSException;
	

	public class AdminDAO implements IAdminDAO{

		static Connection connection = null;
		static PreparedStatement prepareStatement = null;
		static ResultSet resultSet = null;

		
		
		
		public boolean loginValidation(String username, String password) throws QGSException {
		
		}
	}

