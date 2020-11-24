package com.cg.controller;

import org.apache.log4j.Logger;
import java.util.logging.Logger.*;
	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.cg.dao.AdminDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.Accounts;
	import com.cg.service.AdminService;
	import com.cg.service.IAdminService;
import com.cg.utility.LoggerUtility;

	@WebServlet("/AccountCreationServlet")
	public class AdminAccountCreationServlet extends HttpServlet{
		
		
		
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			IAdminService service = new AdminService();
			
			int isCreated = 0;
			Logger logger = LoggerUtility.getLogger();
			
			PrintWriter out = response.getWriter();
			RequestDispatcher dispatcher = null;
			boolean isUserExists = false;
			String userName = request.getParameter("userName");
			String insuredName = request.getParameter("insuredName");
			String insuredStreet = request.getParameter("insuredStreet");
			logger.info(insuredStreet);
			String insuredCity = request.getParameter("insuredCity");
			String insuredState = request.getParameter("insuredState");
			int insuredZip = Integer.parseInt(request.getParameter("insuredZip"));
			String busSegName = request.getParameter("busSegName");
			logger.info("hello");
			//int accNumber = Integer.parseInt(request.getParameter("accnumber"));
		
			logger.info("line 38");
			try {
							
				String bussinessSegmentId = service.getLineOfBusinessIdByName(busSegName);
				Accounts account = new Accounts(insuredName, insuredStreet, insuredCity, insuredState, insuredZip, bussinessSegmentId);
				
				isUserExists = service.isUserExists(userName);
				if (isUserExists) {

					isCreated = service.accountCreation(account, userName);
					if (isCreated == 1) {
						logger.info("Account Created Successfully!!");
						/*dispatcher = request.getRequestDispatcher("adminhome.html");
						dispatcher.include(request, response);
				*/	}
				} else {
					logger.info("User does not exists! First register as user");
				/*	dispatcher = request.getRequestDispatcher("adminhome.html");
					dispatcher.include(request, response);
				*/}
			} catch (QGSException e) {
				logger.error(e.getMessage());
			}

		}
	}
