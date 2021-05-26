package com.onlinegame.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionUtil extends CommonUtil {

	private static Connection connection;
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		/*
		 * This create new connection objects when connection is closed or it is
		 * null
		 */
		if (connection == null || connection.isClosed()) {

			Class.forName(properties.getProperty("driverName"));
			connection = DriverManager.getConnection(properties.getProperty("url"),	
					                                 properties.getProperty("username"), 
					                                 properties.getProperty("password"));
		}
		return connection;
	}
}
