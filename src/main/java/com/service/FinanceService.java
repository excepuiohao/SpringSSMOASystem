package com.service;

import java.util.List;

import com.bean.Finance;

public interface FinanceService {

	void InsertFinance(Finance finance);

	void UpdateFinance(Finance finance);

	void DeleteFinance(String finance);

	List<Finance> SelectFinanceByApartmentId(String apartmentId);

	List<Finance> SelectFinanceByMonth(int month);

}
