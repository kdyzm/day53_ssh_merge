package com.kdyzm.ssh.service;

import com.kdyzm.ssh.domain.User;

public interface UserService {
	public User addUser(User user);
	public User deleteUser(User user);
	public User updateUser(User user);
	public User getUser(User user);
}
