package com.kosta.selvlet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import dao.CourseDAO;
import dao.CourseDAOImpl;
import vo.CourseVO;

public class CourseBoardUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		CourseDAO courseDAO = new CourseDAOImpl();
		Collection<CourseVO> courseVOs = new ArrayList<CourseVO>();
		
		courseVOs = courseDAO.getCoursesList();
		
		request.setAttribute("courseVOs", courseVOs);
		
		return "jsp/courses/courseBoard.jsp";
	}

}
