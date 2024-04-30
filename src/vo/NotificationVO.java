package vo;

public class NotificationVO {
	
	private int notificationId;
	private String title;
	private String description;
	private String notificationDate;
	private String managerId;
	private String name;
	
	public NotificationVO(int notificationId, String title, String description, String notificationDate, String managerId) {
		setNotificationId(notificationId);
		setTitle(title);
		setDescription(description);
		setNotificationDate(notificationDate);
		setManagerId(managerId);
	}
	
	public NotificationVO(int notificationId, String title, String notificationDate, String name) {
		setNotificationId(notificationId);
		setDescription(description);
		setTitle(title);
		setNotificationDate(notificationDate);
		setName(name);
	}
	

	public NotificationVO(int notificationId, String title, String description) {
		setNotificationId(notificationId);
		setTitle(title);
		setNotificationDate(notificationDate);
		setDescription(description);
	}

	public NotificationVO(String title, String description, String managerId) {
		setTitle(title);
		setDescription(description);
		setManagerId(managerId);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((managerId == null) ? 0 : managerId.hashCode());
		result = prime * result + ((notificationDate == null) ? 0 : notificationDate.hashCode());
		result = prime * result + notificationId;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		NotificationVO other = (NotificationVO) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (managerId == null) {
			if (other.managerId != null)
				return false;
		} else if (!managerId.equals(other.managerId))
			return false;
		if (notificationDate == null) {
			if (other.notificationDate != null)
				return false;
		} else if (!notificationDate.equals(other.notificationDate))
			return false;
		if (notificationId != other.notificationId)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "notificationsVO [notificationId=" + notificationId + ", title=" + title + ", description=" + description
				+ ", notificationDate=" + notificationDate + ", managerId=" + managerId + "]";
	}
	
	
	
}
