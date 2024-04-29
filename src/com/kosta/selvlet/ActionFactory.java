package com.kosta.selvlet;

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
			a = new NotificationUIAction();
			break;
		case "notificationPostUI":
			a = new NotificationPostUIAction();
			break;
		case "addNotificationUI":
			a = new AddNotificationUIAction();
			break;
		case "addNotification":
			a = new AddNotificationAction();
			break;
		case "setNotificationUI":
			a = new SetNotificationUIAction();
			break;
		case "setNotification":
			a = new SetNotificationAction();
			break;	
		case "removeNotificationAction":
			a = new RemoveNotificationAction();
			break;	
		}
		return a;
	}

}
