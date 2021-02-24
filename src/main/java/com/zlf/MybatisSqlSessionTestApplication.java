package com.zlf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zlf.dao")
@EnableTransactionManagement
public class MybatisSqlSessionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSqlSessionTestApplication.class, args);
    }

}
