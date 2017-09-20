package com.hevispring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hevispring.beans.annotation.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public void execute() {
		System.out.println("controller: Start excuting...");
		userService.add();
		System.out.println("controller: End excuting...");
	}
}
