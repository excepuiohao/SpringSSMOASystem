package com.bean;

/**
 * @author excepuio
 * 
 *         工作日志基类
 */
public class WorkLog {

	private int LogId;

	private int UserID;

	private String LogTime;

	private String LogContent;

	private int LogStatus;

	public int getLogId() {
		return LogId;
	}

	public void setLogId(int logId) {
		LogId = logId;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getLogTime() {
		return LogTime;
	}

	public void setLogTime(String logTime) {
		LogTime = logTime;
	}

	public String getLogContent() {
		return LogContent;
	}

	public void setLogContent(String logContent) {
		LogContent = logContent;
	}

	public int getLogStatus() {
		return LogStatus;
	}

	public void setLogStatus(int logStatus) {
		LogStatus = logStatus;
	}

	public WorkLog(int logId, int userID, String logTime, String logContent, int logStatus) {
		super();
		LogId = logId;
		UserID = userID;
		LogTime = logTime;
		LogContent = logContent;
		LogStatus = logStatus;
	}

	@Override
	public String toString() {
		return "WorkLog [LogId=" + LogId + ", UserID=" + UserID + ", LogTime=" + LogTime + ", LogContent=" + LogContent
				+ ", LogStatus=" + LogStatus + "]";
	}

	public WorkLog() {
		super();
		// TODO Auto-generated constructor stub
	}

}
