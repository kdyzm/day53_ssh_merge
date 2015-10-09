package com.kdyzm.ssh.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.kdyzm.ssh.dao.UserDao;
import com.kdyzm.ssh.domain.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public User addUser(User user) {
		hibernateTemplate.save(user);
		return (User) hibernateTemplate.get(User.class, user.getUid());
	}

	@Override
	public User deleteUser(User user) {
		hibernateTemplate.delete(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		hibernateTemplate.update(user);
		return user;
	}

	@Override
	public User getUser(User user) {
		User result=(User) hibernateTemplate.get(User.class, user.getUid());
		return result;
	}
	
}
