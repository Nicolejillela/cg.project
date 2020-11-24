package com.cg.controller;


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
	import com.cg.service.IInsuredService;
	import com.cg.service.InsuredService;

	@WebServlet("/InsuredAccountCreation")
	public class InsuredAccountCreation extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			IInsuredService service = new InsuredService();
			
			int isCreated = 0;
			
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
				
				String bussinessSegmentId = service.getLineOfBusinessIdByName(busSegName);
				Accounts account = new Accounts(insuredName, insuredStreet, insuredCity, insuredState, insuredZip, bussinessSegmentId);
				
				isCreated = service.accountCreation(account, userName);
				if (isCreated == 1) {
					out.println("Account Created Successfully!!");
					dispatcher = request.getRequestDispatcher("insurerhome.html");//insurerhome.html");
					dispatcher.forward(request, response);
				}
				
			} catch (QGSException e) {
				System.out.println(e.getMessage());
			}

		}
	}
