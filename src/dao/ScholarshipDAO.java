package dao;

import java.util.Collection;

import vo.customVo.ScholarshipStatementVO;

public interface ScholarshipDAO {

	/** (포인트) (Board) 모든 수강생의 포인트 정보 조회하기 */
	Collection<ScholarshipStatementVO> getStudentsPointsInfoList();

	/** (포인트) 특정 courseId의 포인트 정보 조회하기 (클릭 시) */
	Collection<ScholarshipStatementVO> getStudentPointsByCourseId(int courseId);

	/** (포인트) 특정 사용자의 포인트 정보 조회하기 (이름 조회) */
	Collection<ScholarshipStatementVO> getStudentPointByName(String name);

	/** (포인트) 227기 중 특정 사용자의 포인트 정보 조회하기 (이름, 코스id로 검색) */
	Collection<ScholarshipStatementVO> getStudentsPointsByCourseIdAndName(String name, int courseId);

	/** (포인트) 특정 사용자의 특정 카테고리에 대한 (point_id 이용) 포인트 등록하기 */
	boolean addPoints(String hrdNetId, int pointId);

	/** (포인트 카테고리 관리) 특정 카테고리에 대한 포인트 등록 (table: points_categories) */
	boolean setPointCategory(String category, int point);

	// 정산 버튼
	/** (정산버튼) 현재 기준 포인트 50 이상인 전체 대상자의 정산일 입력 */
	boolean setRecipientsSettlementDate();

	// 특정 기수의 등록이면 기존 메소드 재사용이 아닌 새 메소드 생성하여 기수를 가져가서 sql 사용이 나을지 고민하기
	/** (정산 버튼) 현재 기준 포인트 50 이상인 장학금 대상자 중 특정 기수의 정산일 입력 */
	boolean setSelectedRecipientsSettlementDate(Collection<String> selectedStudentsHrdIds);

	/** (정산 버튼) 현재 기준 포인트 50 이상인 장학금 대상자 중 특정 기수의 정산일 입력 */
	boolean setSelectedRecipientsSettlementDateByCourseId(int courseId);
	
	// 장학금 지급 대상 목록
	/** (Board) 장학금 대상인 수강생 정보, 장학금 정보 전체 불러오기 */
	Collection<ScholarshipStatementVO> getScholarshipRecipientsInfo();

	// get으로
	/** 특정 기수의 정산 대상 목록 불러오기 (검색)(정산 조건 충족하는 경우) */
	Collection<ScholarshipStatementVO> setScholarshipRecipientsByCourseId(int courseId);

	/** 특정 기수의 특정 이름을 가진 수강생의 정산 대상 목록 불러오기 (검색)(정산 조건 충족하는 경우) */
	Collection<ScholarshipStatementVO> getScholarshipRecipientsByCourseIdAndName(int courseId, String name);

	/** 특정 대상자의 정보 불러오기 (클릭 시) */
	ScholarshipStatementVO getScholarshipRecipientByHrdNetId(String hrdNetId);

	/** 정산 대상자 전체 목록 갯수  */
	int countScholarshipRecipients();
}
