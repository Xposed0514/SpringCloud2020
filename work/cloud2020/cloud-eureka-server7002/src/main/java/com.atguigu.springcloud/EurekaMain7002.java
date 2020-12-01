package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @description
 * @author: LIYAN
 * @create: 2020-11-24 11:34
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
    public static void main(String[] args) {
            SpringApplication.run(EurekaMain7002.class, args);
    }
}
