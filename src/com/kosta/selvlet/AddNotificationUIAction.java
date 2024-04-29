package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

public class AddNotificationUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		return "jsp/notifications/addNotification.jsp";
	}

}
