package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DbSourceApplication {
    public static void main( String[] args ){
    	SpringApplication.run(DbSourceApplication.class, args);
    
    }
}
