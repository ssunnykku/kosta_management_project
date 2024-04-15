package dto;

public class CourseDTO {
	private final int courseId;
	private final String academyLocation;
	private final String courseName;
	private final String courseStartDate;
	private final String courseEndDate;
	private final String subject;
	private final String courseType;
	private final int totalTrainingHours;
	private final int trainingHoursOfDay;
	private final int numberOfMonths;
	private final int numberOfSettlement;
	
	public CourseDTO(int courseId, String academyLocation, String courseName, String courseStartDate,
			String courseEndDate, String subject, String courseType, int totalTrainingHours, int trainingHoursOfDay,
			int numberOfMonths, int numberOfSettlement) {
		super();
		this.courseId = courseId;
		this.academyLocation = academyLocation;
		this.courseName = courseName;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndDate;
		this.subject = subject;
		this.courseType = courseType;
		this.totalTrainingHours = totalTrainingHours;
		this.trainingHoursOfDay = trainingHoursOfDay;
		this.numberOfMonths = numberOfMonths;
		this.numberOfSettlement = numberOfSettlement;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getAcademyLocation() {
		return academyLocation;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public String getSubject() {
		return subject;
	}

	public String getCourseType() {
		return courseType;
	}

	public int getTotalTrainingHours() {
		return totalTrainingHours;
	}

	public int getTrainingHoursOfDay() {
		return trainingHoursOfDay;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public int getNumberOfSettlement() {
		return numberOfSettlement;
	}
	
	

}
