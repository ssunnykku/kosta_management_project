package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ManagerDAO;
import dao.ManagerDAOImpl;
import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import servlet.Action;
import vo.NotificationVO;
import vo.customVo.NotificationManagerVO;

public class AddNotificationAction  implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		String url = "jsp/notifications/notificationBoard.jsp";
		HttpSession session = request.getSession(false);
		
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String managerId = (String) session.getAttribute("userId");
		
		if(managerId == null) {
			// 여기 알림 모달창 만들기 -> 로그인 안내
			url = "jsp/login/login.jsp";
		}
		
		NotificationVO notification = new NotificationVO(title, description, managerId);
		
		new NotificationDAOImpl().addNotification(notification);
		
		return url;
	}

}
