package com.sino.bean;

public class User {
	public String id;
	public String user_name;
	public String pass_word;
	
	public User() {
		super();
	}
	public User(String id, String user_name, String pass_word) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.pass_word = pass_word;
	}
	public User(String user_name, String pass_word) {
		super();
		this.user_name = user_name;
		this.pass_word = pass_word;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	

}
