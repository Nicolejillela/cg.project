package com.cg.controller;


	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.cg.dao.AdminDAO;
	import com.cg.dao.IAdminDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.UserRole;
	import com.cg.service.AdminService;
	import com.cg.service.IAdminService;
import com.cg.utility.LoggerUtility;

	@WebServlet("/ProfileCreation")
	public class ProfileCreation extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			Logger logger = LoggerUtility.getLogger();
			int isInserted = 0;
			PrintWriter out = response.getWriter();
			RequestDispatcher dispatcher = null;
			
			IAdminService service = new AdminService();
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String rolecode = request.getParameter("rolecode");
			
			//System.out.println(username + " " + password + " " + rolecode);
			
			UserRole userRole = new UserRole(username, password, rolecode);
			try {

				isInserted = service.addUser(userRole);
				if (isInserted > 0) {
					logger.info("User Role created successfully!!!!");
					/*dispatcher = request.getRequestDispatcher("adminhome.html");
					dispatcher.include(request, response);
			*/	} else {
					logger.info("Username already exists!! Enter a different Username");
			/*		dispatcher = request.getRequestDispatcher("profilecreation.html");
					dispatcher.include(request, response);
			*/	}
			} catch (QGSException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				logger.error(e.getMessage());
			}
		}
	}

