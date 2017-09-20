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
				
				//����֪ͨ�൱�ڽӿڵĴ˷���ʵ�֣�����ֵΪ���õķ����ķ���ֵ
				
				Object result = null;
				try {//�������쳣
					//ǰ��֪ͨ
					System.out.println(method.getReturnType().toString()+" "+method.getName()+" ("+Arrays.asList(args)+"):beginning");
					result = method.invoke(target, args);
					//����֪ͨ
				} catch (Exception e) {
					//�쳣֪ͨ
					e.printStackTrace();
				}
				
				//����֪ͨ
				System.out.println(method.getReturnType().toString()+" "+method.getName()+" ("+Arrays.asList(args)+"):ending");
				
				return result;
			}
		};
		
		T proxy = (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
		
		return proxy;
	}
}
