package com.example.bean;

public class User {

	private String name;
	private String sex;
	
	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
		System.out.println("2.0");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + "]";
	}
}
