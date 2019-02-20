package com.service.impl;

import java.util.List;

import com.bean.CardRecord;
import com.dao.CardDAO;
import com.service.CardSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardSevice {

	@Autowired
	CardDAO cardDAO;

	@Override
	public void InsertCardRecord(CardRecord cardRecord) {
		// TODO Auto-generated method stub
		cardDAO.InsertCardRecord(cardRecord);
	}

	@Override
	public List<CardRecord> SelectCardRecordByUserId(String userId) {
		// TODO Auto-generated method stub
		return cardDAO.SelectCardRecordByUserId(userId);
	}

	@Override
	public List<String> SelectRecordTimeByUserId(String userId) {
		// TODO Auto-generated method stub
		return cardDAO.SelectRecordTimeByUserId(userId);
	}

	@Override
	public List<CardRecord> SelectAllCardRecord() {
		// TODO Auto-generated method stub
		return cardDAO.SelectAllCardRecord();
	}

	@Override
	public int SelectCradCountByUserIdAndTime(String userId, String time) {
		// TODO Auto-generated method stub
		return cardDAO.SelectCradCountByUserIdAndTime(userId, time);
	}

	@Override
	public List<CardRecord> SelectUnusefulCardRecord() {
		// TODO Auto-generated method stub
		return cardDAO.SelectUnusefulCardRecord();
	}

	@Override
	public void AdjustingCard(String recordId, String status) {
		// TODO Auto-generated method stub
		cardDAO.AdjustingCard(recordId, status);
	}

}
