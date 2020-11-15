package com.eplugger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.eplugger.mapper")
public class TokenfiledApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokenfiledApplication.class, args);
    }

}
