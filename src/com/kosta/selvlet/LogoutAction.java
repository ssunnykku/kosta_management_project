package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		HttpSession session = request.getSession(); 
		
		if (session != null) {
			session.invalidate();
		}
		return "jsp/login/logout.jsp";
	}

}
