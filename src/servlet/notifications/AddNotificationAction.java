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

public class AddNotificationAction  implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String managerId = request.getParameter("id");
		
		NotificationVO notification = new NotificationVO(title, description, managerId);
		
		new NotificationDAOImpl().addNotification(notification);
		
		return "jsp/notifications/notificationBoard.jsp";
	}

}
