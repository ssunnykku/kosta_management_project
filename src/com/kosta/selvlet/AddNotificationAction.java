package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import vo.NotificationVO;

public class AddNotificationAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		String url="controller?cmd=addNotification";
		
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		HttpSession session = request.getSession();
		String managerId = (String) session.getAttribute("managerId");
		
		NotificationDAO notificationDAO = new NotificationDAOImpl();
		NotificationVO notificationVO;
		notificationVO = new NotificationVO(title, description, managerId);
		
		boolean result = notificationDAO.addNotification(notificationVO);
		
		if (result) {
			url = "controller?cmd=notificationBoardUI";
		}
		
		return url;
	}

}
