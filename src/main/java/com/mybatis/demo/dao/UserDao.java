package com.mybatis.demo.dao;

import java.util.List;

import com.mybatis.demo.model.User;

public interface UserDao {
	List<User> selAll();
	User selUser(Integer id);
}
