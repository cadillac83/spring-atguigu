package com.hevispring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //��ʾ��BeanΪһ������
@Component //����Ϊһ�����
public class AnnotationAspect {

	//@BeforeΪǰ��֪ͨ��execution()ΪaspectJ���ʽ
	@Before("execution(* com.hevispring.aop.impl.Calculate.*(double, double))")
	public void beforeMethod(JoinPoint joinPoint) {//���������org.aspectj.lang.JoinPoint���Ի�ȡ�ý�������Ϣ
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+" before running with args-"+args);
	}
	
	//@AfterΪ����֪ͨ��Ŀ�귽��ִ�к������Ƿ��쳣����ִ�У�
	//ע���:����֪ͨ�����ܷ���ִ�н��
	@After("execution(* com.hevispring.aop.impl.Calculate.*(double, double))")
	public void afterMethod(JoinPoint joinPoint) {
		
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(methodName+" after running with args-"+args);
	}
	
	//����ͦ��Ľ�����ע�⣬��Ҫ��ʱ��ȥ������
}
