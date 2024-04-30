package com.kosta.selvlet;

public class ActionFactory {

	public static Action getAction(String cmd) {

		Action a = null;
		switch (cmd) {

		// login/logout
		case "loginUI":
			a = new LoginUIAction();
			break;
		case "loginAction":
			a = new LoginAction();
			break;
		case "logoutAction":
			a = new LogoutAction();
			break;

		// notifications
		case "notificationBoardUI":
			a = new NotificationBoardUIAction();
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

		// courses
		case "courseBoardUI":
			a = new CourseBoardUIAction();
			break;
		case "coursePostUI":
			a = new CoursePostUIAction();
			break;
		case "addCourseUI":
			a = new addCourseUIAction();
			break;
		case "addCourseAction":
			a = new addCourseAction();
			break;	
		case "setCourseUI":
			a = new setCourseUIAction();
			break;		
			
		}
		return a;
	}

}
