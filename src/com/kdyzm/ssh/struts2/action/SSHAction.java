package com.kdyzm.ssh.struts2.action;

import com.kdyzm.ssh.domain.User;
import com.kdyzm.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 测试SSH整合
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
		System.out.println("调用了sshTest方法！");
		User user=new User();
		user.setName("张三");
		user.setAge(13);
		userService.addUser(user);
		return "ssh";
	}
}

