package com.hevispring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculateLoggingProxy {

	private Calculate target;

	

	public CalculateLoggingProxy(Calculate target) {
		super();
		this.target = target;
	}



	public Calculate getLoggingProxy() {
		
		Calculate proxy = null;
		
		ClassLoader classLoader = target.getClass().getClassLoader();
		Class[] interfaces = target.getClass().getInterfaces();
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("start:"+args[0]+" "+method.getName()+" "+args[1]);
				Object result = method.invoke(target, args);//记得这里是使用反射(Reflect) 让method叫被代理的家伙去执行(invoke)方法
				System.out.println("end:"+args[0]+" "+method.getName()+" "+args[1]);
				
				return result;
			}
		};
		
		proxy = (Calculate) Proxy.newProxyInstance(classLoader,interfaces,handler);
		 
		return proxy;
	}
}
