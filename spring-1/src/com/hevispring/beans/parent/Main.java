package com.hevispring.beans.parent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hevispring/beans/parent/bean-parent.xml");
		
		Address address = (Address) context.getBean("address");
		System.out.println("1,"+address);
		address = (Address) context.getBean("address2");
		System.out.println("2,"+address);
		address = (Address) context.getBean("address3");
		System.out.println("3,"+address);
		
		
	}
}
