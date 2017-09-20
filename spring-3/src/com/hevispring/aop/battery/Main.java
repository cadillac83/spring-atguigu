package com.hevispring.aop.battery;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/aop/battery/applicationContext.xml");
		

		Calculate target = (Calculate) context.getBean("calculator");
		
		target.plus(3, 1);

		Calculate target2 = (Calculate) context.getBean("superCalculator");
		
		target2.plus(3, 1);
		
		
		context.close();
	}
}
