package com.backend.mapper;

import java.util.List;

import com.backend.entity.UserFormMap;
import com.backend.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
