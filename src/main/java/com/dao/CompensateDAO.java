package com.dao;

import java.util.List;

import com.bean.Compensate;

public interface CompensateDAO {
	void InsertCompensate(Compensate compensate);

	void UpdateCompensate(Compensate compensate);

	void DeleteCompensate(String compensateId);

	List<Compensate> SelectCompensateByStatus(String status);

	List<Compensate> SelectCompensateByUserId(String userId);

	List<Compensate> SelectCompensateByType(String type);
	
	List<Compensate> SelectUsefulCompensateByUserId(String userId);
}
