package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import vo.AttendanceVO;
import vo.CourseVO;
import vo.StudentVO;
import vo.customVo.StudentCompletionVO;
import dao.AttendanceDAO;
import dao.AttendanceDAOImpl;
import dao.CourseDAO;
import dao.CourseDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;

public class CertificationServiceImpl implements CertificationService{

	StudentDAO students;
	CourseDAO courses;
	AttendanceDAO attendances;

	public CertificationServiceImpl() throws ClassNotFoundException, SQLException {
		students = new StudentDAOImpl();
		courses = new CourseDAOImpl();
		attendances = new AttendanceDAOImpl();
	}

	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoList() throws ClassNotFoundException, SQLException {

		Collection<StudentVO> studentList = students.getStudentInfoList();

		List<StudentCompletionVO> StudentCompletionList = new ArrayList<StudentCompletionVO>();

		for (StudentVO vo : studentList) {
			int courseId = vo.getCourseId();

			CourseVO courseInfoByCourseId = courses.getCourseInfoByCourseId(courseId);
			
			CertificationService certification = new CertificationServiceImpl();

			double completionRate = certification.calculateCompletionRate(vo.getHrdNetId(), 
					courseInfoByCourseId.getTotalTrainingHours(), 
					courseInfoByCourseId.getTrainingHoursOfDay());
					
			StudentCompletionVO certificationInfo = new StudentCompletionVO(
					vo.getHrdNetId(),
					vo.getCourseId(),
					vo.getName(),
					vo.getBirth(),
					vo.getCompletionStatus(),
					courseInfoByCourseId.getNumberOfMonths(),
					completionRate);
			
			StudentCompletionList.add(certificationInfo);

		}

		return StudentCompletionList;
	}

	public double calculateCompletionRate(String hrdNetId, int totalTrainingHours, int trainingHoursOfDay) throws ClassNotFoundException, SQLException {
		Collection<AttendanceVO> attendanceInfo = attendances.getStudentAttendanceByHrdNetId(hrdNetId);
		int countAttencanceDate = 0;
		int courseDurationDay = totalTrainingHours/trainingHoursOfDay;
		
		
		for (AttendanceVO vo : attendanceInfo) {
			if (vo.getAttendanceStatus() == 0) {
				countAttencanceDate += 1;
			}
		}
		
		double completionRate = countAttencanceDate/(double)courseDurationDay * 100;
		
		return completionRate;
	}



	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoByCourseId(int courseId) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoByName(String name) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoByCourseIdAndName(int courseId, String name) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoByHrdNetId(String HrdNetId) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<StudentCompletionVO> getStudentCompletionInfoByCourseIdAndHrdNetId(int courseId,
			String hrdNetId) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}


}
