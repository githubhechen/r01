package com.sino.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sino.bean.User;
import com.sino.mapper.UserMapper;
import com.sino.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	UserMapper mp;
	@Override
	public User Login(User user) {
		return mp.selUser(user);
	}

}
