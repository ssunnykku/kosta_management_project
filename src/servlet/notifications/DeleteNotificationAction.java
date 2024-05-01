package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import servlet.Action;

public class DeleteNotificationAction implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		NotificationDAO dao = new NotificationDAOImpl();

		return  "jsp/notifications/notificationBoard.jsp";
	}

}
