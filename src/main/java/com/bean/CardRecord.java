package com.bean;

/**
 * @author excepuio 打卡记录基类
 */
public class CardRecord {
	private int RecordId;

	private int UserId;

	private String RecordTime;

	private String RecordIP;
	
	private String Status;

	public int getRecordId() {
		return RecordId;
	}

	public void setRecordId(int recordId) {
		RecordId = recordId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getRecordTime() {
		return RecordTime;
	}

	public void setRecordTime(String recordTime) {
		RecordTime = recordTime;
	}

	public String getRecordIP() {
		return RecordIP;
	}

	public void setRecordIP(String recordIP) {
		RecordIP = recordIP;
	}

	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public CardRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardRecord(int recordId, int userId, String recordTime, String recordIP, String status) {
		super();
		RecordId = recordId;
		UserId = userId;
		RecordTime = recordTime;
		RecordIP = recordIP;
		Status = status;
	}

}
