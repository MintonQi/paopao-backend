package com.minton.paopao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.minton.paopao.mapper")
public class PaopaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaopaoApplication.class, args);
    }

}
