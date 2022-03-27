package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Login;
import com.revature.beans.Users;
import com.revature.services.UsersServ;


@RestController
public class LoginCtrl {

	@Autowired
	UsersServ userService;

	@PostMapping("/users/login")
	public Users checkLogin(@RequestBody Login login) {
		return userService.userLogin(login.getUsername(), login.getPassword());
	}
	
	
}
