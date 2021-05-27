package com.onlinegame.service;
import com.onlinegame.model.Player;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;



public interface IUserServices {
	
	public void addUser(Player player) throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException;
	
	

}
