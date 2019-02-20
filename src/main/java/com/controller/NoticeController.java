package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Notice;
import com.service.NoticeService;
import com.service.UserService;
import com.service.impl.NoticeServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class NoticeController {
	@Resource(name = "noticeServiceImpl", type = NoticeServiceImpl.class)
	NoticeService noticeSerivces;

	@Resource(name = "userServiceImpl", type = UserServiceImpl.class)
	UserService userSerivces;

	@RequestMapping("/InsertNotice")
	public String InsertNotice(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String NoticeContent = request.getParameter("NoticeContent");
		int NoticePower = Integer.valueOf(request.getParameter("NoticePower")).intValue();
		NoticeContent = new String(NoticeContent.getBytes("ISO-8859-1"), "UTF-8");
		int NoticeOrder = noticeSerivces.GetNoticeCount() + 1;
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String NoticeTime = formatter.format(currentTime);
		Notice notice = new Notice(0, NoticeContent, NoticePower, NoticeOrder, NoticeTime);
		noticeSerivces.InsertNotice(notice);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('公告发布成功，返回首页');");
		out.println("</script>");
		List<Notice> list = new ArrayList<Notice>();
		String userId = request.getSession().getAttribute("userId").toString();
		int UserLevel = userSerivces.SelectUserLevelByUserID(userId);
		list = noticeSerivces.SelectNoticeByPower(UserLevel);
		request.setAttribute("list", list);
		int Order = noticeSerivces.GetNoticeCount();
		request.getSession().setAttribute("noticeCount", Order);
		return "../jsp/AllNotice";

	}

	@RequestMapping("/UserSelectNotice")
	public String UserSelectNotice(HttpServletRequest request) throws IOException {
		List<Notice> list = new ArrayList<Notice>();
		String userId = request.getSession().getAttribute("userId").toString();
		int UserLevel = userSerivces.SelectUserLevelByUserID(userId);
		list = noticeSerivces.SelectNoticeByPower(UserLevel);
		System.out.println("gugu:"+list.get(1).getNoticeTime());
		request.setAttribute("list", list);
		return "../jsp/UserNotice";

	}
	
	@RequestMapping("/AdminSelectNotice")
	public String AdminSelectNotice(HttpServletRequest request) throws IOException {
		List<Notice> list = new ArrayList<Notice>();
		String userId = request.getSession().getAttribute("userId").toString();
		int UserLevel = userSerivces.SelectUserLevelByUserID(userId);
		list = noticeSerivces.SelectNoticeByPower(UserLevel);
		System.out.println("gugu:"+list.get(1).getNoticeTime());
		request.setAttribute("list", list);
		return "../jsp/AllNotice";

	}

	@RequestMapping("/DeleteNotice")
	public String DeleteNotice(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String NoticeId = request.getParameter("NoticeId");
		noticeSerivces.DeleteNotice(NoticeId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		List<Notice> list = new ArrayList<Notice>();
		String userId = request.getSession().getAttribute("userId").toString();
		int UserLevel = userSerivces.SelectUserLevelByUserID(userId);
		list = noticeSerivces.SelectNoticeByPower(UserLevel);
		request.setAttribute("list", list);
		int Order = noticeSerivces.GetNoticeCount();
		request.getSession().setAttribute("noticeCount", Order);
		return "../jsp/AllNotice";

	}

	@RequestMapping("/UpNotice")
	public String UpNotice(HttpServletRequest request) throws IOException {
		String NoticeId = request.getParameter("NoticeId");
		float NoticeOrder = Float.parseFloat(request.getParameter("NoticeOrder"));
		float Order = noticeSerivces.GetNoticeCount();
		// 置顶
		if (NoticeOrder == 1) {

			// 不进行任何操作
		} else {
			// 让除了这一条之外的所有order+1 然后将这一条order==1
			noticeSerivces.UpNotice1(NoticeOrder);
			noticeSerivces.UpNotice2(NoticeId);
		}

		List<Notice> list = new ArrayList<Notice>();
		String userId = request.getSession().getAttribute("userId").toString();
		int UserLevel = userSerivces.SelectUserLevelByUserID(userId);
		list = noticeSerivces.SelectNoticeByPower(UserLevel);
		request.setAttribute("list", list);
		return "../jsp/AllNotice";

	}
}
