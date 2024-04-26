package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import vo.ManagerVO;

public class ManagerDAOImpl implements ManagerDAO {
	//	사번 M2018이고 이름이 홍길동, 비밀번호가 487312인 사원 생성 (managers)
	//	사번 M2018이고 비밀번호가 487312인 사원 로그인하기 (managers)

	//	private Connection conn;
	private DataSource dataSource;
	public ManagerDAOImpl()  throws ClassNotFoundException, SQLException {
		// 1. driver loading -> 객체 생성 new String()
		//		Class.forName("oracle.jdbc.OracleDriver");
		//		System.out.println("1 loading ok");
		//
		//		// 2. Connection
		//		String url = "jdbc:oracle:thin:@192.168.0.67:1521:XE";
		//
		//		conn = DriverManager.getConnection(url, "hr", "hr");
		//		System.out.println("2 connection ok");

		try {
			Context context = new InitialContext();
//			System.out.println(context);
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myoracle");
//			System.out.println(dataSource);

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean login(String managerId, String password) {
		String sql = "select name from managers where manager_id=? and password=?";

		boolean result = false;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  managerId);
			pstmt.setString(2,   password);
			ResultSet rs = pstmt.executeQuery();

			if(rs.next()) {
				if(rs.getString(1) != null) {
					result=true;
				}
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean addManager(ManagerVO manager) {
		// TODO Auto-generated method stub
		return false;
	}
}

