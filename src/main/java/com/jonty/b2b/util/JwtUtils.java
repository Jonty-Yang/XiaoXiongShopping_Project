package com.jonty.b2b.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Duration;
import java.util.Date;

/**
 * 创建作者: AHao
 * 创建日期: 2022/12/21 14:39
 * 项目名称: security-jwt
 */

public class JwtUtils {

    // 密钥
    private final static String SECRET_KEY = "SOFTEEM";

    // JWT的过期时间
    private final static Duration exp = Duration.ofHours(5);

    // 构建凭证 根据用户名构建JWT字符串
    public static String generate(String phone) {
        Date expDate = new Date(System.currentTimeMillis() + exp.toMillis());
        return Jwts.builder()
                .setExpiration(expDate)
                .setSubject(phone)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    // 解析凭证
    public static Claims parse(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    public static void main(String[] args) {
        String token = generate("1222");
        //String token = "eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE2NzE2MDk0NjIsInN1YiI6ImFhYSIsImlhdCI6MTY3MTYwNTg2Mn0.6GuUtuUQprH9ZVv38DirJpUW2R1YvXIEMQVEX3XWS9cp9t6k6Ijgi08tt4_IyI9e0cBNSPlZBSdX1vWj6DViGQ";
        System.out.println("token = " + token);
        Claims claims = parse(token);
        System.out.println(claims.getSubject());
        System.out.println(claims.getExpiration());
        System.out.println(claims.getIssuedAt());
        if (new Date().before(claims.getExpiration())) {
            System.out.println("凭证还未过期");
        }
    }

}
