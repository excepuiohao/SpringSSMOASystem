package com.dao;

import java.util.List;

import com.bean.Attendance;

public interface AttendanceDAO {

	void InsertAttendance(Attendance attendance);

	void UpdateAttendance(Attendance attendance);

	void DeleteAttendance(String attendanceId);

	List<Attendance> SelectAttendanceByStatus(String status);

	Attendance SelectAttendanceById(String attendanceId);

}
