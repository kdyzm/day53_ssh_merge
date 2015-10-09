package com.kdyzm.ssh.spring.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdyzm.ssh.domain.User;
import com.kdyzm.ssh.service.UserService;

public class TestSpring {
	@Test
	public void test1(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(sessionFactory);
		System.out.println(userService);
	}
	//直接使用spring测试整合hibernate
	@Test
	public void test2(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user=new User();
		user.setUid(1L);
		user=userService.getUser(user);
		System.out.println(user);
	}
	//测试事务能够正常回滚
//	事务回滚还是失败，为什么
	
	//TODO 事务回滚失败！！！
	@Test
	public void test3(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		User user=new User();
		User user1=new User();
		user.setName("张三");
		user.setAge(13);
		user1.setName("李四");
		user1.setAge(14);
		
		UserService userService=(UserService) context.getBean("userService");
		userService.addUser(user);
		//测试除以零的异常发生之后事务能够正常回滚
		int a=1/0;
		userService.addUser(user1);
		System.out.println(a);
	}
}
