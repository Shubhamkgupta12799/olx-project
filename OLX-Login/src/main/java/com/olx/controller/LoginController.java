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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/olx/login")
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping(value = "/user/authenticate", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="This is for user authentication", notes="This REST API for validation of all Users")
	public String authenticate(@ApiParam(value="Stock id", name="id") @RequestBody User user) {
		return loginService.authenticate(user);
	}

	@DeleteMapping(value = "/user/logout")
	@ApiOperation(value="Logout user", notes="This REST API for logout all Users")
	public boolean logout() {
		return loginService.logout();
	}
	
	@PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Post all User", notes="This REST API post list of all Users")
	public User createNewStock(@ApiParam(value="Stock id", name="id") @RequestBody User user) {
		return loginService.createNewUser(user);
	}

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Get all User", notes="This REST API returns list of all Users")
	public List<User> getAllUsers() {
		return loginService.getAllUsers();
	}
	
	@GetMapping(value = "/token/validate")
	@ApiOperation(value="Validate all User", notes="This REST API validate of Users")
	public boolean validationOfUser()
	{
		return loginService.validationOfUser();
	}

}
