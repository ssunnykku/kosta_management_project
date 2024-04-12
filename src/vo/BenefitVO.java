package vo;

public class BenefitVO {
	private int benefitId;
	private int trainingPay;
	private int mealPay;
	private int stayPay;
	private String benefitPayDate;
	private String hrdNetId;
	private Number payDurationId;
	public int getBenefitId() {
		return benefitId;
	}
	
	public BenefitVO(int benefitId, int trainingPay, int mealPay, int stayPay, String benefitPayDate, String hrdNetId,
			Number payDurationId) {
		setBenefitId(benefitId);
		setTrainingPay(trainingPay);
		setMealPay(mealPay);
		setStayPay(stayPay);
		setBenefitPayDate(benefitPayDate);
		setHrdNetId( hrdNetId);
		setPayDurationId(payDurationId);
		
	}
	
	public void setBenefitId(int benefitId) {
		this.benefitId = benefitId;
	}
	public int getTrainingPay() {
		return trainingPay;
	}
	public void setTrainingPay(int trainingPay) {
		this.trainingPay = trainingPay;
	}
	public int getMealPay() {
		return mealPay;
	}
	public void setMealPay(int mealPay) {
		this.mealPay = mealPay;
	}
	public int getStayPay() {
		return stayPay;
	}
	public void setStayPay(int stayPay) {
		this.stayPay = stayPay;
	}
	public String getBenefitPayDate() {
		return benefitPayDate;
	}
	public void setBenefitPayDate(String benefitPayDate) {
		this.benefitPayDate = benefitPayDate;
	}
	public String getHrdNetId() {
		return hrdNetId;
	}
	public void setHrdNetId(String hrdNetId) {
		this.hrdNetId = hrdNetId;
	}
	public Number getPayDurationId() {
		return payDurationId;
	}
	public void setPayDurationId(Number payDurationId) {
		this.payDurationId = payDurationId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + benefitId;
		result = prime * result + ((benefitPayDate == null) ? 0 : benefitPayDate.hashCode());
		result = prime * result + ((hrdNetId == null) ? 0 : hrdNetId.hashCode());
		result = prime * result + mealPay;
		result = prime * result + ((payDurationId == null) ? 0 : payDurationId.hashCode());
		result = prime * result + stayPay;
		result = prime * result + trainingPay;
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
		BenefitVO other = (BenefitVO) obj;
		if (benefitId != other.benefitId)
			return false;
		if (benefitPayDate == null) {
			if (other.benefitPayDate != null)
				return false;
		} else if (!benefitPayDate.equals(other.benefitPayDate))
			return false;
		if (hrdNetId == null) {
			if (other.hrdNetId != null)
				return false;
		} else if (!hrdNetId.equals(other.hrdNetId))
			return false;
		if (mealPay != other.mealPay)
			return false;
		if (payDurationId == null) {
			if (other.payDurationId != null)
				return false;
		} else if (!payDurationId.equals(other.payDurationId))
			return false;
		if (stayPay != other.stayPay)
			return false;
		if (trainingPay != other.trainingPay)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "benefitsVO [benefitId=" + benefitId + ", trainingPay=" + trainingPay + ", mealPay=" + mealPay
				+ ", stayPay=" + stayPay + ", benefitPayDate=" + benefitPayDate + ", hrdNetId=" + hrdNetId
				+ ", payDurationId=" + payDurationId + "]";
	}
	
}

