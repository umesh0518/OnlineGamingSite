package com.onlinegame.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.onlinegame.model.Player;
import com.onlinegame.util.DBConnectionUtil;
import com.onlinegame.util.QueryUtil;

public class UserServiceImplementation implements IUserServices{

	private static Connection connection;

	private static Statement statement;
	
	private PreparedStatement preparedStatement;
	
	@Override
	public void addUser(Player player) throws SQLException, ParserConfigurationException, SAXException, IOException{
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			preparedStatement = connection.prepareStatement(QueryUtil.executeQueryById("add_user"));
			//preparedStatement = connection.prepareStatement("insert into user_ (firstName, lastName, email, gender, dob, password) values (?, ?, ?, ?, ?, ?) ");
			preparedStatement.setString(1, player.getfName());
			preparedStatement.setString(2, player.getlName());
			preparedStatement.setString(3, player.getEmail());
			preparedStatement.setString(4, player.getGender());
			preparedStatement.setString(5, player.getDOB());
			preparedStatement.setString(6, player.getPassword());
			
			preparedStatement.executeUpdate();
			
		
			
			
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
