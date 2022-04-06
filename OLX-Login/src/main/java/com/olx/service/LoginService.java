package com.olx.service;

import java.util.List;

import com.olx.dto.User;


public interface LoginService {
	public String authenticate(User user);
   
	public boolean logout();
	
	public User createNewUser(User user);
	
	public List<User> getAllUsers();
	
	public boolean validationOfUser();

}
