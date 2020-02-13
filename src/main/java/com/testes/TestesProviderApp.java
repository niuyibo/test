package com.testes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.testes.mapper")
public class TestesProviderApp {
	public static void main(String[] args) {
		SpringApplication.run(TestesProviderApp.class, args);
	}
}
