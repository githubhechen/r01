package com.bjsxt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.User;
import com.bjsxt.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Resource
	UserServiceImpl userServiceImpl;
	@RequestMapping("login")
	public String dologin(HttpServletRequest req){
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");
		User selUser = userServiceImpl.selUser(userid,password);
		if(selUser==null){
			return "reindex";	
			
		}else{
			return "success";	
		}
		
	}
}
