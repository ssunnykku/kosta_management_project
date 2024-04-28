import java.sql.SQLException;

import dao.ManagerDAOImpl;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ManagerDAOImpl manager = new ManagerDAOImpl();
		System.out.println(manager.login("M2018", "487312"));

		
	}
}
