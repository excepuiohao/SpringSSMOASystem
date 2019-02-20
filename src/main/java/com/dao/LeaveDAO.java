package com.dao;

import java.util.List;

import com.bean.Leave;

public interface LeaveDAO {

	void InsertLeave(Leave leave);

	void UpdateLeave(Leave leave);

	void DeleteLeave(String leaveId);

	List<Leave> SelectLeaveByStatus(String status);

	List<Leave> SelectLeaveByUserId(String userId);
	
	void AdjustingLeave(String LeaveId,String status);
}
