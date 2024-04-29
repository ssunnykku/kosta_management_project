package servlet.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ManagerDAOImpl;
import servlet.Action;
public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException,  SQLException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String url="jsp/notifications/notificationBoard.jsp";
		boolean login;
		
		try {
			login = new ManagerDAOImpl().login(id, pw);
			
			if(login) {
				HttpSession session = request.getSession(true); 
				session.setAttribute("loginStatus", login); 
				session.setAttribute("userId", id);

			} else {
				url = "loginOK.jsp";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return url;

	}
}
