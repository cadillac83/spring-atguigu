package com.hevispring.beans.annotation;

import org.springframework.stereotype.Component;

@Component
public class TestObject {
	public void sayHello() {
		System.out.println("Component:Hello");
	}
}
