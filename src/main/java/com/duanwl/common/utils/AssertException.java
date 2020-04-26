package com.duanwl.common.utils;
/**
 * 
 * @ClassName: AssertException 
 * @Description: 断言异常类
 * @author: 段文龙
 * @date: 2020年4月26日 下午4:53:17
 */
public class AssertException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public AssertException() {
		super();
	}
	public AssertException(String message) {
		
		super(message);
		this.message =message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
