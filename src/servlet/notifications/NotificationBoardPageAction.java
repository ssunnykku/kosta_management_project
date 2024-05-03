package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import dao.NotificationDAOImpl;
import servlet.Action;

public class NotificationBoardPageAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		int offset = 10;
		int curser = new NotificationDAOImpl().getFirstNotificationId();
		int page = Integer.parseInt(request.getParameter("page"));
		Gson gson = new Gson();
		String json = gson.toJson(new NotificationDAOImpl().getNotificationsListPerPage(curser, offset, page));
		
		request.setAttribute("data", json);
	

		return "jsp/notifications/notificationListPageAPI.jsp";
	}

}
