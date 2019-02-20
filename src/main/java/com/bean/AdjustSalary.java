package com.bean;

/**
 * @author excepuio µ÷Ð½±í
 */
public class AdjustSalary {

	private int AdjustSalaryId;

	private int UserID;

	private float HopeSalary;

	private String Status;

	private String AdjustTime;

	public int getAdjustSalaryId() {
		return AdjustSalaryId;
	}

	public void setAdjustSalaryId(int adjustSalaryId) {
		AdjustSalaryId = adjustSalaryId;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public float getHopeSalary() {
		return HopeSalary;
	}

	public void setHopeSalary(float hopeSalary) {
		HopeSalary = hopeSalary;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAdjustTime() {
		return AdjustTime;
	}

	public void setAdjustTime(String adjustTime) {
		AdjustTime = adjustTime;
	}

	@Override
	public String toString() {
		return "AdjustSalary [AdjustSalaryId=" + AdjustSalaryId + ", UserID=" + UserID + ", HopeSalary=" + HopeSalary
				+ ", Status=" + Status + ", AdjustTime=" + AdjustTime + "]";
	}

	public AdjustSalary(int adjustSalaryId, int userID, float hopeSalary, String status, String adjustTime) {
		super();
		AdjustSalaryId = adjustSalaryId;
		UserID = userID;
		HopeSalary = hopeSalary;
		Status = status;
		AdjustTime = adjustTime;
	}

	public AdjustSalary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
