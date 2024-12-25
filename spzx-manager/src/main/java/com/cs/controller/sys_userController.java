package com.cs.controller;

import com.cs.service.sys_userService;
import com.cs.spzx.model.entity.system.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys_user")
public class sys_userController {

    @Autowired
    private sys_userService sysUserService;

    // 根据用户名查询用户
//    @GetMapping("/username/{userName}")
//    public ResponseEntity<SysUser> getSysUserByUserName(@PathVariable String userName) {
//        SysUser sysUser = sysUserService.getSysUserByUserName(userName);
//        if (sysUser != null) {
//            return ResponseEntity.ok(sysUser);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }

    // 根据ID查询用户
    @GetMapping("/{id}")
    public ResponseEntity<SysUser> getSysUserById(@PathVariable int id) {
        SysUser sysUser = sysUserService.getSysUserById(id);
        if (sysUser != null) {
            return ResponseEntity.ok(sysUser);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // 新增用户
    @PostMapping
    public ResponseEntity<SysUser> createUser(@RequestBody SysUser sysUser) {
        sysUserService.createUser(sysUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(sysUser);
    }

    // 更新用户
    @PutMapping("/{id}")
    public ResponseEntity<SysUser> updateUser(@PathVariable int id, @RequestBody SysUser sysUser) {
        sysUser.setId((long) id);  // 确保传入的ID与URL中的ID一致
        sysUserService.updateUser(sysUser);
        return ResponseEntity.ok(sysUser);
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable int id) {
        sysUserService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    // 逻辑删除用户
    @PutMapping("/soft_delete/{id}")
    public ResponseEntity<Void> softDeleteUser(@PathVariable int id) {
        sysUserService.softDeleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
