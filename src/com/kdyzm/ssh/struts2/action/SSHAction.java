package com.kdyzm.ssh.struts2.action;

import com.kdyzm.ssh.domain.User;
import com.kdyzm.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * ����SSH����
 */
public class SSHAction extends ActionSupport{
	private static final long serialVersionUID = 7601405142760931863L;
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	public String sshTest() throws Exception{
		System.out.println("������sshTest������");
		User user=new User();
		user.setName("����");
		user.setAge(13);
		userService.addUser(user);
		return "ssh";
	}
}

