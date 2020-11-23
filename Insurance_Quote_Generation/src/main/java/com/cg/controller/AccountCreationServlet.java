package com.cg.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.Exception.QGSException;
import com.cg.model.Accounts;
import com.cg.service.AgentService;
import com.cg.service.IAgentService;


@WebServlet("/AccountCreationServlet")
public class AccountCreationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        IAgentService service = new AgentService();
		
        //boolean isAccountExists = false;
		
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = null;
		boolean isUserExists = false;
		String userName = request.getParameter("userName");
		String insuredName = request.getParameter("insuredName");
		String insuredStreet = request.getParameter("insuredStreet");
		String insuredCity = request.getParameter("insuredCity");
		String insuredState = request.getParameter("insuredState");
		int insuredZip = Integer.parseInt(request.getParameter("insuredZip"));
		String busSegName = request.getParameter("busSegName");
		try {
			
			isUserExists = service.isUserExists(userName);
			if (isUserExists) {
               // isAccountExists = service.accountValidation(userName);
				//if(isAccountExists) {
					out.println("Account already exists");
					dispatcher = request.getRequestDispatcher("login.jsp");
					dispatcher.include(request, response);
					} else {
						out.println("User does not exists! First register as user");
						dispatcher = request.getRequestDispatcher("InsuredAccountCreation.jsp");
						dispatcher.include(request, response);
					
			}
		
		} catch (QGSException e) {
			System.out.println(e.getMessage());
		}

	}

}
