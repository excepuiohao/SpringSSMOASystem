package com.dao;

import java.util.List;

import com.bean.FiveRisksOneGold;

public interface FiveRisksDAO {

	void InsertFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold);

	void UpdateFiveRisksOneGold(FiveRisksOneGold fiveRisksOneGold);

	void DeleteFiveRisksOneGold(String fiveRisksOneGoldId);

	List<FiveRisksOneGold> SelectFiveRisksOneGoldByUserId(String userId);

}
