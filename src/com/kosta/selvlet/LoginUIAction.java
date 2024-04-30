package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ManagerDAO;
import dao.ManagerDAOImpl;

public class LoginUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		return "jsp/login/login.jsp";
	}

}
