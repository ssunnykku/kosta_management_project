package dao;

import vo.ManagerVO;

public interface ManagerDAO {
	
	boolean addManager(ManagerVO manager);
	
	boolean login(String managerId, String password);
	
	boolean managerExists(String managerId);
}
