package dao;

import java.util.Collection;

import vo.customVo.ScholarshipStatementVO;

public interface ScholarshipDAO {
	
	Collection<ScholarshipStatementVO> getStudentsPointsInfoList();

	Collection<ScholarshipStatementVO> getStudentPointsByCourseId(int courseId);

	Collection<ScholarshipStatementVO> getStudentPointByName(String name);

	Collection<ScholarshipStatementVO> getStudentsPointsByCourseIdAndName(String name, int courseId);

	boolean setPointCategory(String category, int point);

	boolean addPoints(String hrdNetId, int pointId);
	
	Collection<ScholarshipStatementVO> getScholarshipRecipientsInfo();

	boolean setRecipientsSettlementDate();

	boolean setSelectedRecipientsSettlementDate(Collection<String> selectedStudentsHrdIds);

	boolean getSelectedRecipientsSettlementDateByCourseId(int courseId);

	Collection<ScholarshipStatementVO>setScholarshipRecipientsByCourseId(int courseId);
	
	Collection<ScholarshipStatementVO>getScholarshipRecipientsByCourseIdAndName(int courseId, String name);

	ScholarshipStatementVO getScholarshipRecipientByHrdId(String hrdNetId);

	int countScholarshipRecipients();


}
