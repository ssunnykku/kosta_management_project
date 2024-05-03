package com.kosta.selvlet;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import dao.CourseDAO;
import dao.CourseDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import vo.CourseVO;
import vo.StudentVO;
import vo.StudentsPointVO;

public class AddStudentAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {

		System.out.println("??????");

		String url = "jsp/students/addStudent.jsp";

		String name = request.getParameter("name");
		String hrdNetId = request.getParameter("hrd_net_id");
		LocalDate birth = LocalDate.parse(request.getParameter("birth"));
		char gender = request.getParameter("gender").charAt(1);
		int courseId = Integer.parseInt(request.getParameter("course_id"));
		String province = request.getParameter("province");
		String phoneNumber = request.getParameter("phone_number");
		String email = request.getParameter("email");

		// academtLocation 불러오기
		CourseDAO courseDAO = new CourseDAOImpl();
		CourseVO courseVO = null;
		courseVO = courseDAO.getCourseInfoByCourseId(courseId);

		String academyLocation = courseVO.getAcademyLocation();

		// 은행, 계좌 정보 있는 VO, 없는 VO 나누기
		StudentVO studentVO = null;

		if (request.getParameter("bank") != null) {
			String bank = request.getParameter("bank");
			String account = request.getParameter("account");
			studentVO = new StudentVO(hrdNetId, name, birth, province, bank, account, phoneNumber, email, 1, gender,
					courseId, academyLocation);
		} else {
			studentVO = new StudentVO(hrdNetId, name, birth, province, phoneNumber, email, 1, gender, courseId,
					academyLocation);
		}

		StudentDAO studentDAO = new StudentDAOImpl();
		boolean result = studentDAO.addStudent(studentVO); 	// 메소드 경우의 수로
															// 나누기~~~~~~~~

		if (result) {
			url = "jsp/students/addStudentOK.jsp";
		}
		System.out.println(result);

		return url;
	}
	// System.out.println(name);
	// System.out.println(hrdNetId);
	// System.out.println(birth);
	// System.out.println(gender);
	// System.out.println(courseId);
	// System.out.println(province);
	// System.out.println(bank);
	// System.out.println(account);
	// System.out.println(phoneNumber);
	// System.out.println(email);

	// courseId로 과정 정보 불러오기
	// 불러온 과정 정보에서 시작일 빼서 오늘이랑 비교하고 오늘 이전이면 (=과정이 시작되었으면) 출석 테이블 불러오기
	// 불러온 출석 테이블에서 가져온 출석일과 과정 전체의 출석일을 비교하여
	// 아니 .. 처음 등록하면 출석일이 없음 ㅋㅋ
}
