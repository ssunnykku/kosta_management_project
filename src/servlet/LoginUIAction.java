package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class LoginUIAction  implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException, SQLException {
		
		return "jsp/login/login.jsp";
	}

}
