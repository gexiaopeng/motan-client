package com.gxp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxp.service.FooService;
import com.gxp.service.UserService;

/**
 * <p>
 * Project Name: 超级促销王
 * <br>
 * Description: 
 * <br>
 * File Name: MotanClient.java
 * <br>
 * Copyright: Copyright (C) 2009 All Rights Reserved.
 * <br>
 * Company: 杭州迅博达数字传媒技术有限公司
 * <br>
 * @author 葛晓鹏
 * @create time：2016年5月11日 下午3:56:42
 * @version: v2.1
 * 
 *       Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2016年5月11日 下午3:56:42 |葛晓鹏    　　|v2.1        |Create
 * 
 */
public class MotanClient {
	 public static void main(String[] args) throws InterruptedException {
	        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
	        FooService service = (FooService) ctx.getBean("remoteService");
	        UserService userservice = (UserService) ctx.getBean("userService");
	        try {
				System.out.println("=========:"+service.hello("motanmm"));
				System.out.println("=========:"+userservice.getUserName(12));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	    }
}
