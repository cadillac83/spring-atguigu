package com.hevispring.aop;

import org.springframework.stereotype.Component;

@Component("calculate")
public class CalculateImpl implements Calculate {

	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	@Override
	public int rec(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		
		return a / b;
	}

}