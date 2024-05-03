package servlet.students;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import servlet.Action;

public class PointBoardUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {

		return "jsp/students/pointBoard.jsp";
	}

}
