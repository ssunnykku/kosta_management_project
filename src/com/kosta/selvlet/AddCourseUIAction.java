package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

public class AddCourseUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		return "jsp/courses/addCourseModal.jsp";
	}

}
