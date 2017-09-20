package com.hevispring.beans.annotation.respository.impl;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements com.hevispring.beans.annotation.respository.UserRepository {

	@Override
	public void save() {
		System.out.println("repository: Saving ...");

	}

}
