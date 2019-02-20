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

import com.bean.Apartment;
import com.bean.ApartmentUser;
import com.service.ApartmentService;
import com.service.ApartmentUserService;
import com.service.impl.ApartmentServiceImpl;
import com.service.impl.ApartmentUserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class ApartmentController {

	@Resource(name = "apartmentServiceImpl", type = ApartmentServiceImpl.class)
	ApartmentService apartmentService;

	@Resource(name = "apartmentUserServiceImpl", type = ApartmentUserServiceImpl.class)
	ApartmentUserService apartmentUserService;

	@RequestMapping("/InsertApartment")
	public String InsertCar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ApartmentPMId = Integer.valueOf(request.getParameter("ApartmentPMId")).intValue();
		String ApartmentName = request.getParameter("ApartmentName");
		String ApartmentExplain = request.getParameter("ApartmentExplain");
		ApartmentName = new String(ApartmentName.getBytes("ISO-8859-1"), "UTF-8");
		ApartmentExplain = new String(ApartmentExplain.getBytes("ISO-8859-1"), "UTF-8");
		Apartment apartment = new Apartment(0, ApartmentName, ApartmentPMId, ApartmentExplain);
		apartmentService.InsertApartment(apartment);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('增加部门成功，返回首页');");
		out.println("</script>");
		List<Apartment> list = new ArrayList<Apartment>();
		list = apartmentService.SelectAllApartment();
		request.setAttribute("list", list);
		return "../jsp/AllApartment";

	}

	@RequestMapping("/UserSelectApartment")
	public String UserSelectApartment(HttpServletRequest request) throws IOException {
		List<Apartment> list = new ArrayList<Apartment>();
		list = apartmentService.SelectAllApartment();
		request.setAttribute("list", list);
		return "../jsp/UserApartment";

	}
	@RequestMapping("/AdminSelectApartment")
	public String AdminSelectApartment(HttpServletRequest request) throws IOException {
		List<Apartment> list = new ArrayList<Apartment>();
		list = apartmentService.SelectAllApartment();
		request.setAttribute("list", list);
		return "../jsp/AllApartment";

	}

	@RequestMapping("/DeleteApartment")
	public String DeleteApartment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ApartmentId = request.getParameter("ApartmentId");
		apartmentService.DeleteApartment(ApartmentId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		List<Apartment> list = new ArrayList<Apartment>();
		list = apartmentService.SelectAllApartment();
		request.setAttribute("list", list);
		return "../jsp/AllApartment";

	}

	@RequestMapping("/UpdateApartment1")
	public String UpdateApartment1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ApartmentId = request.getParameter("ApartmentId");
		Apartment apartment = new Apartment();

		apartment = apartmentService.SelectApartmentById(ApartmentId);
		request.setAttribute("apartment", apartment);
		return "../jsp/UpdateApartment";

	}

	@RequestMapping("/UpdateApartment2")
	public String UpdateApartment2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ApartmentPMId = Integer.valueOf(request.getParameter("ApartmentPMId")).intValue();
		String ApartmentName = request.getParameter("ApartmentName");
		String ApartmentExplain = request.getParameter("ApartmentExplain");
		ApartmentName = new String(ApartmentName.getBytes("ISO-8859-1"), "UTF-8");
		ApartmentExplain = new String(ApartmentExplain.getBytes("ISO-8859-1"), "UTF-8");
		int ApartmentId = Integer.valueOf(request.getParameter("ApartmentId")).intValue();
		Apartment apartment = new Apartment(ApartmentId, ApartmentName, ApartmentPMId, ApartmentExplain);
		apartmentService.UpdateApartment(apartment);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('更新成功，返回首页');");
		out.println("</script>");
		List<Apartment> list = new ArrayList<Apartment>();
		list = apartmentService.SelectAllApartment();
		request.setAttribute("list", list);
		return "../jsp/AllApartment";
	}

	@RequestMapping("/InsertApartmentUser")
	public String InsertApartmentUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ApartmentId = Integer.valueOf(request.getParameter("ApartmentId")).intValue();
		int UserId = Integer.valueOf(request.getParameter("UserId")).intValue();
		ApartmentUser apartmentUser = new ApartmentUser(0, ApartmentId, UserId);
		apartmentUserService.InsertApartmentUser(apartmentUser);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('增加部门人员成功，返回首页');");
		out.println("</script>");
		return "../jsp/ApartmentUser";

	}

	@RequestMapping("/DeleteApartmentUser")
	public String DeleteApartmentUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int ApartmentId = Integer.valueOf(request.getParameter("ApartmentId")).intValue();
		int UserId = Integer.valueOf(request.getParameter("UserId")).intValue();
		ApartmentUser apartmentUser = new ApartmentUser(0, ApartmentId, UserId);
		apartmentUserService.DeleteApartmentUser(apartmentUser);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除部门人员成功，返回首页');");
		out.println("</script>");
		return "../jsp/ApartmentUser";

	}

}
