package com.dao;

import java.util.List;

import com.bean.Insurance;

public interface InsuranceDAO {

	void InsertInsurance(Insurance insurance);

	void UpdateInsurance(Insurance insurance);

	void DeleteInsurancet(String insuranceId);

	List<Insurance> SelectInsuranceByUserId(String userId);

	List<Insurance> SelectInsuranceByStatus(String status);
	
	List<Insurance> SelectUsefulInsuranceByUserId(String userId);
}
