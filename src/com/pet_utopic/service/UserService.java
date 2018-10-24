package com.pet_utopic.service;

import java.util.List;

import com.pet_utopic.model.User;

public interface UserService {
	List<User> findUserByUsernameAndPassword(User user);
	int insertUser(User user);
	int updateUserById(User user);
	User selectUserInfo(User user);
}
