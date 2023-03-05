package com.jonty.b2b.service;

import com.jonty.b2b.entity.User;
import com.jonty.b2b.vo.LoginUserInfo;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 19:22
 * 项目名称: XiaoXiongShopping_Project
 */

public interface IUserService {

    // 登录
    String userLogin(LoginUserInfo loginUserInfo);

    // 注册
    String userRegister(User user);

    // 修改
    boolean updateUserById(User user);

}
