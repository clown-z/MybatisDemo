package com.mybatis.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.demo.dao.UserDao;
import com.mybatis.demo.model.User;
import com.mybatis.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> selAll() {
		// TODO 自动生成的方法存根
		return userDao.selAll();
	}

	@Override
	public User selUser(Integer id) {
		// TODO 自动生成的方法存根
		return userDao.selUser(id);
	}

}
