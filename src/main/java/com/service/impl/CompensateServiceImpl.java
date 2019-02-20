package com.service.impl;

import java.util.List;

import com.bean.Compensate;
import com.dao.CompensateDAO;
import com.service.CompensateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensateServiceImpl implements CompensateService {

	@Autowired
	CompensateDAO compensateDAO;

	@Override
	public void InsertCompensate(Compensate compensate) {
		// TODO Auto-generated method stub
		compensateDAO.InsertCompensate(compensate);
	}

	@Override
	public void UpdateCompensate(Compensate compensate) {
		// TODO Auto-generated method stub
		compensateDAO.UpdateCompensate(compensate);
	}

	@Override
	public void DeleteCompensate(String compensateId) {
		// TODO Auto-generated method stub
		compensateDAO.DeleteCompensate(compensateId);
	}

	@Override
	public List<Compensate> SelectCompensateByStatus(String status) {
		// TODO Auto-generated method stub
		return compensateDAO.SelectCompensateByStatus(status);
	}

	@Override
	public List<Compensate> SelectCompensateByUserId(String userId) {
		// TODO Auto-generated method stub
		return compensateDAO.SelectCompensateByUserId(userId);
	}

	@Override
	public List<Compensate> SelectCompensateByType(String type) {
		// TODO Auto-generated method stub
		return compensateDAO.SelectCompensateByType(type);
	}

	@Override
	public List<Compensate> SelectUsefulCompensateByUserId(String userId) {
		// TODO Auto-generated method stub
		return compensateDAO.SelectUsefulCompensateByUserId(userId);
	}

}
