package com.kosta.selvlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import vo.NotificationVO;

public class NotificationBoardUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		Collection<NotificationVO> notificationVOs = new ArrayList<NotificationVO>();
		NotificationDAO notificationDAO = new NotificationDAOImpl();
		notificationVOs = notificationDAO.getNotificationsList();
		
//		for (NotificationVO notificationVO : notificationVOs) {
//			notificationVO.get
//		}
		
		request.setAttribute("notificationVOs", notificationVOs);

		return "jsp/notifications/notificationBoard.jsp";
	}

}
