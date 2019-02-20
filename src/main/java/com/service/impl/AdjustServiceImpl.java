package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.AdjustSalary;
import com.dao.AdjustDAO;
import com.service.AdjustService;

@Service
public class AdjustServiceImpl implements AdjustService {

	@Autowired
	AdjustDAO adjustDAO;

	@Override
	public void InsertAdjust(AdjustSalary adjustSalary) {
		// TODO Auto-generated method stub
		adjustDAO.InsertAdjust(adjustSalary);
	}

	@Override
	public void UpdateAdjust(AdjustSalary adjustSalary) {
		// TODO Auto-generated method stub
		adjustDAO.UpdateAdjust(adjustSalary);
	}

	@Override
	public void DeleteAdjust(String adjustSalaryId) {
		// TODO Auto-generated method stub
		adjustDAO.DeleteAdjust(adjustSalaryId);
	}

	@Override
	public List<AdjustSalary> SelectAdjustByStatus(String status) {
		// TODO Auto-generated method stub
		return adjustDAO.SelectAdjustByStatus(status);
	}

	@Override
	public AdjustSalary SelectAdjustSalaryByUserID(String userId) {
		// TODO Auto-generated method stub
		return adjustDAO.SelectAdjustSalaryByUserID(userId);
	}

}
