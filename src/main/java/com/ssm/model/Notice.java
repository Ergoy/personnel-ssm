package com.ssm.model;

import java.io.Serializable;

public class Notice  {
	private Integer id;
	private String title;
	private String content;
	private String Create_date;
	private Integer user_id;
	private User user;
	public Notice(){
		super();
	}

	public Notice(String title, String content, String create_date, Integer user_id, User user) {
		this.title = title;
		this.content = content;
		Create_date = create_date;
		this.user_id = user_id;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreate_date() {
		return Create_date;
	}
	public void setCreate_date(String create_date) {
		Create_date = create_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Notice{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", Create_date='" + Create_date + '\'' +
				", user_id=" + user_id +
				", user=" + user +
				'}';
	}
}

