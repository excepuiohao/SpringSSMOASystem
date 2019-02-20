package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Notice;
import com.dao.NoticeDAO;
import com.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDAO noticeDAO;

	@Override
	public void InsertNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeDAO.InsertNotice(notice);
	}

	@Override
	public void UpdateNotice(Notice notice) {
		// TODO Auto-generated method stub
		noticeDAO.UpdateNotice(notice);
	}

	@Override
	public void DeleteNotice(String noticeId) {
		// TODO Auto-generated method stub
		noticeDAO.DeleteNotice(noticeId);
	}

	@Override
	public List<Notice> SelectNoticeByPower(float power) {
		// TODO Auto-generated method stub
		return noticeDAO.SelectNoticeByPower(power);
	}

	@Override
	public int GetNoticeCount() {
		// TODO Auto-generated method stub
		return noticeDAO.GetNoticeCount();
	}

	@Override
	public void UpNotice1(float NoticeOrder) {
		// TODO Auto-generated method stub
		noticeDAO.UpNotice1(NoticeOrder);
	}

	@Override
	public void UpNotice2(String noticeId) {
		// TODO Auto-generated method stub
		noticeDAO.UpNotice2(noticeId);
	}

}
