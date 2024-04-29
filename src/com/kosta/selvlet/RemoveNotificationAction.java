package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;

public class RemoveNotificationAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		int notificationId = Integer.parseInt(request.getParameter("notificationId"));

		HttpSession session = request.getSession();
		String managerId = (String) session.getAttribute("managerId");

		String url="jsp/notifications/removeFail.jsp";
		boolean result = false;
		
		NotificationDAO notificationDAO = new NotificationDAOImpl();
		
		if (managerId.equals(notificationDAO.getManagerIdByNotificationId(notificationId))) {		
			result = notificationDAO.deleteNodificationById(notificationId);
		}
		
		if (result) {
			url="controller?cmd=notificationBoardUI";
		}else{
			request.setAttribute("notificationId", notificationId);
		}
		
		return url;
	}

}
