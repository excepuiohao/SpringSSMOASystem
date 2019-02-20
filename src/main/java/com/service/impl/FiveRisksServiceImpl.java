package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.FiveRisksOneGold;
import com.dao.FiveRisksDAO;
import com.service.FiveRisksService;

@Service
public class FiveRisksServiceImpl implements FiveRisksService {

	@Autowired
	FiveRisksDAO fiveRisksDAO;

	@Override
	public void InsertFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold) {
		// TODO Auto-generated method stub
		fiveRisksDAO.InsertFiveRisksOneGold(fiveRisksOneGold);
	}

	@Override
	public void UpdateFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold) {
		// TODO Auto-generated method stub

		fiveRisksDAO.UpdateFiveRisksOneGold(fiveRisksOneGold);
	}

	@Override
	public void DeleteFiveRisksOneGold(String fiveRisksOneGoldId) {
		// TODO Auto-generated method stub
		fiveRisksDAO.DeleteFiveRisksOneGold(fiveRisksOneGoldId);
	}

	@Override
	public List<FiveRisksOneGold> SelectFiveRisksOneGoldByUserId(String userId) {
		// TODO Auto-generated method stub
		return fiveRisksDAO.SelectFiveRisksOneGoldByUserId(userId);
	}


}
