package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Admin;
import com.service.AdminService;
import com.service.impl.AdminServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class AdminController {
	
	@Resource(name = "adminServiceImpl", type = AdminServiceImpl.class)
	AdminService adminService;
	
	@RequestMapping("/AdminLogin")
	public String AdminLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int AdminId = Integer.valueOf(request.getParameter("AdminId")).intValue();
		String AdminPassword = request.getParameter("AdminPassword");
		Admin admin=new Admin();
		admin=adminService.SelectAdminByIdAndPassword( Integer.toString(AdminId), AdminPassword);
		if (admin == null) {
			response.setContentType("text/html;charset=gb2312");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('µ«¬Ω ß∞‹£¨«Î÷ÿ–¬ ‰»Îƒ˙µƒ√‹¬Î£°');");
			out.println("history.back();");
			out.println("</script>");
			return "../jsp/AdminLogin";
		} else {
			request.getSession().setAttribute("adminId", admin.getAdminId());
			return "../jsp/AdminMain";
		}
	}
}
