package com.cg.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.Exception.QGSException;
import com.cg.service.AdminService;
import com.cg.service.IAdminService;
import com.cg.service.InsuredService;


@SuppressWarnings("serial")
@WebServlet("/LoginServlet")

//This Servlet is used to validate the user and redirect them to the respective homepage  
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = null;
		IAdminService adminService = new AdminService();
		HttpSession session = request.getSession();
		boolean isFound = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.setAttribute("username", username);
		//System.out.println(username);
		try {
			
			
			isFound = adminService.loginValidation(username,password);
			
			if(isFound == true) {
				System.out.println("user exist");
			}else {
				System.out.println("Account not exist create your account");
				dispatcher = request.getRequestDispatcher("InsuredAccountCreation.jsp");
				dispatcher.forward(request, response);
				
			}
						
		}catch (QGSException e) {
		
			//throw new LoginException("Error occured while validating"+e.getMessage());
			System.out.println(e.getMessage());
		
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
