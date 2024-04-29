package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import vo.NotificationVO;

public class SetNotificationUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		
		NotificationDAO notificationDAO = new NotificationDAOImpl();
		NotificationVO notificationVO = null;
		
		notificationVO = notificationDAO.getNotification(notificationId);
		
		request.setAttribute("notificationVO", notificationVO);

		return "jsp/notifications/setNotification.jsp";
	}

}
