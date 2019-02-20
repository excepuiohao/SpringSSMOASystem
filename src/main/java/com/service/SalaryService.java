package com.service;

import java.util.List;

import com.bean.Salary;

public interface SalaryService {
	void InsertSalary(Salary salary);

	void UpdateSalary(Salary salary);

	void DeleteSalary(String salaryId);

	List<Salary> SelectSalaryByUserId(String userId);

	List<Salary> SelectSalaryByMonth(String month);
	
	int CalWorkHour(String beginTime, String endTime);
}
