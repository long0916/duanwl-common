package com.duanwl.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	
	//根据日期计算年龄
	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 9, 16);
		
		int age = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(age);
	}
	
	//返回月末
	@Test
	public void testGetEndMonth() {
		 Calendar c = Calendar.getInstance();
		 c.set(2020, 7, 23);
		 Date date = DateUtil.getEndMonth(c.getTime());
		 SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String format = fm.format(date);
		 System.out.println(format);
	}
	
	//返回月初
	@Test
	public void testGetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = fm.format(date);
		System.out.println(format);
	}
	
	//返回随机日期
	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 9, 1);
		
		Date date = DateUtil.random(c.getTime(),new Date());
     SimpleDateFormat fm = new  SimpleDateFormat("yyyy-MM-dd");
     String format = fm.format(date);
     System.out.println(format);
	}

}
