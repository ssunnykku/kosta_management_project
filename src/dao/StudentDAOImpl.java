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

import jdbc.JdbcTest;
import vo.customVo.StudentCourseVO;
import vo.StudentVO;

public class StudentDAOImpl implements StudentDAO {
	
	Connection conn = JdbcTest.jdbcConnector();
	
	public StudentDAOImpl() throws ClassNotFoundException, SQLException {

	}
	
	/** 전체 수강생 목록 불러오기(students) */
	@Override
	public Collection<StudentVO> getStudentInfoList() throws ClassNotFoundException, SQLException  {
		String sql = "select hrd_net_id, course_id, name, "
				+ "birth, province, bank, account, "
				+ "phone_number,email,completion_status "
				+ "from students";
		List<StudentVO> studentsList = new ArrayList<>();

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				StudentVO studentInfo = new StudentVO(
						rs.getString("hrd_net_id"),
						rs.getInt("course_id"), 
						rs.getString("name"), 
						rs.getString("birth"), 
						rs.getString("province"), 
						rs.getString("bank"), 
						rs.getString("account"), 
						rs.getString("phone_number"), 
						rs.getString("email"), 
						rs.getInt("completion_status"));
				studentsList.add(studentInfo);
			}
		return studentsList;
	}
	
	/** 특정 기수의 수강생 목록 불러오기 */
	@Override
	public Collection<StudentVO> getStudentInfoListByCourseId(int courseId) throws ClassNotFoundException, SQLException  {
		
		String sql = "select hrd_net_id, course_id, name, "
				+ "birth, province, bank, account, "
				+ "phone_number,email,completion_status "
				+ "from students "
				+ "where course_id = ?";
		
		List<StudentVO> studentsList = new ArrayList<>();
		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, courseId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				studentsList.add(new StudentVO(
						rs.getString("hrd_net_id"),
						rs.getInt("course_id"), 
						rs.getString("name"), 
						rs.getString("birth"), 
						rs.getString("province"), 
						rs.getString("bank"), 
						rs.getString("account"), 
						rs.getString("phone_number"), 
						rs.getString("email"), 
						rs.getInt("completion_status")));
						
	        }
		
		return studentsList;
	}

	/** 특정 이름을 가진 수강생 목록 불러오기 */
	@Override
	public Collection<StudentVO> getStudentInfoListByName(String name) throws ClassNotFoundException, SQLException {
		String sql = "select hrd_net_id, course_id, name, "
				+ "birth, province, bank, account, "
				+ "phone_number,email,completion_status "
				+ "from students "
				+ "where name = ?";
		
		List<StudentVO> studentsList = new ArrayList<>();
		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				studentsList.add(new StudentVO(
						rs.getString("hrd_net_id"),
						rs.getInt("course_id"), 
						rs.getString("name"), 
						rs.getString("birth"), 
						rs.getString("province"), 
						rs.getString("bank"), 
						rs.getString("account"), 
						rs.getString("phone_number"), 
						rs.getString("email"), 
						rs.getInt("completion_status")));
						
	        }
		
		return studentsList;

	}

	/** 새로운 수강생 정보를 등록하기 -1 */
	@Override
	public boolean addStudent(StudentVO studentVO) throws ClassNotFoundException, SQLException {
		String sql = "insert into students "
				+ "(hrd_net_id, name, birth, province, bank, account, phone_number,email,completion_status,gender,completion_rate,course_id,academy_location)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?)";
		
		boolean result = false;
		
		String hrdNetId = studentVO.getHrdNetId();
		String name = studentVO.getName();
		String birth = studentVO.getBirth();
		String province = studentVO.getProvince();
		String bank = studentVO.getBank();
		String account = studentVO.getAccount();
		String phoneNumber = studentVO.getPhoneNumber();
		String email = studentVO.getEmail();
		int completionStatus = studentVO.getCompletionStatus();
		char gender = studentVO.getGender();
		double completionRate = studentVO.getCompletionRate();
		int courseId = studentVO.getCourseId();
		String academyLocation = studentVO.getAcademyLocation();

		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, hrdNetId);
		    pstmt.setString(2, name);
		    pstmt.setString(3, birth);
		    pstmt.setString(4, province);
		    pstmt.setString(5, bank);
		    pstmt.setString(6, account);
		    pstmt.setString(7, phoneNumber);
		    pstmt.setString(8, email);
		    pstmt.setInt(9, completionStatus);
		    pstmt.setString(10, String.valueOf(gender));
		    pstmt.setDouble(11, completionRate);
		    pstmt.setInt(12, courseId);
		    pstmt.setString(13, academyLocation);
			
			int num = pstmt.executeUpdate();
			if(num==1)
				result=true;

		return result;
	}

	/**	특정 아이디를 가진 학생의 정보를 수정하기 */
	@Override
	public boolean setStudentInfoByHrdNetId(StudentVO studentVO) {
		String sql = "update students set name = '송송송', birth='2006/09/27', province='경기', bank='농협', account='3020666993805', phone_number='010-3333-8888',email='gndgnd@gmail.com',gender=1,course_id=191,academy_location=(select academy_location from courses where course_id=191)\n"
				+ "where hrd_net_id='dnWkf'";
		// TODO Auto-generated method stub
		return false;
	}

	// attendances, students
	/**전체 학생의 출결 정보를 불러오기(students, attendances) */
//	@Override
//	public Collection<StudentCompletionVO> getStudentCourseInfoList() {
//		String sql = "select b.hrd_net_id, c.course_id, b.name, b.birth,  "
//				+ "c.total_training_hours/c.training_hours_of_day as course_duration_day, "
//				+ "b.completion_rate, b.completion_Status from attendances a left join students b on a.hrd_net_id = b.hrd_net_id left join courses c on b.course_id = c.course_id and b.academy_location = c.academy_location";
//		List<StudentCompletionVO> studentsList = new ArrayList<>();
//
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				StudentCompletionVO studentInfo = new StudentCompletionVO(
//						rs.getString("hrd_net_id"),
//						rs.getInt("course_id"), 
//						rs.getString("name"), 
//						rs.getString("birth"), 
//						rs.getInt(5), 
//						rs.getDouble("completion_rate"), 
//						rs.getInt("completion_Status"));
//				studentsList.add(studentInfo);
//			}
//		}  catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return studentsList;
//	}

	// attendances, students
	/** 특정 기수에 속한 학생들의 출결 정보를 불러오기 */
	@Override
	public Collection<StudentCourseVO> getStudentCourseInfoListByCourseId(int courseId) {
		String sql = "select s.course_id, s.name, s.birth, c.total_training_hours / c.training_hours_of_day as total_training_day\n"
				+ "from students s, courses c\n"
				+ "where s.course_id = c.course_id and c.course_id = 277";
		// TODO Auto-generated method stub
		
		return null;
	}

	// attendances, students
	/** 특정 이름을 가진 학생의 출결 정보를 불러오기 */
	@Override
	public Collection<StudentCourseVO> getStudentCourseInfoListByName(int name) {
		String sql = "select s.course_id, s.name, s.birth, c.total_training_hours / c.training_hours_of_day as total_training_day\n"
				+ "from students s, courses c\n"
				+ "where s.course_id = c.course_id and s.name = '김선희'";
		// TODO Auto-generated method stub
		return null;
	}
	
	// attendances, students
	/** "특정 아이디를 가진 학생의 출결 입력하기 (출결 입력 시 수료율 계산하여 넣기) (수료율 계산 시 수료 여부 계산하여 넣기)" */
	@Override
	public boolean addStudentCourseInfoByHrdNetId(StudentCourseVO studentCourseVO) {
		String sql = "INSERT INTO attendances (hrd_net_id, attendance_date, attendance_status) VALUES ('wlgus4400', '2023-09-01', 4);\n"
				+ "\n"
				+ "-- 수료율 계산\n"
				+ "select (select (total_training_hours / training_hours_of_day) - coalesce((select count(attendance_date) + (select count(attendance_date)/3\n"
				+ "from attendances\n"
				+ "where attendance_status != 1 and hrd_net_id = 'wlgus4400')\n"
				+ "from attendances where attendance_status=1 and hrd_net_id = 'wlgus4400'\n"
				+ "group by hrd_net_id),0)\n"
				+ "from courses where course_id=277)/(total_training_hours / training_hours_of_day)*100 from courses where course_id=277;\n"
				+ "\n"
				+ "-- 수료율이 80% 이상인지 판별 후 수료 여부 변경\n"
				+ "update students set completion_status= 2\n"
				+ "where hrd_net_id = 'wlgus4400'";
		// TODO Auto-generated method stub
		return false;
	}

}
