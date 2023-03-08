package com.jonty.b2b.service;

import com.jonty.b2b.entity.Address;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/3/7 20:49
 * 项目名称: xiao_xiong_shopping
 */
public interface IAddressService {

    /**
     * 根据用户id查询对应的地址信息
     *
     * @param uid 用户id
     * @return 地址集合
     */
    List<Address> getAddressByUserId(Integer uid);
}
