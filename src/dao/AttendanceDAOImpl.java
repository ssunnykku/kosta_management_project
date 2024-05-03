package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jdbc.JdbcConnectionManager;
import vo.AttendanceVO;

public class AttendanceDAOImpl implements AttendanceDAO {

	DataSource dataSource = null;

	public AttendanceDAOImpl() throws ClassNotFoundException, SQLException {
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
	public Collection<AttendanceVO> getStudentAttendanceList() {
		String sql = "select attendance_date, hrd_net_id, attendance_status from attendances";

		List<AttendanceVO> attendanceInfoList = new ArrayList<>();

		try (Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				String attendanceDate = rs.getString("attendance_date");
				String hrdNetId = rs.getString("hrd_net_id");
				int attendanceStatus = rs.getInt("attendance_status");
				attendanceInfoList.add(new AttendanceVO(attendanceDate, hrdNetId, attendanceStatus));
			}

		} catch (Exception e) {
		}

		return attendanceInfoList;
	}

	@Override
	public Collection<AttendanceVO> getStudentAttendanceByHrdNetId(String hrdNetId) {
		String sql = "select attendance_date, hrd_net_id, attendance_status from attendances where hrd_net_id = ? ";

		List<AttendanceVO> attendanceInfoList = new ArrayList<>();
		try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, hrdNetId);
			try (ResultSet rs = pstmt.executeQuery()) {

				while (rs.next()) {
					String attendanceDate = rs.getString("attendance_date");
					int attendanceStatus = rs.getInt("attendance_status");

					attendanceInfoList.add(new AttendanceVO(attendanceDate, hrdNetId, attendanceStatus));
				}
			}
		} catch (Exception e) {
		}

		return attendanceInfoList;
	}

}
