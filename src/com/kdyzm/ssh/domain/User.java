package com.kdyzm.ssh.domain;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 547592156414306636L;
	private Long uid;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", age=" + age + "]";
	}
	public User() {
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
