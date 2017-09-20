package com.hevispring.aop.helloworld;

public class Main {

	public static void main(String[] args) {

		Calculate calculator = new CalculateImpl();
		
		//Calculate loggingProxy = new CalculateLoggingProxy(calculator).getLoggingProxy();
		
		//new version
		Calculate myLoggingProxy = new MyLoggingProxy<Calculate>(calculator).getLoggingProxy();
		
		double result = myLoggingProxy.plus(5, 10);
		System.out.println("result-->"+result);
		
	}
}
