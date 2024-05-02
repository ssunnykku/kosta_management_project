package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

import dao.ManagerDAO;
import dao.ManagerDAOImpl;

public class IdCheckAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		String managerId = request.getParameter("manager_id");
		System.out.println(managerId);
		
		ManagerDAO managerDAO = new ManagerDAOImpl();
		boolean result = managerDAO.managerExists(managerId);
		System.out.println(result);
		
		request.setAttribute("result", "Y");

		
		if (result) {
			request.setAttribute("result", "N");
		}/*else{
			request.setAttribute("result", "Yes");
		}*/
		System.out.println(request.getAttribute("result"));
		
		return "jsp/login/idCheck.jsp";
	}

}
