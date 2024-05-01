package servlet.notifications;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import dao.NotificationDAOImpl;
import servlet.Action;
import vo.customVo.NotificationVO;

public class NotificationBoardAction implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
			Gson gson = new Gson();
			ArrayList<NotificationVO> list =  (ArrayList<NotificationVO>) new NotificationDAOImpl().getNotificationsList();
			
			String json = gson.toJson(list);
			request.setAttribute("data", json);

		return "jsp/notifications/notificationListAPI.jsp";
	}

}
