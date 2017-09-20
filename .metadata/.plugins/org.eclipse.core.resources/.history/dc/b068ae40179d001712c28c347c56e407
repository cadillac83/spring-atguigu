package com.hevispring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/aop/xml/applicationContext.xml");
		
		Calculate target = (Calculate) context.getBean("calculate");
		
		target.mul(3, 123);
		
	}
}
