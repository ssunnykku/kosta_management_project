package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import vo.customVo.ScholarshipStatementVO;

public class ScholarshipDAOImpl implements ScholarshipDAO {

	DataSource dataSource = null;

	public ScholarshipDAOImpl(Connection connection) {
		Context context;

		try {
			context = new InitialContext(); // 톰캣 서버 내에 context.xml에 있기 때문에 톰캣
											// 떠야 실행됨
											// new 키워드 있어도 새로 생성되지 않음 -> 중복코드 아님
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myoracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<ScholarshipStatementVO> getStudentsPointsInfoList() {

		List<ScholarshipStatementVO> studentsPointInfoList = new ArrayList<>();

		String sql = "select d.course_id, d.course_name, c.birth, c.name, c.bank, c.account, sum(b.point) as total_point, 500000 as amount "
				+ "from students_points a join points_categories b on a.point_id = b.point_id join students c on a.hrd_net_id = c.hrd_net_id "
				+ "join courses d on d.course_id = c.course_id and d.academy_location = c.academy_location "
				+ "group by d.course_id, c.birth, c.name, d.course_name, c.bank, c.account";
		try (Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				ScholarshipStatementVO data = new ScholarshipStatementVO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));

				studentsPointInfoList.add(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studentsPointInfoList;
	}

	/** 특정 courseId의 포인트 정보 조회하기 (클릭 시) */ // 50만원 처리... 이게 맞아????
	@Override
	public Collection<ScholarshipStatementVO> getStudentPointsByCourseId(int courseId) {

		List<ScholarshipStatementVO> pointInfoList = new ArrayList<>();

		String sql = "select d.course_id, d.course_name, c.birth, c.name, c.bank, c.account, sum(b.point) as total_point, 500000 as amount "
				+ "from students_points a join points_categories b on a.point_id = b.point_id join students c on a.hrd_net_id = c.hrd_net_id join courses d on d.course_id = c.course_id and d.academy_location = c.academy_location where d.course_id = ? group by d.course_id, c.birth, c.name, d.course_name, c.bank, c.account";

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, courseId);
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						ScholarshipStatementVO data = new ScholarshipStatementVO(rs.getInt(1), rs.getString(2),
								rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),
								rs.getInt(8));

						pointInfoList.add(data);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pointInfoList;
	}

	/** 특정 사용자의 포인트 정보 조회하기 (이름 조회) */
	@Override
	public Collection<ScholarshipStatementVO> getStudentPointByName(String name) {

		List<ScholarshipStatementVO> pointInfoList = new ArrayList<>();

		String sql = "select d.course_id, d.course_name, c.birth, c.name, c.bank, c.account, sum(b.point) as total_point, ? as amount from students_points a join points_categories b on a.point_id = b.point_id join students c on a.hrd_net_id = c.hrd_net_id join courses d on d.course_id = c.course_id and d.academy_location = c.academy_location where c.name = ? group by d.course_id, c.birth, c.name, d.course_name, c.bank, c.account";

		int amount = 500000;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, amount);
				pstmt.setString(2, name);
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						ScholarshipStatementVO data = new ScholarshipStatementVO(rs.getInt(1), rs.getString(2),
								rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),
								rs.getInt(8));
						pointInfoList.add(data);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pointInfoList;
	}

	// 227기 중 특정 사용자의 포인트 정보 조회하기 (이름, 코스id로 검색)
	@Override
	public Collection<ScholarshipStatementVO> getStudentsPointsByCourseIdAndName(String name, int courseId) {
		List<ScholarshipStatementVO> pointInfoList = new ArrayList<>();

		String sql = "select d.course_id, d.course_name, c.birth, c.name, c.bank, c.account, sum(b.point) as total_point, ? as amount "
				+ "from students_pointsa "
				+ "join points_categories b on a.point_id = b.point_id join students c on a.hrd_net_id = c.hrd_net_id "
				+ "join courses d on d.course_id = c.course_id and d.academy_location = c.academy_location "
				+ "where d.course_id = ? and c.name = ? "
				+ "group by d.course_id, c.birth, c.name, d.course_name, c.bank, c.account";

		int amount = 500000;

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, amount);
				pstmt.setInt(2, courseId);
				pstmt.setString(3, name);

				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						ScholarshipStatementVO data = new ScholarshipStatementVO(rs.getInt(1), rs.getString(2),
								rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),
								rs.getInt(8));
						pointInfoList.add(data);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pointInfoList;

	}

	/** 특정 카테고리에 대한 포인트 등록 (table: points_categories) */
	@Override
	public boolean setPointCategory(String category, int point) {
		String sql = "insert into points_categories (point_id, category, point) values(point_id.NEXTVAL, ? , ?)";
		boolean result = false;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, category);
				pstmt.setInt(2, point);
				int num = pstmt.executeUpdate();
				if (num == 1) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	// java.sql.SQLIntegrityConstraintViolationException: ORA-02291: integrity
	// constraint (HR.FK_POINTS_CA_TO_ST_POINTS) violated - parent key not found
	// -> 예외 처리
	/** 특정 사용자의 특정 카테고리에 대한 (point_id 이용) 포인트 등록하기 */
	@Override
	public boolean addPoints(String hrdNetId, int pointId) {
		String sql = "insert into students_points (hrd_net_id, point_id, save_point_date) values(?, ?, sysdate)";

		boolean result = false;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, hrdNetId);
				pstmt.setInt(2, pointId);
				int num = pstmt.executeUpdate();
				if (num == 1) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/** 장학금 대상인 수강생 정보, 장학금 정보 전체 불러오기 */
	@Override
	public Collection<ScholarshipStatementVO> getScholarshipRecipientsInfo() {
		String sql = "select d.course_id, d.course_name, c.birth, c.name, c.bank, c.account, sum(b.point) as total_point, 500000 as amount "
				+ "from students_points a left join points_categories b "
				+ "on a.point_id = b.point_id left join students c on c.hrd_net_id = a.hrd_net_id "
				+ "left join courses d on d.course_id = c.course_id and d.academy_location = c.academy_location "
				+ "where scholarship_settlement_date is null group by d.course_id, c.birth, c.name, d.course_name, c.bank, c.account, 500000 "
				+ "having sum(b.point) >= 50";
		List<ScholarshipStatementVO> studentsPointInfoList = new ArrayList<>();

		try (Connection conn = dataSource.getConnection()) {
			try (Statement stmt = conn.createStatement()) {
				try (ResultSet rs = stmt.executeQuery(sql)) {
					while (rs.next()) {
						ScholarshipStatementVO data = new ScholarshipStatementVO(rs.getInt(1), rs.getString(2),
								rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7),
								rs.getInt(8));
						studentsPointInfoList.add(data);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studentsPointInfoList;

	}

	/** 현재 기준 포인트 50 이상인 전체 대상자의 정산일 입력 (정산버튼) */
	@Override
	public boolean setRecipientsSettlementDate() {
		String sql = "update students set scholarship_settlement_date = sysdate "
				+ "where hrd_net_id in (select a.hrd_net_id from students_points a "
				+ "left join points_categories b on a.point_id = b.point_id "
				+ "where scholarship_settlement_date is null " + "group by a.hrd_net_id having sum(b.point) >= 50)";

		boolean result = false;
		try (Connection conn = dataSource.getConnection()) {
			try (Statement stmt = conn.createStatement()) {
				int rowsAffected = stmt.executeUpdate(sql);
				if (rowsAffected > 0) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/** 현재 기준 포인트 50 이상인 장학금 대상자 중 선택된 사용자의 정산일 입력 (정산버튼) */ // rollback 적용?
	@Override
	public boolean setSelectedRecipientsSettlementDate(Collection<String> selectedStudentsHrdIds) {
		String sql = "update students set scholarship_settlement_date = sysdate "
				+ "where hrd_net_id in (select c.hrd_net_id from students_points a left join points_categories b on a.point_id = b.point_id "
				+ "left join students c on c.hrd_net_id = a.hrd_net_id where c.hrd_net_id in(?) "
				+ "and scholarship_settlement_date is null group by c.hrd_net_id having sum(b.point) >= 50)";

		boolean result = false;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

				for (String hrdId : selectedStudentsHrdIds) {
					pstmt.setString(1, hrdId);
					int num = pstmt.executeUpdate();
					if (num > 0) {
						result = true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/** 현재 기준 포인트 50 이상인 장학금 대상자 중 특정 기수의 정산일 입력 (정산 버튼) */ // rollback?
	
/*	public boolean getSelectedRecipientsSettlementDateByCourseId(int courseId) {
		String sql = "update students set scholarship_settlement_date = sysdate " + "where hrd_net_id in "
				+ "(select c.hrd_net_id from students_points a "
				+ "left join points_categories b on a.point_id = b.point_id left join students c "
				+ "on c.hrd_net_id = a.hrd_net_id where c.course_id = ? " + "and scholarship_settlement_date is null "
				+ "group by c.hrd_net_id having sum(b.point) >= 50)";
		boolean result = false;

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, courseId);
				int num = pstmt.executeUpdate();
				while (num > 0) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
*/
	// 특정 기수의 정산 대상 목록 불러오기정산 조건 충족하는 경우만 불러옴)
	@Override
	public Collection<ScholarshipStatementVO> setScholarshipRecipientsByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ScholarshipStatementVO> getScholarshipRecipientsByCourseIdAndName(int courseId, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScholarshipStatementVO getScholarshipRecipientByHrdNetId(String hrdNetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countScholarshipRecipients() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setSelectedRecipientsSettlementDateByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
