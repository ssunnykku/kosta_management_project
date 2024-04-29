package servlet;

import servlet.login.LoginAction;
import servlet.login.LoginUIAction;
import servlet.login.LogoutAction;
import servlet.notifications.AddNotificationAction;
import servlet.notifications.AddNotificationUIAction;
import servlet.notifications.DeleteNotificationAction;
import servlet.notifications.NotificationBoardAction;
import servlet.notifications.NotificationBoardUIAction;
import servlet.notifications.setNotificationAction;
import servlet.notifications.setNotificationUIAction;

public class ActionFactory {
	public static Action getAction(String cmd) { 
		Action a = null;
		
		switch (cmd) {
		case "loginUI":
			a = new LoginUIAction();
			break;
		case "loginAction":
			a = new LoginAction();
			break;
		case "logoutAction":
			a = new LogoutAction();	
			break;
		case "notificationBoardUI":
			a = new NotificationBoardUIAction();
			break;
		case "notificationBoardAction":
			a = new NotificationBoardAction();
			break;
		case "deleteNotificationAction":
			a = new DeleteNotificationAction();
			break;
		case "addNotificationUI":
			a  = new AddNotificationUIAction();
			break;
		case "addNotificationAction":
			a = new AddNotificationAction();
			break;		
			case "setNotificationUI":
				a = new setNotificationUIAction();
				break;
		case "setNotificationAction":
			a = new setNotificationAction();
			break;
		}
		return a;

	}
}
