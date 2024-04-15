package vo.customVo;

import java.util.Objects;

public class StudentCompletionVO {
	private String hrdNetId;
	private int courseId;
	private String name;
	private String birth;
	private int completionStatus;
	private double completionRate; //계산 
	private int totalTrainingHours; //입력값 총 교육시간 
	private int trainingHoursOfDay; // 입력값 하루 교육시간 
	private int numberOfMonths; // 총 개월 수 (입력값)
	
	public StudentCompletionVO(String hrdNetId, int courseId, String name, String birth, int totalDays,
			int completionStatus) {
		setHrdNetId(hrdNetId);
		setCourseId(courseId);
		setName(name);
		setBirth(birth);
		setCompletionStatus(completionStatus);
	}
	
	public StudentCompletionVO(String hrdNetId, 
			int courseId, 
			String name, 
			String birth, 
			int numberOfMonths, 
			int completionStatus, 
			double completionRate) {
		setHrdNetId(hrdNetId);
		setCourseId(courseId);
		setName(name);
		setBirth(birth);
		setCompletionStatus(completionStatus);
		setNumberOfMonths(numberOfMonths);
		setCompletionRate(completionRate);
	}

	public int getTotalTrainingHours() {
		return totalTrainingHours;
	}

	public int getTrainingHoursOfDay() {
		return trainingHoursOfDay;
	}

	// 총 몇달인지 계산
	public int getNumberOfMonths() {
		return this.numberOfMonths = numberOfMonths;
	}

	public void setTotalTrainingHours(int totalTrainingHours) {
		this.totalTrainingHours = totalTrainingHours;
	}

	public void setTrainingHoursOfDay(int trainingHoursOfDay) {
		this.trainingHoursOfDay = trainingHoursOfDay;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		
		this.numberOfMonths = numberOfMonths;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	public String getHrdNetId() {
		return hrdNetId;
	}
	public void setHrdNetId(String hrdNetId) {
		this.hrdNetId = hrdNetId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getCompletionStatus() {
		return completionStatus;
	}
	public void setCompletionStatus(int completionStatus) {
		this.completionStatus = completionStatus;
	}

	@Override
	public String toString() {
		return "StudentCompletionVO [hrdNetId=" + hrdNetId + ", courseId=" + courseId + ", name=" + name + ", birth="
				+ birth + ", completionStatus=" + completionStatus + ", completionRate=" + completionRate
				+ ", totalTrainingHours=" + totalTrainingHours + ", trainingHoursOfDay=" + trainingHoursOfDay
				+ ", numberOfMonths=" + numberOfMonths + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birth, completionRate, completionStatus, courseId, hrdNetId, name, numberOfMonths,
				totalTrainingHours, trainingHoursOfDay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentCompletionVO other = (StudentCompletionVO) obj;
		return Objects.equals(birth, other.birth)
				&& Double.doubleToLongBits(completionRate) == Double.doubleToLongBits(other.completionRate)
				&& completionStatus == other.completionStatus && courseId == other.courseId
				&& Objects.equals(hrdNetId, other.hrdNetId) && Objects.equals(name, other.name)
				&& numberOfMonths == other.numberOfMonths && totalTrainingHours == other.totalTrainingHours
				&& trainingHoursOfDay == other.trainingHoursOfDay;
	}

	
}
