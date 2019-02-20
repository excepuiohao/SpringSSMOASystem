package com.bean;

/**
 * @author excepuio ” º˛√‹¬Î…Û∫À
 */
public class EmailPasswordConfirm {
	private int EmailPasswordConfirmID;

	private int UserId;

	private String ConfirmStatus;

	public int getEmailPasswordConfirmID() {
		return EmailPasswordConfirmID;
	}

	public void setEmailPasswordConfirmID(int emailPasswordConfirmID) {
		EmailPasswordConfirmID = emailPasswordConfirmID;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getConfirmStatus() {
		return ConfirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		ConfirmStatus = confirmStatus;
	}

	@Override
	public String toString() {
		return "EmailPasswordConfirm [EmailPasswordConfirmID=" + EmailPasswordConfirmID + ", UserId=" + UserId
				+ ", ConfirmStatus=" + ConfirmStatus + "]";
	}

	public EmailPasswordConfirm(int emailPasswordConfirmID, int userId, String confirmStatus) {
		super();
		EmailPasswordConfirmID = emailPasswordConfirmID;
		UserId = userId;
		ConfirmStatus = confirmStatus;
	}

	public EmailPasswordConfirm() {
		super();
		// TODO Auto-generated constructor stub
	}

}
