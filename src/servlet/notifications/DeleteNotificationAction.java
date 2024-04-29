package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import servlet.Action;

public class DeleteNotificationAction implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		return  "jsp/notifications/notificationBoard.jsp";
	}

}
