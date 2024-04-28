package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionManager {

	
	private static final JdbcConnectionManager INSTANCE = new JdbcConnectionManager();

	private JdbcConnectionManager() {}

	public static JdbcConnectionManager getJdbcConector() throws ClassNotFoundException, SQLException{
		return INSTANCE;
	}

	public static Connection jdbcConnector() throws ClassNotFoundException, SQLException{
		// 1. driver loading -> 객체 생성 new String()
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1 loading ok");

		// 2. Connection
		String url = "jdbc:oracle:thin:@192.168.0.67:1521:XE";

		Connection conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2 connection ok");

		return conn;
	}



}
