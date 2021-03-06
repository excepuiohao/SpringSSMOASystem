package com.service;

import java.util.List;

import com.bean.Notice;

public interface NoticeService {
	void InsertNotice(Notice notice);

	void UpdateNotice(Notice notice);

	void DeleteNotice(String noticeId);

	List<Notice> SelectNoticeByPower(float power);

	int GetNoticeCount();

	void UpNotice1(float NoticeOrder);

	void UpNotice2(String noticeId);
}
