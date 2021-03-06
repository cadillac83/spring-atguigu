package com.hevispring.beans.generics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * 泛型依赖注入
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/beans/generics/di/beans-generics.xml");
		

		//在父类设定好装配关系，子类通过泛型去识别依赖
		UserService userService = (UserService) context.getBean("userService");
		userService.doSomething();
		
		System.out.println("---------------------------");
		
		JobService jobService = (JobService) context.getBean("jobService");
		jobService.doSomething();
		
		
	}
}
