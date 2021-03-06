package com.hevispring.aop.battery;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class ValicationAspect {
	
	
	//这边需要使用到LoggingAspect的切面表达式声明方法，添加包名.类名.方法()
	//前置通知
	@Before("LoggingAspect.defineJoinPointExpression()")
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+" ("+args+")-beginning valication");
	}
	//后置通知
	@After("LoggingAspect.defineJoinPointExpression()")
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+" ("+args+")-ending valication");
	}
	
}
