package com.onlinegame.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
/*///////////////////////////////////////////////



This is for test delete this later




///////////////////////////////////////////////////*/
public class main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//File directory = new File("./");
		//System.out.println(directory.getAbsolutePath());
		
		
		 try  {
                // initializing all the tables in database
	    		 InitializeTables.initializeTables();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
		
	}

}
