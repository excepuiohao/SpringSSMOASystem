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

import com.bean.Compensate;
import com.bean.WorkLog;
import com.service.CompensateService;
import com.service.impl.CompensateServiceImpl;
import com.service.impl.WorkLogServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class CompensateController {

	@Resource(name = "compensateServiceImpl", type = CompensateServiceImpl.class)
	CompensateService compensateService;

	@RequestMapping("/InsertCompensate")
	public String InsertCompensate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CompensateType = request.getParameter("CompensateType");
		CompensateType = new String(CompensateType.getBytes("ISO-8859-1"), "UTF-8");
		float CompensatePrice = Float.valueOf(request.getParameter("CompensatePrice").toString()).intValue();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		Compensate compensate = new Compensate(0, CompensateType, CompensatePrice, userId, "审核中");
		compensateService.InsertCompensate(compensate);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('报销成功，等待审核');");
		out.println("</script>");
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllCompensate";

	}

	@RequestMapping("/SelectCompensate")
	public String SelectCompensate(HttpServletRequest request) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllCompensate";

	}

	@RequestMapping("/DeleteCompensate")
	public String DeleteCompensate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CompensateID = request.getParameter("CompensateID");
		compensateService.DeleteCompensate(CompensateID);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/AllCompensate";

	}

	@RequestMapping("/AuditingCompensate")
	public String AuditingCompensate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CompensateID = request.getParameter("CompensateID");
		String CompensateStatus = request.getParameter("CompensateStatus");
		CompensateStatus = new String(CompensateStatus.getBytes("ISO-8859-1"), "UTF-8");
		if ("审核中".equals(CompensateStatus)) {
			CompensateStatus = "审核成功";
		} else {
			CompensateStatus = "审核中";
		}
		String CompensateType = request.getParameter("CompensateType");
		CompensateType = new String(CompensateType.getBytes("ISO-8859-1"), "UTF-8");
		float CompensatePrice = Float.valueOf(request.getParameter("CompensatePrice").toString()).intValue();
		int userId = Integer.valueOf(request.getParameter("UserID").toString()).intValue();
		Compensate compensate = new Compensate();
		compensate.setCompensateID(Integer.parseInt(CompensateID));
		compensate.setCompensateStatus(CompensateStatus);
		compensate.setCompensatePrice(CompensatePrice);
		compensate.setCompensateStatus(CompensateStatus);
		compensate.setCompensateType(CompensateType);
		compensate.setUserID(userId);
		compensateService.UpdateCompensate(compensate);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('审核成功，返回首页');");
		out.println("</script>");

		return "../jsp/SelectCompensateByCondition";

	}

	@RequestMapping("/SelectCompensateByStatus")
	public String SelectCompensateByStatus(HttpServletRequest request) throws IOException {
		String CompensateStatus = request.getParameter("CompensateStatus");
		CompensateStatus = new String(CompensateStatus.getBytes("ISO-8859-1"), "UTF-8");
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByStatus(CompensateStatus);
		request.setAttribute("list", list);
		return "../jsp/CompensateAuditing";

	}

	@RequestMapping("/SelectCompensateByUserId")
	public String SelectCompensateByUserId(HttpServletRequest request) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByUserId(String.valueOf(userId));
		request.setAttribute("list", list);
		return "../jsp/CompensateAuditing";

	}

	@RequestMapping("/SelectCompensateByType")
	public String SelectCompensateByType(HttpServletRequest request) throws IOException {
		String CompensateType = request.getParameter("CompensateType");
		CompensateType = new String(CompensateType.getBytes("ISO-8859-1"), "UTF-8");
		List<Compensate> list = new ArrayList<Compensate>();
		list = compensateService.SelectCompensateByType(CompensateType);
		request.setAttribute("list", list);
		return "../jsp/CompensateAuditing";

	}
}
