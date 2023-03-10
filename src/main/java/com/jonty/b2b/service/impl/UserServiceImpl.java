package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.User;
import com.jonty.b2b.exception.UserNotFoundException;
import com.jonty.b2b.mapper.UserMapper;
import com.jonty.b2b.service.IUserService;
import com.jonty.b2b.util.JwtUtils;
import com.jonty.b2b.vo.LoginUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 19:29
 * 项目名称: XiaoXiongShopping_Project
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // 用户登录
    @Override
    public String userLogin(LoginUserInfo loginUserInfo) {
        User currentUser = userMapper.selectUserByPhone(loginUserInfo.getPhone());
        System.out.println("currentUser = " + currentUser);
        if (currentUser == null) {
            throw new UserNotFoundException("用户未找到！");
        }
        // 校验密码
        if (!passwordEncoder.matches(loginUserInfo.getPassword(), currentUser.getPassword())) {
            throw new BadCredentialsException("密码错误！");
        }
        // 颁发凭证
        return JwtUtils.generate(currentUser.getPhone());
    }

    // 用户注册
    @Override
    public String userRegister(User user) {
        // 加密
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        int add = userMapper.insertSelective(user);
        if (add > 0) {
            return "注册成功！";
        }
        return "注册失败！";
    }

    @Override
    public boolean updateUserById(User user) {
        log.info("修改后的信息为:[{}]", user);
        int update = userMapper.updateByPrimaryKeySelective(user);
        return update >= 1;
    }

    /**
     * 模拟登录 静态数据
     *
     * @param loginUserInfo 登录 vo 对象
     * @return
     */
    @Override
    public String userLoginByText(LoginUserInfo loginUserInfo) {
        if (!("18811360631".equalsIgnoreCase(loginUserInfo.getPhone()) ||
                "123".equalsIgnoreCase(loginUserInfo.getPassword()))) {
            throw new RuntimeException("密码或用户名不正确，静态登录！");
        }
        return JwtUtils.generate(loginUserInfo.getPhone());
    }
}
