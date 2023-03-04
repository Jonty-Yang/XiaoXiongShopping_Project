package com.jonty.b2b.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/22 19:35
 * 项目名称: XiaoXiongShopping_Project
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginUserInfo {

    private String phone;
    private String password;
}
