package com.hevispring.aop.helloworld;

public class CalculateImpl implements Calculate {

	@Override
	public double plus(double a, double b) {
		return a + b;
	}

	@Override
	public double rec(double a, double b) {
		return a - b;
	}

	@Override
	public double mul(double a, double b) {
		return a * b;
	}

	@Override
	public double div(double a, double b) {
		
		return a / b;
	}

}
