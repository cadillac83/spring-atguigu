package com.hevispring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/beans/autowire/auto-wire.xml");
		
		Person peter = (Person) context.getBean("person");
		System.out.println(peter);
		
		Person leow = (Person) context.getBean("person2");
		System.out.println(leow);
	}
}
