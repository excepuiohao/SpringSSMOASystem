package com.dao;

import java.util.List;

import com.bean.WorkLog;

public interface WorkLogDAO {

	void InsertWorkLog(WorkLog workLog);

	void UpdateWorkLog(WorkLog workLog);

	void DeleteWorkLog(String logId);

	List<WorkLog> SelectWorkLogByUserId(String userId);

}
