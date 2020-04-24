package com.duanwl.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年4月23日 下午5:23:49
 */
public class DateUtil {
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 根据传入的日期返回日期的月初，如传入2020-4-24 ，返回2020-4-01
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		//Calendar 是一个日历类。提供 设置日期，加减日期等方法，方便程序员对日期做计算
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置这个月月初即：改变这个月的日期为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);//设置为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置为0小时
		c.set(Calendar.MINUTE, 0);//设置为0分
		c.set(Calendar.SECOND, 0);//设置为0秒
		return c.getTime();
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 根据传入的日期返回日期的月初。如传入 2020-04-24  ，返回 2020-04-30 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//Calender 是一个日历类，提供  设置日期，加减日期等方法，方便程序员对日期做计算
		Calendar c = Calendar.getInstance(); //初始化一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月加  2020-05-24，在改变成2020-05-01再减去一秒，在获取日期
		c.add(Calendar.MONTH, 1);//让月加1
		Date nexMonthInit = getInitMonth(c.getTime());//变成月初
		//初始化日历类
		c.setTime(nexMonthInit);
		c.add(Calendar.SECOND, -1);//再减去一秒
		return c.getTime();
	}
	
	
	public static int getAgeByBirthday(Date  birthday) {
		//获取系统当前年月日
		Calendar c = Calendar.getInstance();
		int nowYear = c.get(Calendar.YEAR);
		int nowMonth = c.get(Calendar.MONTH);
		int nowDate = c.get(Calendar.DAY_OF_MONTH);
		//获取传入日期的生日的年月日
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayYear = c2.get(Calendar.YEAR);
		int birthdayMonth = c2.get(Calendar.MONTH);
		int birthdayDate = c2.get(Calendar.DAY_OF_MONTH);
		//判断
		if(nowYear<birthdayYear) {
			throw new RuntimeException("传入的错误日期");
		}
		//两个年份相减，得出年龄
		int age= nowYear-birthdayYear;
		//没有到出生的月侧年龄-1
		if(nowMonth<birthdayMonth) {
			age--;
		}
		//没有到出生日 年龄减去1
		if(nowMonth ==birthdayMonth && nowDate<birthdayDate) {
			age--;
		}
		return age;
	}
	
	
	/**
	 * 
	 * @Title: random 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}

}
