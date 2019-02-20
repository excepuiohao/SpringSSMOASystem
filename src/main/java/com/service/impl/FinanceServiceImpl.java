package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Finance;
import com.dao.FinanceDAO;
import com.service.FinanceService;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	FinanceDAO financeDAO;

	@Override
	public void InsertFinance(Finance finance) {
		// TODO Auto-generated method stub
		financeDAO.InsertFinance(finance);

	}

	@Override
	public void UpdateFinance(Finance finance) {
		// TODO Auto-generated method stub
		financeDAO.UpdateFinance(finance);
	}

	@Override
	public void DeleteFinance(String finance) {
		// TODO Auto-generated method stub
		financeDAO.DeleteFinance(finance);
	}

	@Override
	public List<Finance> SelectFinanceByApartmentId(String apartmentId) {
		// TODO Auto-generated method stub
		return financeDAO.SelectFinanceByApartmentId(apartmentId);
	}

	@Override
	public List<Finance> SelectFinanceByMonth(int month) {
		// TODO Auto-generated method stub
		return financeDAO.SelectFinanceByMonth(month);
	}

}
