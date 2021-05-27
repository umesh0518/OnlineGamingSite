package com.onlinegame.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.onlinegame.model.Player;
import com.onlinegame.service.*;


public class AddPlayerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddPlayerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		 response.setContentType("text/html");
		 Player player = new Player();
		 
		 player.setfName(request.getParameter("fname"));
		 player.setlName(request.getParameter("lname"));
		 player.setGender(request.getParameter("gender"));
		 player.setDOB(request.getParameter("dob"));
		 player.setEmail(request.getParameter("email"));
		 player.setPassword(request.getParameter("user_password"));
		 
		 IUserServices iuserservice = new UserServiceImplementation();
		 try {
			 
			 
			iuserservice.addUser(player);
			
			
			
		} catch (ClassNotFoundException | SQLException | ParserConfigurationException| SAXException| IOException  e) {
			e.printStackTrace();
		}
		 
		 
	}

}
