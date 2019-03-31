package com.hzm.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Huzhimin on 2019/03/24/0024 19:57
 */
@SpringBootApplication
/**
 * @EnableFeignClients  声明启用 Feign
 */
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
