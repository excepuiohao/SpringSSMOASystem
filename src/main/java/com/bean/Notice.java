package com.bean;

/**
 * @author excepuio π´∏Êª˘Óê
 */
public class Notice {

	private int NoticeId;

	private String NoticeContent;

	private float NoticePower;

	private int NoticeOrder;

	private String NoticeTime;

	public int getNoticeId() {
		return NoticeId;
	}

	public void setNoticeId(int noticeId) {
		NoticeId = noticeId;
	}

	public String getNoticeContent() {
		return NoticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		NoticeContent = noticeContent;
	}

	public float getNoticePower() {
		return NoticePower;
	}

	public void setNoticePower(float noticePower) {
		NoticePower = noticePower;
	}

	public int getNoticeOrder() {
		return NoticeOrder;
	}

	public void setNoticeOrder(int noticeOrder) {
		NoticeOrder = noticeOrder;
	}

	@Override
	public String toString() {
		return "Notice [NoticeId=" + NoticeId + ", NoticeContent=" + NoticeContent + ", NoticePower=" + NoticePower
				+ ", NoticeOrder=" + NoticeOrder + ", NoticeTime=" + NoticeTime + "]";
	}

	public Notice(int noticeId, String noticeContent, float noticePower, int noticeOrder, String noticeTime) {
		super();
		NoticeId = noticeId;
		NoticeContent = noticeContent;
		NoticePower = noticePower;
		NoticeOrder = noticeOrder;

		NoticeTime = noticeTime;
	}

	public String getNoticeTime() {
		return NoticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		NoticeTime = noticeTime;
	}

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

}
