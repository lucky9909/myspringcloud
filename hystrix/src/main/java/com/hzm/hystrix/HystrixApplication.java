package com.hzm.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Huzhimin on 2019/03/25/0025 20:58
 */
@SpringBootApplication
//启用 Feign
@EnableFeignClients
//声明启用数据监控
@EnableCircuitBreaker
//声明启用可视化数据监控
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
