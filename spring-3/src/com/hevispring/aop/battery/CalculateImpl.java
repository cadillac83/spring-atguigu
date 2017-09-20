package com.hevispring.aop.battery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculator")
public class CalculateImpl implements Calculate {
	
	@Autowired
	private Battery battery;
	
	

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public int plus(int a, int b) {
		System.out.println(this.battery.getLeave());
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
