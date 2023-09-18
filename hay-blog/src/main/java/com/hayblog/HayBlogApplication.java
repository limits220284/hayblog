package com.hayblog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hayblog.mapper")
public class HayBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(HayBlogApplication.class, args);
    }
}
