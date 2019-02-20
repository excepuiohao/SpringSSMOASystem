package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Contract;
import com.bean.Users;
import com.service.ContractService;
import com.service.NoticeService;
import com.service.UserService;
import com.service.impl.ContractServiceImpl;
import com.service.impl.NoticeServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class UserController {

	@Resource(name = "noticeServiceImpl", type = NoticeServiceImpl.class)
	NoticeService noticeSerivces;

	@Resource(name = "userServiceImpl", type = UserServiceImpl.class)
	UserService userSerivces;

	@Resource(name = "contractServiceImpl", type = ContractServiceImpl.class)
	ContractService contractService;

	@RequestMapping("/UserLogin")
	public String UserLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int userId = Integer.valueOf(request.getParameter("userId")).intValue();
		String emailPassword = request.getParameter("password");
		System.out.println(userId + emailPassword);
		Users users = new Users();
		users.setUserID(userId);
		users.setEmailPassword(emailPassword);
		Users users1 = new Users();
		users1 = userSerivces.SelectUserByIdAndPassword(users);
		System.out.println(users1);
		if (users1 == null) {
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('登陆失败，请重新输入您的密码！');");
			out.println("history.back();");
			out.println("</script>");
			return "../jsp/Login";
		} else {

			float Order = noticeSerivces.GetNoticeCount();
			request.getSession().setAttribute("noticeCount", Order);
			request.getSession().setAttribute("userId", users1.getUserId());
			request.getSession().setAttribute("userNameName", users1.getUserName());
			return "../jsp/Main";
		}
	}

	@RequestMapping("/UserRegist")
	public String UserRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String UserName = request.getParameter("UserName");
		UserName = new String(UserName.getBytes("ISO-8859-1"), "UTF-8");
		String UserSex = request.getParameter("UserSex");
		UserSex = new String(UserSex.getBytes("ISO-8859-1"), "UTF-8");
		String UserPhone = request.getParameter("UserPhone");
		String UserAddress = request.getParameter("UserAddress");
		UserAddress = new String(UserAddress.getBytes("ISO-8859-1"), "UTF-8");
		String UserApartment = request.getParameter("UserApartment");
		UserApartment = new String(UserApartment.getBytes("ISO-8859-1"), "UTF-8");
		int UserEmailId = Integer.valueOf(request.getParameter("UserEmailId")).intValue();
		String EmailPassword = request.getParameter("EmailPassword");
		float UserSalary = Float.parseFloat(request.getParameter("UserSalary"));
		int UserPMID = Integer.valueOf(request.getParameter("UserPMID")).intValue();
		int UserLevel = Integer.valueOf(request.getParameter("UserLevel")).intValue();
		String UserTime = request.getParameter("UserTime");
		UserTime = new String(UserTime.getBytes("ISO-8859-1"), "UTF-8");
		Users users = new Users(0, UserName, UserSex, UserPhone, UserAddress, UserApartment, UserEmailId, EmailPassword,
				UserSalary, UserPMID, UserLevel, UserTime, 0);
		userSerivces.InsertUser(users);
		Users users1 = new Users();
		users1 = userSerivces.SelectUserByIdAndPassword(users);
		System.out.println(users1);
		/*if (users1 == null) {
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('注册失败，请重新注册！');");
			out.println("history.back();");
			out.println("</script>");
			return "../jsp/Login";
		} else {*/
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('注册成功，请先于公司签订合同！');");
			out.println("</script>");
			return "../jsp/SignContract";
		/*}*/
	}

	@RequestMapping("/SignContract")
	public String SignContract(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ContractContent = request.getParameter("ContractContent");
		ContractContent = new String(ContractContent.getBytes("ISO-8859-1"), "UTF-8");
		String ContractType = request.getParameter("ContractType");
		ContractType = new String(ContractType.getBytes("ISO-8859-1"), "UTF-8");
		String ContractBeginTime = request.getParameter("ContractBeginTime");
		ContractBeginTime = new String(ContractBeginTime.getBytes("ISO-8859-1"), "UTF-8");
		String ContractEndTime = request.getParameter("ContractEndTime");
		ContractEndTime = new String(ContractEndTime.getBytes("ISO-8859-1"), "UTF-8");
		int UserId = Integer.valueOf(request.getParameter("UserId")).intValue();
		Contract contract = new Contract(1, ContractContent, ContractType, UserId, ContractBeginTime, ContractEndTime);
		contractService.InsertContract(contract);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('劳动签订合同签订成功，将跳转到登陆页面！');");
		out.println("</script>");
		return "../jsp/Login";
	}

	@RequestMapping("/UpdateUser")
	public String UpdateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String UserName = request.getParameter("UserName");
		UserName = new String(UserName.getBytes("ISO-8859-1"), "UTF-8");
		String UserSex = request.getParameter("UserSex");
		UserSex = new String(UserSex.getBytes("ISO-8859-1"), "UTF-8");
		String UserPhone = request.getParameter("UserPhone");
		String UserAddress = request.getParameter("UserAddress");
		UserAddress = new String(UserAddress.getBytes("ISO-8859-1"), "UTF-8");
		String UserApartment = request.getParameter("UserApartment");
		UserApartment = new String(UserApartment.getBytes("ISO-8859-1"), "UTF-8");
		int UserEmailId = Integer.valueOf(request.getParameter("UserEmailId")).intValue();
		String EmailPassword = request.getParameter("EmailPassword");
		float UserSalary = Float.parseFloat(request.getParameter("UserSalary"));
		int UserPMID = Integer.valueOf(request.getParameter("UserPMID")).intValue();
		int UserLevel = Integer.valueOf(request.getParameter("UserLevel")).intValue();
		String UserTime = request.getParameter("UserTime");
		UserTime = new String(UserTime.getBytes("ISO-8859-1"), "UTF-8");
		int CarId = Integer.valueOf(request.getParameter("CarId")).intValue();
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		Users users = new Users(userId, UserName, UserSex, UserPhone, UserAddress, UserApartment, UserEmailId,
				EmailPassword, UserSalary, UserPMID, UserLevel, UserTime, CarId);
		userSerivces.UpdateUser(users);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('更新成功，返回首页！');");
		out.println("history.back();");
		out.println("</script>");
		return "../jsp/Main";

	}

	@RequestMapping("/UserInfo")
	public String UserInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getSession().getAttribute("userId").toString();
		Users users = new Users();
		users = userSerivces.SelectUserByUserID(userId);
		request.setAttribute("users", users);
		return "../jsp/UpdateUser";

	}
	
	@RequestMapping("/DeleteUser")
	public String DeleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getParameter("userId");
		userId = new String(userId.getBytes("ISO-8859-1"), "UTF-8");
		userSerivces.DeleteUser(userId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('该人员已离职，返回首页！');");
		out.println("history.back();");
		out.println("</script>");
		return "../jsp/Main";

	}

}
