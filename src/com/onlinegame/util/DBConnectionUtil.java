package com.onlinegame.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil extends CommonUtil {

	private static Connection connection;
	

	private DBConnectionUtil() {
		
	}
	
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
	
	
	
//	public static final Properties properties = new Properties();
//    // static block so this will be loaded first in this class
//	static {
//		try {
//			// Read the property only once when load the class
//			InputStream input = new FileInputStream("src\\com\\onlinegame\\util\\config.properties");
//			
//			// load a properties file
//            properties.load(input);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
