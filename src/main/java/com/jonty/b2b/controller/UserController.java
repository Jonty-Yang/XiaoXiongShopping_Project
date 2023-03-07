package com.jonty.b2b.controller;

import com.jonty.b2b.entity.User;
import com.jonty.b2b.mapper.UserMapper;
import com.jonty.b2b.service.IUserService;

import com.jonty.b2b.vo.LoginUserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 19:25
 * 项目名称: XiaoXiongShopping_Project
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @Resource
    private UserMapper userMapper;

    //@PostMapping("/login")
    public Map<String, Object> UserLogin(@RequestBody LoginUserInfo loginUserInfo) {
        Map<String, Object> map = new HashMap<>();
        map.put("token", userService.userLogin(loginUserInfo));
        map.put("userLogin", userMapper.selectUserByPhone(loginUserInfo.getPhone()));
        return map;
    }

    @PostMapping("/register")
    public String UserRegister(@RequestBody User user) {
        System.out.println("user = " + user);
        return userService.userRegister(user);
    }

    @PostMapping("/login")
    public String userLogin2(@RequestBody LoginUserInfo loginUserInfo){
        System.out.println("loginUserInfo = " + loginUserInfo);
        return userService.userLoginByText(loginUserInfo);
    }
}
