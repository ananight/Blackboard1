package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author ananight
 * @date 2020/1/2
 */
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class BlackboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackboardApplication.class, args);
    }

}
