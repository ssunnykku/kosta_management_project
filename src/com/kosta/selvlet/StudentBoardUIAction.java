package com.kosta.selvlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import vo.StudentVO;

public class StudentBoardUIAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		StudentDAO studentDAO = new StudentDAOImpl();
		Collection<StudentVO> studentVOs = new ArrayList<StudentVO>();
		studentVOs = studentDAO.getStudentInfoList();
		
		request.setAttribute("studentVOs", studentVOs);

		return "jsp/students/studentBoard.jsp";
	}

}
