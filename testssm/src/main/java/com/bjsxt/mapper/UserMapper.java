package com.bjsxt.mapper;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.User;

public interface UserMapper {
	
	@Select("select*from user where userid=#{0} and password=#{1}")
	User selByUser(String userid,String password);
}
