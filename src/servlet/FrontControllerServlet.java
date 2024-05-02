package servlet;

import java.io.IOException;
import java.sql.SQLException;

//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManagerDAOImpl;

@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");

		String cmd = request.getParameter("cmd");
		Action a = ActionFactory.getAction(cmd);
		
		String url;
		try {

			url = a.execute(request);
			request.getRequestDispatcher("/" + url).forward(request, response);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
