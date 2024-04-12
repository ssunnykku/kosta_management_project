package dao;

import java.util.Collection;

import customVo.StudentCompletionVO;
import customVo.StudentCourseVO;
import vo.StudentVO;

public interface StudentDAO {

	Collection<StudentVO> getStudentInfoList();
	
	Collection<StudentVO> getStudentInfoListByCourseId(int courseId);
	
	Collection<StudentVO> getStudentInfoListByName(String name);
	
	boolean addStudent(StudentVO studentVO);

	boolean setStudentInfoByHrdNetId(StudentVO studentVO);

	Collection<StudentCompletionVO> getStudentCourseInfoList();

	Collection<StudentCourseVO> getStudentCourseInfoListByCourseId(int courseId);

	Collection<StudentCourseVO> getStudentCourseInfoListByName(int name);

	boolean addStudentCourseInfoByHrdNetId(StudentCourseVO studentCourseVO);
	
	
}
