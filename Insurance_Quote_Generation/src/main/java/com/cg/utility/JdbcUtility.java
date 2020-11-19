package com.cg.utility;



	
	import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.cg.Exception.QGSException;

import oracle.jdbc.OracleDriver;

//This class is used to get the connection object
public class JdbcUtility {
	
	private static Connection connection = null;

	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static Connection getConnection() throws QGSException {
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			connection = DriverManager.getConnection(url, "system", "123");
			System.out.println("connected");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new QGSException("Error occurred in connecting to database"+e.getMessage());
		}
		return connection;
	}
}


