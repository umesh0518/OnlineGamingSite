package com.onlinegame.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class CommonUtil {
	
	public static final Properties properties = new Properties();
    // static block so this will be loaded first in this class
	static {
		try {
			// Read the property only once when load the class
			//InputStream input = QueryUtil.class.getResourceAsStream("src\\com\\onlinegame\\util\\config.properties");
			// InputStream input = new FileInputStream("src\\com\\onlinegame\\util\\config.properties");
			//getResourcesasStream is used instead of FileInputStream in webapps
			
			
			// load a properties file
            properties.load(CommonUtil.class.getResourceAsStream("config.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
