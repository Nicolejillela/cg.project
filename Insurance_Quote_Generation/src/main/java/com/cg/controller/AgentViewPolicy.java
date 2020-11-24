package com.cg.controller;


	import java.io.IOException;
	import java.sql.ResultSet;
	import java.util.List;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.cg.Exception.QGSException;
	import com.cg.model.Policy;
	import com.cg.service.AdminService;
	import com.cg.service.AgentService;
	import com.cg.service.IAdminService;
	import com.cg.service.IAgentService;
import com.cg.utility.LoggerUtility;

	@WebServlet("/AgentViewPolicy")
	public class AgentViewPolicy extends HttpServlet{
		Logger logger = LoggerUtility.getLogger();
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			IAgentService service = new AgentService();
			RequestDispatcher dispatcher = null;
			HttpSession session = request.getSession();
			try {
				String username = (String)session.getAttribute("username");
				List<Policy> policies = service.getPolicies(username);
				System.out.println("Result set:"+policies);
				request.setAttribute("policies", policies);
				dispatcher = request.getRequestDispatcher("agentviewpolicy.jsp");
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
