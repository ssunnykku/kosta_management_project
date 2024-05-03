package servlet;

import servlet.benefits.BenefitBuardUIAction;
import servlet.benefits.BenefitResultBoardUIAction;
import servlet.courses.CourseBoardUIAction;
import servlet.login.LoginAction;
import servlet.login.LoginUIAction;
import servlet.login.LogoutAction;
import servlet.notifications.AddNotificationAction;
import servlet.notifications.AddNotificationUIAction;
import servlet.notifications.DeleteNotificationAction;
import servlet.notifications.NotificationBoardAction;
import servlet.notifications.NotificationBoardPageAction;
import servlet.notifications.NotificationBoardUIAction;
import servlet.notifications.NotificationPageUIAction;
import servlet.notifications.SetNotificationAction;
import servlet.notifications.SetNotificationUIAction;
import servlet.scholarships.ScholarshipBoardUIAction;
import servlet.scholarships.ScholarshipResultBoardUIAction;
import servlet.students.AddAttendanceUIAction;
import servlet.students.AddStudentUIAction;
import servlet.students.AttendanceBoardAction;
import servlet.students.AttendanceBoardUIAction;
import servlet.students.PointBoardAction;
import servlet.students.PointBoardUIAction;
import servlet.students.SetStudentAction;
import servlet.students.StudentBoardUIAction;

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
		/*pagenation*/
		case "notificationBoardPageAction":
			a = new NotificationBoardPageAction();
			break;
			
			/***************** courses ****************/

		case "courseBoardUI":
			a = new CourseBoardUIAction();
			break;

			/***************** scholarships****************/

		case "scholarshipBoardUI":
			a = new ScholarshipBoardUIAction();
			break;

		case "scholarshipResultBoardUI":
			a = new ScholarshipResultBoardUIAction();
			break;
			
			/**********************benefits********************/
		case "benefitBoardUI":
			a = new BenefitBuardUIAction();
			break;

		case "benefitResultBoardUI":
			a = new BenefitResultBoardUIAction();
			break;
		
		/**********************students*********************/
		case "attendanceBoardUI":
			a = new AttendanceBoardUIAction();
			break;
		case "attendanceBoardAction":
			a = new AttendanceBoardAction();
			break;
		case "pointBoardUI":
			a = new PointBoardUIAction();
			break;
		case "pointBoardAction":
			a = new PointBoardAction();
			break;
		case "addAttendanceUI":
			a = new AddAttendanceUIAction();
			break;
		case "addStudentUI":
			a = new AddStudentUIAction();
			break;
		case "setStudentAction":
			a = new SetStudentAction();
			break;
		case "studentBoardUI":
			a = new StudentBoardUIAction();
			break;
		
		}
			
		
		
		return a;
	}



}
