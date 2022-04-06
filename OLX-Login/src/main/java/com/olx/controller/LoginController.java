package com.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.User;
import com.olx.service.LoginService;

@RestController
@RequestMapping("/olx/login")
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping(value = "/user/authenticate", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String authenticate(@RequestBody User user) {
		return loginService.authenticate(user);
	}

	@DeleteMapping(value = "/user/logout")
	public boolean logout() {
		return loginService.logout();
	}
	
	@PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User createNewStock(@RequestBody User user) {
		return loginService.createNewUser(user);
	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllStocks() {
		return loginService.getAllUsers();
	}
	
	@GetMapping(value = "/token/validate")
	public boolean validationOfUser()
	{
		return loginService.validationOfUser();
	}

}
