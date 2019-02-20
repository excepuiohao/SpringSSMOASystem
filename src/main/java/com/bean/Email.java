package com.bean;

/**
 * @author excepuio ÓÊ¼þ»ùÀà
 */
public class Email {

	private int EmailId;

	private int UserId;

	private String EmailPassword;

	public int getEmailId() {
		return EmailId;
	}

	public void setEmailId(int emailId) {
		EmailId = emailId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getEmailPassword() {
		return EmailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		EmailPassword = emailPassword;
	}

	@Override
	public String toString() {
		return "Email [EmailId=" + EmailId + ", UserId=" + UserId + ", EmailPassword=" + EmailPassword + "]";
	}

	public Email(int emailId, int userId, String emailPassword) {
		super();
		EmailId = emailId;
		UserId = userId;
		EmailPassword = emailPassword;
	}

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}

}
