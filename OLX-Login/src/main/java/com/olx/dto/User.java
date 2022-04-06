package com.olx.dto;

import io.swagger.annotations.ApiModelProperty;

public class User {

	@ApiModelProperty(value="User identifier")
	private int Id;
	
	@ApiModelProperty(value="User identifier")
	private String firstName;
	
	@ApiModelProperty(value="User identifier")
	private String lastName;
	
	@ApiModelProperty(value="User identifier")
	private String userName;
	
	@ApiModelProperty(value="User identifier")
	private String password;
	
	@ApiModelProperty(value="User identifier")
	private String email;
	
	@ApiModelProperty(value="User identifier")
	private long phone;
	
	public User(int Id,String firstName, String lastName, String userName, String password, String email, long phone) {
		super();
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public User() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
	
	
}
