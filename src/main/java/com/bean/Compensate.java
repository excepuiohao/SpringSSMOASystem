package com.bean;

/**
 * @author excepuio 报销补贴基类
 */
public class Compensate {

	private int CompensateID;

	private String CompensateType;

	private float CompensatePrice;

	private int UserID;

	private String CompensateStatus;

	public int getCompensateID() {
		return CompensateID;
	}

	public void setCompensateID(int compensateID) {
		CompensateID = compensateID;
	}

	public String getCompensateType() {
		return CompensateType;
	}

	public void setCompensateType(String compensateType) {
		CompensateType = compensateType;
	}

	public float getCompensatePrice() {
		return CompensatePrice;
	}

	public void setCompensatePrice(float compensatePrice) {
		CompensatePrice = compensatePrice;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getCompensateStatus() {
		return CompensateStatus;
	}

	public void setCompensateStatus(String compensateStatus) {
		CompensateStatus = compensateStatus;
	}

	@Override
	public String toString() {
		return "Compensate [CompensateID=" + CompensateID + ", CompensateType=" + CompensateType + ", CompensatePrice="
				+ CompensatePrice + ", UserID=" + UserID + ", CompensateStatus=" + CompensateStatus + "]";
	}

	public Compensate(int compensateID, String compensateType, float compensatePrice, int userID,
			String compensateStatus) {
		super();
		CompensateID = compensateID;
		CompensateType = compensateType;
		CompensatePrice = compensatePrice;
		UserID = userID;
		CompensateStatus = compensateStatus;
	}

	public Compensate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
