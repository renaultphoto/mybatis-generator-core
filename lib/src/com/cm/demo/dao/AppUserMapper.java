package com.cm.demo.dao;

import com.cm.demo.entity.AppUser;

public interface AppUserMapper {
    int deleteByPrimaryKey(String username);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);
}