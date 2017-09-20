package com.hevispring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hevispring.beans.annotation.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userAnotherRepositoryImpl")//��ע�Ϳ���ָ��bean�������ֶ��userRepository��ʵ�����ʱ�򣩣�����һ�ֽ�������Ǹ���Ӧ��beanһ����Ҫ��value
	UserRepository userRepository;
	
	/*
	����setter�����Ͳ����ڣ����ǿ��Եġ�
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
