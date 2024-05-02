package servlet.notifications;

import java.io.IOException;
import dao.NotificationDAOImpl;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import servlet.Action;
import vo.customVo.NotificationVO;

public class SetNotificationAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		String title = request.getParameter("title");
		String description = request.getParameter("description");

		String url = "controller?cmd=setNotificationUI&notificationId=" + notificationId;

		HttpSession session = request.getSession(false);
		new NotificationDAOImpl().setNotificationById(new NotificationVO(notificationId, title, description));

		return url;
	}

}
