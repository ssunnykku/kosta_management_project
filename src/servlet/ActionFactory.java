package servlet;

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
		}
		return a;

	}


}
