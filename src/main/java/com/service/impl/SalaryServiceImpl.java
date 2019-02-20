package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Salary;
import com.dao.SalaryDAO;
import com.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryDAO salaryDAO;

	@Override
	public void InsertSalary(Salary salary) {
		// TODO Auto-generated method stub
		salaryDAO.InsertSalary(salary);
	}

	@Override
	public void UpdateSalary(Salary salary) {
		// TODO Auto-generated method stub
		salaryDAO.UpdateSalary(salary);
	}

	@Override
	public void DeleteSalary(String salaryId) {
		// TODO Auto-generated method stub
		salaryDAO.DeleteSalary(salaryId);
	}

	@Override
	public List<Salary> SelectSalaryByUserId(String userId) {
		// TODO Auto-generated method stub
		return salaryDAO.SelectSalaryByUserId(userId);
	}

	@Override
	public List<Salary> SelectSalaryByMonth(String month) {
		// TODO Auto-generated method stub
		return salaryDAO.SelectSalaryByMonth(month);
	}

	@Override
	public int CalWorkHour(String beginTime, String endTime) {
		// TODO Auto-generated method stub
		return salaryDAO.CalWorkHour(beginTime, endTime);
	}

}
