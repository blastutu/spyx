package com.cs.service;

import com.cs.spzx.model.entity.system.SysUser;

public interface sys_userService {

    // 根据用户名查询用户
//    SysUser getSysUserByUserName(String userName);

    // 根据ID查询用户
    SysUser getSysUserById(int id);

    // 新增用户
    void createUser(SysUser sysUser);

    // 更新用户信息
    void updateUser(SysUser sysUser);

    // 删除用户
    void deleteUserById(int id);

    // 逻辑删除用户（通过 is_deleted 字段）
    void softDeleteUser(int id);
}
