package vo;

public class StudentsPointVO {
	
	private String hrdNetId;
	private int pointId;
	private int savePointDate;
	
	
	public StudentsPointVO(String hrdNetId, int pointId, int savePointDate) {
		setHrdNetId(hrdNetId);
		setPointId(pointId);
		setSavePointDate(savePointDate);
	}
	public String getHrdNetId() {
		return hrdNetId;
	}
	public void setHrdNetId(String hrdNetId) {
		this.hrdNetId = hrdNetId;
	}
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	public int getSavePointDate() {
		return savePointDate;
	}
	public void setSavePointDate(int savePointDate) {
		this.savePointDate = savePointDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hrdNetId == null) ? 0 : hrdNetId.hashCode());
		result = prime * result + pointId;
		result = prime * result + savePointDate;
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
		StudentsPointVO other = (StudentsPointVO) obj;
		if (hrdNetId == null) {
			if (other.hrdNetId != null)
				return false;
		} else if (!hrdNetId.equals(other.hrdNetId))
			return false;
		if (pointId != other.pointId)
			return false;
		if (savePointDate != other.savePointDate)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "studentsPointsVO [hrdNetId=" + hrdNetId + ", pointId=" + pointId + ", savePointDate=" + savePointDate
				+ "]";
	}
	
	

}
