package servlet.scholarships;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import servlet.Action;

public class ScholarshipResultBoardUIAction implements Action{

	@Override
	public String execute(HttpServletRequest request)
			throws ServletException, IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return "jsp/scholarships/scholarshipBoard.jsp";
	}

}
