package dao;

import java.sql.SQLException;
import java.util.Collection;

import vo.customVo.StudentCompletionVO;
import vo.customVo.StudentCourseVO;
import vo.StudentVO;

public interface StudentDAO {

	/**전체 수강생 목록 불러오기*/
	Collection<StudentVO> getStudentInfoList();

	/**특정 기수의 수강생 목록 불러오기*/
	Collection<StudentVO> getStudentInfoListByCourseId(int courseId);
	
	/**특정 이름을 가진 수강생 목록 불러오기*/
	Collection<StudentVO> getStudentInfoListByName(String name);
	
	/**새로운 수강생 정보를 등록하기*/
	boolean addStudent(StudentVO studentVO);

	/**특정 아이디를 가진 학생의 정보를 수정하기*/
	boolean setStudentInfoByHrdNetId(StudentVO studentVO);

	/**전체 학생의 출결 정보를 불러오기*/
	// Collection<StudentCourseVO> getStudentCourseInfoList();
	// Collection<StudentCompletionVO> getStudentCourseInfoList();

	/**특정 기수에 속한 학생들의 출결 정보를 불러오기*/
	Collection<StudentCourseVO> getStudentCourseInfoListByCourseId(int courseId);

	/**특정 이름을 가진 학생의 출결 정보를 불러오기*/
	Collection<StudentCourseVO> getStudentCourseInfoListByName(int name);
	
	/**특정 아이디를 가진 학생의 출결 입력하기*/
	boolean addStudentCourseInfoByHrdNetId(StudentCourseVO studentCourseVO);


	/**특정 아이디를 가진 학생의 출결 입력하기*/
	// boolean addStudentCourseInfoByHrdNetId(StudentAttendanceVO studentAttendanceVO);
	
	
}
