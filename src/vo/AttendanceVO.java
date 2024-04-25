package vo;

import java.util.Objects;

public class AttendanceVO {
	private String attendanceDate;
	private String hrdNetID;
	private int attendanceStatus;
	
	public AttendanceVO(String attendanceDate, String hrdNetID, int attendanceStatus) {
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
	public String getHrdNetID() {
		return hrdNetID;
	}
	public void setHrdNetID(String hrdNetID) {
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
		return "AttendanceVO [attendanceDate=" + attendanceDate + ", hrdNetID=" + hrdNetID + ", attendanceStatus="
				+ attendanceStatus + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attendanceDate, attendanceStatus, hrdNetID);
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
		return Objects.equals(attendanceDate, other.attendanceDate) && attendanceStatus == other.attendanceStatus
				&& Objects.equals(hrdNetID, other.hrdNetID);
	}
	
	
}
