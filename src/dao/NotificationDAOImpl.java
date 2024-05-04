package dao;

import java.sql.Connection;
import vo.NotificationVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import vo.customVo.NotificationManagerVO;

public class NotificationDAOImpl implements NotificationDAO {

	private Connection conn;
	private DataSource dataSource;
	
	public NotificationDAOImpl() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myoracle");
			conn = dataSource.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//	M2018 직원이 게시글을 작성
	@Override   
	public boolean addNotification(NotificationVO notification ) {
		
		String sql =  "insert into notifications (notification_id, title, description, notification_date, manager_id) "
				+ "values (notification_id.NEXTVAL, ?, ?, sysdate, ?)";

		boolean result = false;
		String title = notification.getTitle();
		String description = notification.getDescription();
		String managerId = notification.getManagerId();

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setString(3, managerId);

			int num = pstmt.executeUpdate();
			if(num==1)
				result=true;
			
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

	/** 전체 게시글 불러오기 (notifications) */
	@Override
	public Collection<NotificationManagerVO> getNotificationsList() {

		String sql = "select n.notification_id, n.title, to_char(n.notification_date, 'yyyy-mm-dd') as notification_date, m.name "
				+ "from managers m, notifications n where m.manager_id = n.manager_id "
				+ "order by notification_id desc, notification_date desc";
		
		List<NotificationManagerVO> boards = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NotificationManagerVO board = new NotificationManagerVO(
						rs.getInt("notification_id"), 
						rs.getString("title"),
						rs.getString("notification_date"), 
						rs.getString("name"));
				boards.add(board);
			}
			
			System.out.println(boards);
			
			rs.close();
			stmt.close();
			conn.close();
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return boards;
	}


	/** 게시글 번호가 notificationId번인 게시글의 게시물 번호, 제목, 내용, 게시일, 작성자명 가져오기 */
	@Override
	public NotificationManagerVO getNotification(int notificationId) {
		
		NotificationManagerVO board = null;
		
		String sql = "select"
				+ " n.notification_id, "
				+ "n.title, "
				+"n.description,"
				+ "to_char(n.notification_date, 'yyyy-mm-dd') as notification_date,"
				+ " m.name "
				+ "from managers m, notifications n where m.manager_id = n.manager_id and notification_id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notificationId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new NotificationManagerVO(
						rs.getInt(1), 
						rs.getString(2),  
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5));
	        }
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return board;
	}

	/**	게시글 번호가 1번인 게시글 수정하기 */ // (로그인검증 해야함-> 매니저 아이디는 db에서 꺼내오기?????????? 로그인 어쩔)
	@Override
	public boolean setNotificationById(NotificationVO notificationVo) {
		
		String sql = "update notifications set title = ?, description = ?, notification_date = sysdate where notification_id = ?";
		boolean result = false;
		
		int notificationId = notificationVo.getNotificationId();
		String title = notificationVo.getTitle();
		String description = notificationVo.getDescription();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, description);
			pstmt.setInt(3, notificationId);

			int num = pstmt.executeUpdate();
			
			if(num==1)
				result=true;

			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/**	게시글 번호가 1번인 게시글 삭제하기 */
	@Override
	public boolean deleteNodificationById(int notificationId) {
		String sql = "delete notifications where notification_id = ?";
		boolean result = false; 
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notificationId);

			int num = pstmt.executeUpdate();
			
			if(num==1)
				result=true;

			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

/** 페이지네이션 적용 **/
public Collection<NotificationManagerVO> getNotificationsListPerPage(int offset, int page) {

	String sql = "SELECT * FROM (SELECT ROWNUM AS RN, notification_id, title, notification_date, name "
			+ "FROM (SELECT n.notification_id, n.title, n.notification_date, m.name FROM managers m, notifications n "
			+ "WHERE m.manager_id = n.manager_id ORDER BY notification_id DESC, notification_date DESC)) "
			+ "WHERE RN BETWEEN +"+((page*offset)-(offset-1))+" AND "+page*offset;

		List<NotificationManagerVO> boards = new ArrayList<>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NotificationManagerVO board = new NotificationManagerVO(
						rs.getInt("notification_id"), 
						rs.getString("title"),
						rs.getString("notification_date"), 
						rs.getString("name"));
				boards.add(board);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return boards;
	}

public int getFirstNotificationId() {

	String sql = "select notification_id from (select notification_id from notifications "
			+ "order by notification_id desc, notification_date desc) "
			+ "where rownum = 1";

		int result = 0;

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}  catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
}
