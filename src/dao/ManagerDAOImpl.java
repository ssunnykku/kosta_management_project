package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import vo.ManagerVO;

public class ManagerDAOImpl implements ManagerDAO {
	// 사번 M2018이고 이름이 홍길동, 비밀번호가 487312인 사원 생성 (managers)
	// 사번 M2018이고 비밀번호가 487312인 사원 로그인하기 (managers)

	DataSource dataSource = null;

	public ManagerDAOImpl() {
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
	public boolean addManager(ManagerVO manager) {

		return false;
	}

	@Override
	public boolean login(String managerId, String password) {
		String sql = "select password from managers where manager_id = ?";
		boolean result = false;
		String originalPw = "";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, managerId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next())
				originalPw = rs.getString(1);

			if (originalPw.equals(password))
				result = true;

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean managerExists(String managerId) {

		String sql = "select manager_id from managers where manager_id = ?";
		boolean result = false;
		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

				pstmt.setString(1, managerId);

				int num = pstmt.executeUpdate();
				if (num > 0)
					result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
