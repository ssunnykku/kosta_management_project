package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ManagerDAO;
import dao.ManagerDAOImpl;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		String managerId = request.getParameter("manager_id");
		String password = request.getParameter("password");
		String url = "controller?cmd=loginUI";
		System.out.println(managerId);
		System.out.println(password);
		System.out.println(url);

		ManagerDAO managerDAO = new ManagerDAOImpl();
		
		boolean result = managerDAO.login(managerId, password);

		if (result){
			HttpSession session = request.getSession(true);
			session.setAttribute("managerId", managerId);
			session.setAttribute("password", password);
			url = "jsp/login/loginOK.jsp";
		}
		
		System.out.println(url);
		return url;
	}

}
