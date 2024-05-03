package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import vo.customVo.StudentCourseVO;
import vo.StudentVO;

public class StudentDAOImpl implements StudentDAO {

	DataSource dataSource = null;

	public StudentDAOImpl() {

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

	/** 전체 수강생 목록 불러오기(students) */
	@Override
	public Collection<StudentVO> getStudentInfoList() {
		String sql = "select hrd_net_id, name, birth, province, bank, "
				+ "account, phone_number, email, completion_status, course_id " + "from students";
		Collection<StudentVO> studentVOs = new ArrayList<>();

		try (Connection conn = dataSource.getConnection()) {
			try (Statement stmt = conn.createStatement()) {
				try (ResultSet rs = stmt.executeQuery(sql)) {
					while (rs.next()) {
						StudentVO studentVO = new StudentVO(rs.getString(1), rs.getString(2),
								rs.getDate(3).toLocalDate(), rs.getString(4), rs.getString(5), rs.getString(6),
								rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
						studentVOs.add(studentVO);
					}
				}
			}
		} catch (Exception e) {
		}
		return studentVOs;

	}

	/** 특정 기수의 수강생 목록 불러오기 */
	@Override
	public Collection<StudentVO> getStudentInfoListByCourseId(int courseId) {

		String sql = "select hrd_net_id, name, birth, province, bank "
				+ "account, phone_number, email, completion_status, course_id " + "from students where course_id = ?";

		Collection<StudentVO> studentVOs = new ArrayList<>();
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, courseId);
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						StudentVO studentVO = new StudentVO(rs.getString(1), rs.getString(2),
								rs.getDate(3).toLocalDate(), rs.getString(4), rs.getString(5), rs.getString(6),
								rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
						studentVOs.add(studentVO);
					}
				}
			}
		} catch (Exception e) {
		}
		return studentVOs;
	}

	/** 특정 이름을 가진 수강생 목록 불러오기 */
	@Override
	public Collection<StudentVO> getStudentInfoListByName(String name) {
		String sql = "select hrd_net_id, name, birth, province, bank "
				+ "account, phone_number, email, completion_status, course_id " + "from students where name = ?";

		Collection<StudentVO> studentVOs = new ArrayList<>();

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, name);
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						StudentVO studentVO = new StudentVO(rs.getString(1), rs.getString(2),
								rs.getDate(3).toLocalDate(), rs.getString(4), rs.getString(5), rs.getString(6),
								rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
						studentVOs.add(studentVO);
					}
				}
			}
		} catch (Exception e) {
		}

		return studentVOs;

	}

	/** 새로운 수강생 정보를 등록하기 -1 */
	@Override
	public boolean addStudent(StudentVO studentVO) {
		String sql = "insert into students "
				+ "(hrd_net_id, name, birth, province, bank, account, phone_number,email,completion_status,gender,completion_rate,course_id,academy_location)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?)";

		boolean result = false;

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

				pstmt.setString(1, studentVO.getHrdNetId());
				pstmt.setString(2, studentVO.getName());
				pstmt.setDate(3, Date.valueOf(studentVO.getBirth()));
				pstmt.setString(4, studentVO.getProvince());
				pstmt.setString(5, studentVO.getBank());
				pstmt.setString(6, studentVO.getAccount());
				pstmt.setString(7, studentVO.getPhoneNumber());
				pstmt.setString(8, studentVO.getEmail());
				pstmt.setInt(9, studentVO.getCompletionStatus());
				pstmt.setString(10, String.valueOf(studentVO.getGender()));
				pstmt.setDouble(11, studentVO.getCompletionRate());
				pstmt.setInt(12, studentVO.getCourseId());
				pstmt.setString(13, studentVO.getAcademyLocation());

				int num = pstmt.executeUpdate();

				if (num == 1)
					result = true;
			}
		} catch (Exception e) {
		}

		return result;
	}

	/** 특정 아이디를 가진 학생의 정보를 수정하기 */
	@Override
	public boolean setStudentInfoByHrdNetId(StudentVO studentVO) {
		String sql = "update students set name = '송송송', birth='2006/09/27', province='경기', bank='농협', account='3020666993805', phone_number='010-3333-8888',email='gndgnd@gmail.com',gender=1,course_id=191,academy_location=(select academy_location from courses where course_id=191)\n"
				+ "where hrd_net_id='dnWkf'";
		// TODO Auto-generated method stub
		return false;
	}

	// attendances, students
	/** 전체 학생의 출결 정보를 불러오기(students, attendances) */
	// @Override
	// public Collection<StudentCompletionVO> getStudentCourseInfoList() {
	// String sql = "select b.hrd_net_id, c.course_id, b.name, b.birth, "
	// + "c.total_training_hours/c.training_hours_of_day as course_duration_day,
	// "
	// + "b.completion_rate, b.completion_Status from attendances a left join
	// students b on a.hrd_net_id = b.hrd_net_id left join courses c on
	// b.course_id = c.course_id and b.academy_location = c.academy_location";
	// List<StudentCompletionVO> studentsList = new ArrayList<>();
	//
	// try {
	// Statement stmt = conn.createStatement();
	// ResultSet rs = stmt.executeQuery(sql);
	// while(rs.next()) {
	// StudentCompletionVO studentInfo = new StudentCompletionVO(
	// rs.getString("hrd_net_id"),
	// rs.getInt("course_id"),
	// rs.getString("name"),
	// rs.getString("birth"),
	// rs.getInt(5),
	// rs.getDouble("completion_rate"),
	// rs.getInt("completion_Status"));
	// studentsList.add(studentInfo);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return studentsList;
	// }

	// attendances, students
	/** 특정 기수에 속한 학생들의 출결 정보를 불러오기 */
	@Override
	public Collection<StudentCourseVO> getStudentCourseInfoListByCourseId(int courseId) {
		String sql = "select s.course_id, s.name, s.birth, c.total_training_hours / c.training_hours_of_day as total_training_day\n"
				+ "from students s, courses c\n" + "where s.course_id = c.course_id and c.course_id = 277";
		// TODO Auto-generated method stub

		return null;
	}

	// attendances, students
	/** 특정 이름을 가진 학생의 출결 정보를 불러오기 */
	@Override
	public Collection<StudentCourseVO> getStudentCourseInfoListByName(int name) {
		String sql = "select s.course_id, s.name, s.birth, c.total_training_hours / c.training_hours_of_day as total_training_day\n"
				+ "from students s, courses c\n" + "where s.course_id = c.course_id and s.name = '김선희'";
		// TODO Auto-generated method stub
		return null;
	}

	// attendances, students
	/** "특정 아이디를 가진 학생의 출결 입력하기 (출결 입력 시 수료율 계산하여 넣기) (수료율 계산 시 수료 여부 계산하여 넣기)" */
	@Override
	public boolean addStudentCourseInfoByHrdNetId(StudentCourseVO studentCourseVO) {
		String sql = "INSERT INTO attendances (hrd_net_id, attendance_date, attendance_status) VALUES ('wlgus4400', '2023-09-01', 4);\n"
				+ "\n" + "-- 수료율 계산\n"
				+ "select (select (total_training_hours / training_hours_of_day) - coalesce((select count(attendance_date) + (select count(attendance_date)/3\n"
				+ "from attendances\n" + "where attendance_status != 1 and hrd_net_id = 'wlgus4400')\n"
				+ "from attendances where attendance_status=1 and hrd_net_id = 'wlgus4400'\n"
				+ "group by hrd_net_id),0)\n"
				+ "from courses where course_id=277)/(total_training_hours / training_hours_of_day)*100 from courses where course_id=277;\n"
				+ "\n" + "-- 수료율이 80% 이상인지 판별 후 수료 여부 변경\n" + "update students set completion_status= 2\n"
				+ "where hrd_net_id = 'wlgus4400'";
		// TODO Auto-generated method stub
		return false;
	}

}
