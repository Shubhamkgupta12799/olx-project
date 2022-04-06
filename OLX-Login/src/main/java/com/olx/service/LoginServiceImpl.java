package com.olx.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.olx.dto.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String authenticate(User user) {
		// TODO Auto-generated method stub
		return "A78DT";
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

	@Override
	public User createNewUser(User user) {
		user.setId((users.size() + 1));
		users.add(user);
		return user;
	}
	
	

	static List<User> users = new ArrayList<User>();

	static {

		users.add(new User(1, "Shubham", "Gupta", "shubham123", "Shubham@123", "shubham@gmail.com", 8090266899l));
		users.add(new User(2, "Rahul", "Kandu", "rahul123", "Rahul@123", "rahul@gmail.com", 8795251972l));

	}

	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean validationOfUser() {
		return true;
	}

}
