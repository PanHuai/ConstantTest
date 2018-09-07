package com.phlyl.manage.lyl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration(exclude = {JacksonAutoConfiguration.class})
@EnableTransactionManagement
@MapperScan("com.phlyl.manage.lyl.mapper")
@SpringBootApplication
public class LylApplication {

    public static void main(String[] args) {
        SpringApplication.run(LylApplication.class, args);
    }
}
