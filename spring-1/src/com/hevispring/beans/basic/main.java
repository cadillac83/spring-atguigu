package com.hevispring.beans.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		/*
		ͨ������
		HelloWorld hWorld = new HelloWorld();
		hWorld.setName("Niao san");
		hWorld.sayHello();
		*/
		
		//1.����Spring��IOC����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hevispring/beans/basic/applicationContext.xml");
		//2.��IOC������ȡ��Bean��ʵ��
//		HelloWorld hw = (HelloWorld) applicationContext.getBean("helloworld");
		//3.���÷���
//		hw.sayHello();
		
		
		/* װ��bean
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		car = (Car) applicationContext.getBean("car2");
		System.out.println(car);
		car = (Car) applicationContext.getBean("car3");
		System.out.println(car);
		*/
		
		/*
		Person peter = (Person) applicationContext.getBean("person");
		System.out.println(peter);
		Person anna = (Person) applicationContext.getBean("person2");
		System.out.println(anna);
		
		RichPerson rPerson = (RichPerson) applicationContext.getBean("richPerson");
		System.out.println(rPerson);
		*/
		
		/*Libray libray = (Libray) applicationContext.getBean("library");
		System.out.println(libray);*/

		DataSources ds = (DataSources) applicationContext.getBean("dataSources");
		System.out.println(ds.getProperties());
		
		DataSources ds2 = (DataSources) applicationContext.getBean("dataSources2");
		System.out.println(ds2.getProperties());
		
		
	}
}