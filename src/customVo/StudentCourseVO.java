package customVo;

public class StudentCourseVO {
	
	private String courseId;
	private String name;
	private String birth;
	private int totalTrainingHours;
	private int trainingHoursOfDay;
	
	
	public StudentCourseVO(String courseId, String name, String birth, int totalTrainingHours, int trainingHoursOfDay) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.birth = birth;
		this.totalTrainingHours = totalTrainingHours;
		this.trainingHoursOfDay = trainingHoursOfDay;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentCourseVO other = (StudentCourseVO) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (totalTrainingHours != other.totalTrainingHours)
			return false;
		if (trainingHoursOfDay != other.trainingHoursOfDay)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudentCourseVO [courseId=" + courseId + ", name=" + name + ", birth=" + birth + ", totalTrainingHours="
				+ totalTrainingHours + ", trainingHoursOfDay=" + trainingHoursOfDay + "]";
	}

}
