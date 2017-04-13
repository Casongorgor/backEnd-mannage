package com.backend.mapper;

import java.util.List;

import com.backend.entity.RoleFormMap;
import com.backend.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
