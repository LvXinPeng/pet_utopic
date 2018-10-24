package com.pet_utopic.service.impl;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet_utopic.dao.UserMapper;
import com.pet_utopic.model.User;
import com.pet_utopic.service.UserService;
/**
 * 
* <p>Title: UserServiceImpl</p>  
* <p>Description: </p>   
* @author 李仲浩  
* @date 2017年12月31日
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> findUserByUsernameAndPassword(User user) {
		System.out.println(user.getPassword() + user.getUsername());
		List<User> users =  userMapper.selectUserByUsernamePassword(user);
		return users;
	}

	@Override
	public int insertUser(User user) {
		int affected_row = userMapper.insertUser(user);
		return affected_row;
	}

	@Override
	public int updateUserById(User user) {
		int affected_row = userMapper.updateUserById(user);
		return affected_row;
	}

	@Override
	public User selectUserInfo(User user) {
		user = userMapper.selectUserInfo(user);
		return user;
	}

}
