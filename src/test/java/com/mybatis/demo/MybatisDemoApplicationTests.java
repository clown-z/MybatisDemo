package com.mybatis.demo;

import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatis.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisDemoApplicationTests {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void contextLoads() throws Exception {
		String mconf = "mybatis-config.xml";
		InputStream in = new FileInputStream(mconf);
		this.getClass().getClassLoader().getResource("mybatis-config.xml");
	}

}
