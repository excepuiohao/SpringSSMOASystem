package com.bean;

/**
 * @author excepuio ¿¼ÇÚ
 */
public class Attendance {

	private int AttendanceId;

	private int UserId;

	private String AttendanceStatus;

	private int RecordId;

	public int getAttendanceId() {
		return AttendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		AttendanceId = attendanceId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getAttendanceStatus() {
		return AttendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		AttendanceStatus = attendanceStatus;
	}

	public int getRecordId() {
		return RecordId;
	}

	public void setRecordId(int recordId) {
		RecordId = recordId;
	}

	@Override
	public String toString() {
		return "Attendance [AttendanceId=" + AttendanceId + ", UserId=" + UserId + ", AttendanceStatus="
				+ AttendanceStatus + ", RecordId=" + RecordId + "]";
	}

	public Attendance(int attendanceId, int userId, String attendanceStatus, int recordId) {
		super();
		AttendanceId = attendanceId;
		UserId = userId;
		AttendanceStatus = attendanceStatus;
		RecordId = recordId;
	}

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

}
