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

import com.bean.Car;
import com.bean.CardRecord;
import com.bean.Leave;
import com.service.ApartmentService;
import com.service.LeaveService;
import com.service.impl.LeaveServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class LeaveController {

	@Resource(name = "leaveServiceImpl", type = LeaveServiceImpl.class)
	LeaveService leaveService;

	@RequestMapping("/InsertLeave")
	public String InsertLeave(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		String LeaveBeginTime = request.getParameter("LeaveBeginTime");
		String LeaveEndTime = request.getParameter("LeaveEndTime");
		String LeaveType = request.getParameter("LeaveType");
		LeaveBeginTime = new String(LeaveBeginTime.getBytes("ISO-8859-1"), "UTF-8");
		LeaveEndTime = new String(LeaveEndTime.getBytes("ISO-8859-1"), "UTF-8");
		LeaveType = new String(LeaveType.getBytes("ISO-8859-1"), "UTF-8");
		String LeaveReason = request.getParameter("LeaveReason");
		LeaveReason = new String(LeaveReason.getBytes("ISO-8859-1"), "UTF-8");
		Leave leave=new Leave(0, userId, LeaveBeginTime, LeaveEndTime, LeaveType, LeaveReason, "审核中");
		leaveService.InsertLeave(leave);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('申请成功，返回首页');");
		out.println("</script>");
		return "../jsp/Main";
	}
	
	@RequestMapping("/SeleteMyLeave")
	public String SeleteMyLeave(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getSession().getAttribute("userId").toString();
		List<Leave>list=leaveService.SelectLeaveByUserId(userId);
		request.setAttribute("list", list);
		return "../jsp/MyLeave";
	}
	
	@RequestMapping("/AdjustingLeave")
	public String AdjustingLeave(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Leave>list=leaveService.SelectLeaveByStatus("审核中");
		request.setAttribute("list", list);
		return "../jsp/AdjustingLeave";
	}
	
	@RequestMapping("/AdjustingLeave1")
	public String AdjustingLeave1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String LeaveId = request.getParameter("LeaveId");
		LeaveId = new String(LeaveId.getBytes("ISO-8859-1"), "UTF-8");
		leaveService.AdjustingLeave(LeaveId, "审核成功");
		List<Leave>list=leaveService.SelectLeaveByStatus("审核中");
		request.setAttribute("list", list);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('审核成功。该条记录有效');");
		out.println("</script>");
		return "../jsp/AdjustingLeave";
	}
	
	@RequestMapping("/AdjustingLeave2")
	public String AdjustingLeave2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String LeaveId = request.getParameter("LeaveId");
		LeaveId = new String(LeaveId.getBytes("ISO-8859-1"), "UTF-8");
		leaveService.AdjustingLeave(LeaveId, "审核失败");
		List<Leave>list=leaveService.SelectLeaveByStatus("审核中");
		request.setAttribute("list", list);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('审核成功。该条记录无效');");
		out.println("</script>");
		return "../jsp/AdjustingLeave";
	}
	
}
