package vo;

public class PayDurationVO {
	public class payDurationsVO {
		private int payDurationId;
		private String payDurationStartDate;
		private String payDurationEndDate;
		private int courseId;
		private String academyLocation;
		
		public payDurationsVO(int payDurationId, String payDurationStartDate, String payDurationEndDate, int courseId,
				String academyLocation) {
			setPayDurationId(payDurationId);
			setPayDurationStartDate(payDurationStartDate);
			setPayDurationEndDate(payDurationEndDate);
			setCourseId(courseId);
			setAcademyLocation(academyLocation);
		}
		
		public int getPayDurationId() {
			return payDurationId;
		}
		public void setPayDurationId(int payDurationId) {
			this.payDurationId = payDurationId;
		}
		public String getPayDurationStartDate() {
			return payDurationStartDate;
		}
		public void setPayDurationStartDate(String payDurationStartDate) {
			this.payDurationStartDate = payDurationStartDate;
		}
		public String getPayDurationEndDate() {
			return payDurationEndDate;
		}
		public void setPayDurationEndDate(String payDurationEndDate) {
			this.payDurationEndDate = payDurationEndDate;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((academyLocation == null) ? 0 : academyLocation.hashCode());
			result = prime * result + courseId;
			result = prime * result + ((payDurationEndDate == null) ? 0 : payDurationEndDate.hashCode());
			result = prime * result + payDurationId;
			result = prime * result + ((payDurationStartDate == null) ? 0 : payDurationStartDate.hashCode());
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
			payDurationsVO other = (payDurationsVO) obj;
			if (academyLocation == null) {
				if (other.academyLocation != null)
					return false;
			} else if (!academyLocation.equals(other.academyLocation))
				return false;
			if (courseId != other.courseId)
				return false;
			if (payDurationEndDate == null) {
				if (other.payDurationEndDate != null)
					return false;
			} else if (!payDurationEndDate.equals(other.payDurationEndDate))
				return false;
			if (payDurationId != other.payDurationId)
				return false;
			if (payDurationStartDate == null) {
				if (other.payDurationStartDate != null)
					return false;
			} else if (!payDurationStartDate.equals(other.payDurationStartDate))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "payDurationsVO [payDurationId=" + payDurationId + ", payDurationStartDate=" + payDurationStartDate
					+ ", payDurationEndDate=" + payDurationEndDate + ", courseId=" + courseId + ", academyLocation="
					+ academyLocation + "]";
		}
		
		
	}

}
