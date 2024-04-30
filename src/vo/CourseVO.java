package vo;

import java.sql.Date;
import java.time.LocalDate;

public class CourseVO {
	private int courseId;
	private String academyLocation;
	private String courseName;
	private LocalDate courseStartDate;
	private LocalDate courseEndDate;
	private String subject;
	private String courseType;
	private int totalTrainingHours;
	private int trainingHoursOfDay;
	private int numberOfMonths;
	private int numberOfSettlement;

	public CourseVO(int courseId, String academyLocation, String courseName, LocalDate courseStartDate,
			LocalDate courseEndDate, String subject, String courseType, int totalTrainingHours, int trainingHoursOfDay,
			int numberOfMonths, int numberOfSettlement) {
		setCourseId(courseId);
		setAcademyLocation(academyLocation);
		setCourseName(courseName);
		setCourseStartDate(courseStartDate);
		setCourseEndDate(courseEndDate);
		setSubject(subject);
		setCourseType(courseType);
		setTotalTrainingHours(totalTrainingHours);
		setTrainingHoursOfDay(trainingHoursOfDay);
		setNumberOfMonths(numberOfMonths);
		setNumberOfSettlement(numberOfSettlement);
	}
	
	public CourseVO(int courseId, String academyLocation, String courseName, LocalDate courseStartDate,
			LocalDate courseEndDate, String subject, String courseType, int totalTrainingHours, int trainingHoursOfDay,
			int numberOfMonths) {
		setCourseId(courseId);
		setAcademyLocation(academyLocation);
		setCourseName(courseName);
		setCourseStartDate(courseStartDate);
		setCourseEndDate(courseEndDate);
		setSubject(subject);
		setCourseType(courseType);
		setTotalTrainingHours(totalTrainingHours);
		setTrainingHoursOfDay(trainingHoursOfDay);
		setNumberOfMonths(numberOfMonths);
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(LocalDate courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public LocalDate getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(LocalDate courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public int getTotalTrainingHours() {
		return totalTrainingHours;
	}

	public void setTotalTrainingHours(int totalTrainingHours) {
		this.totalTrainingHours = totalTrainingHours;
	}

	public int getTrainingHoursOfDay() {
		return trainingHoursOfDay;
	}

	public void setTrainingHoursOfDay(int trainingHoursOfDay) {
		this.trainingHoursOfDay = trainingHoursOfDay;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public int getNumberOfSettlement() {
		return numberOfSettlement;
	}

	public void setNumberOfSettlement(int numberOfSettlement) {
		this.numberOfSettlement = numberOfSettlement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academyLocation == null) ? 0 : academyLocation.hashCode());
		result = prime * result + ((courseEndDate == null) ? 0 : courseEndDate.hashCode());
		result = prime * result + courseId;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((courseStartDate == null) ? 0 : courseStartDate.hashCode());
		result = prime * result + ((courseType == null) ? 0 : courseType.hashCode());
		result = prime * result + numberOfMonths;
		result = prime * result + numberOfSettlement;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + totalTrainingHours;
		result = prime * result + trainingHoursOfDay;
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
		CourseVO other = (CourseVO) obj;
		if (academyLocation == null) {
			if (other.academyLocation != null)
				return false;
		} else if (!academyLocation.equals(other.academyLocation))
			return false;
		if (courseEndDate == null) {
			if (other.courseEndDate != null)
				return false;
		} else if (!courseEndDate.equals(other.courseEndDate))
			return false;
		if (courseId != other.courseId)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (courseStartDate == null) {
			if (other.courseStartDate != null)
				return false;
		} else if (!courseStartDate.equals(other.courseStartDate))
			return false;
		if (courseType == null) {
			if (other.courseType != null)
				return false;
		} else if (!courseType.equals(other.courseType))
			return false;
		if (numberOfMonths != other.numberOfMonths)
			return false;
		if (numberOfSettlement != other.numberOfSettlement)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (totalTrainingHours != other.totalTrainingHours)
			return false;
		if (trainingHoursOfDay != other.trainingHoursOfDay)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CourseVO [courseId=" + courseId + ", academyLocation=" + academyLocation + ", courseName=" + courseName
				+ ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate + ", subject=" + subject
				+ ", courseType=" + courseType + ", totalTrainingHours=" + totalTrainingHours + ", trainingHoursOfDay="
				+ trainingHoursOfDay + ", numberOfMonths=" + numberOfMonths + ", numberOfSettlement="
				+ numberOfSettlement + "]";
	}

}
