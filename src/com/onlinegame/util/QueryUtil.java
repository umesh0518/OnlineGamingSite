package com.onlinegame.util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class QueryUtil {
	
public static String executeQueryById(String id) throws ParserConfigurationException, SAXException, IOException {
		
		NodeList nodeList;
		Element element = null;
		// to know what is the current directory java is looking for  
		//File directory = new File("./");
		//System.out.println(directory.getAbsolutePath());

		File xmlfile = new File("WebContent/WEB-INF/allQueries.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    Document doc = dBuilder.parse(xmlfile);
	    doc.getDocumentElement().normalize();
	    nodeList = doc.getElementsByTagName("query");
	    
	    for (int value = 0; value < nodeList.getLength(); value++) {
			element = (Element) nodeList.item(value);
			if (element.getAttribute("id").equals(id))
				break;
		}
		return element.getTextContent().trim();
	}

}
