package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Insurance;
import com.dao.InsuranceDAO;
import com.service.InsuranceService;

@Service

public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	InsuranceDAO insuranceDAO;

	@Override
	public void InsertInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		insuranceDAO.InsertInsurance(insurance);
	}

	@Override
	public void UpdateInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		insuranceDAO.UpdateInsurance(insurance);
	}

	@Override
	public void DeleteInsurancet(String insuranceId) {
		// TODO Auto-generated method stub
		insuranceDAO.DeleteInsurancet(insuranceId);
	}

	@Override
	public List<Insurance> SelectInsuranceByUserId(String userId) {
		// TODO Auto-generated method stub
		return insuranceDAO.SelectInsuranceByUserId(userId);
	}

	@Override
	public List<Insurance> SelectInsuranceByStatus(String status) {
		// TODO Auto-generated method stub
		return insuranceDAO.SelectInsuranceByStatus(status);
	}

	@Override
	public List<Insurance> SelectUsefulInsuranceByUserId(String userId) {
		// TODO Auto-generated method stub
		return insuranceDAO.SelectUsefulInsuranceByUserId(userId);
	}

}
