package com.hzm.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Huzhimin on 2019/03/24/0024 13:09
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }

    @Bean
    /**
     * @LoadBalanced 声明一个基于Ribbon的负载均衡
     */
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
