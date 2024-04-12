package dao;

import java.util.Collection;

import vo.NotificationVO;

public interface BoardDAO {
	
	boolean addNotification(NotificationVO notification);
	
	Collection<NotificationVO> getNotificationsList();
	
	int getNotificationNumber();
	
	NotificationVO getNotification(int notificationId);
	
	boolean setNotificationById(NotificationVO notificationVo);
	
	boolean deleteNodificationById(int notificationId);

}