package com.kosta.selvlet;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

public class AddStudentAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		String name = request.getParameter("name");
		String hrdNetId = request.getParameter("hrd_net_id");
		LocalDate birth=LocalDate.parse(request.getParameter("birth"));
		String gender = request.getParameter("gender");
		String courseNumber = request.getParameter("course_number");
		String province = request.getParameter("province");
		String bank = request.getParameter("bank");
		String account = request.getParameter("account");
		String phoneNumber = request.getParameter("phone_number");
		String email = request.getParameter("email");

		return null;
	}

}
