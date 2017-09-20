package com.hevispring.beans.spel;

public class Person {
	private String name;
	private Salary salary;
	private String level;
	private int luckyNum;
	
	public int getLuckyNum() {
		return luckyNum;
	}
	public void setLuckyNum(int luckyNum) {
		this.luckyNum = luckyNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", level=" + level + ", luckyNum=" + luckyNum + "]";
	}

	
	
}
