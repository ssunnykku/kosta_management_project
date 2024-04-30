package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import dao.NotificationDAOImpl;
import servlet.Action;
import vo.NotificationVO;

public class NotificationAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		Gson gson = new Gson();
		NotificationVO notification = new NotificationDAOImpl().getNotification(notificationId);

		String json = gson.toJson(notification);
		request.setAttribute("data", json);

		return "jsp/notifications/notificationListAPI.jsp";
	}

}
