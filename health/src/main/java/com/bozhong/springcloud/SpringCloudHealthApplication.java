package com.bozhong.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bozhong.springcloud.mapper")
public class SpringCloudHealthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHealthApplication.class, args);
    }
}
