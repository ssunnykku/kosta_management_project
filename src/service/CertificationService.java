package service;

import java.sql.SQLException;
import java.util.Collection;

import vo.customVo.StudentCompletionVO;

public interface CertificationService {
	/** (수료 구분 전체, 기수 내림차순, 이름 오름차순) 전체 학생의 수료 정보 불러오기
	 * @throws SQLException 
	 * @throws ClassNotFoundException */
	Collection<StudentCompletionVO> getStudentCompletionInfoList() throws ClassNotFoundException, SQLException;
	/** (수료 구분 전체, 기수 내림차순, 이름 오름차순) 특정 기수에 속한 학생들의 수료 정보 불러오기 */
	Collection<StudentCompletionVO> getStudentCompletionInfoByCourseId(int courseId) throws ClassNotFoundException, SQLException;
	/** (수료 구분 전체, 기수 내림차순, 이름 오름차순) 특정 이름을 가진 학생의 수료 정보 불러오기(n명) */
	Collection<StudentCompletionVO>  getStudentCompletionInfoByName(String name) throws ClassNotFoundException, SQLException;
	/** 수료 구분 전체, 기수 내림차순, 이름 오름차순) 특정 기수, 특정 이름을 가진 학생의 수료 정보 불러오기 */
	Collection<StudentCompletionVO> getStudentCompletionInfoByCourseIdAndName(int courseId, String name) throws ClassNotFoundException, SQLException;
	/** (수료 완료만, 기수 내림차순, 이름 오름차순) 선택된 학생의 수료증 불러오기(1~n명) -> 수료증 출력 */
	Collection<StudentCompletionVO> getStudentCompletionInfoByHrdNetId(String HrdNetId) throws ClassNotFoundException, SQLException;
	/** (수료 완료만, 기수 내림차순, 이름 오름차순) 선택된 특정 기수의 학생 수료 정보 불러오기(1~n명) */
	Collection<StudentCompletionVO> getStudentCompletionInfoByCourseIdAndHrdNetId(int courseId, String hrdNetId) throws ClassNotFoundException, SQLException;
	double calculateCompletionRate(String hrdNetId, int totalTrainingHours, int trainingHoursOfDay) throws ClassNotFoundException, SQLException;
}
