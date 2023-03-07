package com.jonty.b2b.service.impl;

import com.jonty.b2b.entity.Address;
import com.jonty.b2b.mapper.AddressMapper;
import com.jonty.b2b.service.IAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/3/7 20:52
 * 项目名称: xiao_xiong_shopping
 */

@Service
@Slf4j
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAddressByUserId(Integer uid) {
        log.info("当前用户为:{}", SecurityContextHolder.getContext());
        return addressMapper.getAddressByUserId(uid);
    }
}
