package com.hevispring.beans.generics.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	@Autowired
	private BaseRepository<T> repository;
	
	public void doSomething() {
		System.out.println("picking repository...");
		System.out.println("yes, it is u! "+this.getClass().getGenericSuperclass().toString());
		repository.doSomeDBWork();
	}
}
