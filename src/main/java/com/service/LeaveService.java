package com.service;

import java.util.List;

import com.bean.Leave;

public interface LeaveService {
	void InsertLeave(Leave leave);

	void UpdateLeave(Leave leave);

	void DeleteLeave(String leaveId);

	List<Leave> SelectLeaveByStatus(String status);

	List<Leave> SelectLeaveByUserId(String userId);
	
	void AdjustingLeave(String LeaveId,String status);
}
