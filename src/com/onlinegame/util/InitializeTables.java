package com.onlinegame.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class InitializeTables {
	
	private static Connection connection;
	private static Statement statement;
	
	public static void initializeTables() throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException {
		
		connection = DBConnectionUtil.getDBConnection();
		statement = connection.createStatement();
		
		// drop all tables then create new ones 
		statement.execute(QueryUtil.executeQueryById("drop_table_leaderboard"));
		statement.execute(QueryUtil.executeQueryById("drop_table_game"));
		statement.execute(QueryUtil.executeQueryById("drop_table_forum"));
		statement.execute(QueryUtil.executeQueryById("drop_table_product"));
		statement.execute(QueryUtil.executeQueryById("drop_table_admin"));
		statement.execute(QueryUtil.executeQueryById("drop_table_player"));
		statement.execute(QueryUtil.executeQueryById("drop_table_gameseller"));
		statement.execute(QueryUtil.executeQueryById("drop_table_user_"));
		
		// create initialization table 
		statement.execute(QueryUtil.executeQueryById("create_user_table"));
		statement.execute(QueryUtil.executeQueryById("create_player_table"));
		statement.execute(QueryUtil.executeQueryById("create_gameseller_table"));
		statement.execute(QueryUtil.executeQueryById("create_game_table"));
		statement.execute(QueryUtil.executeQueryById("create_admin_table"));
		statement.execute(QueryUtil.executeQueryById("create_forum_table"));
		statement.execute(QueryUtil.executeQueryById("create_product_table"));
		statement.execute(QueryUtil.executeQueryById("create_leaderboad_table"));
		
		//close connection
		connection.close();
	}
	
	
}
