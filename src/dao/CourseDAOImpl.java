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

import jdbc.JdbcConnectionManager;
import vo.CourseVO;

public class CourseDAOImpl implements CourseDAO {

//	JdbcConnectionManager jdbc = JdbcConnectionManager.getJdbcConector();
	Connection conn = JdbcConnectionManager.jdbcConnector();
	public CourseDAOImpl() throws ClassNotFoundException, SQLException {

	}

	/** 과정 전체 정보 불러오기 */
	@Override
	public Collection<CourseVO> getCoursesList() {

		List<CourseVO> courseList = new ArrayList<>();
		String sql = "select course_id, academy_location,course_name,"
				+ "course_start_date,course_end_date,"
				+ "subject,course_type,"
				+ "total_training_hours,training_hours_of_day,"
				+ "number_of_months,number_of_settlement "
				+ "from courses";

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				CourseVO course = new CourseVO(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), 
						rs.getString(6), rs.getString(7), 
						rs.getInt(8), rs.getInt(9),
						rs.getInt(10), rs.getInt(11));
				courseList.add(course);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		return courseList;
	}


	/** 과정 전체의 갯수 가져오기 */
	@Override
	public int getNumberOfCourseList() {

		String sql = "select count(course_id) from courses";
		int num = 0;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				num = rs.getInt(1);
			}
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return num;
	}

	/** 특정 기수의 과정 삭제하기 */
	@Override
	public boolean deleteCoursebyCourseId(int courseId) {

		String sql = "delete courses where course_id = ?";
		boolean result = false;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, courseId);

			int num = pstmt.executeUpdate();

			if(num==1)
				result=true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/** 특정 기수의 과정 불러오기 */
	@Override
	public CourseVO getCourseInfoByCourseId(int courseId) {

		CourseVO course = null;

		String sql = "select course_id, academy_location,  course_name, course_start_date, "
				+ "course_end_date, subject, course_type, total_training_hours, "
				+ "training_hours_of_day, number_of_months, number_of_settlement "
				+ "from courses where course_id = ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, courseId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				course =  new CourseVO(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), 
						rs.getString(6), rs.getString(7), 
						rs.getInt(8), rs.getInt(9),
						rs.getInt(10), rs.getInt(11));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return course;
	}

	/** 특정 강의장의 강의 정보 불러오기 */
	@Override
	public Collection<CourseVO> getCourseInfoByAcademyLocation(String academyLocation) {

		List<CourseVO> courseList = new ArrayList<CourseVO>();

		String sql = "select course_id,academy_location,"
				+ "course_name,course_start_date,"
				+ "course_end_date,subject,"
				+ "course_type,total_training_hours,"
				+ "training_hours_of_day,number_of_months,number_of_settlement "
				+ "from courses where academy_location = ? ";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, academyLocation);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				courseList.add(new CourseVO(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), 
						rs.getString(6), rs.getString(7), 
						rs.getInt(8), rs.getInt(9),
						rs.getInt(10), rs.getInt(11)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return courseList;
	}

	/** 과정 정보 등록하기 */
	@Override
	public boolean addCourseInfo(CourseVO course) {

		String sql = "insert into courses "
				+ "(course_id,academy_location,course_name,"
				+ "course_start_date,course_end_date,"
				+ "subject,course_type,"
				+ "total_training_hours,training_hours_of_day, "
				+ "number_of_months, number_of_settlement) "
				+ "values(?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?)";

		boolean result = false;

		int courseId = course.getCourseId();
		String academyLocation = course.getAcademyLocation(); 
		String name = course.getCourseName();
		String courseStartDate = course.getCourseStartDate();
		String courseEndDate = course.getCourseEndDate();
		String subject = course.getSubject(); 
		String courseType = course.getCourseType();
		int totalTrainingHours = course.getTotalTrainingHours();
		int trainingHoursOfDay = course.getTrainingHoursOfDay(); 
		int numberOfMonths = course.getNumberOfMonths();
		int numberOfSettlement = 0;		


		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, courseId); 
			pstmt.setString(2, academyLocation); 
			pstmt.setString(3, name);
			pstmt.setString(4, courseStartDate); 
			pstmt.setString(5, courseEndDate); 
			pstmt.setString(6, subject);
			pstmt.setString(7, courseType); 
			pstmt.setInt(8, totalTrainingHours); 
			pstmt.setInt(9, trainingHoursOfDay);
			pstmt.setInt(10, numberOfMonths); 
			pstmt.setInt(11, numberOfSettlement);

			int num = pstmt.executeUpdate();

			if(num==1)
				result=true;
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/** 과정 정보 수정하기 */
	@Override
	public boolean setCourseInfo(CourseVO course) {

		boolean result = false;

		String sql = "update courses "
				+ "set course_id= ?,"
				+ "academy_location= ?,"
				+ "course_name= ?, "
				+ "course_start_date= ? ,"
				+ "course_end_date= ? ,"
				+ "subject= ?,"
				+ "course_type= ?, "
				+ "total_training_hours= ?,"
				+ "training_hours_of_day= ?, "
				+ "number_of_months= ?, "
				+ "number_of_settlement = ? "
				+ "where course_id= ?";

		int courseId = course.getCourseId();
		String academyLocation = course.getAcademyLocation(); 
		String name = course.getCourseName();
		String courseStartDate = course.getCourseStartDate();
		String courseEndDate = course.getCourseEndDate();
		String subject = course.getSubject(); 
		String courseType = course.getCourseType();
		int totalTrainingHours = course.getTotalTrainingHours();
		int trainingHoursOfDay = course.getTrainingHoursOfDay(); 
		int numberOfMonths = course.getNumberOfMonths();
		int numberOfSettlement = course.getNumberOfSettlement();		


		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, courseId); 
			pstmt.setString(2, academyLocation); 
			pstmt.setString(3, name);
			pstmt.setString(4, courseStartDate); 
			pstmt.setString(5, courseEndDate); 
			pstmt.setString(6, subject);
			pstmt.setString(7, courseType); 
			pstmt.setInt(8, totalTrainingHours); 
			pstmt.setInt(9, trainingHoursOfDay);
			pstmt.setInt(10, numberOfMonths); 
			pstmt.setInt(11, numberOfSettlement);
			pstmt.setInt(12, courseId);

			int num = pstmt.executeUpdate();

			if(num==1)
				result=true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}



}
