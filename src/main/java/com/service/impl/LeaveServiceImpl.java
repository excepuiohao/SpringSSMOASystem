package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Leave;
import com.dao.LeaveDAO;
import com.service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	LeaveDAO leaveDAO;

	@Override
	public void InsertLeave(Leave leave) {
		// TODO Auto-generated method stub
		leaveDAO.InsertLeave(leave);
	}

	@Override
	public void UpdateLeave(Leave leave) {
		// TODO Auto-generated method stub
		leaveDAO.UpdateLeave(leave);
	}

	@Override
	public void DeleteLeave(String leaveId) {
		// TODO Auto-generated method stub
		leaveDAO.DeleteLeave(leaveId);
	}

	@Override
	public List<Leave> SelectLeaveByStatus(String status) {
		// TODO Auto-generated method stub
		return leaveDAO.SelectLeaveByStatus(status);
	}

	@Override
	public List<Leave> SelectLeaveByUserId(String userId) {
		// TODO Auto-generated method stub
		return leaveDAO.SelectLeaveByUserId(userId);
	}

	@Override
	public void AdjustingLeave(String LeaveId, String status) {
		// TODO Auto-generated method stub
		leaveDAO.AdjustingLeave(LeaveId, status);
	}

}
