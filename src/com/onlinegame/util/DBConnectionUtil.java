package com.onlinegame.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.oop.util.CommonConstants;

public class DBConnectionUtil {

	private static Connection connection;
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		/*
		 * This create new connection objects when connection is closed or it is
		 * null
		 */
		if (connection == null || connection.isClosed()) {

			Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
			connection = DriverManager.getConnection(properties.getProperty(CommonConstants.URL),
					properties.getProperty(CommonConstants.USERNAME), properties.getProperty(CommonConstants.PASSWORD));
		}
		return connection;
	}
}
