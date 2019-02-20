package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Attendance;
import com.dao.AttendanceDAO;
import com.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceDAO attendanceDAO;

	@Override
	public void InsertAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanceDAO.InsertAttendance(attendance);
	}

	@Override
	public void UpdateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanceDAO.UpdateAttendance(attendance);
	}

	@Override
	public void DeleteAttendance(String attendanceId) {
		// TODO Auto-generated method stub
		attendanceDAO.DeleteAttendance(attendanceId);
	}

	@Override
	public List<Attendance> SelectAttendanceByStatus(String status) {
		// TODO Auto-generated method stub
		return attendanceDAO.SelectAttendanceByStatus(status);
	}

	@Override
	public Attendance SelectAttendanceById(String attendanceId) {
		// TODO Auto-generated method stub
		return attendanceDAO.SelectAttendanceById(attendanceId);
	}

}
