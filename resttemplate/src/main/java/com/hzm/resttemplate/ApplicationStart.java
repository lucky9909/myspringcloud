package com.hzm.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Huzhimin on 2019/03/23/0023 20:53
 */
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);
    }
    //将 RestTemplate 注入到 IoC 容器中
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
