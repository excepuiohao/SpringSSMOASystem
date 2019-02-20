package com.service;

import java.util.List;

import com.bean.FiveRisksOneGold;

public interface FiveRisksService {
	void InsertFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold);

	void UpdateFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold);

	void DeleteFiveRisksOneGold(String fiveRisksOneGoldId);

	List<FiveRisksOneGold> SelectFiveRisksOneGoldByUserId(String userId);
	
}
