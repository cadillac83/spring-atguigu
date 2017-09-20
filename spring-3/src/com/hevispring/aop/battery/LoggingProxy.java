package com.hevispring.aop.battery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LoggingProxy<T> {
	T target;
	
	public LoggingProxy(T target) {
		super();
		this.target = target;
	}

	@SuppressWarnings("unchecked")
	public T getLoggingProxy() {
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		InvocationHandler handler = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				//环绕通知相当于接口的此方法实现，返回值为调用的方法的返回值
				
				Object result = null;
				try {//可能有异常
					//前置通知
					System.out.println(method.getReturnType().toString()+" "+method.getName()+" ("+Arrays.asList(args)+"):beginning");
					result = method.invoke(target, args);
					//返回通知
				} catch (Exception e) {
					//异常通知
					e.printStackTrace();
				}
				
				//后置通知
				System.out.println(method.getReturnType().toString()+" "+method.getName()+" ("+Arrays.asList(args)+"):ending");
				
				return result;
			}
		};
		
		T proxy = (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
		
		return proxy;
	}
}
