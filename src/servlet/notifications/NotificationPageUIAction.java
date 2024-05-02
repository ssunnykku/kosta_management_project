package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import dao.NotificationDAOImpl;
import servlet.Action;
import vo.customVo.NotificationManagerVO;

public class NotificationPageUIAction  implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		
		NotificationManagerVO notification = new NotificationDAOImpl().getNotification(notificationId);
//		String description = notification.getDescription();

		request.setAttribute("data", notification);
		System.out.println(notification);

		return "jsp/notifications/notificationPost.jsp";
	}

}
