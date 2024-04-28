
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletionService;

import vo.customVo.ScholarshipStatementVO;
import dao.NotificationDAO;
import dao.NotificationDAOImpl;
import dao.CourseDAO;
import dao.CourseDAOImpl;
import dao.ScholarshipDAO;
import dao.ScholarshipDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import jdbc.JdbcConnectionManager;
import service.CertificationService;
import service.CertificationServiceImpl;
import vo.CourseVO;
import vo.NotificationVO;
import vo.StudentVO;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {
			
//			JdbcTest connector = new JdbcTest();
//			Connection conn = connector.jdbcConnector();
			
			// 怨듭��궗�빆 �뀒�뒪�듃 

//					BoardDAO boards= new BoardDAOImpl(conn);

//					NotificationVO notification = new NotificationVO(1, "�넻�옣 �궗蹂� �젣異� �븞�궡","�궡�뀋�뀋", "2024-01-01", "M2018");
			//		NotificationVO notification2 = new NotificationVO(2, "�넻�옣 �궗蹂� �젣異� �븞�궡","�궡�뀋�뀋", "2024-01-01", "M2018");
//					NotificationVO editData = new NotificationVO(22, "�닔�젙�뻽�뒿�땲�떎.","�궡�뀋�뀋");
//					System.out.println(boards.addNotification(notification));
			//		System.out.println(boards.addNotification(notification2));

			//		System.out.println(boards.getNotificationsList());

			//		System.out.println(boards.getNotificationNumber());
			//
//					System.out.println(boards.getNotification(22));
			//
//					System.out.println(boards.setNotificationById(editData));
//					System.out.println(boards.getNotification(22));
			//		
			//		System.out.println(boards.deleteNodificationById(21) + "�궘�젣");
			//		 


			// 怨쇱젙 愿�由� �뀒�뒪�듃

//
//		CourseDAO courseList = new CourseDAOImpl(conn);

//		CourseVO course = new CourseVO(2, "媛��궛", "Java 湲곕컲 �겢�씪�슦�뱶 媛쒕컻�옄 �뼇�꽦 怨쇱젙",
//				"2024/02/27", "2024/07/31", "Java Web", "梨꾩슜 �삁�젙�옄 臾대즺", 800, 8, 5, 0);
//		CourseVO course2 = new CourseVO(221, "媛��궛", "Java 湲곕컲 �겢�씪�슦�뱶 媛쒕컻�옄 �뼇�꽦 怨쇱젙",
//				"2024/02/27", "2024/07/31", "Java Web", "梨꾩슜 �삁�젙�옄 臾대즺", 800, 8, 5, 0);

//		System.out.println(courseList.addCourseInfo(course));
//		System.out.println(courseList.addCourseInfo(course2));
//
//		for (CourseVO a : courseList.getCoursesList()) {
//			System.out.println(a);
//		}

//		System.out.println(courseList.getNumberOfCourseList());
//
//		System.out.println(courseList.deleteCoursebyCourseId(221));
//
//		System.out.println(courseList.getCourseInfoByCourseId(221));
//
//		System.out.println(courseList.getCourseInfoByAcademyLocation("媛��궛"));
//
//		System.out.println(courseList.setCourseInfo(new CourseVO(221, "媛뺤꽌", "Java 湲곕컲 �겢�씪�슦�뱶 媛쒕컻�옄 �뼇�꽦 怨쇱젙",
//				"2024/02/27", "2024/07/31", "Java Web", "梨꾩슜 �삁�젙�옄 臾대즺", 800, 8, 5, 0)));
//

			// �옣�븰湲�_�룷�씤�듃 �뀒�뒪�듃
//			ScholarshipDAO scholarshipPoint = new ScholarshipDAOImpl(conn);
//			System.out.println(scholarshipPoint.getScholarshipRecipientsInfo());

			
//			for (ScholarshipStatementVO scholarshipStatement : list) {
//				System.out.println(scholarshipStatement);
//			}
			
			List<String> datas = new ArrayList<String>();
			datas.add("youyou33");
			datas.add("whfflekdgg");
//			datas.add("aa");
//			datas.add("kkhhsds"); // �옣�븰湲� ���긽�옄 �븘�떂
//			System.out.println(scholarshipPoint.setSelectedRecipientsSettlementDate(datas));


//			System.out.println(scholarshipPoint.getStudentPointsByCourseId(277));
//			
//			System.out.println(scholarshipPoint.getStudentPointByName("源��꽑�씗"));
			 
//			System.out.println(scholarshipPoint.getStudentsPointsByCourseIdAndName("源��꽑�씗", 277));
			
//			System.out.println(scholarshipPoint.setPointCategory("蹂대꼫�뒪", 10));
			
//			System.out.println(scholarshipPoint.addPoints("whfflekdgg", 21));
			
			
//			System.out.println(scholarshipPoint.getScholarshipRecipientsInfo());
			
//			System.out.println(scholarshipPoint.setRecipientsSettlementDate());
			
//			System.out.println(scholarshipPoint.getSelectedRecipientsSettlementDateByCourseId(277));
		
			// �닔媛뺤깮 
//			StudentDAO student = new StudentDAOImpl();
			
//			System.out.println(student.getStudentInfoList());
			
//			System.out.println(student.getStudentInfoListByCourseId(277));
			
//			System.out.println(student.getStudentInfoListByName("�넀�쑀泥�"));
//			StudentVO st = new StudentVO("sun", "�뀒�뒪�듃", "1999/02/16", "寃쎄린", "�떊�븳", "99552188454","010-8888-8888","sun@gmail.com",1,'1',0,277,"媛��궛");
//			student.addStudent(st);
			

			
			
			/*********** �뀉�뀗�꽮�뀠 �꽮�뀭�뀓�뀗�꽦�뀒�뀠�꽮�뀭�뀋 *************/
		//	StudentDAOTest st = new StudentDAOTest(conn);
			
		//	System.out.println(st.getStudentInfoList());
			
			CertificationService certification = new CertificationServiceImpl();
		//	System.out.println(certification.calculateCompletionRate("goaqjrj959", 800, 8));
			System.out.println(certification.getStudentCompletionInfoList());
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
