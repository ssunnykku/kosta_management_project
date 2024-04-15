package dao;

import java.sql.SQLException;
import java.util.Collection;

import vo.AttendanceVO;

public interface AttendanceDAO {
	/** 전체 학생의 출결 정보를 불러오기 */
	Collection<AttendanceVO> getStudentAttendanceList() throws ClassNotFoundException, SQLException ;
	/** 특정 아이디를 가진 학생의 출결 입력하기 */
	Collection<AttendanceVO> getStudentAttendanceByHrdNetId(String hrdNetId) throws ClassNotFoundException, SQLException ;
}
