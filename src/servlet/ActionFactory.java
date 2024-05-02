package servlet;

import servlet.courses.CourseBoardUIAction;
import servlet.login.LoginAction;
import servlet.login.LoginUIAction;
import servlet.login.LogoutAction;
import servlet.notifications.AddNotificationAction;
import servlet.notifications.AddNotificationUIAction;
import servlet.notifications.DeleteNotificationAction;
import servlet.notifications.NotificationBoardAction;
import servlet.notifications.NotificationBoardUIAction;
import servlet.notifications.NotificationPageUIAction;
import servlet.notifications.SetNotificationAction;
import servlet.notifications.SetNotificationUIAction;

public class ActionFactory {
	public static Action getAction(String cmd) { 
		Action a = null;

		switch (cmd) {
		/***************** login ****************/
		case "loginUI":
			a = new LoginUIAction();
			break;
		case "loginAction":
			a = new LoginAction();
			break;
		case "logoutAction":
			a = new LogoutAction();	
			break;

			/***************** notification ****************/
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
			a = new SetNotificationUIAction();
			break;
		case "setNotificationAction":
			a = new SetNotificationAction();
			break;
		case "notificationPageUI":
			a = new NotificationPageUIAction();
			break;

			/***************** courses ****************/
			
		case "courseBoardUI":
			a = new CourseBoardUIAction();
			break;
		}
		return a;
	}
}
