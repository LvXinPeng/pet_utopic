package com.pet_utopic.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pet_utopic.model.User;
import com.pet_utopic.service.UserService;
import com.pet_utopic.service.impl.UserServiceImpl;
/**
 * 
* <p>Title: UserController</p>  
* <p>Description: 用户管理</p>   
* @author 李仲浩  
* @date 2017年12月31日
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("login")
	public String login(User user,Map<String, Object> map,HttpSession Session){
		List<User> users = userService.findUserByUsernameAndPassword(user);
		if(!users.isEmpty()){
			map.put("message", "登录成功");
			Session.setAttribute("user", users.get(0));
			System.out.println(Session.getAttribute("user"));
			System.out.println("登录成功");
			return "main";
		}
		else {
			map.put("message", "用户名或密码错误");
			System.out.println("登录失败");
			return "login";
		}
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(User user,Map<String, Object> map){
		System.out.println(user.toString());
		int affected_row = userService.insertUser(user);
		if(affected_row == 1){
			return "login";
		}
		else {
			map.put("message", "用户名已存在");
			return "register";
		}
		
	}
	@RequestMapping(value="updateUserInfo",method=RequestMethod.PUT)
	public String updateUserInfo(User user,Map<String, Object> map){
		
		return null;
		
	}
}
