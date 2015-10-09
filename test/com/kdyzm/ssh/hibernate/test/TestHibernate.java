package com.kdyzm.ssh.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.kdyzm.ssh.domain.User;


public class TestHibernate {
	private static SessionFactory sessionFactory;
	static{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	/*
	 * µ•∂¿≤‚ ‘hibernate≥…π¶£°
	 */
	@Test
	public void test1(){
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		User user=(User) session.get(User.class,1L);
		System.out.println(user);
		transaction.commit();
		session.close();
	}
}
