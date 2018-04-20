package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	UserMapper ump;
	public User selUser(String userid,String password) {
		return this.ump.selByUser( userid, password);
	}

}
