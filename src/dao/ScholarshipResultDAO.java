package dao;

import java.util.Collection;

import customVo.ScholarshipStatementVO;

public interface ScholarshipResultDAO {
	
	Collection<ScholarshipStatementVO> getScholarshipResultsList();
	
	Collection<ScholarshipStatementVO> getScholarshipResultsByName(String name);
	
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseId(String courseId);
	
	Collection<ScholarshipStatementVO> getScholarshipResultsByDate(String date);
	
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseIdAndDate(String date, String courseId);
	
	Collection<ScholarshipStatementVO> getScholarshipResultsByCourseIdDateName(String date, String courseId, String name);

}
