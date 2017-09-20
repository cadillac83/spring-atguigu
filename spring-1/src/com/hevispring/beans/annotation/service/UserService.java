package com.hevispring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hevispring.beans.annotation.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userAnotherRepositoryImpl")//此注释可以指定bean（若出现多个userRepository的实现类的时候），还有一种解决方案是给对应的bean一个需要的value
	UserRepository userRepository;
	
	/*
	加在setter方法和参数内，都是可以的。
	UserRepository userRepository;
	@Autowired
	public void setUserRepository(@Qualifier("userAnotherRepositoryImpl") UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	*/



	public void add() {
		System.out.println("userService: Add...");
		userRepository.save();
	}
}
