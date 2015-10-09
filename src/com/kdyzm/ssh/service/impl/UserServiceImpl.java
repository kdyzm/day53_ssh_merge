package com.kdyzm.ssh.service.impl;

import com.kdyzm.ssh.dao.UserDao;
import com.kdyzm.ssh.domain.User;
import com.kdyzm.ssh.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User deleteUser(User user) {
		return userDao.deleteUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User getUser(User user) {
		return userDao.getUser(user);
	}

}
