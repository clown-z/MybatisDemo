package com.mybatis.demo.service;

import java.util.List;

import com.mybatis.demo.model.User;

public interface UserService {
	
	List<User> selAll();
	User selUser(Integer id);
}
