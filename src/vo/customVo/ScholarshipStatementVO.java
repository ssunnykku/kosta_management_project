package vo.customVo;

import java.util.Objects;

public class ScholarshipStatementVO {

	private int courseId;
	private String courseName;
	private String birth;
	private String name;
	private String bank;
	private String account;
	private int totalPoints;
	private int scholarshipAmount;
	private String scholarshipPayDate;

	public ScholarshipStatementVO(int courseId, 
			String courseName, String birth, 
			String name, String bank, String account, 
			int totalPoints,
			int scholarshipAmount, 
			String scholarshipPayDate) {

		setCourseId(courseId);
		setCourseName(courseName);
		setBirth(birth);
		setName(name);
		setAccount(account);
		setTotalPoints(totalPoints);
		setScholarshipAmount(500000);
		setBank(bank);
		setScholarshipPayDate(scholarshipPayDate);
	}

	public ScholarshipStatementVO(int courseId, String courseName, 
			String birth, String name, String bank, 
			String account, int totalPoints, 
			int scholarshipAmount) {
		
		setCourseId(courseId);
		setCourseName(courseName);
		setBirth(birth);
		setName(name);
		setBank(bank);
		setAccount(account);
		setTotalPoints(totalPoints);
		setScholarshipAmount(500000);
	}


	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getScholarshipAmount() {
		return scholarshipAmount;
	}
	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getScholarshipPayDate() {
		return scholarshipPayDate;
	}
	public void setScholarshipPayDate(String scholarshipPayDate) {
		this.scholarshipPayDate = scholarshipPayDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, bank, birth, courseId, courseName, name, scholarshipAmount, scholarshipPayDate,
				totalPoints);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScholarshipStatementVO other = (ScholarshipStatementVO) obj;
		return Objects.equals(account, other.account) && Objects.equals(bank, other.bank)
				&& Objects.equals(birth, other.birth) && courseId == other.courseId
				&& Objects.equals(courseName, other.courseName) && Objects.equals(name, other.name)
				&& scholarshipAmount == other.scholarshipAmount
				&& Objects.equals(scholarshipPayDate, other.scholarshipPayDate) && totalPoints == other.totalPoints;
	}

	@Override
	public String toString() {
		return "기수 :" + courseId + " 과정명 : " + courseName + " 생년월일 : " + birth
				+ " 이름 : " + name + " 은행 : " + bank + " 계좌번호 : " + account + " 총 포인트 : " + totalPoints
				+ " 금액(원) :" + scholarshipAmount + " 정산일 : " + scholarshipPayDate;
	}





}
