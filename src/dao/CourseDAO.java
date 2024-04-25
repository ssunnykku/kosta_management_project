package dao;

import java.util.Collection;

import vo.CourseVO;

public interface CourseDAO {
	
	Collection<CourseVO>getCoursesList();
	
	int	getNumberOfCourseList();
	
	boolean deleteCoursebyCourseId(int courseId);

	CourseVO getCourseInfoByCourseId(int courseId);
	
	
	Collection<CourseVO> getCourseInfoByAcademyLocation(String academyLocation);
	
	boolean addCourseInfo(CourseVO course);
	
	boolean setCourseInfo(CourseVO course);

}
