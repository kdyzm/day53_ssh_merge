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
	//ֱ��ʹ��spring��������hibernate
	@Test
	public void test2(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user=new User();
		user.setUid(1L);
		user=userService.getUser(user);
		System.out.println(user);
	}
	//���������ܹ������ع�
//	����ع�����ʧ�ܣ�Ϊʲô
	
	//TODO ����ع�ʧ�ܣ�����
	@Test
	public void test3(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		User user=new User();
		User user1=new User();
		user.setName("����");
		user.setAge(13);
		user1.setName("����");
		user1.setAge(14);
		
		UserService userService=(UserService) context.getBean("userService");
		userService.addUser(user);
		//���Գ�������쳣����֮�������ܹ������ع�
		int a=1/0;
		userService.addUser(user1);
		System.out.println(a);
	}
}
