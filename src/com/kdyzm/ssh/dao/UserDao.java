package com.kdyzm.ssh.dao;

import com.kdyzm.ssh.domain.User;

public interface UserDao {
	public User addUser(User user);
	public User deleteUser(User user);
	public User updateUser(User user);
	public User getUser(User user);
}
