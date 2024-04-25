package dto;

public class StudentDTO {
	private final String hrdNetId;
	private final String name;
	private final String birth;
	private final String province;
	private final String bank;
	private final String account;
	private final String phoneNumber;
	private final String email;
	private final int completionStatus;
	private final double completionRate;
	private final char gender;
	private final String scholarshipPayDate;;
	private final int courseId;
	private final String academyLocation;
	
	public StudentDTO(String hrdNetId, String name, String birth, String province, String bank, String account,
			String phoneNumber, String email, int completionStatus, double completionRate, char gender,
			String scholarshipPayDate, int courseId, String academyLocation) {
		super();
		this.hrdNetId = hrdNetId;
		this.name = name;
		this.birth = birth;
		this.province = province;
		this.bank = bank;
		this.account = account;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.completionStatus = completionStatus;
		this.completionRate = completionRate;
		this.gender = gender;
		this.scholarshipPayDate = scholarshipPayDate;
		this.courseId = courseId;
		this.academyLocation = academyLocation;
	}

	public String getHrdNetId() {
		return hrdNetId;
	}

	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}

	public String getProvince() {
		return province;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getCompletionStatus() {
		return completionStatus;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public char getGender() {
		return gender;
	}

	public String getScholarshipPayDate() {
		return scholarshipPayDate;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getAcademyLocation() {
		return academyLocation;
	}
	
	

}
