package com.sino.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sino.bean.User;
import com.sino.service.UserService;
import com.sino.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Resource
	UserService us;
	@RequestMapping("dologin")
	public String demo(HttpServletRequest req) {
		String username = req.getParameter("userid");
		String password = req.getParameter("password");
		User user = new User(username, password);
		User user2 = us.Login(user);
		if(user2!=null){
			return "success";
		}else{
			return"index";
		}
		
	}
}
