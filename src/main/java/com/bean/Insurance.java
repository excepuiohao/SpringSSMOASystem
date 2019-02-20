package com.bean;

/**
 * @author excepuio 商保基类
 */
public class Insurance {

	private int InsuranceID;

	private int UserId;

	private float CompensateMoney;

	private String CompensateReason;

	private String CompensateStatus;

	public int getInsuranceID() {
		return InsuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		InsuranceID = insuranceID;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public float getCompensateMoney() {
		return CompensateMoney;
	}

	public void setCompensateMoney(float compensateMoney) {
		CompensateMoney = compensateMoney;
	}

	public String getCompensateReason() {
		return CompensateReason;
	}

	public void setCompensateReason(String compensateReason) {
		CompensateReason = compensateReason;
	}

	public String getCompensateStatus() {
		return CompensateStatus;
	}

	public void setCompensateStatus(String compensateStatus) {
		CompensateStatus = compensateStatus;
	}

	@Override
	public String toString() {
		return "Insurance [InsuranceID=" + InsuranceID + ", UserId=" + UserId + ", CompensateMoney=" + CompensateMoney
				+ ", CompensateReason=" + CompensateReason + ", CompensateStatus=" + CompensateStatus + "]";
	}

	public Insurance(int insuranceID, int userId, float compensateMoney, String compensateReason,
			String compensateStatus) {
		super();
		InsuranceID = insuranceID;
		UserId = userId;
		CompensateMoney = compensateMoney;
		CompensateReason = compensateReason;
		CompensateStatus = compensateStatus;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

}
