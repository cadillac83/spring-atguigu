package com.hevispring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/beans/spel/el.xml");
		Person peter = context.getBean(Person.class);
		System.out.println(peter);
	}
}
