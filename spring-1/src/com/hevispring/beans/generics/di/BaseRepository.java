package com.hevispring.beans.generics.di;

public class BaseRepository<T> {

	public void doSomeDBWork() {
		System.out.println(this.getClass().getGenericSuperclass().toString()+" doing job");
	}
}
