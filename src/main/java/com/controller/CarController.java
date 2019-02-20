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
import com.bean.Users;
import com.service.CarService;
import com.service.UserService;
import com.service.impl.CarServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class CarController {

	@Resource(name = "userServiceImpl", type = UserServiceImpl.class)
	UserService userSerivces;

	@Resource(name = "carServiceImpl", type = CarServiceImpl.class)
	CarService carServices;

	@RequestMapping("/InsertCar")
	public String InsertCar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int DriverId = Integer.valueOf(request.getParameter("DriverId")).intValue();
		String CarLine = request.getParameter("CarLine");
		String CarModel = request.getParameter("CarModel");
		String CarTime = request.getParameter("CarTime");
		CarLine = new String(CarLine.getBytes("ISO-8859-1"), "UTF-8");
		CarModel = new String(CarModel.getBytes("ISO-8859-1"), "UTF-8");
		CarTime = new String(CarTime.getBytes("ISO-8859-1"), "UTF-8");

		Car car = new Car(0, CarLine, DriverId, 0, CarModel, CarTime);
		carServices.InsertCar(car);

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('增加班车成功，返回首页');");
		out.println("</script>");
		List<Car> list = new ArrayList<Car>();
		list = carServices.SelectCar();
		request.setAttribute("list", list);
		return "../jsp/AllCar";

	}

	@RequestMapping("/AdminSelectCar")
	public String AdminSelectCar(HttpServletRequest request) throws IOException {
		List<Car> list = new ArrayList<Car>();
		list = carServices.SelectCar();
		request.setAttribute("list", list);
		return "../jsp/AllCar";

	}
	
	@RequestMapping("/UserSelectCar")
	public String UserSelectCar(HttpServletRequest request) throws IOException {
		List<Car> list = new ArrayList<Car>();
		list = carServices.SelectCar();
		request.setAttribute("list", list);
		return "../jsp/UserCar";

	}

	@RequestMapping("/DeleteCar")
	public String DeleteCar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CarId = request.getParameter("CarId");
		carServices.DeleteCar(CarId);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('删除成功，返回首页');");
		out.println("</script>");
		List<Car> list = new ArrayList<Car>();
		list = carServices.SelectCar();
		request.setAttribute("list", list);
		return "../jsp/AllCar";

	}

	@RequestMapping("/UpdateCar1")
	public String UpdateCar1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String CarId = request.getParameter("CarId");
		Car car = new Car();
		car = carServices.SelectCarById(CarId);
		request.setAttribute("car", car);
		return "../jsp/UpdateCar";

	}

	@RequestMapping("/UpdateCar2")
	public String UpdateCar2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int DriverId = Integer.valueOf(request.getParameter("DriverId")).intValue();
		String CarLine = request.getParameter("CarLine");
		String CarModel = request.getParameter("CarModel");
		String CarTime = request.getParameter("CarTime");
		CarLine = new String(CarLine.getBytes("ISO-8859-1"), "UTF-8");
		CarModel = new String(CarModel.getBytes("ISO-8859-1"), "UTF-8");
		CarTime = new String(CarTime.getBytes("ISO-8859-1"), "UTF-8");
		int CarNumber = Integer.valueOf(request.getParameter("CarNumber")).intValue();
		int CarId = Integer.valueOf(request.getParameter("CarId")).intValue();
		Car car = new Car(CarId, CarLine, DriverId, CarNumber, CarModel, CarTime);
		carServices.UpdateCar(car);
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.flush();
		out.println("<script>");
		out.println("alert('更新成功，返回首页');");
		out.println("</script>");
		List<Car> list = new ArrayList<Car>();
		list = carServices.SelectCar();
		request.setAttribute("list", list);
		return "../jsp/AllCar";
	}
}
