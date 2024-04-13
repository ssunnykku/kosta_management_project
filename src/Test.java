
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import customVo.ScholarshipStatementVO;
import dao.BoardDAO;
import dao.BoardDAOImpl;
import dao.CourseDAO;
import dao.CourseDAOImpl;
import dao.ScholarshipDAO;
import dao.ScholarshipDAOImpl;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import daoTest.StudentDAOTest;
import jdbc.JdbcTest;
import vo.CourseVO;
import vo.NotificationVO;
import vo.StudentVO;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {
			
			JdbcTest connector = new JdbcTest();
			Connection conn = connector.jdbcConnector();
			
			// 공지사항 테스트 

//					BoardDAO boards= new BoardDAOImpl(conn);

//					NotificationVO notification = new NotificationVO(1, "통장 사본 제출 안내","내ㅇㅇ", "2024-01-01", "M2018");
			//		NotificationVO notification2 = new NotificationVO(2, "통장 사본 제출 안내","내ㅇㅇ", "2024-01-01", "M2018");
//					NotificationVO editData = new NotificationVO(22, "수정했습니다.","내ㅇㅇ");
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
			//		System.out.println(boards.deleteNodificationById(21) + "삭제");
			//		 


			// 과정 관리 테스트

//
//		CourseDAO courseList = new CourseDAOImpl(conn);

//		CourseVO course = new CourseVO(2, "가산", "Java 기반 클라우드 개발자 양성 과정",
//				"2024/02/27", "2024/07/31", "Java Web", "채용 예정자 무료", 800, 8, 5, 0);
//		CourseVO course2 = new CourseVO(221, "가산", "Java 기반 클라우드 개발자 양성 과정",
//				"2024/02/27", "2024/07/31", "Java Web", "채용 예정자 무료", 800, 8, 5, 0);

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
//		System.out.println(courseList.getCourseInfoByAcademyLocation("가산"));
//
//		System.out.println(courseList.setCourseInfo(new CourseVO(221, "강서", "Java 기반 클라우드 개발자 양성 과정",
//				"2024/02/27", "2024/07/31", "Java Web", "채용 예정자 무료", 800, 8, 5, 0)));
//

			// 장학금_포인트 테스트
			ScholarshipDAO scholarshipPoint = new ScholarshipDAOImpl(conn);
//			System.out.println(scholarshipPoint.getScholarshipRecipientsInfo());

			
//			for (ScholarshipStatementVO scholarshipStatement : list) {
//				System.out.println(scholarshipStatement);
//			}
			
			List<String> datas = new ArrayList<String>();
			datas.add("youyou33");
			datas.add("whfflekdgg");
//			datas.add("aa");
//			datas.add("kkhhsds"); // 장학금 대상자 아님
//			System.out.println(scholarshipPoint.setSelectedRecipientsSettlementDate(datas));


//			System.out.println(scholarshipPoint.getStudentPointsByCourseId(277));
//			
//			System.out.println(scholarshipPoint.getStudentPointByName("김선희"));
			 
//			System.out.println(scholarshipPoint.getStudentsPointsByCourseIdAndName("김선희", 277));
			
//			System.out.println(scholarshipPoint.setPointCategory("보너스", 10));
			
//			System.out.println(scholarshipPoint.addPoints("whfflekdgg", 21));
			
			
//			System.out.println(scholarshipPoint.getScholarshipRecipientsInfo());
			
//			System.out.println(scholarshipPoint.setRecipientsSettlementDate());
			
			System.out.println(scholarshipPoint.getSelectedRecipientsSettlementDateByCourseId(277));
		
			// 수강생 
			StudentDAO student = new StudentDAOImpl(conn);
			
//			System.out.println(student.getStudentInfoList());
			
//			System.out.println(student.getStudentInfoListByCourseId(277));
			
//			System.out.println(student.getStudentInfoListByName("손유철"));
//			StudentVO st = new StudentVO("sun", "테스트", "1999/02/16", "경기", "신한", "99552188454","010-8888-8888","sun@gmail.com",1,'1',0,277,"가산");
//			student.addStudent(st);
			
			
			
			
			/*********** ㅅㅐㄹㅗ ㄹㅣㅍㅐㄱㅌㅗㄹㅣㅇ *************/
		//	StudentDAOTest st = new StudentDAOTest(conn);
			
		//	System.out.println(st.getStudentInfoList());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
