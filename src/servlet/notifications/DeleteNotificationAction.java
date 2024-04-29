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
		
		// req값으로 배열을 가지고 옴
		// for문으로 돌려주면서 delete 해줌( 
		NotificationDAO dao = new NotificationDAOImpl();

		return  "jsp/notifications/notificationBoard.jsp";
	}

}
