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

	private Connection conn;
	private DataSource dataSource;
	public ManagerDAOImpl()  throws ClassNotFoundException, SQLException {
		try {
			Context context = new InitialContext();

			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myoracle");
			conn = dataSource.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String managerId, String password) {
		String sql = "select name from managers where manager_id=? and password=?";

		boolean result = false;
		try {
//			Connection conn = dataSource.getConnection();
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

	@Override
	public ManagerVO getManagerByManagerId(String managerId) {
		String sql = "select * from managers where manager_id = ? ";
		ManagerVO managerInfo = null;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  managerId);
			ResultSet rs = pstmt.executeQuery();
			
			String id;
			String name;
			
			if(rs.next()) {
				 id = rs.getString(1);
				 name = rs.getString(2);
				 managerInfo = new ManagerVO(id, name);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return managerInfo;
	}
	

	
}

