package com.sino.mapper;

import org.apache.ibatis.annotations.Select;

import com.sino.bean.User;

public interface UserMapper {
	@Select("select *from user where user_name=#{user_name} and pass_word=#{pass_word}")
	User selUser(User user);

}
