package com.hevispring.beans.generics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * ��������ע��
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/beans/generics/di/beans-generics.xml");
		

		//�ڸ����趨��װ���ϵ������ͨ������ȥʶ������
		UserService userService = (UserService) context.getBean("userService");
		userService.doSomething();
		
		System.out.println("---------------------------");
		
		JobService jobService = (JobService) context.getBean("jobService");
		jobService.doSomething();
		
		
	}
}