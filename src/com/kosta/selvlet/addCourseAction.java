package com.kosta.selvlet;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import dao.CourseDAO;
import dao.CourseDAOImpl;
import vo.CourseVO;

public class addCourseAction implements Action {

	@Override
	public String execute(HttpServletRequest request) {
		
		String url = "controller?cmd=addCourseUI";
        
		
		int courseId = Integer.parseInt(request.getParameter("course_id"));
		String academyLocation = request.getParameter("academy_location");
		String courseName = request.getParameter("course_name");
		LocalDate courseStartDate = LocalDate.parse(request.getParameter("course_start_date"));
		LocalDate courseEndDate = LocalDate.parse(request.getParameter("course_end_date"));

		String subject = request.getParameter("subject");
		String courseType = request.getParameter("course_type");
		int totalTrainingHours = Integer.parseInt(request.getParameter("total_training_hours"));
		int trainingHoursOfDay = Integer.parseInt(request.getParameter("training_hours_of_day"));
		int numberOfMonths = Integer.parseInt(request.getParameter("number_of_months"));
		
		
/*		System.out.println("course_id:  "+Integer.parseInt(request.getParameter("course_id")));
		System.out.println("academy_location:  "+request.getParameter("academy_location"));
		System.out.println("courseName:  "+request.getParameter("course_name"));
		System.out.println("course_start_date:  "+LocalDate.parse(request.getParameter("course_start_date")));
		System.out.println("course_end_date:  "+LocalDate.parse(request.getParameter("course_end_date")));
		
		System.out.println("subject:  "+request.getParameter("subject"));
		System.out.println("course_type:  "+request.getParameter("course_type"));
		System.out.println("total_training_hours:  "+Integer.parseInt(request.getParameter("total_training_hours")));
		System.out.println("training_hours_of_day:  "+Integer.parseInt(request.getParameter("training_hours_of_day")));
		System.out.println("number_of_months:  "+Integer.parseInt(request.getParameter("number_of_months")));*/
		

		CourseDAO courseDAO = new CourseDAOImpl();
		CourseVO courseVO = null;
		courseVO = new CourseVO(courseId, academyLocation, courseName, courseStartDate,
				courseEndDate, subject, courseType, totalTrainingHours,
				trainingHoursOfDay, numberOfMonths);
		boolean result = courseDAO.addCourseInfo(courseVO);

		if (result) {
			url = "jsp/courses/addCourseOK.jsp";
		}
		
		return url;
	}

}
