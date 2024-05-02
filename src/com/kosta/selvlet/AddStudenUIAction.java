package com.kosta.selvlet;

import javax.servlet.http.HttpServletRequest;

public class AddStudenUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		return "jsp/students/addStudent.jsp";
	}

}
