package dao;

import java.util.Collection;

import vo.NotificationVO;
import vo.customVo.NotificationManagerVO;

public interface NotificationDAO {
	
	boolean addNotification(NotificationVO  notification);
	
	Collection<NotificationManagerVO> getNotificationsList();
	
//	int getNotificationNumber();
	
	NotificationManagerVO getNotification(int notificationId);
	
	boolean setNotificationById(NotificationVO notificationVo);
	
	boolean deleteNodificationById(int notificationId);

}