package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import dao.NotificationDAOImpl;
import servlet.Action;
import vo.customVo.NotificationVO;

public class NotificationPageUIAction  implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		
		NotificationVO notification = new NotificationDAOImpl().getNotification(notificationId);
		String description = notification.getDescription();

//		for (int i = 0; i < description.length(); i++) {
//			if(description.charAt(i) == '\n') {
//				description.replace("\n", "<br>");
//			};
//		}
		
		System.out.println(description);
		request.setAttribute("data", notification);

		return "jsp/notifications/notificationPost.jsp";
	}

}
