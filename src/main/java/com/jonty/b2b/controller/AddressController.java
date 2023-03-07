package com.jonty.b2b.controller;

import com.jonty.b2b.entity.Address;
import com.jonty.b2b.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 创建作者: AHao
 * 创建日期: 2023/3/7 20:57
 * 项目名称: xiao_xiong_shopping
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/addressByUserId/{id}")
    public List<Address> getAddressByUserId(@PathVariable Integer id){
        return addressService.getAddressByUserId(id);
    }
}
