package com.bean;

/**
 * @author excepuio ’àºŸª˘Óê
 */
public class Leave {

	private int LeaveId;

	private int LeaveUserId;

	private String LeaveBeginTime;

	private String LeaveEndTime;
	
	private String LeaveType;

	private String LeaveReason;

	private String LeaveStatus;

	public int getLeaveId() {
		return LeaveId;
	}

	public void setLeaveId(int leaveId) {
		LeaveId = leaveId;
	}

	public int getLeaveUserId() {
		return LeaveUserId;
	}

	public void setLeaveUserId(int leaveUserId) {
		LeaveUserId = leaveUserId;
	}

	public String getLeaveType() {
		return LeaveType;
	}

	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}

	public String getLeaveReason() {
		return LeaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		LeaveReason = leaveReason;
	}

	public String getLeaveStatus() {
		return LeaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		LeaveStatus = leaveStatus;
	}

	
	public String getLeaveBeginTime() {
		return LeaveBeginTime;
	}

	public void setLeaveBeginTime(String leaveBeginTime) {
		LeaveBeginTime = leaveBeginTime;
	}

	public String getLeaveEndTime() {
		return LeaveEndTime;
	}

	public void setLeaveEndTime(String leaveEndTime) {
		LeaveEndTime = leaveEndTime;
	}

	

	public Leave(int leaveId, int leaveUserId, String leaveBeginTime, String leaveEndTime, String leaveType,
			String leaveReason, String leaveStatus) {
		super();
		LeaveId = leaveId;
		LeaveUserId = leaveUserId;
		LeaveBeginTime = leaveBeginTime;
		LeaveEndTime = leaveEndTime;
		LeaveType = leaveType;
		LeaveReason = leaveReason;
		LeaveStatus = leaveStatus;
	}

	@Override
	public String toString() {
		return "Leave [LeaveId=" + LeaveId + ", LeaveUserId=" + LeaveUserId + ", LeaveBeginTime=" + LeaveBeginTime
				+ ", LeaveEndTime=" + LeaveEndTime + ", LeaveType=" + LeaveType + ", LeaveReason=" + LeaveReason
				+ ", LeaveStatus=" + LeaveStatus + "]";
	}

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}

}
