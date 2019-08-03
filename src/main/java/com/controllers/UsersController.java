package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserResponseModel;
import com.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UserResponseModel user;

	@Autowired
	UserService userService;

	@GetMapping("/getUserById")
	public UserResponseModel getUserById(@RequestParam String id) {
		if (null != id) {
			return userService.getUserById(id);
		}
		return null;

	}
}
