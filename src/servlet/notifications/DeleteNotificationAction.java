package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.NotificationDAOImpl;
import servlet.Action;

public class DeleteNotificationAction implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		
		HttpSession session = request.getSession(false); 
		
		int notificationId = Integer.parseInt(request.getParameter("notificationId"));
		String url = "controller?cmd=deleteNotificationAction&notificationId=" + notificationId ;

		boolean result = new NotificationDAOImpl().deleteNodificationById(notificationId);
		
		if(!result ) {
			return url = "jsp/notifications/notificationBoard.jsp";
			// 삭제 불가 알람 보내기 (id 값이 없거나 false일 경우)????
		}

		
//		if (loginStatus == false)
		
		// 작성자만 삭제할 수 있도록 할 것 
		
		return url;
	}

}
