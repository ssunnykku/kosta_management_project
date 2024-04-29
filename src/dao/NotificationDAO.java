package dao;

import java.util.Collection;

import vo.NotificationVO;

public interface NotificationDAO {
	
	boolean addNotification(NotificationVO notification);
	
	Collection<NotificationVO> getNotificationsList();
	
	int getNotificationNumber();
	
	NotificationVO getNotification(int notificationId);
	
	boolean setNotification(NotificationVO notificationVO);
	
	boolean deleteNodificationById(int notificationId);
	
	// 추가 메소드
	String getManagerIdByNotificationId(int notificationId);

}