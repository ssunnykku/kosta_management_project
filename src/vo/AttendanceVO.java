package vo;

public class AttendanceVO {
	private String attendanceDate;
	private int hrdNetID;
	private int attendanceStatus;
	
	public AttendanceVO(String attendanceDate, int hrdNetID, int attendanceStatus) {
		setAttendanceDate(attendanceDate);
		setHrdNetID(hrdNetID);
		setAttendanceStatus(attendanceStatus);
	}
	
	public String getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public int getHrdNetID() {
		return hrdNetID;
	}
	public void setHrdNetID(int hrdNetID) {
		this.hrdNetID = hrdNetID;
	}
	public int getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(int attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
	@Override
	public String toString() {
		return "attendancesVo [attendanceDate=" + attendanceDate + ", hrdNetID=" + hrdNetID + ", attendanceStatus="
				+ attendanceStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendanceDate == null) ? 0 : attendanceDate.hashCode());
		result = prime * result + attendanceStatus;
		result = prime * result + hrdNetID;
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
		AttendanceVO other = (AttendanceVO) obj;
		if (attendanceDate == null) {
			if (other.attendanceDate != null)
				return false;
		} else if (!attendanceDate.equals(other.attendanceDate))
			return false;
		if (attendanceStatus != other.attendanceStatus)
			return false;
		if (hrdNetID != other.hrdNetID)
			return false;
		return true;
	}
	

}
