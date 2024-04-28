package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jdbc.JdbcTest;
import vo.AttendanceVO;

public class AttendanceDAOImpl implements AttendanceDAO {

	Connection conn;

	public AttendanceDAOImpl() throws ClassNotFoundException, SQLException {
		conn = new JdbcTest().jdbcConnector();
	}

	@Override
	public Collection<AttendanceVO> getStudentAttendanceList() throws ClassNotFoundException, SQLException  {
		String sql = "select attendance_date, hrd_net_id, attendance_status from attendances";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		List<AttendanceVO> attendanceInfoList = new ArrayList<>();
		
		while(rs.next()) {
			String attendanceDate = rs.getString("attendance_date");
			String hrdNetId = rs.getString("hrd_net_id");
			int attendanceStatus = rs.getInt("attendance_status");
			attendanceInfoList.add(new AttendanceVO(attendanceDate, hrdNetId, attendanceStatus));
		}
		return attendanceInfoList;
	}

	@Override
	public Collection<AttendanceVO> getStudentAttendanceByHrdNetId(String hrdNetId) throws ClassNotFoundException, SQLException  {
		String sql = "select attendance_date, hrd_net_id, attendance_status from attendances where hrd_net_id = ? ";
		
		List<AttendanceVO> attendanceInfoList = new ArrayList<>();

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, hrdNetId);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String attendanceDate = rs.getString("attendance_date");
			int attendanceStatus = rs.getInt("attendance_status");
			
			attendanceInfoList.add(new AttendanceVO(attendanceDate, hrdNetId, attendanceStatus));
		}
		
		return attendanceInfoList;
	}

}
