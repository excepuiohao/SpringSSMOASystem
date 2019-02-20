package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Compensate;
import com.bean.FiveRisksOneGold;
import com.bean.Insurance;
import com.bean.Salary;
import com.bean.Users;
import com.service.CardSevice;
import com.service.CompensateService;
import com.service.FiveRisksService;
import com.service.InsuranceService;
import com.service.SalaryService;
import com.service.UserService;
import com.service.impl.CardServiceImpl;
import com.service.impl.CompensateServiceImpl;
import com.service.impl.FiveRisksServiceImpl;
import com.service.impl.InsuranceServiceImpl;
import com.service.impl.SalaryServiceImpl;
import com.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/jsp")
public class SalaryController {

	
	@Resource(name = "userServiceImpl", type = UserServiceImpl.class)
	UserService userSerivces;
	
	@Resource(name = "salaryServiceImpl", type = SalaryServiceImpl.class)
	SalaryService salaryService;
	
	@Resource(name = "fiveRisksServiceImpl", type = FiveRisksServiceImpl.class)
	FiveRisksService fiveRisksService;
	
	@Resource(name = "compensateServiceImpl", type = CompensateServiceImpl.class)
	CompensateService compensateService;

	@Resource(name = "insuranceServiceImpl", type = InsuranceServiceImpl.class)
	InsuranceService insuranceService;
	
	@Resource(name = "cardServiceImpl", type = CardServiceImpl.class)
	CardSevice cardSevice;
	
	public Salary CalSalary(int userId){
		Salary salary=new Salary();
		//得到员工底薪
		Users users=userSerivces.SelectUserByUserID(String.valueOf(userId));
		float UserBaseSalary=users.getUserSalary();
		//得到员工考勤
		float UserAttence=0;
		float HourSalary=UserBaseSalary/160;
		int HourWork=0;
		List<String> list =cardSevice.SelectRecordTimeByUserId(String.valueOf(userId));
		for (int i = 0; i < list.size(); i=i+2) {
			HourWork=HourWork+salaryService.CalWorkHour(list.get(i), list.get(i+1));
		}
		UserAttence=HourSalary*HourWork;
		//得到员工商保
		float UserSubsidy=0;
		List<Insurance>insurances=insuranceService.SelectUsefulInsuranceByUserId(String.valueOf(userId));
		for (int i = 0; i < insurances.size(); i++) {
			UserSubsidy=UserSubsidy+insurances.get(i).getCompensateMoney();
		}
		
		
		//得到员工补贴
		float UserCompensate=0;
		List<Compensate> compensates=compensateService.SelectUsefulCompensateByUserId(String.valueOf(userId));
		for (int i = 0; i < compensates.size(); i++) {
			UserCompensate=UserCompensate+compensates.get(i).getCompensatePrice();
		}
		
		
		
		//得到员工五险一金
		List<FiveRisksOneGold> fiveRisksOneGold=fiveRisksService.SelectFiveRisksOneGoldByUserId(String.valueOf(userId));
		float FiveRiskOneGoldMoney=0;
		for (int i = 0; i < fiveRisksOneGold.size(); i++) {
			float Endowment=fiveRisksOneGold.get(i).getEndowment();
			float Medical=fiveRisksOneGold.get(i).getMedical();
			float Unemployment=fiveRisksOneGold.get(i).getUnemployment();
			float Employment=fiveRisksOneGold.get(i).getEmployment();
			float Maternity=fiveRisksOneGold.get(i).getMaternity();
			float Housing=fiveRisksOneGold.get(i).getHousing();
			FiveRiskOneGoldMoney=FiveRiskOneGoldMoney+Endowment+Medical+Unemployment+Employment+Maternity+Housing;
		}
		
		
		//得到员工实际所得工资
		float UserGetSalary=UserAttence+UserSubsidy+UserCompensate-FiveRiskOneGoldMoney;
		//得到发放时间
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String GrantTime = formatter.format(currentTime);
		//得到发放月份
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MMs");
		String SalaryMonth = formatter1.format(currentTime);
		
		salary.setFiveRiskOneGold(FiveRiskOneGoldMoney);
		salary.setGrantTime(GrantTime);
		salary.setSalaryId(1);
		salary.setSalaryMonth(SalaryMonth);
		salary.setUserAttence(UserAttence);
		salary.setUserBaseSalary(UserBaseSalary);
		salary.setUserCompensate(UserCompensate);
		salary.setUserGetSalary(UserGetSalary);
		salary.setUserID(userId);
		salary.setUserSubsidy(UserSubsidy);
		return salary;
	}
	
	@RequestMapping("/SelectMySalary")
	public String SelectMySalary(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int userId = Integer.valueOf(request.getSession().getAttribute("userId").toString()).intValue();
		Salary salary=CalSalary(userId);
		List<Salary> list = new ArrayList<Salary>();
		list.add(salary);
		request.setAttribute("list", list);
		return "../jsp/Salary";

	}
	
	
	@RequestMapping("/SelectAllSalary")
	public String SelectAllSalary(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<String> list1=userSerivces.SelectAllUserId();
		List<Salary> list=new ArrayList<Salary>();
		Salary salary=new Salary();
		System.out.println("userId:"+list1.get(1));
		for (int i = 0; i < list1.size(); i++) {
		System.out.println("userId:"+list1.get(i));
		 int userId= Integer.valueOf(list1.get(i)).intValue();
		 salary=CalSalary(userId);
		 list.add(salary);
		 salaryService.InsertSalary(salary);
		}
		request.setAttribute("list", list);
		return "../jsp/AllSalary";
	}
}
