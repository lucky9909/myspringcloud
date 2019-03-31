package com.hzm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Huzhimin on 2019/03/24/0024 9:54
 */
//生成zuul的代理
@EnableZuulProxy
//自动装配网关配置文件
@EnableAutoConfiguration
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
