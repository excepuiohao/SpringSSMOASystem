package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.CardRecord;
import com.bean.Salary;
import com.service.CardSevice;
import com.service.UserService;
import com.service.impl.CardServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class CardController {
	@Resource(name = "cardServiceImpl", type = CardServiceImpl.class)
	CardSevice cardSevice;
	
	@RequestMapping("/SelectMyCard")
	public String SelectMyCard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<CardRecord> list = new ArrayList<CardRecord>();
		list=cardSevice.SelectCardRecordByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/CardRecord";

	}
	
	@RequestMapping("/SelectAllCard")
	public String SelectAllCard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<CardRecord> list = cardSevice.SelectAllCardRecord();
		request.setAttribute("list", list);
		return "../jsp/AllCardRecord";

	}
	
	@RequestMapping("/SignCard")
	public String SignCard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CardRecord cardRecord=new CardRecord();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		InetAddress address = InetAddress.getLocalHost();//��ȡ���Ǳ��ص�IP��ַ //PC-20140317PXKX/192.168.0.121
		String ip = address.getHostAddress();
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String time = formatter.format(currentTime);
		int cardCount=cardSevice.SelectCradCountByUserIdAndTime(String.valueOf(userId), time);
		if (cardCount==0) {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			time = formatter.format(currentTime);
			cardRecord.setRecordId(1);
			cardRecord.setRecordIP(ip);
			cardRecord.setRecordTime(time);
			cardRecord.setUserId(userId);
			cardRecord.setStatus("�򿨳ɹ�");
			cardSevice.InsertCardRecord(cardRecord);
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('�ϰ�ǩ���ɹ�');");
			out.println("</script>");
		}else if (cardCount==1) {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			time = formatter.format(currentTime);
			cardRecord.setRecordId(1);
			cardRecord.setRecordIP(ip);
			cardRecord.setRecordTime(time);
			cardRecord.setUserId(userId);
			cardRecord.setStatus("�򿨳ɹ�");
			cardSevice.InsertCardRecord(cardRecord);
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('�°�򿨳ɹ�');");
			out.println("</script>");
		}else{
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('������Ѿ�������ο��� �����ظ���');");
			out.println("</script>");
		}
		return "../jsp/Main";

	}
	
	@RequestMapping("/ApplyCard")
	public String ApplyCard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CardRecord cardRecord=new CardRecord();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		String ApplyTime = request.getParameter("ApplyTime");
		ApplyTime = new String(ApplyTime.getBytes("ISO-8859-1"), "UTF-8");
		InetAddress address = InetAddress.getLocalHost();//��ȡ���Ǳ��ص�IP��ַ //PC-20140317PXKX/192.168.0.121
		String ip = address.getHostAddress();
		String begintime=ApplyTime+" 09:00:00";
		String endtime=ApplyTime+" 18:00:00";
		int cardCount=cardSevice.SelectCradCountByUserIdAndTime(String.valueOf(userId), ApplyTime);
		if (cardCount==0) {
			cardRecord.setRecordId(1);
			cardRecord.setRecordIP(ip);
			cardRecord.setRecordTime(begintime);
			cardRecord.setUserId(userId);
			cardRecord.setStatus("�����");
			cardSevice.InsertCardRecord(cardRecord);
			cardRecord.setRecordTime(endtime);
			cardSevice.InsertCardRecord(cardRecord);
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('������û�д򿨼�¼������ɹ����ȴ����');");
			out.println("</script>");
		}else if (cardCount==1) {
			cardRecord.setRecordId(1);
			cardRecord.setRecordIP(ip);
			cardRecord.setRecordTime(endtime);
			cardRecord.setUserId(userId);
			cardRecord.setStatus("�����");
			cardSevice.InsertCardRecord(cardRecord);
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('��������һ���򿨼�¼������ɹ�����ȴ����');");
			out.println("</script>");
		}else{
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('�������������Ĵ򿨼�¼������Ҫ����������');");
			out.println("</script>");
		}
		return "../jsp/ApplyCard";
	}
	
	@RequestMapping("/CardAdjusting")
	public String CardAdjusting(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<CardRecord> list = new ArrayList<CardRecord>();
		list=cardSevice.SelectUnusefulCardRecord();
		request.setAttribute("list", list);
		return "../jsp/AdjustingCardRecord";

	}
	
	@RequestMapping("/CardAdjusting1")
	public String CardAdjusting1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String RecordId = request.getParameter("RecordId");
		RecordId = new String(RecordId.getBytes("ISO-8859-1"), "UTF-8");
		cardSevice.AdjustingCard(RecordId, "�򿨳ɹ�");
		List<CardRecord> list = new ArrayList<CardRecord>();
		list=cardSevice.SelectUnusefulCardRecord();
		request.setAttribute("list", list);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('��˳ɹ���������¼��Ч');");
		out.println("</script>");
		return "../jsp/AdjustingCardRecord";

	}
	@RequestMapping("/CardAdjusting2")
	public String CardAdjusting2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String RecordId = request.getParameter("RecordId");
		RecordId = new String(RecordId.getBytes("ISO-8859-1"), "UTF-8");
		cardSevice.AdjustingCard(RecordId, "���ʧ��");
		List<CardRecord> list = new ArrayList<CardRecord>();
		list=cardSevice.SelectUnusefulCardRecord();
		request.setAttribute("list", list);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('��˳ɹ���������¼��Ч');");
		out.println("</script>");
		return "../jsp/AdjustingCardRecord";

	}
	
	
}
