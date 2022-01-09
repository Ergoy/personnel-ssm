package com.ssm.model;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String typename;
	private String username;
	private String password;


	public User(String typename, String username, String password) {
		this.typename = typename;
		this.username = username;
		this.password = password;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", typename='" + typename + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getTypename() {
		return typename;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
