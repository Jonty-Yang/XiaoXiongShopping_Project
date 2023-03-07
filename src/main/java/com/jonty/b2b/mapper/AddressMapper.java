package com.jonty.b2b.mapper;

import com.jonty.b2b.entity.Address;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/3/7 20:53
 * 项目名称: xiao_xiong_shopping
 */

public interface AddressMapper {

    // 根据用户id查询地址信息
    List<Address> getAddressByUserId(Integer uid);
}
