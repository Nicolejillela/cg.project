package com.cg.controller;



	import java.io.IOException;

	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.List;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.cg.dao.AdminDAO;
	import com.cg.Exception.QGSException;
	import com.cg.model.PolicyQuestions;
	import com.cg.service.AdminService;
	import com.cg.service.IAdminService;
import com.cg.utility.LoggerUtility;
	@WebServlet("/PolicyCreationServlet")
	public class PolicyCreationServlet extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			Logger logger = LoggerUtility.getLogger();
			int accNumber = Integer.parseInt(request.getParameter("accNumber"));
			ServletContext context = request.getServletContext();
			context.setAttribute("accNumber", accNumber);
			PrintWriter out = response.getWriter();
		    
			IAdminService service = new AdminService();
			
			List<PolicyQuestions> policyQuestions = new ArrayList<PolicyQuestions>();
			RequestDispatcher dispatcher = null;
			try {
				String busSegId = service.getBusSegId(accNumber);
				System.out.println(busSegId);
				context.setAttribute("busSegId", busSegId);
				policyQuestions = service.getPolicyQuestions(busSegId);
				//out.println(policyQuestions);
				System.out.println(policyQuestions);
				dispatcher = request.getRequestDispatcher("policycreationquestions.jsp");
				System.out.println("Question : "+policyQuestions);
				request.setAttribute("questions", policyQuestions);
				dispatcher.forward(request, response);
			} catch (QGSException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				logger.error(e.getMessage());
			}
			
		}
	}
