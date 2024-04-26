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
			a = new logoutAction();
			break;
		case "notificationUI":
			a = new notificationUIAction();
			break;
		case "notificationPostUI":
			a = new notificationPostUIAction();
			break;
			
		default:
			break;
		}
		return a ;
	}

}
