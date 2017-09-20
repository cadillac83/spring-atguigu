package com.hevispring.beans.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		/*
		通常做法
		HelloWorld hWorld = new HelloWorld();
		hWorld.setName("Niao san");
		hWorld.sayHello();
		*/
		
		//1.创建Spring的IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hevispring/beans/basic/applicationContext.xml");
		//2.从IOC容器中取得Bean的实例
//		HelloWorld hw = (HelloWorld) applicationContext.getBean("helloworld");
		//3.调用方法
//		hw.sayHello();
		
		
		/* 装配bean
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
