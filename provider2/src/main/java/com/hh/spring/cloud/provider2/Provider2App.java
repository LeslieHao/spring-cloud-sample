package com.hh.spring.cloud.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author HaoHao
 * @date 2019-05-20 16:22
 */
@SpringBootApplication
@EnableEurekaServer
public class Provider2App {

    public static void main(String[] args) {
        SpringApplication.run(Provider2App.class, args);
    }

}
