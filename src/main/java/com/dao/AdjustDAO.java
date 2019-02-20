package com.dao;

import java.util.List;

import com.bean.AdjustSalary;

public interface AdjustDAO {

	void InsertAdjust(AdjustSalary adjustSalary);

	void UpdateAdjust(AdjustSalary adjustSalary);

	void DeleteAdjust(String adjustSalaryId);

	List<AdjustSalary> SelectAdjustByStatus(String status);

	AdjustSalary SelectAdjustSalaryByUserID(String userId);
}
