package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import servlet.Action;

public class NotificationBoardUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

//		HttpSession session = request.getSession(false); 

//		boolean loginStatus = (boolean) session.getAttribute("login");
//		String managerId = (String) session.getAttribute("userId");
//		
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + loginStatus);
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + session);
		
		return "jsp/notifications/notificationBoard.jsp";
	}

}
