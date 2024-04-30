package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

import dao.CourseDAO;
import dao.CourseDAOImpl;
import vo.CourseVO;

public class setCourseUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		int courseId = Integer.parseInt(request.getParameter("courseId"));
		
		CourseDAO courseDAO = new CourseDAOImpl();
		
		CourseVO courseVO = null;
		courseVO = courseDAO.getCourseInfoByCourseId(courseId);
		
		request.setAttribute("courseVO", courseVO);
		
		return "jsp/courses/setCourseModal.jsp";
	}

}
