package com.cs.service.impl;

import com.cs.mapper.sys_userMapper;
import com.cs.service.sys_userService;
import com.cs.spzx.model.entity.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sys_userServiceImpl implements sys_userService {

    @Autowired
    private sys_userMapper userMapper;

//    @Override
//    public SysUser getSysUserByUserName(String userName) {
//        return userMapper.getSysUserByUserName(userName);
//    }

    @Override
    public SysUser getSysUserById(int id) {
        return userMapper.getSysUserById(id);
    }

    @Override
    public void createUser(SysUser sysUser) {
        userMapper.createUser(sysUser);
    }

    @Override
    public void updateUser(SysUser sysUser) {
        userMapper.updateUser(sysUser);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById((long) id);
    }

    @Override
    public void softDeleteUser(int id) {
        userMapper.softDeleteUser((long) id);
    }
}
