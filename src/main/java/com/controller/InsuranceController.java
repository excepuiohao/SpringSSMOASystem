package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Compensate;
import com.bean.Insurance;
import com.service.InsuranceService;
import com.service.impl.InsuranceServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class InsuranceController {
	
	@Resource(name = "insuranceServiceImpl", type = InsuranceServiceImpl.class)
	InsuranceService insuranceService;
	
	@RequestMapping("/InsertInsurance")
	public String InsertInsurance(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CompensateReason = request.getParameter("CompensateReason");
		CompensateReason = new String(CompensateReason.getBytes("ISO-8859-1"), "UTF-8");
		float CompensateMoney = Float.valueOf(request.getParameter("CompensateMoney").toString()).intValue();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		Insurance insurance=new Insurance(0, userId, CompensateMoney, CompensateReason, "审核中");
		insuranceService.InsertInsurance(insurance);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('申请商保成功，等待审核');");
		out.println("</script>");
		
		return "../jsp/AllCompensate";

	}

	@RequestMapping("/SelectInsuranceByUserId")
	public String SelectInsuranceByUserId(HttpServletRequest request) throws IOException {
		String UserId = request.getParameter("UserId");
		UserId = new String(UserId.getBytes("ISO-8859-1"), "UTF-8");
		List<Insurance> list = new ArrayList<Insurance>();
		list = insuranceService.SelectInsuranceByUserId(UserId);
		request.setAttribute("list", list);
		return "../jsp/InsuranceAuditing";

	}
	
	@RequestMapping("/AuditingInsurance")
	public String AuditingInsurance(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CompensateStatus = request.getParameter("CompensateStatus");
		CompensateStatus = new String(CompensateStatus.getBytes("ISO-8859-1"), "UTF-8");
		if (CompensateStatus.equals("审核中")) {
			CompensateStatus = "审核成功";
		} else {
			CompensateStatus = "审核中";
		}
		float CompensateMoney = Float.valueOf(request.getParameter("CompensateMoney").toString()).intValue();
		int UserId = Integer.valueOf(request.getParameter("UserId").toString()).intValue();
		int InsuranceID = Integer.valueOf(request.getParameter("InsuranceID").toString()).intValue();
		String CompensateReason = request.getParameter("CompensateReason");
		CompensateReason = new String(CompensateStatus.getBytes("ISO-8859-1"), "UTF-8");
		Insurance insurance=new Insurance(InsuranceID, UserId, CompensateMoney, CompensateReason, CompensateStatus);
		insuranceService.UpdateInsurance(insurance);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('审核成功，返回首页');");
		out.println("</script>");
		String UserId1 =request.getSession().getAttribute("userId").toString();
		List<Insurance> list = new ArrayList<Insurance>();
		list = insuranceService.SelectInsuranceByUserId(UserId1);
		request.setAttribute("list", list);
		return "../jsp/MyInsurance";

	}
	
	@RequestMapping("/SelectMyInsurance")
	public String SelectMyInsurance(HttpServletRequest request) throws IOException {
		String UserId =request.getSession().getAttribute("userId").toString();
		List<Insurance> list = new ArrayList<Insurance>();
		list = insuranceService.SelectInsuranceByUserId(UserId);
		request.setAttribute("list", list);
		return "../jsp/MyInsurance";

	}
}
