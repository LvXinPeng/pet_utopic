package com.pet_utopic.dao;

import java.util.List;

import com.pet_utopic.model.User;

/**
 * 
* <p>Title: UserMapper</p>  
* <p>Description: </p>   
* @author 李仲浩  
* @date 2017年12月30日
 */
public interface UserMapper {
	List<User> selectUserByUsernamePassword(User user);
	int insertUser(User user);
	int updateUserById(User user);
	User selectUserInfo(User user);
}
