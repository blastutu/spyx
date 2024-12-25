package com.cs.mapper;

import com.cs.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface sys_userMapper {

    // 查询单个用户通过ID
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser getSysUserById(int id);

//    // 查询所有用户
//    @Select("SELECT * FROM sys_user")
//    List<SysUser> getAllUsers();

    // 插入一个新用户
    @Insert("INSERT INTO sys_user (id, userName, password, name, phone, avatar, description, status, create_time, update_time, is_deleted) " +
            "VALUES (#{id}, #{userName}, #{password}, #{name}, #{phone}, #{avatar}, #{description}, #{status}, #{createTime}, #{updateTime}, #{isDeleted})")
    void createUser(SysUser sysUser);

    // 更新用户信息
    @Update("UPDATE sys_user SET userName = #{userName}, password = #{password}, name = #{name}, phone = #{phone}, " +
            "avatar = #{avatar}, description = #{description}, status = #{status}, update_time = #{updateTime}, " +
            "is_deleted = #{isDeleted} WHERE id = #{id}")
    void updateUser(SysUser sysUser);

    // 删除用户通过ID
    @Delete("DELETE FROM sys_user WHERE id = #{id}")
    void deleteUserById(Long id);

    // 逻辑删除用户（根据 is_deleted 字段）
    @Update("UPDATE sys_user SET is_deleted = 1 WHERE id = #{id}")
    void softDeleteUser(Long id);

//    SysUser getSysUserByUserName(String userName);

//    SysUser getSysUserById(int id);
}