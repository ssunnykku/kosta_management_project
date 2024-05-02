package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.NotificationDAOImpl;

import servlet.Action;
import vo.customVo.NotificationManagerVO;

public class SetNotificationUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		//notificationId가 null일 경우 
	
		NotificationManagerVO notification = new NotificationDAOImpl().getNotification(notificationId);
		HttpSession session = request.getSession(false);
		session.setAttribute("data", notification);
	
		return "jsp/notifications/setNotification.jsp";
	}

}
