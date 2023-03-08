package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    // 注册 动态sql
    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 登录
    User selectUserByPhone(String phone);

    // 扣减余额
    int deductBalance(@Param("uid") Integer uid, @Param("balance") Double balance);
}