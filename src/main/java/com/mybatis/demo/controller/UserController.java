package com.mybatis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.mybatis.demo.dao.UserDao;
import com.mybatis.demo.model.User;
import com.mybatis.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("h")
	public String hello() {
		return "he ll o";
	}
	
	@RequestMapping("all")
	public List<User> selAll() {
		for (User user : userService.selAll()) {
			System.out.println(user.toString());
		}
		return userService.selAll();
	}
	
	@RequestMapping("sel")
	public User selUser(Integer id) {
		System.out.println(userService.selUser(id).toString());
		return userService.selUser(id);
	}
}
