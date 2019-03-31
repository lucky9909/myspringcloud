package com.hzm.nativeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Huzhimin on 2019/03/25/0025 22:53
 */
@SpringBootApplication
/**
 * @EnableConfigServer 声明配置中心
 */
@EnableConfigServer
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
