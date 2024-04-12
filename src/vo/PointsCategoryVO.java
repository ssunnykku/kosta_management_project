package vo;

public class PointsCategoryVO {
	
	private int pointId;
	private String category;
	private int point;
	
	
	
	public PointsCategoryVO(int pointId, String category, int point) {
		setPointId(pointId);
		setCategory(category);
		setPoint(point);
	}
	
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + point;
		result = prime * result + pointId;
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
		PointsCategoryVO other = (PointsCategoryVO) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (point != other.point)
			return false;
		if (pointId != other.pointId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "pointsCategoriesVO [pointId=" + pointId + ", category=" + category + ", point=" + point + "]";
	}
	
	

}
