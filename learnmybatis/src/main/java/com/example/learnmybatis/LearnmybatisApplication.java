package com.example.learnmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.learnmybatis.mapper")
public class LearnmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnmybatisApplication.class, args);
    }

}
