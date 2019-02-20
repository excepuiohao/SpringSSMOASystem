package com.service;

import java.util.List;

import com.bean.CardRecord;

public interface CardSevice {
	void InsertCardRecord(CardRecord cardRecord);

	List<CardRecord> SelectCardRecordByUserId(String userId);

	List<String> SelectRecordTimeByUserId(String userId);

	List<CardRecord> SelectAllCardRecord();

	int SelectCradCountByUserIdAndTime(String userId, String time);
	
	List<CardRecord> SelectUnusefulCardRecord();
	
	void AdjustingCard(String recordId,String status);
}
