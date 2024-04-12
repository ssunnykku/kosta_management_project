package customVo;

public class StudentCompletionVO {
	private String hrdNetId;
	private int courseId;
	private String name;
	private String birth;
	private int totalDays;
	private int completionStatus;
	private int courseDurationDay;
	private double completionRate;
	
	public StudentCompletionVO(String hrdNetId, int courseId, String name, String birth, int totalDays,
			int completionStatus) {
		setHrdNetId(hrdNetId);
		setCourseId(courseId);
		setName(name);
		setBirth(birth);
		setTotalDays(totalDays);
		setCompletionStatus(completionStatus);
	}
	
	public StudentCompletionVO(String hrdNetId, int courseId, String name, String birth, int courseDurationDay, double completion_rate,
			int completionStatus) {
		setHrdNetId(hrdNetId);
		setCourseId(courseId);
		setName(name);
		setBirth(birth);
		setTotalDays(totalDays);
		setCompletionStatus(completionStatus);
		setCourseDurationDay(courseDurationDay);
		setCompletionRate(completionRate);
	}
	
	
	public int getCourseDurationDay() {
		return courseDurationDay;
	}

	public void setCourseDurationDay(int courseDurationDay) {
		this.courseDurationDay = courseDurationDay;
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
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public int getCompletionStatus() {
		return completionStatus;
	}
	public void setCompletionStatus(int completionStatus) {
		this.completionStatus = completionStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + completionStatus;
		result = prime * result + courseId;
		result = prime * result + ((hrdNetId == null) ? 0 : hrdNetId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + totalDays;
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
		StudentCompletionVO other = (StudentCompletionVO) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (completionStatus != other.completionStatus)
			return false;
		if (courseId != other.courseId)
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
		if (totalDays != other.totalDays)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudenstCompletionVO [hrdNetId=" + hrdNetId + ", courseId=" + courseId + ", name=" + name + ", birth="
				+ birth + ", totalDays=" + totalDays + ", completionStatus=" + completionStatus + "]";
	}
}
