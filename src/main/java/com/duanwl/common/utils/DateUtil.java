package com.duanwl.common.utils;

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
