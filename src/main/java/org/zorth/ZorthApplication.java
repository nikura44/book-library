package org.zorth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.zorth.mapper")
public class ZorthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZorthApplication.class);
        System.out.println("application is running...");
    }
}