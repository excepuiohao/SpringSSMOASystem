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
import com.bean.FiveRisksOneGold;
import com.service.CarService;
import com.service.FiveRisksService;
import com.service.UserService;
import com.service.impl.CarServiceImpl;
import com.service.impl.FiveRisksServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class FiveRisksOneGoldController {

	@Resource(name = "fiveRisksServiceImpl", type = FiveRisksServiceImpl.class)
	FiveRisksService fiveRisksService;


	@RequestMapping("/InsertFiveRisksOneGold")
	public String InsertFiveRisksOneGold(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int UserId = Integer.valueOf(request.getParameter("UserId")).intValue();
		float Endowment = Float.valueOf(request.getParameter("Endowment")).intValue();
		float Medical = Float.valueOf(request.getParameter("Medical")).intValue();
		float Unemployment = Float.valueOf(request.getParameter("Unemployment")).intValue();
		float Employment = Float.valueOf(request.getParameter("Employment")).intValue();
		float Maternity = Float.valueOf(request.getParameter("Maternity")).intValue();
		float Housing = Float.valueOf(request.getParameter("Housing")).intValue();
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String PayTime = formatter.format(currentTime);
		FiveRisksOneGold fiveRisksOneGold=new FiveRisksOneGold(0, UserId, Endowment, Medical, Unemployment, Employment, Maternity, Housing, PayTime);
		fiveRisksService.InsertFiveRisksOneGold(fiveRisksOneGold);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('缴纳成功，返回首页');");
		out.println("</script>");
		String userId = request.getSession().getAttribute("userId").toString();
		List<FiveRisksOneGold> list = new ArrayList<FiveRisksOneGold>();
		list = fiveRisksService.SelectFiveRisksOneGoldByUserId(userId);
		request.setAttribute("list", list);
		return "../jsp/AllFiveRisksOneGoldByUserId";

	}

	@RequestMapping("/SelectFiveRisksOneGoldByUserId")
	public String SelectFiveRisksOneGoldByUserId(HttpServletRequest request) throws IOException {
		String userId = request.getSession().getAttribute("userId").toString();
		List<FiveRisksOneGold> list = new ArrayList<FiveRisksOneGold>();
		list = fiveRisksService.SelectFiveRisksOneGoldByUserId(userId);
		request.setAttribute("list", list);
		return "../jsp/AllFiveRisksOneGoldByUserId";

	}

	
}
