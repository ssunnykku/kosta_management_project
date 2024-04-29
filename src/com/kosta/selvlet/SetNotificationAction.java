package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import vo.NotificationVO;

public class SetNotificationAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int notificationId = Integer.parseInt(request.getParameter("notificationId"));

		HttpSession session = request.getSession();
		String managerId = (String) session.getAttribute("managerId");

		String url = "jsp/notifications/setFail.jsp";
		boolean result = false;

		NotificationDAO notificationDAO = new NotificationDAOImpl();

		if (managerId.equals(notificationDAO.getManagerIdByNotificationId(notificationId))) {
			NotificationVO notificationVO = new NotificationVO(notificationId, title, description);
			result = notificationDAO.setNotification(notificationVO);
		}

		if (result) {
			url = "controller?cmd=notificationPostUI&notificationId=" + notificationId;
		} else {
			request.setAttribute("notificationId", notificationId);
		}
		return url;
	}

}
