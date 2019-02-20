package com.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GetWeek {
	public static List<String> getWeekByDate(Date time) {
		List<String> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 设置时间格式
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		// 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下�?周去�?
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几�?
		if (1 == dayWeek) {
			cal.add(Calendar.DAY_OF_MONTH, -1);
		}
		System.out.println("要计算日期为:" + sdf.format(cal.getTime())); // 输出要计算日�?
		cal.setFirstDayOfWeek(Calendar.MONDAY);// 设置�?个星期的第一天，按中国的习惯�?个星期的第一天是星期�?
		int day = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几�?
		cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);// 根据日历的规则，给当前日期减去星期几与一个星期第�?天的差�??
		String imptime1 = sdf.format(cal.getTime());
		System.out.println("�?在周星期�?的日期：" + imptime1);
		list.add(imptime1);
		cal.add(Calendar.DATE, 1);
		String imptime2 = sdf.format(cal.getTime());
		System.out.println("�?在周星期二的日期�?" + imptime2);
		list.add(imptime2);
		cal.add(Calendar.DATE, 1);
		String imptime3 = sdf.format(cal.getTime());
		System.out.println("�?在周星期三的日期�?" + imptime3);
		list.add(imptime3);
		cal.add(Calendar.DATE, 1);
		String imptime4 = sdf.format(cal.getTime());
		System.out.println("�?在周星期四的日期�?" + imptime4);
		list.add(imptime4);
		cal.add(Calendar.DATE, 1);
		String imptime5 = sdf.format(cal.getTime());
		System.out.println("�?在周星期五的日期�?" + imptime5);
		list.add(imptime5);
		cal.add(Calendar.DATE, 1);
		String imptime6 = sdf.format(cal.getTime());
		System.out.println("�?在周星期六的日期�?" + imptime6);
		list.add(imptime6);
		cal.add(Calendar.DATE, 1);
		String imptime7 = sdf.format(cal.getTime());
		System.out.println("�?在周星期日的日期�?" + imptime7);
		list.add(imptime7);
		return list;
	}

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(GetWeek.getWeekByDate(d));
	}
}
