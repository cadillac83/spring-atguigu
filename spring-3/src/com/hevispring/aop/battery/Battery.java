package com.hevispring.aop.battery;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value="prototype")
@Component
public class Battery {
	private int leave;

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	@Override
	public String toString() {
		return "Battery [leave=" + leave + "]";
	}

	public Battery() {
		super();
		this.leave = 100;
	}
	
	
	
}
