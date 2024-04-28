package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ManagerDAOImpl;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException,  SQLException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String url="controller?cmd=loginUI";
		boolean login;
		
		try {
			login = new ManagerDAOImpl().login(id, pw);
			System.out.println(login);
			if(!login) {
				HttpSession session = request.getSession(true); 
				session.setAttribute("loginStatus", login); 

				url = "loginOK.jsp";

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return url;

	}
}
