package vo;

import java.time.LocalDate;

public class StudentVO {
	private String hrdNetId;
	private String name;
	private LocalDate birth;
	private String province;
	private String bank;
	private String account;
	private String phoneNumber;
	private String email;
	private int completionStatus;
	private double completionRate;
	private char gender;
	private String scholarshipPayDate;;
	private int courseId;
	private String academyLocation;

	public StudentVO(String hrdNetId, String name, LocalDate birth, String province, String bank, String account,
			String phoneNumber, String email, int completionStatus, double completionRate, char gender,
			String scholarshipPayDate, int courseId, String academyLocation) {
		setHrdNetId(hrdNetId);
		setName(name);
		setBirth(birth);
		setProvince(province);
		setBank(bank);
		setAccount(account);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setCompletionStatus(completionStatus);
		setCompletionRate(completionRate);
		setGender(gender);
		setScholarshipPayDate(scholarshipPayDate);
		setCourseId(courseId);
		setAcademyLocation(academyLocation);
	}

	// String sql = "select hrd_net_id, name, birth, province, bank, "
	// + "account, phone_number, email, completion_status, course_id "
	// + "from students";

	public StudentVO(String hrdNetId, String name, LocalDate birth, String province, String bank, String account,
			String phoneNumber, String email, int completionStatus, int courseId) {
		setHrdNetId(hrdNetId);
		setName(name);
		setBirth(birth);
		setProvince(province);
		setBank(bank);
		setAccount(account);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setCompletionStatus(completionStatus);
		setCourseId(courseId);
	}

	// 은행, 계좌번호 있는 버전
	public StudentVO(String hrdNetId, String name, LocalDate birth, String province, String bank, String account,
			String phoneNumber, String email, int completionStatus, char gender, int courseId, String academyLocation) {
		setHrdNetId(hrdNetId);
		setName(name);
		setBirth(birth);
		setProvince(province);
		setBank(bank);
		setAccount(account);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setCompletionStatus(completionStatus);
		setCompletionRate(completionRate);
		setGender(gender);
		setScholarshipPayDate(scholarshipPayDate);
		setCourseId(courseId);
		setAcademyLocation(academyLocation);
	}

	// 은행, 계좌번호 없는 버전
	public StudentVO(String hrdNetId, String name, LocalDate birth, String province, String phoneNumber, String email,
			int completionStatus, char gender, int courseId, String academyLocation) {
		setHrdNetId(hrdNetId);
		setName(name);
		setBirth(birth);
		setProvince(province);
		setBank(bank);
		setAccount(account);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setCompletionStatus(completionStatus);
		setCompletionRate(completionRate);
		setGender(gender);
		setScholarshipPayDate(scholarshipPayDate);
		setCourseId(courseId);
		setAcademyLocation(academyLocation);
	}

	public String getHrdNetId() {
		return hrdNetId;
	}

	public void setHrdNetId(String hrdNetId) {
		this.hrdNetId = hrdNetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(int completionStatus) {
		this.completionStatus = completionStatus;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getScholarshipPayDate() {
		return scholarshipPayDate;
	}

	public void setScholarshipPayDate(String scholarshipPayDate) {
		this.scholarshipPayDate = scholarshipPayDate;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getAcademyLocation() {
		return academyLocation;
	}

	public void setAcademyLocation(String academyLocation) {
		this.academyLocation = academyLocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academyLocation == null) ? 0 : academyLocation.hashCode());
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		long temp;
		temp = Double.doubleToLongBits(completionRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + completionStatus;
		result = prime * result + courseId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((hrdNetId == null) ? 0 : hrdNetId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((scholarshipPayDate == null) ? 0 : scholarshipPayDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (academyLocation == null) {
			if (other.academyLocation != null)
				return false;
		} else if (!academyLocation.equals(other.academyLocation))
			return false;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (Double.doubleToLongBits(completionRate) != Double.doubleToLongBits(other.completionRate))
			return false;
		if (completionStatus != other.completionStatus)
			return false;
		if (courseId != other.courseId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (hrdNetId == null) {
			if (other.hrdNetId != null)
				return false;
		} else if (!hrdNetId.equals(other.hrdNetId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (scholarshipPayDate == null) {
			if (other.scholarshipPayDate != null)
				return false;
		} else if (!scholarshipPayDate.equals(other.scholarshipPayDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "studentsVO [hrdNetId=" + hrdNetId + ", name=" + name + ", birth=" + birth + ", province=" + province
				+ ", bank=" + bank + ", account=" + account + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", completionStatus=" + completionStatus + ", completionRate=" + completionRate + ", gender=" + gender
				+ ", scholarshipPayDate=" + scholarshipPayDate + ", courseId=" + courseId + ", academyLocation="
				+ academyLocation + "]";
	}

}