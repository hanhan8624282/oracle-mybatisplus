package com.ecc.oraclemybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ecc.oraclemybatisplus.mapper")
public class OracleMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OracleMybatisplusApplication.class, args);
    }

}
