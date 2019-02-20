package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.WorkLog;
import com.dao.WorkLogDAO;
import com.service.WorkLogService;

@Service
public class WorkLogServiceImpl implements WorkLogService {

	@Autowired
	WorkLogDAO workLogDAO;

	@Override
	public void InsertWorkLog(WorkLog workLog) {
		// TODO Auto-generated method stub
		workLogDAO.InsertWorkLog(workLog);
	}

	@Override
	public void UpdateWorkLog(WorkLog workLog) {
		// TODO Auto-generated method stub
		workLogDAO.UpdateWorkLog(workLog);

	}

	@Override
	public void DeleteWorkLog(String logId) {
		// TODO Auto-generated method stub
		workLogDAO.DeleteWorkLog(logId);
	}

	@Override
	public List<WorkLog> SelectWorkLogByUserId(String userId) {
		// TODO Auto-generated method stub
		return workLogDAO.SelectWorkLogByUserId(userId);
	}

}
