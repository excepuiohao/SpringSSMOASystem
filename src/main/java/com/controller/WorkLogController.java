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

import com.bean.Car;
import com.bean.Map;
import com.bean.WorkLog;
import com.service.MapService;
import com.service.UserService;
import com.service.WorkLogService;
import com.service.impl.MapServiceImpl;
import com.service.impl.UserServiceImpl;
import com.service.impl.WorkLogServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class WorkLogController {
	@Resource(name = "workLogServiceImpl", type = WorkLogServiceImpl.class)
	WorkLogService logServiceImpl;

	@RequestMapping("/InsertWorkLog")
	public String InsertWorkLog(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String LogContent = request.getParameter("LogContent");
		LogContent = new String(LogContent.getBytes("ISO-8859-1"), "UTF-8");
		int LogStatus = Integer.valueOf(request.getParameter("LogStatus")).intValue();

		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String LogTime = formatter.format(currentTime);
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		WorkLog workLog = new WorkLog(0, userId, LogTime, LogContent, LogStatus);
		logServiceImpl.InsertWorkLog(workLog);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('发布日志成功，返回首页');");
		out.println("</script>");
		List<WorkLog> list = new ArrayList<WorkLog>();
		list = logServiceImpl.SelectWorkLogByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllWorkLog";

	}

	@RequestMapping("/SelectWorkLog")
	public String SelectWorkLog(HttpServletRequest request) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<WorkLog> list = new ArrayList<WorkLog>();
		list = logServiceImpl.SelectWorkLogByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllWorkLog";

	}

	@RequestMapping("/DeleteWorkLog")
	public String DeleteWorkLog(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String LogId = request.getParameter("LogId");
		logServiceImpl.DeleteWorkLog(LogId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<WorkLog> list = new ArrayList<WorkLog>();
		list = logServiceImpl.SelectWorkLogByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllWorkLog";

	}

}
