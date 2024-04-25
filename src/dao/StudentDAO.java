package dao;

import java.sql.SQLException;
import java.util.Collection;

import vo.customVo.StudentCompletionVO;
import vo.customVo.StudentCourseVO;
import vo.StudentVO;

public interface StudentDAO {

	Collection<StudentVO> getStudentInfoList() throws ClassNotFoundException, SQLException;
	
	Collection<StudentVO> getStudentInfoListByCourseId(int courseId) throws ClassNotFoundException, SQLException;
	
	Collection<StudentVO> getStudentInfoListByName(String name) throws ClassNotFoundException, SQLException;
	
	boolean addStudent(StudentVO studentVO) throws ClassNotFoundException, SQLException;

	boolean setStudentInfoByHrdNetId(StudentVO studentVO);

//	Collection<StudentCompletionVO> getStudentCourseInfoList();

	Collection<StudentCourseVO> getStudentCourseInfoListByCourseId(int courseId);

	Collection<StudentCourseVO> getStudentCourseInfoListByName(int name);

	boolean addStudentCourseInfoByHrdNetId(StudentCourseVO studentCourseVO);
	
	
}
