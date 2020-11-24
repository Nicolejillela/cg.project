package com.cg.controller;



	import java.io.IOException;
	import java.util.List;

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
	import com.cg.model.Policy;
	import com.cg.service.AdminService;
	import com.cg.service.IAdminService;
import com.cg.utility.LoggerUtility;

	@WebServlet("/ViewPolicy")
	public class ViewPolicy extends HttpServlet{
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			IAdminService service = new AdminService();
			Logger logger = LoggerUtility.getLogger();
			RequestDispatcher dispatcher = null;
			try {
				List<Policy> policies = service.getPolicies();
				System.out.println(policies);
				request.setAttribute("policies", policies);
				dispatcher = request.getRequestDispatcher("viewpolicy.jsp");
				dispatcher.include(request, response);
			} catch (QGSException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				logger.error(e.getMessage());
			}
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doPost(req, resp);
		}
	}
