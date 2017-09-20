package com.hevispring.beans.basic;

import java.util.List;

public class RichPerson extends Person {
	
	private List<Car> cars;

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "RichPerson [cars=" + cars + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
