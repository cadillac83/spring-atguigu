package com.hevispring.beans.spel;

public class Salary {
	private double basic;
	private double extra;
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getExtra() {
		return extra;
	}
	public void setExtra(double extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", extra=" + extra + "]";
	}
	
	
}
