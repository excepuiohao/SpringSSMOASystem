package com.service;

import java.util.List;

import com.bean.WorkLog;

public interface WorkLogService {
	void InsertWorkLog(WorkLog workLog);

	void UpdateWorkLog(WorkLog workLog);

	void DeleteWorkLog(String logId);

	List<WorkLog> SelectWorkLogByUserId(String userId);
}
