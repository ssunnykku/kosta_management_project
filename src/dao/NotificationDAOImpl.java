package dao;

import java.sql.Connection;
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

import vo.NotificationVO;

public class NotificationDAOImpl implements NotificationDAO {

	DataSource dataSource = null;

	public NotificationDAOImpl() {

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

	// M2018 직원이 게시글을 작성
	@Override
	public boolean addNotification(NotificationVO notification) {

		String sql = "insert into notifications (notification_id, title, description, notification_date, manager_id) "
				+ "values (notification_id.NEXTVAL, ?, ?, sysdate, ?)";

		boolean result = false;
		String title = notification.getTitle();
		String description = notification.getDescription();
		String managerId = notification.getManagerId();

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, title);
				pstmt.setString(2, description);
				pstmt.setString(3, managerId);

				int num = pstmt.executeUpdate();
				if (num == 1)
					result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

	/** 전체 게시글 불러오기 (notifications) */
	@Override
	public Collection<NotificationVO> getNotificationsList() {

		String sql = "select n.notification_id, n.title, n.notification_date, m.name from managers m, notifications n where m.manager_id = n.manager_id order by notification_date desc";
		Collection<NotificationVO> boards = new ArrayList<>();

		try (Connection conn = dataSource.getConnection()) {
			try (Statement stmt = conn.createStatement()) {
				try (ResultSet rs = stmt.executeQuery(sql)) {
					while (rs.next()) {
						NotificationVO board = new NotificationVO(rs.getInt(1), rs.getString(2), rs.getString(3),
								rs.getString(4));
						boards.add(board);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // 캐치 하나로 오류 다 잡을 수 있음 / close() 하지 않아도 try가 끝나면 자동으로 close() 호출 /
			// AutoCloseable을 상속받는 애들은 다 쓸 수 있음

		return boards;
	}

	/** 게시글 전체의 갯수 가져오기 */
	@Override
	public int getNotificationNumber() {
		String sql = "select count(notification_id) from notifications";
		int result = 0;

		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/** 게시글 번호가 notificationId번인 게시글의 게시물 번호, 제목, 내용, 게시일, 작성자명 가져오기 */
	@Override
	public NotificationVO getNotification(int notificationId) {

		NotificationVO board = null;

		String sql = "select n.title, n.description, n.notification_date, m.manager_id, m.name from managers m, "
				+ "notifications n where m.manager_id = n.manager_id and notification_id = ?";

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, notificationId);
				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						board = new NotificationVO(notificationId, rs.getString(1), rs.getString(2), rs.getString(3),
								rs.getString(4), rs.getString(5));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return board;
	}

	/** 게시글 번호가 1번인 게시글 수정하기 */ // (로그인검증 해야함-> 매니저 아이디는 db에서 꺼내오기?????????? 로그인
								// 어쩔)
	@Override
	public boolean setNotification(NotificationVO notificationVO) {

		String sql = "update notifications set title = ?, description = ?, notification_date = sysdate where notification_id = ?";
		boolean result = false;

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, notificationVO.getTitle());
				pstmt.setString(2, notificationVO.getDescription());
				pstmt.setInt(3, notificationVO.getNotificationId());
				int num = pstmt.executeUpdate();

				if (num == 1)
					result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	/** 게시글 번호가 1번인 게시글 삭제하기 */
	@Override
	public boolean deleteNodificationById(int notificationId) {
		String sql = "delete notifications where notification_id = ?";
		boolean result = false;

		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notificationId);

			int num = pstmt.executeUpdate();

			if (num == 1)
				result = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

	@Override
	public String getManagerIdByNotificationId(int notificationId) {
		String sql = "select manager_id from notifications where notification_id = ?";
		String managerId = "";

		try (Connection conn = dataSource.getConnection()) {
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, notificationId);

				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next())
						managerId = rs.getString(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return managerId;

	}

}
