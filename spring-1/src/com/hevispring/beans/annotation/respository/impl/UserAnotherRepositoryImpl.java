package com.hevispring.beans.annotation.respository.impl;

import org.springframework.stereotype.Repository;

import com.hevispring.beans.annotation.respository.UserRepository;

@Repository
public class UserAnotherRepositoryImpl implements UserRepository {

	@Override
	public void save() {
		System.out.println("Another Repository: doing saving");
	}

}
