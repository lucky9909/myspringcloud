package com.hzm.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Huzhimin on 2019/03/28/0028 21:20
 */
@SpringBootApplication
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
    }
}
