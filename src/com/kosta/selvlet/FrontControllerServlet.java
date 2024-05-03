package com.kosta.selvlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service()");  
		request.setCharacterEncoding("utf-8");

		String cmd = request.getParameter("cmd");
		System.out.println("cmd :   "+cmd);

		Action a = ActionFactory.getAction(cmd);
		System.out.println("Action :   "+a);

		String url = a.execute(request);

		request.getRequestDispatcher("/" + url).forward(request, response);
	}
	
}
