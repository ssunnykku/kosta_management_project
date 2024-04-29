package dao;

import vo.ManagerVO;

public interface ManagerDAO {
	
	boolean addManager(ManagerVO manager);
	
	boolean login(String managerId, String password);
	
	/**  추가함 */
	ManagerVO getManagerByManagerId(String managerId);
}
