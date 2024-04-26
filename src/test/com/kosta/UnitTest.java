package test.com.kosta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.ManagerDAO;
import dao.ManagerDAOImpl;

public class UnitTest {
	static ManagerDAO managerdao;
	
	@BeforeClass
	public static void 사전_전체_테스트() throws Exception {
		managerdao=new ManagerDAOImpl();
	}
	
	@Test
	public void login_1(){
		assertNull(managerdao.login("sss", "sdasdq2"));
	}
	
	@Test
	public void login_2(){
		assertEquals("관리자", managerdao.login("M2018", "487312"));
	}
	
	
	
	
	

	//@AfterClass
	public static void 사후_전체_테스트() throws Exception {
		System.out.println("사후_전체_테스트");
	}

	//@Before
	public void 사전_단위_테스트() throws Exception {
		System.out.println("사전_단위_테스트");
	}

	//@After
	public void 사후_단위_테스트() throws Exception {
		System.out.println("사후_단위_테스트");
	}

	//@Test
	public void 단위테스트_1() {
		assertTrue(1==1);
	}
	
	//@Test
	public void 단위테스트_2() {
		assertEquals("홍길동", "이순신");
	}

}