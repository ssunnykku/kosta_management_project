package dao;

import java.util.Collection;

import vo.customVo.ScholarshipStatementVO;

public interface ScholarshipResultDAO {
	
	/** 장학금 정산 처리 결과 전체 불러오기 (처리 완료 정보) */
	Collection<ScholarshipStatementVO> getScholarshipResultsList();
	
	/** 특정 이름을 가진 수강생들의 정산 정보를 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipResultsByName(String name);
	
	/** 특정 기수에 속한 수강생들의 정산 정보를 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseId(String courseId);
	
	/** 특정 정산일에 정산한 수강생들의 정산 정보를 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipResultsByDate(String date);
	
	/** 특정 기수에 속하고, 특정 정산일에 정산한 수강생들의 정산 정보를 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseIdAndDate(String date, String courseId);
	
	/** 특정 기수에 속하고, 특정 정산일에 정산한 특정 이름을 가진 수강생들의 정산 정보를 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseIdDateName(String date, String courseId, String name);

}
