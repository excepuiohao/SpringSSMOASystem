package com.service;

import java.util.List;

import com.bean.Compensate;

public interface CompensateService {
	void InsertCompensate(Compensate compensate);

	void UpdateCompensate(Compensate compensate);

	void DeleteCompensate(String compensateId);

	List<Compensate> SelectCompensateByStatus(String status);

	List<Compensate> SelectCompensateByUserId(String userId);

	List<Compensate> SelectCompensateByType(String type);
	
	List<Compensate> SelectUsefulCompensateByUserId(String userId);
}
