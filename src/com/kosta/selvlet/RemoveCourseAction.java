package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

import dao.CourseDAO;
import dao.CourseDAOImpl;

public class RemoveCourseAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		int courseId = Integer.parseInt(request.getParameter("courseId"));

		CourseDAO courseDAO = new CourseDAOImpl();

		boolean result = courseDAO.deleteCoursebyCourseId(courseId);

		System.out.println("result :   "+result);
		request.setAttribute("result", result);

		return "jsp/courses/removeResult.jsp";
	}

}
